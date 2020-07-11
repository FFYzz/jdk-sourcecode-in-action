package util.function;

import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongFunctionTest {

    public static void main(String[] args) {

        LongFunction<String> inputLongOutputStringFunction = (x) -> "Hello " + x;
        System.out.println(inputLongOutputStringFunction.apply(3));
        LongFunction<Double> inputLongOutputDoubleFunction = (x) -> Double.valueOf(x);
        System.out.println(inputLongOutputDoubleFunction.apply(6));

    }

}
