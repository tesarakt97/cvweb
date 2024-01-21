package com.example.cvweb.page.fragments;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class BaseElements {

    private final SelenideElement
            currentAddressInput = $x("//textarea[@id='currentAddress']").as("Поле ввода 'Current Address'"),
            emailInput = $x("//input[@id='userEmail']").as("Поле ввода 'Email'");

    private final SelenideElement
            submitButton = $x("//button[@id='submit']").as("Кнопка 'Submit'");


    @Step("Заполнить поле 'Current Address'")
    public BaseElements setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    @Step("Заполнить поле 'Email'")
    public BaseElements setEmailInput(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Нажать на кнопку Submit")
    public BaseElements clickSubmitButton() {
        submitButton.click();
        return this;
    }
}
