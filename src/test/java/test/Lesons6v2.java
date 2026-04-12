//package test;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import pages.PracticeForm;
//import static testData.TestData.*;
//import static testData.TestData.city;
//import static utils.RandomUtils.RandomUtils.*;
//import static utils.RandomUtils.getRandomState;
//
//public class Lesons6v2 {
//    PracticeForm practiceForm;
//    String firstNameK;
//    String lastNameK;
//    String userEmailK;
//    String userNumberK;
//    String currentAddressK;
//    String genderK;
//    String subjectK;
//    String hobbies;
//    String state;
//    String day;
//    String month;
//    String year;
//    String city;
//
//    @BeforeEach
//    void setUp() {
//        practiceForm = new PracticeForm();
//        firstNameK = getRandomString(10);
//        lastNameK = getRandomString(10);
//        userEmailK = getRandomEmail();
//        userNumberK = getRandomPhone();
//        currentAddressK = getRandomString(5) + " " + getRandomString(5);
//        genderK = getRandomGender();
//        subjectK = getRandomSubject();
//        hobbies = getRandomHobbies();
//        state = getRandomState();
/// /        day = getRandomDay();
/// /        month = getRandomMonth();
/// /        year = getRandomYear();
/// /        city = getRandomCity();
//    }
//
//    @Test
//    void testWithUtils() {
//        practiceForm.openPage()
//                .typeFirstName(firstNameK)
//                .typeLastName(lastNameK)
//                .typeUserEmai(userEmailK)
//                .typeUserNumber(userNumberK)
//                .setGender(genderK)
//                .setMonthInput(month)
//                .setYearInput(year)
//                .setDayInput(day)
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
//    }
//}