//import java.util.Date;
import java.sql.Date;

public class LaunchDate1
{
    public static void main(String[] args) {
        // Date ---> Use util date object for normal usage,
        // Use SQL Date when working with jdbc or hibernate

        // java8 --> Joda api --> new date time api ---> time  package

//       Date date = new Date(); // Date class of util package will return both current date and time
//        System.out.println(date);
//
//        int year = date.getYear();
//
//        System.out.println(year);
//        long timeMLS = date.getTime();
//        System.out.println(date);
//        System.out.println(timeMLS);


        long startTime = System.currentTimeMillis();
       Date date = new Date(startTime);
       System.out.println(date); // it will only give Date

    }
}
