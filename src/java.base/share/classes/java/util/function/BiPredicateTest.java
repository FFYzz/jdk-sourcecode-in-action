package util.function;

import java.util.function.BiPredicate;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class BiPredicateTest {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isBothEven = (x, y) -> (x % 2 == 0) && (y % 2 == 0);
        BiPredicate<Integer, Integer> largetThan5 = (x, y) -> (x > 5) && (y > 5);
        BiPredicate<Integer, String> diffTypePredict = (Integer x, String y) -> (x % 2 == 0) && (y.equals("Hello"));
        System.out.println("4 和 6 都是偶数 : " + isBothEven.test(4, 6));
        System.out.println("3 和 4 都是偶数 : " + isBothEven.test(3, 4));
        System.out.println("4 和 5 都是偶数 且 均大于 5 : " + isBothEven.and(largetThan5).test(4, 5));
        System.out.println("2 和 6 要么都是偶数要么都大于 5 : " + isBothEven.or(largetThan5).test(2, 6));
        System.out.println("4 和 5 都是偶数取反的结果 : " + isBothEven.negate().test(4, 5));
        System.out.println("4 和 6 都是偶数取反的结果 : " + isBothEven.negate().test(4, 6));
        System.out.println("4 是偶数且 第二个输入参数为 Hello : " + diffTypePredict.test(4, "Hello"));

    }

}
