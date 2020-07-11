package util.function;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntPredicateTest {

    public static void main(String[] args) {

        IntPredicate isLargerThanCertainValue = (x) -> x > 3.4;
        IntPredicate isSmallerThanCertainValue = (x) -> x < 7.8;
        System.out.println("2 比 3.4 大 : " + isLargerThanCertainValue.test(2));
        System.out.println("7 比 3.4 大 : " + isLargerThanCertainValue.test(7));
        System.out.println("2 比 3.4 小 : " + isLargerThanCertainValue.negate().test(2));
        System.out.println("5 比 3.4 大且比 7.8 小: " + isLargerThanCertainValue.and(isSmallerThanCertainValue).test(5));
        System.out.println("5 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(5));
        System.out.println("10 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(10));

    }

}
