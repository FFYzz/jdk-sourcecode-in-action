package util.concurrent;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/23
 */
public class ArrayBlockingQueueTest {

    private ArrayBlockingQueue<String> queue;

    @Test
    public void initData() {
        queue = new ArrayBlockingQueue<>(8);
        String[] strs = {"Hello", "World", "Java", "Python", "C", "C++", "Cobol", "C#"};
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        queue.add("Python");
        queue.add("C");
        queue.add("C++");
        queue.add("Cobol");
        queue.add("C#");
        Assert.assertEquals(8, queue.size());
        Assert.assertTrue(queue.contains("Python"));
        Collection<String> collection = new ArrayList<>();
        Assert.assertEquals(queue.drainTo(collection), collection.size());
        Assert.assertArrayEquals(collection.toArray(String[]::new), strs);
        Iterator itr = queue.iterator();
        int count = 0;
        while (itr.hasNext()) {
            Assert.assertEquals(strs[count++], itr.next());
        }
        queue.clear();
        Assert.assertEquals(0, queue.size());
    }

    @Test
    public void initDataWithFairPolicy() throws InterruptedException {
        queue = new ArrayBlockingQueue<>(8, true);
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        queue.add("Python");
        queue.add("C");
        queue.add("C++");
        queue.add("Cobol");
        queue.add("C#");
        // queue.add("Objective-C");
        Assert.assertEquals(queue.remove(), "Hello");
        Assert.assertEquals(queue.offer("Rust"), true);
        Assert.assertEquals(queue.offer("Visual Basic", 5, TimeUnit.SECONDS), false);
        Assert.assertEquals(queue.offer("Vue"), false);
        Assert.assertEquals(queue.poll(), "World");
        queue.clear();
        Assert.assertEquals(queue.poll(5, TimeUnit.SECONDS), null);
        // queue.remove();

    }

    @Test
    public void initDataWithCollection() throws InterruptedException {
        String[] strs = {"Hello", "World", "Java", "Python", "C", "C++", "Cobol", "C#"};
        List<String> list = Arrays.asList(strs);
        queue = new ArrayBlockingQueue<String>(8, false, list);
        Assert.assertEquals(queue.take(), "Hello");
        queue.clear();
        queue.put("Swift");
        Assert.assertEquals(1, queue.size());
    }

}
