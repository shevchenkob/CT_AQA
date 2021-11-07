package com.customertimes.Lesson5;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateTime {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    public static void main(String[] args) throws ParseException {
        ZoneId zoneIdLosAngeles = ZoneId.of("America/Los_Angeles");
        LocalDateTime current = LocalDateTime.now(zoneIdLosAngeles);
        //System.out.println("Before formatting: " + current);

        DateTimeFormatter formatCurrent = DateTimeFormatter.ofPattern("YYYY/MMMM/EEEE HH:mm");
        String formatted = current.format(formatCurrent);
        LOGGER.info("Date and time after formatting: " + formatted + " " + zoneIdLosAngeles);

        String myTime = "1986-22-08 12:30:1";
        //DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        //LocalDateTime dateTime = LocalDateTime.parse(myTime, formatter);

        DateFormat inputFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        Date date = inputFormat.parse(myTime);
        LOGGER.info("Formatted from string: " + date);
    }
}
