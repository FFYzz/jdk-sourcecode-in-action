package util.function;

import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongBinaryOperatorTest {

    public static void main(String[] args) {

        LongBinaryOperator addTwoLong = (x, y) -> x + y;
        System.out.println("两个 long 类型的值相加的结果 : " + addTwoLong.applyAsLong(2L, 3L));

    }

}
