package Ex_IO;

import java.util.function.Consumer;

public class Ex2Consumer{
    public static void main(String[] args) {
        Consumer<String> consumer1 = (arg)->{
            System.out.println(arg + "ok");
        };

        consumer1.accept("consumer Accept -");
    }

}