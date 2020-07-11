package util.function;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongPredicateTest {

    public static void main(String[] args) {

        LongPredicate isLargerThanCertainValue = (x) -> x > 3.4;
        LongPredicate isSmallerThanCertainValue = (x) -> x < 7.8;
        System.out.println("2 比 3.4 大 : " + isLargerThanCertainValue.test(2L));
        System.out.println("7 比 3.4 大 : " + isLargerThanCertainValue.test(7L));
        System.out.println("2 比 3.4 小 : " + isLargerThanCertainValue.negate().test(2L));
        System.out.println("5 比 3.4 大且比 7.8 小: " + isLargerThanCertainValue.and(isSmallerThanCertainValue).test(5L));
        System.out.println("5 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(5L));
        System.out.println("10 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(10L));

    }

}
