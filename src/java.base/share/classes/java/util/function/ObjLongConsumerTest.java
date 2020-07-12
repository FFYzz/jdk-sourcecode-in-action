package util.function;

import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ObjLongConsumerTest {

    public static void main(String[] args) {

        ObjLongConsumer consumer = (x, y) -> System.out.println("input Object : " + x.toString() + ", input long value : " + y);
        consumer.accept("Java", 3L);

    }

}
