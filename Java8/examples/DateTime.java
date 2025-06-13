package com.examples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("localdate: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("localtime: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("localdatetime: " + dateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zoneddatetime: " + zonedDateTime);

        Instant instant = Instant.now();
        System.out.println("instant: " + instant);

        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration: " + duration);

        Period period = Period.ofYears(2).plusMonths(3).plusDays(4);
        System.out.println("period: " + period);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        System.out.println("formatted datetime: " + formattedDateTime);

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now(zone);
        System.out.println("New York Time: " + nyTime);
    }
}

