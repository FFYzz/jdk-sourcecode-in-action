package util.function;

import java.util.function.UnaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class UnaryOperatorTest {

    public static void main(String[] args) {

        UnaryOperator<String> operator = x -> x + " Y";
        System.out.println(operator.apply("Hello"));
        System.out.println(UnaryOperator.identity().apply("Java"));

    }

}
