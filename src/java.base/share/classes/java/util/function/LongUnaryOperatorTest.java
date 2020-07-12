package util.function;

import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class LongUnaryOperatorTest {

    public static void main(String[] args) {

        LongUnaryOperator operator = (x) -> x + 100;
        LongUnaryOperator otherOperator = x -> x * 3;
        System.out.println("输入 x，输出 x + 1 : " + operator.applyAsLong(3));
        System.out.println("组合 compose : 输入 x, 输出 : " + operator.compose(otherOperator).applyAsLong(3));
        System.out.println("andThen : 输入 x, 输出 : " + operator.andThen(otherOperator).applyAsLong(3));
        System.out.println(IntUnaryOperator.identity().applyAsInt(222));

    }

}
