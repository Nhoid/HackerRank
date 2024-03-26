package Introduction.JavaDateAndTime;

import java.io.*;
import java.util.Calendar;


//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and
//a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
// such as getting the date of the next week.
//
//You are given a date. You just need to write the method, findDay, which returns the day on that date.
// To simplify your task, we have provided a portion of the code in the editor.
//
//Complete the findDay function in the editor below.
//
//findDay has the following parameters:
//
//int: month
//int: day
//int: year
//
//Returns
//
//string: the day of the week in capital letters
//
//Input Format
//
//A single line of input containing the space-separated month, day, and year, respectively, in MM DD YYYY format.

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        return switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            case 7 -> "SATURDAY";
            default -> "Emily Mondays";
        };
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        //String res = String.valueOf(month);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
