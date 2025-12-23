package gcr_codebase.built_In_function;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TimeZoneAndTimeDate{
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();
        DateTimeFormatter formate=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: "+gmtTime.format(formate));
        ZonedDateTime istTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: "+istTime.format(formate));
        ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: "+pstTime.format(formate));
    }
}
