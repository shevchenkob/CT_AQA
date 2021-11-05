package com.customertimes.Lesson9;

import com.customertimes.Lesson4.personals_enums.DoctorsEnum;
import com.customertimes.Lesson4.personals_enums.NurseEnum;

import java.time.LocalDateTime;
import java.util.List;

public class MyJSON {

    public static void main(String[] args) {
        parseObjectToJSON();
        parseJSONToObject();
    }

    public static void parseObjectToJSON() {
        SurgeonModel surMod = new SurgeonModel();
        surMod.setRankSurg(DoctorsEnum.HIGHEST_RANK);
        surMod.setScalpel("sharp");

        SurgeonModel surMod1 = new SurgeonModel();
        surMod1.setRankSurg(DoctorsEnum.FIRST_RANK);
        surMod1.setScalpel("iron");

        TherapistModel terMod = new TherapistModel();
        terMod.setRankTherap(DoctorsEnum.HIGHEST_RANK);

        TherapistModel terMod1 = new TherapistModel();
        terMod1.setRankTherap(DoctorsEnum.INTERN);

        DoctorsModel docModel = new DoctorsModel();
        docModel.setPricePerVisit(50);
        docModel.setSurgeonModel(surMod);
        docModel.setTherapistModel(terMod);

        DoctorsModel docModel1 = new DoctorsModel();
        docModel1.setPricePerVisit(100);
        docModel1.setSurgeonModel(surMod1);
        docModel1.setTherapistModel(terMod1);


        NursesModel nursesModel = new NursesModel();
        nursesModel.setCategory(NurseEnum.FIRST_CATEGORY);

        AmbulancePersonalModel ambModel = new AmbulancePersonalModel();
        ambModel.setSquad("squad1");
        ambModel.setDoctorsModel(List.of(docModel, docModel1));
        ambModel.setNursesModel(nursesModel);

        HospitalPersonalModel hotPersMod = new HospitalPersonalModel();
        hotPersMod.setDepartment("test");

        PersonalModel model = new PersonalModel(11, 1985, "Vasya", ambModel, LocalDateTime.now(), hotPersMod );
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