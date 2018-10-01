@java.lang.FunctionalInterface
interface calculation {
    int operation(int a , int b);
}

public class DemoCal {
    public static void main(String[] args) {
        calculation add = (a,  b)-> a+b;

        calculation multi = (a,b)-> a*b;

        calculation sub = (a,b)-> a-b;
        calculation div = (a,b)-> a/b;

        System.out.println(add.operation(5,6));
        System.out.println(multi.operation(5,6));
        System.out.println(sub.operation(7,2));
        System.out.println(div.operation(4,2));


    }
}
