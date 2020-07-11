package util.function;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntConsumerTest {

    public static void main(String[] args) {

        IntConsumer printConsumer = (x) -> System.out.println("input int x = " + x);
        IntConsumer intConsumer = (x) -> System.out.println("int value x = " + (x * 2));
        printConsumer.accept(4);
        printConsumer.andThen(intConsumer).accept(3);

    }

}
