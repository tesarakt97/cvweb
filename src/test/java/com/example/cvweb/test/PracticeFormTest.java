package com.example.cvweb.test;


import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование Форм")
@Features({@Feature("form-service"), @Feature("forms")})
@Tags({@Tag("forms")})
public class PracticeFormTest extends BaseTest {


    @Test
    @AllureId("1")
    @DisplayName("Проверка заполнение формы")
    @Owner("Max")
    @Issue("CV-21")
    @Link(name = "CV-2", url = "https://jira.max.ru/browse/CV-2")
    @Tag("postitive")
    void checkFormFilling() {

    }

}
