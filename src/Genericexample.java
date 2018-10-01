import java.lang.FunctionalInterface;

@FunctionalInterface

interface calanytype<T,R>
{
    R printTo(T a , T b);

}
public class Genericexample {

    public static void main(String[] args) {

       calanytype <Integer,Integer> add= (a , b) -> a+b;

        System.out.println(add.printTo(5,7));

        calanytype <Integer,Integer> sub = (a , b) -> a-b;

        System.out.println(sub.printTo(7,5));

        calanytype <Integer,Integer> multi= (a , b) -> a*b;

        System.out.println(multi.printTo(5,7));

        calanytype <Integer,Integer> div= (a , b) -> a/b;

        System.out.println(div.printTo(6,3));
    }
}
