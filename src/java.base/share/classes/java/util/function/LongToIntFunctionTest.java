package util.function;

import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongToIntFunctionTest {

    public static void main(String[] args) {
        LongToIntFunction transform = x -> (int) x;
        System.out.println("long 值 2 转成 int 值 = " + transform.applyAsInt(2));
    }

}
