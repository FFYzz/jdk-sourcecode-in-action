package util.function;

import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntToLongFunctionTest {

    public static void main(String[] args) {
        IntToLongFunction transform = x -> (long) x;
        System.out.println("int 值 2 转成 long 值 = " + transform.applyAsLong(2));
    }

}
