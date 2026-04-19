package test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import pages.components.CalendarComponent;
import pages.components.TableResultComponent;
import testData.TestBase;

import java.util.Locale;

import static testData.TestData.*;
import static testData.TestData.currentAddress;
import static testData.TestData.firstName;
import static testData.TestData.lastName;
import static testData.TestData.userEmail;
import static testData.TestData.userNumber;

public class Lesson6 extends TestBase {
    PracticeForm practiceForm = new PracticeForm();
    Faker faker = new Faker();
    Faker fakerRu = new Faker(new Locale("ru"));
    CalendarComponent calendarComponent = new CalendarComponent();
    TableResultComponent tableResultComponent = new TableResultComponent();

    @Test
    void Test_with_faker() {

        String firstNameFaker = fakerRu.name().firstName();
        String lastNameFaker = fakerRu.name().lastName();
        String userEmailFaker = faker.internet().emailAddress();
        String userNumberFaker = faker.numerify("##########");
        String currentAddressFaker = fakerRu.address().fullAddress();
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
                .typeFirstName(firstNameFaker)
                .typeLastName(lastNameFaker)
                .typeUserNumber(userNumberFaker)
                .typeUserEmai(userEmailFaker)
                .setGender(genderFaker)
                .typeSubjectSelect(languageFaker)
                .submitHobbies(hobbiesFaker)
                .uploadFile(testFileName)
                .typeCurrentAddress(currentAddressFaker)
                .typeState()
                .SetStateValue(stateFaker)
                .typeCity()
                .SetCityValue(cityFaker);
        calendarComponent.setMonthInput(monthFaker)
                .setYearInput(yearFaker)
                .setDayInput(dayFaker);

        tableResultComponent
                .resultFormButton()
                .checkField();

    }
}