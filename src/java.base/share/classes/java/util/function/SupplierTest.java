package util.function;

import java.util.function.Supplier;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/9
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier simpleSupplier = () -> "specified value";
        System.out.println(simpleSupplier.get());

    }

}
