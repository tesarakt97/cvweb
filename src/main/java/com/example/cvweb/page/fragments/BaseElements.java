package com.example.cvweb.page.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BaseElements {

    private final SelenideElement currentAddressInput = $x("//textarea[@id='currentAddress']").as("Поле ввода 'Current Address'");
    private final SelenideElement emailInput = $x("//input[@id='userEmail']").as("Поле ввода 'Email'");
    private final SelenideElement submitButton = $x("//button[@id='submit']").as("Кнопка 'Submit'");

}
