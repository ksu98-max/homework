package test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import testData.TestBase;

import java.util.Locale;

import static testData.TestData.*;

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
        String cityFaker = "";
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
                .removeBanners()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmai(userEmail)
                .typeUserNumber(userNumber)
                .setGender(genderFaker)
                .setMonthInput(monthFaker)
                .setYearInput(yearFaker)
                .setDayInput(dayFaker)
                .typeSubjectSelect(languageFaker)
                .submitHobbies(hobbiesFaker)
                .uploadFile(testFileName)
                .typeCurrentAddress(currentAddress)
                .typeState()
                .SetStateValue(stateFaker)
                .typeCity()
                .SetCityValue(cityFaker)
                .resultFormButton()
                .checkField();
    }
}