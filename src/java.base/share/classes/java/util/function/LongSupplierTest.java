package util.function;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/11
 */
public class LongSupplierTest {

    public static void main(String[] args) {

        LongSupplier supplier = () -> 3L;
        System.out.println(supplier.getAsLong());

    }

}
