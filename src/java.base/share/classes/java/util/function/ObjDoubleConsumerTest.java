package util.function;

import javax.swing.plaf.IconUIResource;
import java.util.function.ObjDoubleConsumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/12
 */
public class ObjDoubleConsumerTest {

    public static void main(String[] args) {

        ObjDoubleConsumer consumer = (x, y) -> System.out.println("input Object : " + x.toString() + ", input double value : " + y);
        consumer.accept("Java", 3.4);

    }

}
