package util.function;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ToDoubleFunctionTest {

    public static void main(String[] args) {
        ToDoubleFunction<String> transform = (x) -> 3.1;
        System.out.println("output value : " + transform.applyAsDouble("Hello"));
    }

}
