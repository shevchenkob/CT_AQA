package com.customertimes.Lesson5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        ZoneId zoneIdLosAngeles = ZoneId.of("America/Los_Angeles");
        LocalDateTime current = LocalDateTime.now(zoneIdLosAngeles);
        //System.out.println("Before formatting: " + current);

        DateTimeFormatter formatCurrent = DateTimeFormatter.ofPattern("YYYY/MMMM/EEEE HH:mm");
        String formatted = current.format(formatCurrent);
        System.out.println("Date and time after formatting: " + formatted + " " + zoneIdLosAngeles);

        String myTime = "1986-22-08 12:30:1";
        //DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        //LocalDateTime dateTime = LocalDateTime.parse(myTime, formatter);

        DateFormat inputFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        Date date = inputFormat.parse(myTime);
        System.out.println("Formatted from string: " + date);
    }
}
