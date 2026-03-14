package test;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import testData.TestBase;

import java.util.Locale;

import static Utils.randomUtils.getRandomString;
import static testData.TestData.*;
import static testData.TestData.city;
import static testData.TestData.currentAddress;
import static testData.TestData.day;
import static testData.TestData.gender;
import static testData.TestData.hobbies;
import static testData.TestData.language;
import static testData.TestData.month;
import static testData.TestData.state;
import static testData.TestData.year;

public class Lesson6 extends TestBase {
    PracticeForm practiceForm = new PracticeForm();
  Faker faker = new Faker();
   Faker fakerRu = new Faker(new Locale("ru"));

    @Test
    void Test_with_faker() {

        String firstName = fakerRu.name().firstName();
        String lastName = fakerRu.name().lastName();
        String userEmail = faker.internet().emailAddress();
        String userNumber = faker.numerify("##########");
        String currentAddress = fakerRu.address().fullAddress();
//        String setDateOfBirght = faker.date()


        practiceForm.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmai(userEmail)
                .typeUserNumber(userNumber)
                .setGender(gender)
                .setDateOfBirght(day, month,year)
                .typeSubjectSelect(language)
                .submitHobbies(hobbies)
                .file()
                .typeCurrentAddress(currentAddress)
                .typeState()
                .SetStateValue(state)
                .typeCity()
                .SetCityValue(city)
                .resultFormButton()
                .CheckField();
    }

    @Test
    void Test_with_utils() {

        String firstName = getRandomString(10);
        String lastName
        String userEmail
        String userNumber
        String currentAddress
//        String setDateOfBirght = faker.date()


        practiceForm.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmai(userEmail)
                .typeUserNumber(userNumber)
                .setGender(gender)
                .setDateOfBirght(day, month,year)
                .typeSubjectSelect(language)
                .submitHobbies(hobbies)
                .file()
                .typeCurrentAddress(currentAddress)
                .typeState()
                .SetStateValue(state)
                .typeCity()
                .SetCityValue(city)
                .resultFormButton()
                .CheckField();

}