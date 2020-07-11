package util.function;

import java.util.function.DoublePredicate;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoublePredicateTest {

    public static void main(String[] args) {

        DoublePredicate isLargerThanCertainValue = (x) -> x > 3.4;
        DoublePredicate isSmallerThanCertainValue = (x) -> x < 7.8;
        System.out.println("输入值比 3.4 大 : " + isLargerThanCertainValue.test(2.1));
        System.out.println("输入值比 3.4 大 : " + isLargerThanCertainValue.test(7.1));
        System.out.println("输入值比 3.4 小 : " + isLargerThanCertainValue.negate().test(2.1));
        System.out.println("5.6 比 3.4 大且比 7.8 小: " + isLargerThanCertainValue.and(isSmallerThanCertainValue).test(5.6));
        System.out.println("5.6 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(5.6));
        System.out.println("10.2 比 3.4 大或比 7.8 小: " + isLargerThanCertainValue.or(isSmallerThanCertainValue).test(10.2));

    }

}
