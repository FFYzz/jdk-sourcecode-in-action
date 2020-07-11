package util.function;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongConsumerTest {

    public static void main(String[] args) {

        LongConsumer printConsumer = (x) -> System.out.println("input long x = " + x);
        LongConsumer longConsumer = (x) -> System.out.println("long value x = " + (x * 2));
        printConsumer.accept(4);
        printConsumer.andThen(longConsumer).accept(3);

    }

}
