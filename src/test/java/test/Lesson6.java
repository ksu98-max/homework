package test;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import testData.TestBase;

import java.util.Locale;

import static Utils.randomUtils.*;
import static Utils.randomUtils.getRandomHobbies;
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
        String genderFaker = faker.options().option("Male", "Female", "Other");
        String dayFaker = String.valueOf(faker.number().numberBetween(1, 28));
        String monthFaker = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        String yearFaker = String.valueOf(faker.number().numberBetween(1998, 2025));
        String stateFaker = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        String cityFaker="";
        if (stateFaker.equals("NCR")) {
            cityFaker = faker.options().option("Delhi", "Gurgaon", "Noida");
        }
        if (stateFaker.equals("Uttar Pradesh")) {
            cityFaker = faker.options().option("Agra", "Lucknow", "Merrut");
        }
        if (stateFaker.equals("Haryana")) {
            cityFaker = faker.options().option("Karnal", "Panipat");
        }
        if (stateFaker.equals("Rajasthan")) {
            cityFaker = faker.options().option("Jaipur", "Jaselmer");
        }
        String languageFaker = faker.options().option("English", "Chemistry", "Arts", "Maths", "Biology", "Hindi", "Physics", "Accounting");
        String hobbiesFaker = faker.options().option("Sports", "Reading", "Music");


        practiceForm.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmai(userEmail)
                .typeUserNumber(userNumber)
                .setGender(genderFaker)
                .setDateOfBirght(dayFaker, monthFaker, yearFaker)
                .typeSubjectSelect(languageFaker)
                .submitHobbies(hobbiesFaker)
                .file()
                .typeCurrentAddress(currentAddress)
                .typeState()
                .SetStateValue(stateFaker)
                .typeCity()
                .SetCityValue(cityFaker)
                .resultFormButton()
                .CheckField();
    }
}