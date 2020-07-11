package util.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer> integerCompare = BinaryOperator.minBy(Comparator.naturalOrder());
        BinaryOperator<String> stringLengthCompare = BinaryOperator.maxBy((s1, s2) -> s1.length() - s2.length());
        System.out.println(integerCompare.apply(3, 4));
        System.out.println(stringLengthCompare.apply("Hello", "Java"));
    }

}
