package util.function;

import java.util.function.DoubleConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleConsumerTest {

    public static void main(String[] args) {

        DoubleConsumer printConsumer = (x) -> System.out.println("input double x = " + x);
        DoubleConsumer doubleConsumer = (x) -> System.out.println("double value x = " + (x * 2));
        printConsumer.accept(4.3);
        printConsumer.andThen(doubleConsumer).accept(3.2);

    }


}
