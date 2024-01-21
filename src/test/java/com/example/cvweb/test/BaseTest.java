package com.example.cvweb.test;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.cvweb.config.Environment;
import com.example.cvweb.config.SelenideConfig;
import com.example.cvweb.page.MainMenu;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.openqa.selenium.PageLoadStrategy.NONE;

@SpringBootTest
@Epic("Тестирование WEB приложений")
@Feature("Тестирование WEB")
public abstract class BaseTest {

    //Добавить java faker
    @Autowired
    Environment environment;

    @Autowired
    SelenideConfig selenideConfig;

    @Autowired
    MainMenu mainMenu;

    @BeforeAll
    @Step("Базовая настройка драйвера")
    static void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(NONE);//Требуется так как сайт demoqa очень долго загружается до конца
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        WebDriverRunner.setWebDriver(chromeDriver);
    }

    @BeforeEach
    @Step("Базовая настройка браузера перед тестом")
    void configBrowser() {
        Configuration.baseUrl = environment.getBaseUrl();
        Configuration.browserSize = environment.getBrowserSize();
        Configuration.headless = environment.isHeadless();
        Configuration.webdriverLogsEnabled = environment.isWebdriverLogsEnabled();
        Configuration.clickViaJs = environment.isClickViaJs();
    }

    @AfterAll
    static void tearDown() {
        Selenide.closeWebDriver();
    }
}
