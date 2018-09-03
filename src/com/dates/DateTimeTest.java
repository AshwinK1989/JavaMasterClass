package com.dates;

import java.time.*;

public class DateTimeTest {

    public static void main(String[] args) {

        LocalDate ld =  LocalDate.now();
        //It will print today's date.
        System.out.println(ld);

        //If we want to print the custom date then we will do it as follows:

        LocalDate ld1 =  LocalDate.of(2018, Month.JULY,27);
        System.out.println(ld1);

        //If we want to print the time we will do it as follows:
        LocalTime lt = LocalTime.now();

        System.out.println(lt);




        //If we want to get different zoneids then we can do it as follows:

        ZoneId.getAvailableZoneIds().forEach(i->System.out.println(i));

        //If we want to fetch time based on ZoneId then we can do it as follows:

        LocalTime lt1 = LocalTime.now(ZoneId.of("Asia/Qatar"));
        System.out.println(lt1);

        //If you want to get Date as well as Time then we can do it as follows:
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // If want to check whether a particular date is before/after some date then we can do it as follows:

        LocalDate ld3 = LocalDate.of(2018,Month.JULY,27);

        System.out.println(LocalDate.now().isAfter(ld3));



    }
}
