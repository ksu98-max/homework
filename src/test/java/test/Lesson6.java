package test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import pages.components.CalendarComponent;
import pages.components.TableResultComponent;
import testData.TestBase;
import testData.TestDataWithFaker;

import java.util.Locale;

import static testData.TestData.*;
import static testData.TestData.currentAddress;
import static testData.TestData.firstName;
import static testData.TestData.lastName;
import static testData.TestData.userEmail;
import static testData.TestData.userNumber;

public class Lesson6 extends TestBase {

    Faker faker = new Faker();
    Faker fakerRu = new Faker(new Locale("ru"));

    PracticeForm practiceForm = new PracticeForm();
    CalendarComponent calendarComponent = new CalendarComponent();
    TableResultComponent tableResultComponent = new TableResultComponent();
    TestDataWithFaker testData = new TestDataWithFaker();

    @Test
    void Test_with_faker() {


        practiceForm.openPage()
                .removeBanners()
                .typeFirstName(testData.getFirstNameFaker())
                .typeLastName(testData.getLastNameFaker())
                .typeUserNumber(testData.getUserNumberFaker())
                .typeUserEmai(testData.getUserEmailFaker())
                .setGender(testData.getGenderFaker())
                .typeSubjectSelect(testData.getLanguageFaker())
                .submitHobbies(testData.getHobbiesFaker())
                .uploadFile(testFileName)  // это, видимо, отдельная переменная
                .typeCurrentAddress(testData.getCurrentAddressFaker())
                .typeState()
                .SetStateValue(testData.getStateFaker())
                .typeCity()
                .SetCityValue(testData.getCityFaker());

        calendarComponent.setMonthInput(testData.getMonthFaker())
                .setYearInput(testData.getYearFaker())
                .setDayInput(testData.getDayFaker());

        tableResultComponent
                .resultFormButton()
                .checkField();
    }
}