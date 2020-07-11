package util.function;

import java.util.function.BooleanSupplier;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class BooleanSupplierTest {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        BooleanSupplier supplier = () -> str1.equals(str2);
        System.out.println("str1 等于 str2 : " + supplier.getAsBoolean());

    }

}
