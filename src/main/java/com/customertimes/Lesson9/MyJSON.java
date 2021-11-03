package com.customertimes.Lesson9;

import java.time.LocalDateTime;

public class MyJSON {

    public static void main(String[] args) {
        parseObjectToJSON();
        parseJSONToObject();
    }

    public static void parseObjectToJSON() {
        PersonalModel model = new PersonalModel();
        String filePath = "JSON_FILE.json";
        model.setName("Vasya");
        model.setDateOfBirth(1985);
        model.setId(11);
        model.setTime(LocalDateTime.now());

        Jackson.parseObjectToJSON(model, filePath);
    }

    public static void parseJSONToObject() {

        String filePath = "JSON_DATA.json";

        PersonalModel model = Jackson.parseJSONToObject(filePath);

        System.out.println("Name: " + model.getName());
        System.out.println("Birthday: " + model.getDateOfBirth());
        System.out.println("Id is: " + model.getId());

    }
}

