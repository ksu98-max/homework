package pages.components;

import com.codeborne.selenide.SelenideElement;
import pages.PracticeForm;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TableResultComponent {
    public SelenideElement fieldResult = $(".modal-header");
    public SelenideElement resultFormButton = $("#submit");


    public TableResultComponent resultFormButton() {
        resultFormButton.click();
        return this.resultFormButton();
    }
    public TableResultComponent checkField() {
        fieldResult.shouldHave(text("Thanks for submitting the form"));
        return this;
    }
}
