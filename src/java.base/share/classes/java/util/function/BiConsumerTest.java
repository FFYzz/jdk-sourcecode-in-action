package util.function;

import java.util.function.BiConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/10
 */
public class BiConsumerTest {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> calculateSum = (x, y) -> System.out.println("the sum of x and y is : " + (x + y));
        BiConsumer<Integer, Integer> thenConsumer = (x, y) -> System.out.println("then consumer, the product of x and y is : " + (x * y));
        calculateSum.accept(4, 5);
        calculateSum.andThen(thenConsumer).accept(4, 5);
    }

}
