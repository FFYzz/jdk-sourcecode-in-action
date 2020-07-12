package util.function;

import java.util.function.ToDoubleFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToLongFunctionTest {

    public static void main(String[] args) {
        ToLongFunction<String> transform = (x) -> 3L;
        System.out.println("output value : " + transform.applyAsLong("Hello"));
    }

}
