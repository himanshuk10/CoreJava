package java8Features;

import java.time.*;
import java.util.function.LongUnaryOperator;

public class DateTimeApiDemo {
    /*
    * Date and Time API to address the shortcomings of the old java.util.Date and java.util.Calendar classes
    * immutable and thread-safe,
    * provide a more comprehensive and flexible way to handle date and time.
    * */
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1999, Month.FEBRUARY,29);
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //time by their zonal id
        /*
        LocalTime t = LocalTime.now(ZoneId.of("Indian/Reunion"));
        System.out.println(t);
        for(String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
         */

        //machine readable time
        Instant i = Instant.now();
        System.out.println(i);

        //human readable time
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println(localDateTime);

        System.out.println(LocalTime.of(12,49));

    }
}
