package Ex_Collection;

import static java.text.DateFormat.*;
import static java.util.Locale.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex9 {

    public static void main(String[] args) {

        Date today = new Date();
        Locale[] locales = { US, UK,};
        int[] styles = { FULL, LONG, MEDIUM, SHORT };
        String[] styleNames = { "FULL", "LONG", "MEDIUM", "SHORT" };
        DateFormat fmt = null;
        for (Locale locale : locales) {
            System.out.println("\nThe Date for " + locale.getDisplayCountry() + ":");
            for (int i = 0; i < styles.length; i++) {
                fmt = DateFormat.getDateInstance(styles[i], locale);
                System.out.println("\tIn " + styleNames[i] + " is " + fmt.format(today));
            }
        }
    }
}
