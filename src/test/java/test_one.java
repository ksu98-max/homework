import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.channels.ConnectionPendingException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class test_one extends TestBase {
      @Test
         void successfulFillFormTest() {
open("automation-practice-form");
      $("#firstName").setValue("ksenia");
      $("#lastName").setValue("mal");
      $("#userEmail").setValue("msl@t.ru");
      $("#id=gender-radio-2").setValue("Female");
      $("#userNumber").setValue("2569854785");
      $("#id=submit").click();
      }
}
