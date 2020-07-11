package util.function;

import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntToDoubleFunctionTest {

    public static void main(String[] args) {
        IntToDoubleFunction transform = x -> x + 0.1;
        System.out.println("int 值 2 转成 double 值 = " + transform.applyAsDouble(2));
    }

}
