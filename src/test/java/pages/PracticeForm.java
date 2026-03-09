package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.CalendarComponent;

import java.util.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testData.TestData.*;
import static testData.TestData.day;

public class PracticeForm {

    //elements
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement userNumberInput = $("#userNumber");
    private SelenideElement genderContainer = $("#genterWrapper");
    CalendarComponent calendar = new CalendarComponent();
    private SelenideElement subjectInput = $("#subjectsInput");
    private SelenideElement hobbiesButton = $("#hobbiesWrapper");
    private SelenideElement fileToUpload = $("#uploadPicture");
    private SelenideElement currentAddress = $("#currentAddress");
    private SelenideElement stateButton = $("#state");
    private SelenideElement stateInput = $("#state");
    private SelenideElement cityButton = $("#city");
    private SelenideElement cityInput = $("#city");
    public  SelenideElement resultFormButton = $("#submit");
    public  SelenideElement fieldResult = $(".modal-header");

    //action
    public PracticeForm openPage() {
        open("/automation-practice-form");
        return this;
    }

    public PracticeForm typeFirstName(String value) {
        firstNameInput.setValue(value);
return this;
}
    public PracticeForm typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public PracticeForm typeUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    public PracticeForm setGender(String value) {
        genderContainer.$(byText(value)).click();
        return this;
    }
    public PracticeForm setDateOfBirght (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendar.setDate(day, month,year);
        return this;
    }
    public PracticeForm typeSubjectSelect(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public PracticeForm submitHobbies(String value) {
        hobbiesButton.$(byText(value)).click();
        return this;
    }
    public PracticeForm file() {
        fileToUpload.uploadFromClasspath("pic_2.jpg");
        return this;
    }
    public PracticeForm typeCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }
    public PracticeForm typeState() {
        stateButton.click();
        return this;
    }
    public PracticeForm SetStateValue (String value) {
        stateInput.$(byText(value)).click();
        return this;
    }
    public PracticeForm typeCity() {
        cityButton.click();
        return this;
    }
    public PracticeForm SetCityValue (String value) {
        cityInput.$(byText(value)).click();
        return this;
    }
    public PracticeForm resultFormButton() {
        resultFormButton.click();
        return this;
    }
    public PracticeForm CheckField() {
        fieldResult.shouldHave(text("Thanks for submitting the form"));
        return this;
    }
}
