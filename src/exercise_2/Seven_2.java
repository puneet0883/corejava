package exercise_2;
import java.io.*;

public class Seven_2 {

    public static void main(String[] args) {


        int n = 4356844;

        int days = n / (24 * 3600);

        n = n % (24 * 3600);

        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60;

        n %= 60;
        int seconds = n;

        System.out.println("No. of days : " + days + " no. of hours : " + hour + " no. of minutes" + minutes + " no. of seconds" + n);
    }
}
