package exercise_2;

    class Singleton{

    private static Singleton singleton = new Singleton( );


    private Singleton() { }


    public static Singleton getInstance( ) {
        return singleton;
    }


    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}

public class Singleton_4 {

    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );
    }
}