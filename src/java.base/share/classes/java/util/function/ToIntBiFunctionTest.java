package util.function;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToIntBiFunctionTest {

    public static void main(String[] args) {
        ToIntBiFunction<String, String> transform = (x, y) -> 3;
        System.out.println("output value : " + transform.applyAsInt("Hello", "Java"));
    }

}
