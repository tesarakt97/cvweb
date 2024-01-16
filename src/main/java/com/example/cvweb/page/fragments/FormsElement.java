package com.example.cvweb.page.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class FormsElement extends BaseElements {

    private final SelenideElement currentAddressInput = $x("//textarea[@id='currentAddress']").as("Поле ввода 'Current Address'");
    private final SelenideElement emailInput = $x("//input[@id='userEmail']").as("Поле ввода 'Email'");
    private final SelenideElement fullNameInput = $x("//input[@id='userName']").as("Поле ввода 'Full Name'");
    private final SelenideElement nameInput = $x("//input[@id='firstName']").as("Поле ввода 'Name'");
    private final SelenideElement lastNameInput = $x("//input[@id='lastName']").as("Поле ввода 'Last Name'");

    private final SelenideElement genderRadio = $x("//div[@id='genterWrapper']").as("Форма выбора 'Gender'");
    private final SelenideElement hobbiesRadio = $x("//div[@id='hobbiesWrapper']").as("Форма выбора 'Hobbies'");

    private final SelenideElement permanentAddressInput = $x("//textarea[@id='permanentAddress']").as("Поле ввода 'Permanent Address'");


}
