package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;

import static Utils.randomUtils.*;
import static Utils.randomUtils.getRandomGender;
import static Utils.randomUtils.getRandomHobbies;
import static Utils.randomUtils.getRandomString;
import static Utils.randomUtils.getRandomSubject;
import static testData.TestData.*;

//public class Lesons6_1 {
//
//
//    String firstNameK;
//    String lastNameK;
//    String userEmailK;
//    String userNumberK;
//    String currentAddressK;
//    String genderK;
//    String subjectK;
//    String hobbies;
////        String state;
////        String day;
//PracticeForm practiceForm = new PracticeForm();
//    @BeforeEach
//    void prepearRandomData(){
//        firstNameK = getRandomString(10);
//        lastNameK = getRandomString(10);
//        userEmailK = getRandomEmail();
//        userNumberK = getRandomPhone();
//        currentAddressK = getRandomString(5) + " " + getRandomString(5);
//        genderK = getRandomGender();
//        subjectK = getRandomSubject();
//        hobbies = getRandomHobbies();
////   state = getRandomState();
////    day = getRandomDay
//
//    }
//    @Test
//    void Test_with_utils() {
//
//
//        practiceForm.openPage()
//                .typeFirstName(firstNameK)
//                .typeLastName(lastNameK)
//                .typeUserEmai(userEmailK)
//                .typeUserNumber(userNumberK)
//                .setGender(genderK)
//                .setDateOfBirght(day, month, year)
//                .typeSubjectSelect(subjectK)
//                .submitHobbies(hobbies)
//                .file()
//                .typeCurrentAddress(currentAddressK)
//                .typeState()
//                .SetStateValue(state)
//                .typeCity()
//                .SetCityValue(city)
//                .resultFormButton()
//                .CheckField();
//
//    }
//}
//}
