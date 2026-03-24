package testData;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DataWithFaker {
@Test
void fakerTest()
{
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();

    open("/automation-practice-form");
    $("#firstName").setValue("ksenia");
    $("#lastName").setValue("mal");
    $("#genterWrapper").$(byText("Female")).click();
    $("#userNumber").setValue("2566587452");
    $("#dateOfBirthInput").setValue("17 Feb 2026");
    $("#submit").click();

    $(".modal-title").shouldHave(text("Thanks for submitting the form"));

}
    }


