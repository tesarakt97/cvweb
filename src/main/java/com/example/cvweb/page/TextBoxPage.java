package com.example.cvweb.page;

import com.codeborne.selenide.SelenideElement;
import com.example.cvweb.page.fragments.BaseElements;
import io.qameta.allure.Step;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
@Getter
public class TextBoxPage extends BasePage {

    @Autowired
    protected BaseElements baseElements;

    private final SelenideElement
            fullNameInput = $("#userName").as("Поле ввода 'Full Name'"),
            permanentAddressInput = $("#permanentAddress").as("Поле ввода 'Permanent Address'");

    private final SelenideElement
            outputForm = $("#output").as("Форма отображения отправленных данных"),
            outputFullName = outputForm.$("#name").as("Отображение отправленого поля 'Full Name'"),
            outputEmail = outputForm.$("#email").as("Отображение отправленого поля 'Email'"),
            outputCurrentAddress = outputForm.$("#currentAddress").as("Отображение отправленого поля 'Current Address'"),
            outputPermanentAddress = outputForm.$("#permanentAddress").as("Отображение отправленого поля 'Permanent Address'");


    @Step("Заполнить поле 'Full Name'")
    public TextBoxPage setFullName(String fullName) {
        fullNameInput.setValue(fullName);
        return this;
    }

    @Step("Заполнить поле 'Permanent Address'")
    public TextBoxPage setPermanentInput(String permanentAddress) {
        permanentAddressInput.setValue(permanentAddress);
        return this;
    }
}
