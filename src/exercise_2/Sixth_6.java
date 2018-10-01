package exercise_2;

public class Sixth_6 {

    public static void main(String[] args) {

        try
        {
            int num1 = 0;
            int num2 = 50/num1;

            System.out.println("end of try block");
        }

        catch (ArithmeticException e)
        {
            System.out.println("a number is not divisible by 0");
        }

        catch (Exception e)
        {
            System.out.println("error occured");
        }

        finally {
            System.out.println("in the finally block");
        }
    }
}
