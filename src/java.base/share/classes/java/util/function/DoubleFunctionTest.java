package util.function;

import java.util.function.DoubleFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleFunctionTest {

    public static void main(String[] args) {

        DoubleFunction<String> inputDoubleOutputStringFunction = (x) -> "Hello " + x;
        System.out.println(inputDoubleOutputStringFunction.apply(3.4));
        DoubleFunction<Double> inputDoubleOutputDoubleFunction = (x) -> Double.valueOf(x);
        System.out.println(inputDoubleOutputDoubleFunction.apply(6.1));

    }

}
