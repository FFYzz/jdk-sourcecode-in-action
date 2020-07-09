package util.function;

import javax.lang.model.type.NoType;
import java.util.function.Predicate;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/9
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> isOdd = (x) -> (x & 1) == 1;
        Predicate<Integer> isEven = (x) -> (x & 1) == 0;
        System.out.println("是否为 偶数 : " + isEven.test(2));
        System.out.println("是否为 奇数 : " + isOdd.test(4));

        boolean isEvenAndIsOdd = isEven.and(isOdd).test(16);
        System.out.println("16 是否即为奇数又是偶数 : " + isEvenAndIsOdd);

        boolean negtiveRes = isEven.negate().test(5);
        System.out.println("5 是否为偶数求反的结果 : " + negtiveRes);

        boolean orRes = isEven.or(isOdd).test(7);
        System.out.println("7 是否为奇数或者为偶数 : " + orRes);

        // 静态方法
        Integer value = 98;
        boolean isEqual = Predicate.isEqual(value).test(98);

        boolean notValue =  Predicate.not(isOdd).test(78);
        System.out.println("78 is not Odd : " + notValue);

    }

}
