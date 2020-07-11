package util.function;

import java.util.function.IntFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntFunctionTest {

    public static void main(String[] args) {

        IntFunction<String> inputIntOutputStringFunction = (x) -> "Hello " + x;
        System.out.println(inputIntOutputStringFunction.apply(3));
        IntFunction<Double> inputDoubleOutputDoubleFunction = (x) -> Double.valueOf(x);
        System.out.println(inputDoubleOutputDoubleFunction.apply(6));

    }

}
