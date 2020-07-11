package util.function;

import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongToDoubleFunctionTest {

    public static void main(String[] args) {
        LongToDoubleFunction transform = x -> x + 0.2;
        System.out.println("long 值 2 转成 double 值 = " + transform.applyAsDouble(2));
    }

}
