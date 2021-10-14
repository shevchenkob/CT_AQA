package com.customertimes.Lesson5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTime {
    public static void main(String[] args) {
        ZoneId zoneIdLosAngeles = ZoneId.of("America/Los_Angeles");
        LocalDateTime current = LocalDateTime.now(zoneIdLosAngeles);
        System.out.println("Before formatting: " + current);

        DateTimeFormatter formatCurrent = DateTimeFormatter.ofPattern("YYYY/MMMM/EEEE HH:mm");
        String formatted = current.format(formatCurrent);
        System.out.println("Date and time after formatting: " + formatted + " " + zoneIdLosAngeles);
    }
}
