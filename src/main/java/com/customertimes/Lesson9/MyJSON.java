package com.customertimes.Lesson9;

import com.customertimes.Lesson4.personals_enums.NurseEnum;

import java.time.LocalDateTime;
import java.util.List;

public class MyJSON {

    public static void main(String[] args) {
        parseObjectToJSON();
        parseJSONToObject();
    }

    public static void parseObjectToJSON() {

        DoctorsModel docModel = new DoctorsModel();
        docModel.setPricePerVisit(50);

        DoctorsModel docModel1 = new DoctorsModel();
        docModel1.setPricePerVisit(100);

        NursesModel nursesModel = new NursesModel();
        nursesModel.setCategory(NurseEnum.FIRST_CATEGORY);

        AmbulancePersonalModel ambModel = new AmbulancePersonalModel();
        ambModel.setSquad("squad1");
        ambModel.setDoctorsModel(List.of(docModel, docModel1));
        ambModel.setNursesModel(nursesModel);

        PersonalModel model = new PersonalModel(11, 1985, "Vasya", ambModel, LocalDateTime.now() );
        String filePath = "src/main/resources/JSON_FILE.json";

        Jackson.parseObjectToJSON(model, filePath);
    }

    public static void parseJSONToObject() {

        String filePath = "src/main/resources/JSON_DATA.json";

        PersonalModel model = Jackson.parseJSONToObject(filePath);

        System.out.println("Name: " + model.getName());
        System.out.println("Birthday: " + model.getDateOfBirth());
        System.out.println("Id is: " + model.getId());

    }
}

