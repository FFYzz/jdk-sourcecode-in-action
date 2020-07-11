package util.function;

import java.util.function.DoubleBinaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleBinaryOperatorTest {

    public static void main(String[] args) {

        DoubleBinaryOperator addTwoDouble = (x, y) -> x + y;
        System.out.println("两个 double 类型的值相加的结果 : " + addTwoDouble.applyAsDouble(2.3, 3.2));
        System.out.println("两个 double 类型的值相加的结果 : " + addTwoDouble.applyAsDouble(1, 2));
        System.out.println("两个 double 类型的值相加的结果 : " + addTwoDouble.applyAsDouble(2.3f, 3.2f));

    }

}
