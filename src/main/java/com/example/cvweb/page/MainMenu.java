package com.example.cvweb.page;

import io.qameta.allure.Step;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.open;

@Component
public class MainMenu extends BasePage {


    @Step("Открытие главного меню")
    public MainMenu openMainMenu() {
        open("/elements");
        return new MainMenu();
    }

    @Step("Открытие вкладки 'Student Registration Form'")
    public FormsPage openPracticeForm() {
        open("/automation-practice-form");
        return new FormsPage();
    }

    @Step("Открытие вкладки 'Text Box'")
    public TextBoxPage openTextBoxForm() {
        open("/text-box");
        return new TextBoxPage();
    }
}
