package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * This class will used for Date related operations.
 * Year: 2018-19
 *
 * @author Prat3ik on 10/03/19
 * @project changeroots.automation
 */
public class DateUtils {

    /**
     * This method will check whether given text is valid date or not.
     * @param text
     * @param dateFormat
     * @return
     */
    public static boolean isDateValid(String text, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            sdf.parse(text);
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
