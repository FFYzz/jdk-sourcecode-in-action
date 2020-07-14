package util.concurrent;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/6
 */
public class ExecutorCompletionServiceTest {

    /**
     * 按 list 中存放的顺序进行提交
     * 按 任务完成的时间进行获取
     *
     * @param e
     * @param solvers
     * @throws InterruptedException
     * @throws ExecutionException
     */
    private void solve(Executor e, Collection<Callable<Result>> solvers)
            throws InterruptedException, ExecutionException {
        CompletionService<Result> cs
                = new ExecutorCompletionService<>(e);
        solvers.forEach(cs::submit);
        for (int i = solvers.size(); i > 0; i--) {
            Result r = cs.take().get();
            if (r != null)
                use(r);
        }
    }

    /**
     * 获取到第一个完成的 task 的结果，并且忽略中间过程中任务抛出的一场
     * 获取到之后取消其他未执行的任务
     *
     * @param e
     * @param solvers
     * @throws InterruptedException
     */
    private void solve2(Executor e, Collection<Callable<Result>> solvers)
            throws InterruptedException {
        CompletionService<Result> cs
                = new ExecutorCompletionService<>(e);
        int n = solvers.size();
        List<Future<Result>> futures = new ArrayList<>(n);
        Result result = null;
        try {
            solvers.forEach(solver -> futures.add(cs.submit(solver)));
            for (int i = n; i > 0; i--) {
                try {
                    Result r = cs.take().get();
                    if (r != null) {
                        result = r;
                        break;
                    }
                } catch (ExecutionException ignore) {
                }
            }
        } finally {
            futures.forEach(future -> future.cancel(true));
        }
        if (result != null) {
            use(result);
        }
    }

    public void use(Result result) {
        System.out.println(result);
    }


    static class Result {
        String name;
        int age;

        public Result(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


    public void testSolve(ThreadPoolExecutor executor) {
        ArrayList<Callable<Result>> list = new ArrayList<>();
        list.add(() -> {
            Thread.sleep(5);
            return new Result("Hello", 12);
        });
        list.add(() -> {
            Thread.sleep(70);
            return new Result("Java", 13);
        });
        list.add(() -> {
            Thread.sleep(15);
            return new Result("Python", 8);
        });
        list.add(() -> {
            Thread.sleep(20);
            return new Result("C++", 7);
        });
        try {
            solve(executor, list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void testSolve2(ThreadPoolExecutor executor) {
        ArrayList<Callable<Result>> list = new ArrayList<>();
        list.add(() -> {
            throw new ExecutionException(new RuntimeException("手动制造异常，会被吃掉"));
        });
        // 这个 task 将被执行，会输出 Java
        list.add(() -> {
            Thread.sleep(27);
            return new Result("Java", 13);
        });
        list.add(() -> {
            Thread.sleep(15);
            throw new ExecutionException(new RuntimeException("手动制造另一个异常，也会被吃掉"));
        });
        // 这个 task 将被取消
        list.add(() -> {
            Thread.sleep(35);
            return new Result("C++", 7);
        });
        try {
            solve2(executor, list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdownNow();
        }
    }

    public static void main(String[] args) {
        ExecutorCompletionServiceTest test = new ExecutorCompletionServiceTest();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));
        test.testSolve(executor);
        System.out.println("==================");
        test.testSolve2(executor);
    }

}
