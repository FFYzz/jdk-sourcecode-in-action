package util.function;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToIntFunctionTest {

    public static void main(String[] args) {
        ToIntFunction<String> transform = (x) -> 2;
        System.out.println("output value : " + transform.applyAsInt("Hello"));
    }

}
