package util.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiplyBiFunction = (x, y) -> x * y;
        Function<Integer, Integer> addFunction = x -> x + 1;
        System.out.println(multiplyBiFunction.apply(3, 4));
        System.out.println(multiplyBiFunction.andThen(addFunction).apply(3, 4));
    }

}
