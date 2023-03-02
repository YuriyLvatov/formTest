package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.awt.*;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static com.codeborne.selenide.impl.Html.text;

public class Form {


    @BeforeAll
    static void beforeAll () {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    @Test
    void successfulTest() {
        open("/automation-practice-form");
        //executeJavaScript("body.style.zoom = 90%");
        executeJavaScript("$('footer').remove()");


        $("[id=firstName]").setValue("Andrey");

        $("[id=lastName]").setValue("Frolov");

        $("[id=userEmail]").setValue("Frolov@mail.ru");

        $(byText("Male")).click();

        $("[id=userNumber]").setValue("9603456789");

        $("[id=dateOfBirthInput]").click();
        $(By.className("react-datepicker__year-select")).selectOptionByValue("1991");
        $(By.className("react-datepicker__month-select")).selectOptionByValue("4");
        $(byText("18")).click();

        $x("//*[@id=\"subjectsContainer\"]").setValue("Histor");
        $(byText("History")).click();
        $("[id=subjectsContainer]").setValue("Maths");
        $(byText("Maths")).click();

        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();

        $("[id=currentAddress]").setValue("Bad long history...");


        $("[id=state]").click();
        $(byText("Haryana")).click();

        $("[id=city]").click();
        $(byText("Karnal")).click();

        $("[id=submit]").click();



    }

}