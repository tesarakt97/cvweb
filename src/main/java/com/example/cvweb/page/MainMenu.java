package com.example.cvweb.page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class MainMenu extends BasePage {


    @Step("Открытие вкладки 'Text Box'")
    public MainMenu openMainMenu() {
        open("/elements");
        return new MainMenu();
    }

    @Step("Открытие вкладки 'Student Registration Form'")
    public FormsPage openPracticeForm() {
        open("/automation-practice-form");
        return new FormsPage();
    }

    @Step("Открытие вкладки 'Текстовая форма'")
    public TextBox openTextBoxForm() {
        open("/automation-practice-form");
        return new TextBox();
    }

}
