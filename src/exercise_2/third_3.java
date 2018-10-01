package exercise_2;

class A

{

    // Two files are created for NoClassDefFoundError, you have to delete the class file of class A
    // after deleting that file its show NoClassDefFound error at run time.

}

public class third_3 {
    public static void main(String[] args)

    {
        try

        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            }

        A a = new A();

    }

}
