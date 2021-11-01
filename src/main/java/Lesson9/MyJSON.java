package Lesson9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MyJSON {

    public static void main(String[] args){
        parseObjectToJSON();
    }

    public static void parseObjectToJSON () {
        PersonalModel model = new PersonalModel();
        String filePath = "JSON_FILE.json";
        model.setName("Vasya");
        model.setDateOfBirth(1985);
        model.setId(11);

        Jackson.parseObjectToJSON(model, filePath);
    }

    }

