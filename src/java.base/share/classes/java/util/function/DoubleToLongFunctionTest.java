package util.function;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleToLongFunctionTest {

    public static void main(String[] args) {
        DoubleToLongFunction transform = x -> (long) x;
        System.out.println("double 值 2.3 转成 long 值 = " + transform.applyAsLong(2.3));
    }

}
