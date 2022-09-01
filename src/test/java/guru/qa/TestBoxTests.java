package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void setUp() {
        //Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        String name = "Тестов Тест";
        String email = "test@mail.ru";
        String currentAddress = "University of Cambridge, The Old Schools, Trinity Lane, Cambridge CB2 1TN, UK";
        String permanentAddress = "University of Oxford University Offices Wellington Square Oxford OX1 2JD United Kingdom";

        open("/text-box");
        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue(email);
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=permanentAddress]").setValue(permanentAddress);
        $("[id=submit]").click();
        /*$("[id=output]").shouldHave(text(name),
                text(email),
                text(currentAddress),
                text(permanentAddress));*/
        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=output]").$("[id=email]").shouldHave(text(email));
        $("p[id=currentAddress]").shouldHave(text(currentAddress));
        $("[id=permanentAddress]", 1).shouldHave(text(permanentAddress));
    }
}
