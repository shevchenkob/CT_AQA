package com.customertimes.Lesson4;

import com.customertimes.Lesson11.MyLogger;
import com.customertimes.Lesson6.AccountantException;
import com.customertimes.Lesson6.DoctorException;
import com.customertimes.Lesson6.NurseNotWorkException;
import com.customertimes.Lesson4.personals_enums.DoctorsEnum;
import com.customertimes.Lesson4.personals_enums.NurseEnum;
import org.apache.log4j.Logger;

public class Runner {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);

    public static void main(String... args) throws NurseNotWorkException, DoctorException, AccountantException {
        Surgeon surgeon = new Surgeon(10, 1980, "Ivan", "emergency", 50, DoctorsEnum.FIRST_RANK);
        surgeon.work();
        LOGGER.info("Surgeon name is: " + surgeon.name);

        Therapist therapist = new Therapist(15, 1975, "Vasya", "usual", 40, DoctorsEnum.HIGHEST_RANK);
        therapist.work();
        LOGGER.info("Therapist rank is: " + therapist.rankTherap);

        Nurses nurses = new Nurses(8, 1995, "Kate", "profilact", NurseEnum.SECOND_CATEGORY);
        nurses.work();
        LOGGER.info("Nurse squad is: " + nurses.squad);

        Administrators administrators = new Administrators(5, 2000, "Ann", "vaccination", "reception");
        administrators.work();
        LOGGER.info("Administrator workplace is: " + administrators.workplace);

        Accountant accountant = new Accountant(52, 1992, "John", "protection", "sighting");
        accountant.work();
        LOGGER.info("Accountant birthdate is: " + accountant.dateOfBirth);

        Pharmacist pharmacist = new Pharmacist(37, 1988, "Sara", "giveAway", "aspirin");
        pharmacist.work();
        LOGGER.info("Pharmacist department is: " + pharmacist.department);

        /* Mixed using polymorphism */
        Personal newNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        LOGGER.info("New nurse name is: " + newNurse.name);


        Hospital_Personal newAccountant = new Accountant(6, 1888, "Elizabet", "newDep", "newStamp");
        accountant.work();
        LOGGER.info("New accountant birthday: " + newAccountant.dateOfBirth);

        LOGGER.info(newNurse.toString());

        accountant.setStamp("myStamp");
        accountant.getStamp();

        Nurses newOneNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        newOneNurse.getActive();

        Surgeon surgeonNew = new Surgeon(10, 1980, "Ivan", "emergency", 50, DoctorsEnum.FIRST_RANK);
        surgeonNew.getCareful();
        surgeonNew.getRescue();

        /* Exceptions */
        Nurses secondOneNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        secondOneNurse.getID(20);

        Nurses thirdOneNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        thirdOneNurse.getIdTry(50);

        Doctors newDoctor = new Surgeon(5, 1988, "Petya", "emergency", 20, DoctorsEnum.HIGHEST_RANK);
        newDoctor.checkAge(1991);

        Surgeon newSurg1 = new Surgeon(10, 1980, "Ivan", "emergency", 50, DoctorsEnum.FIRST_RANK);
        String tempName = "someName";
        newSurg1.checkName(tempName);

        accountant.checkStamp("someValue");
    }
}
