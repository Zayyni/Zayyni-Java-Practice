import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LaunchDate2
{
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int dayOfMonth=date.getDayOfMonth();
        System.out.println(dayOfMonth);
        int month=date.getMonthValue();
        System.out.println(month);
        int year=date.getYear();
        System.out.println(year);
        int dayOfYear=date.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDate dob=LocalDate.of(1994,3,8);
        System.out.println(dob);
        System.out.println("***********************************");

        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime timeDate=LocalDateTime.now();
        System.out.println(timeDate);

    }
}
