package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestOne extends TestBase {
      @Test
      void successfulFillFormTest() {
            open("/automation-practice-form");
            $("#firstName").setValue("ksenia");
            $("#lastName").setValue("mal");
            $("#userEmail").setValue("msl@t.ru");
            $("#genterWrapper").$(byText("Female")).click();
            $("#userNumber").setValue("2566587452");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("February");
            $(".react-datepicker__year-select").selectOption("2026");
            $$(".react-datepicker__day").findBy(text("17")).click();
            $("#subjectsInput").setValue("English").pressEnter();
            $("#hobbiesWrapper").$(byText("Music")).click();
            $("#uploadPicture").uploadFromClasspath("pic_2.jpg");
            $("#currentAddress").setValue("Russia. Voronezh").pressEnter();
            $("#state").click();
            $(byText("NCR")).click();
            $("#city").click();
            $(byText("Noida")).click();
            $("#submit").click();

            $(".modal-content").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("ksenia mal"));
            $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("msl@t.ru"));
            $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Female"));
            $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("2566587452"));
            $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("17 February,2026"));
            $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
            $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
            $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("pic_2.jpg"));
            $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Russia. Voronezh"));
            $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Noida"));
      }

      @Test
      void simpleTest() {
            open("");
            $$(".card-body").findBy(text("Forms")).click();
            $$(".router-link").findBy(text("Practice Form")).click();
                  $("#firstName").setValue("ksenia");
                  $("#lastName").setValue("mal");
                  $("#genterWrapper").$(byText("Female")).click();
                  $("#userNumber").setValue("2566587452");
                  $("#dateOfBirthInput").setValue("17 Feb 2026");
                  $("#submit").click();

                  $(".modal-title").shouldHave(text("Thanks for submitting the form"));
      }
}