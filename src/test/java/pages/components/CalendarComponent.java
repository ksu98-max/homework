package pages.components;

import com.codeborne.selenide.SelenideElement;
import pages.PracticeForm;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static testData.TestData.month;

//public class CalendarComponent {
//    public void setDate(String day, String month, String year) {
//        $(".react-datepicker__month-select").selectOption(month);
//        $(".react-datepicker__year-select").selectOption(year);
//        $$(".react-datepicker__day").findBy(text(day)).click();
//    }
//    private SelenideElement monthInput = $(".react-datepicker__month-select");
//    private SelenideElement yearInput =   $(".react-datepicker__year-select");
//    private SelenideElement dayInput =    $$(".react-datepicker__day");
//
//    public PracticeForm setMonthInput(String value) {
//        monthInput.selectOption(month);
//        return this;
//
//
//
//
//}
