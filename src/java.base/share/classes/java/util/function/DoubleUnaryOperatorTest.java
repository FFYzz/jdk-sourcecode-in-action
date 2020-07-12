package util.function;

import java.util.function.DoubleUnaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class DoubleUnaryOperatorTest {

    public static void main(String[] args) {
        DoubleUnaryOperator operator = x -> x;
        System.out.println("输入 2 ，输出 : " + operator.applyAsDouble(2));
        DoubleUnaryOperator composeOperator = x -> x * 2;
        System.out.println("输入 3.1，组合计算后输出 : " + operator.compose(composeOperator).applyAsDouble(3.1));
        System.out.println("输入 3.1，组合计算后输出 : " + operator.andThen(composeOperator).applyAsDouble(3.1));

    }

}
