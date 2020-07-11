package util.function;

import java.util.function.DoubleToIntFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleToIntFunctionTest {

    public static void main(String[] args) {
        DoubleToIntFunction transform = x -> (int) x;
        System.out.println("double 值 2.3 转成 int 值 = " + transform.applyAsInt(2.3));
    }

}
