package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class Form {


    @BeforeAll
    static void beforeAll () {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successfulTest() {
        open("/automation-practice-form");

        $("[id=firstName]").setValue("Andrey");
        $("[id=lastName]").setValue("Frolov");
        $("[id=userEmail]").setValue("Frolov@mail.ru");
        $("[id=gender-radio-3]").setValue("true");
        $("[id=userNumber]").setValue("9603456789");
        $("[id=dateOfBirth]").click();

    }

}