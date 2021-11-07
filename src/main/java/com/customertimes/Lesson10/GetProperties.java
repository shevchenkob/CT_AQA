package com.customertimes.Lesson10;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        LOGGER.info("Database password = " + properties.getProperty("dbpassword"));
        LOGGER.info("Database name = " + properties.getProperty("database"));
        LOGGER.info("Database user = " + properties.getProperty("dbuser"));
        LOGGER.info("Name user = " + properties.getProperty("name"));
        LOGGER.info("Birthday user = " + properties.getProperty("birthday"));

        properties.put("dbpassword", "NEWpassword");
        properties.put("database", "NEWlocalhost");
        properties.put("dbuser", "NEWuser");
        properties.put("dbuser", "NEWuser");
        properties.put("dbuser", "NEWuser");
        LOGGER.info("New Database password = " + properties.getProperty("dbpassword"));
        LOGGER.info("New Database name = " + properties.getProperty("database"));
        LOGGER.info("New Database user = " + properties.getProperty("dbuser"));

    }
}
