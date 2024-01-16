package com.example.cvweb.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormsPage extends BasePage {

    private final SelenideElement nameInput = $x("//input[@id='firstName']").as("Поле ввода 'Name'");
    private final SelenideElement lastNameInput = $x("//input[@id='lastName']").as("Поле ввода 'Last Name'");

    private final SelenideElement genderRadio = $x("//div[@id='genterWrapper']").as("Форма выбора 'Gender'");
    private final SelenideElement hobbiesRadio = $x("//div[@id='hobbiesWrapper']").as("Форма выбора 'Hobbies'");

    private final SelenideElement permanentAddressInput = $x("//textarea[@id='permanentAddress']").as("Поле ввода 'Permanent Address'");


}
