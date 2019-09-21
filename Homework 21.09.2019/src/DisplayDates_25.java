// Java program to display the dates in the following formats.

import java.text.DateFormat;
import java.util.Date;

public class DisplayDates_25 {

    public static void main(String args[]) {

        Date currentDate = new Date();
        System.out.println("Current date is: " + currentDate);

        String dateShort = DateFormat.getDateInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("Formatting the Date using DateFormat.SHORT: " + dateShort);
    }
}
