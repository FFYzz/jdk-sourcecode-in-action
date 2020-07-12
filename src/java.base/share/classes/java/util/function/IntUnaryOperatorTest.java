package util.function;

import java.util.function.IntUnaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class IntUnaryOperatorTest {

    public static void main(String[] args) {

        IntUnaryOperator operator = (x) -> x + 1;
        IntUnaryOperator otherOperator = x -> x * 2;
        System.out.println("输入 x，输出 x + 1 : " + operator.applyAsInt(3));
        System.out.println("组合 compose : 输入 x, 输出 : " + operator.compose(otherOperator).applyAsInt(3));
        System.out.println("andThen : 输入 x, 输出 : " + operator.andThen(otherOperator).applyAsInt(3));
        System.out.println(IntUnaryOperator.identity().applyAsInt(2));

    }

}
