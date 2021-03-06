package com.customertimes.Lesson9;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Jackson {

    public static void parseObjectToJSON(PersonalModel model, String pathToFile) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_WITH_CONTEXT_TIME_ZONE);
        File file = new File(pathToFile);
        try {
            mapper.writeValue(file, model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PersonalModel parseJSONToObject(String pathToFile) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_WITH_CONTEXT_TIME_ZONE);
        File file = new File(pathToFile);
        PersonalModel model = null;
        try {
            String jsonValue = FileUtils.readFileToString(file, Charset.defaultCharset());
            model = mapper.readValue(jsonValue, PersonalModel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }
}
