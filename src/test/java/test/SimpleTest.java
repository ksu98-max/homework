package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static testData.TestData.*;

public class SimpleTest extends TestBase {
    @Test
    void simpleTest() {

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").setValue("17 Feb 2026");
        $("#submit").click();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
    }
}
