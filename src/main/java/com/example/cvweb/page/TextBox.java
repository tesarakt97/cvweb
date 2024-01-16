package com.example.cvweb.page;

import com.codeborne.selenide.SelenideElement;
import com.example.cvweb.page.fragments.BaseElements;

import static com.codeborne.selenide.Selenide.$x;

public class TextBox extends BasePage {

    BaseElements baseElements = new BaseElements();
    private final SelenideElement fullNameInput = $x("//input[@id='userName']").as("Поле ввода 'Full Name'");
    private final SelenideElement permanentInput = $x("//textarea[@id='permanentAddress']").as("Поле ввода 'Permanent Address'");


}
