package test;

import org.junit.jupiter.api.Test;
import pages.PracticeForm;
//import pages.components.CalendarComponent;
import pages.components.CalendarComponent;
import pages.components.TableResultComponent;
import testData.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static testData.TestData.*;
import static testData.TestData.currentAddress;

public class Lessons5 extends TestBase {
    PracticeForm practiceForm = new PracticeForm();
    CalendarComponent calendarComponent = new CalendarComponent();
    TableResultComponent tableResultComponent = new TableResultComponent();

    @Test
    void simpleTest() {
        practiceForm.openPage()
                .removeBanners()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserNumber(userNumber)
                .typeUserEmai(userEmail)
                .setGender(gender)
                .typeSubjectSelect(language)
                .submitHobbies(hobbies)
                .uploadFile(testFileName)
                .typeCurrentAddress(currentAddress)
                .typeState()
                .SetStateValue(state)
                .typeCity()
                .SetCityValue(city);
        calendarComponent.calendarClick()
                .setMonthInput(month)
                .setYearInput(year)
                .setDayInput(day);

        tableResultComponent
                .resultFormButton()
                .checkField();
    }
}

