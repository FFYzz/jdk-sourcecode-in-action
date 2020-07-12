package util.function;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToLongBiFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToLongBiFunctionTest {

    public static void main(String[] args) {
        ToLongBiFunction<String, String> transform = (x, y) -> 3L;
        System.out.println("output value : " + transform.applyAsLong("Hello", "Java"));
    }

}
