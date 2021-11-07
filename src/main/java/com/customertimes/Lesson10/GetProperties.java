package com.customertimes.Lesson10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Database password = " + properties.getProperty("dbpassword"));
        System.out.println("Database name = " + properties.getProperty("database"));
        System.out.println("Database user = " + properties.getProperty("dbuser"));

        properties.put("dbpassword", "NEWpassword");
        properties.put("database", "NEWlocalhost");
        properties.put("dbuser", "NEWuser");
        System.out.println("New Database password = " + properties.getProperty("dbpassword"));
        System.out.println("New Database name = " + properties.getProperty("database"));
        System.out.println("New Database user = " + properties.getProperty("dbuser"));

    }
}
