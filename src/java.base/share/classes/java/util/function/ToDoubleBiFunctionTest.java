package util.function;

import java.util.function.ToDoubleBiFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToDoubleBiFunctionTest {

    public static void main(String[] args) {
        ToDoubleBiFunction<String, String> transform = (x, y) -> 3.1;
        System.out.println("output value : " + transform.applyAsDouble("Hello", "Java"));
    }

}
