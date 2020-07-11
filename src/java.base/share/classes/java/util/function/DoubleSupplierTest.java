package util.function;

import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class DoubleSupplierTest {

    public static void main(String[] args) {

        DoubleSupplier supplier = () -> 3.2;
        System.out.println(supplier.getAsDouble());

    }

}
