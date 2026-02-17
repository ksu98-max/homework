package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
        @BeforeAll
        static void setUp() {
                Configuration.browserSize = "1920x1080";
                Configuration.pageLoadStrategy = "eager";
                Configuration.baseUrl = "https://demoqa.com";
        }

        @Test
        void checkPracticeFormTest() {
                open("");
                $$(".card-body").findBy(text("Forms")).click();
                $$(".router-link").findBy(text("Practice Form")).click();
                //  @BeforeAll
                //  static void  beforeAll() {
                //   Configuration.baseUrl = "https://demoqa.com";
                //   Configuration.browserSize = "1280x1024";
                //   Configuration.timeout = 10000;
                //  Configuration.pageLoadStrategy = "eager";
        }
}