package solution;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {

    public static void main(String[] args) {
        String dateStr = "2011/11/19";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date;

        try {
            date = dateFormat.parse(dateStr);
            System.out.println(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
