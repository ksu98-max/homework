package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static testData.TestData.month;
import static testData.TestData.year;

public class CalendarComponent {
    private SelenideElement dateOfBirthClick = $(".#dateOfBirthInput");
    private SelenideElement monthInput = $(".react-datepicker__month-select");
    private SelenideElement yearInput = $(".react-datepicker__year-select");
    private SelenideElement dayInput = $(".react-datepicker__day");


    public CalendarComponent calendarClick() {
        dateOfBirthClick.click();
        return this;
    }
    public CalendarComponent setMonthInput(String value) {
        monthInput.selectOption(month);
        return this;
    }

    public CalendarComponent setYearInput(String value) {
        yearInput.selectOption(year);
        return this;
    }

    public CalendarComponent setDayInput(String value) {
        dayInput.$(byText(value)).click();
        return this;
    }
}
