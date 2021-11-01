package Lesson9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Jackson {

    public static void parseObjectToJSON(PersonalModel model, String pathToFile) {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(pathToFile);
        try {
            mapper.writeValue(file, model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
