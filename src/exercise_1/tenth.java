package exercise_1;

public class tenth {

    int add(int a , int b)
    {
        int ad = a+b;
        return ad;
    }
    double add(double a , double b) {
        double ad = a + b;
        return ad;
    }

    int multi(int a , int b) {
        int mu = a * b;
        return mu;
    }

    float multi(float a , float b)
    {
        float mu = a*b;
        return mu;
    }
    String join(String a , String b)
    {
        String str = a.concat(b);

        return str;
    }

    String join(String a , String b , String c)
    {
        String d = a.concat(b);
        String e = d.concat(c);

        return e ;
    }

    public static void main(String[] args) {

        tenth ob1 = new tenth();

        System.out.println(ob1.join("puneet","jindal"));
        System.out.println(ob1.add(10,20));
        System.out.println(ob1.add(10.60,12.80));
        System.out.println(ob1.multi(10,20));
        System.out.println(ob1.multi(1.5f,2.5f));


        System.out.println(ob1.join("puneet","jindal" ,"tothenew"));
    }

}
