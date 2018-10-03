
package Ex_IO;
import java.util.*;


@FunctionalInterface
interface add {
    Boolean addnum(int a , int b);
}

@FunctionalInterface
interface increment {
    int incrementnum(int a);
}

@FunctionalInterface
interface concat{
    String concatstring(String str1 , String str2);
}

@FunctionalInterface
interface uppercase{
    String touppercase(String str);
}


public class Ex1 {
    public static void main(String[] args) {


        add ad = (a, b) -> {
            if (a > b) return true;
            else return false;
        };
        System.out.println(ad.addnum(7, 5));

        increment incre = (a) -> a + 1;
        System.out.println(incre.incrementnum(6));

        concat con = (str1, str2) -> str1 + str2;
        System.out.println(con.concatstring("puneet ", "jindal"));

        uppercase upcase = (str) -> str.toUpperCase();

        System.out.println(upcase.touppercase("puneet"));

    }



}

