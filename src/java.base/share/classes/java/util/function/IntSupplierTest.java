package util.function;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class IntSupplierTest {

    public static void main(String[] args) {

        IntSupplier supplier = () -> 3;
        System.out.println(supplier.getAsInt());

    }

}
