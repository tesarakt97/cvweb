package com.example.cvweb.page.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class FormsElement extends BaseElements {

    private final SelenideElement
            currentAddressInput = $x("//textarea[@id='currentAddress']").as("Поле ввода 'Current Address'"),
            emailInput = $x("//input[@id='userEmail']").as("Поле ввода 'Email'"),
            fullNameInput = $x("//input[@id='userName']").as("Поле ввода 'Full Name'"),
            nameInput = $x("//input[@id='firstName']").as("Поле ввода 'Name'"),
            lastNameInput = $x("//input[@id='lastName']").as("Поле ввода 'Last Name'"),
            genderRadio = $x("//div[@id='genterWrapper']").as("Форма выбора 'Gender'"),
            hobbiesRadio = $x("//div[@id='hobbiesWrapper']").as("Форма выбора 'Hobbies'"),
            permanentAddressInput = $x("//textarea[@id='permanentAddress']").as("Поле ввода 'Permanent Address'");


}
