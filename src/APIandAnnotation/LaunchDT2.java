package APIandAnnotation;

import java.time.LocalDate;
import java.time.LocalTime;

public class LaunchDT2
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day+"/"+month+"/"+year);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nanoSecond = time.getNano();
        System.out.println(hour+":"+minute+":"+second+"."+nanoSecond);
    }
}


/* OUTPUT:
2023-09-05
5/9/2023
09:32:03.742166300
9:32:3.742166300
 */