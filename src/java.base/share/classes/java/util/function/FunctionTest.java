package util.function;

import java.util.function.Function;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/9
 */
public class FunctionTest {

    public static void main(String[] args) {
        Function<Integer, Integer> addOneFun = (x) -> x + 1;
        Function<Integer, Integer> multiplyTwoFun = (x) -> x * 2;
        // apply 应用
        Integer applyValue = addOneFun.apply(3);
        System.out.println("applyValue = " + applyValue);
        // 先乘后加一 应用
        Function<Integer, Integer> addThenMultiplyFun = addOneFun.compose(multiplyTwoFun);
        Integer multiplyThenAddValue = addThenMultiplyFun.apply(2);
        System.out.println("addThenMultiplyFunValue = " + multiplyThenAddValue);
        // 先加一再乘 应用
        Function<Integer, Integer> multiplyThenAdd = addOneFun.andThen(multiplyTwoFun);
        Integer addThenMultiplyFunValue = multiplyThenAdd.apply(2);
        System.out.println("multiplyThenAddValue = " + addThenMultiplyFunValue);
        // 输入 = 输出
        Integer identityValue = (Integer) Function.identity().apply(2);
        System.out.println("identityValue = " + identityValue);
    }

}
