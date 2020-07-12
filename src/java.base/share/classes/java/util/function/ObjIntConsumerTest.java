package util.function;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ObjIntConsumerTest {

    public static void main(String[] args) {

        ObjIntConsumer consumer = (x, y) -> System.out.println("input Object : " + x.toString() + ", input int value : " + y);
        consumer.accept("Java", 3);

    }

}
