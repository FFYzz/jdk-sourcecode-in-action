package util.function;

import java.sql.SQLOutput;
import java.util.function.Consumer;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/7/9
 */
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer commonConsumer = x -> System.out.println(x);
        Consumer afterConsumer = x -> System.out.println("after consumer : " + x);
        commonConsumer.accept("Hello");
        commonConsumer.accept(2);
        commonConsumer.andThen(afterConsumer).accept("trick");
    }

}
