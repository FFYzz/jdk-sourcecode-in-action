package util.function;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntBinaryOperatorTest {

    public static void main(String[] args) {

        IntBinaryOperator addTwoInt = (x, y) -> x + y;
        System.out.println("两个 int 类型的值相加的结果 : " + addTwoInt.applyAsInt(2, 3));

    }

}
