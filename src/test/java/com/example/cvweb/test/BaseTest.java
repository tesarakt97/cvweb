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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

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

    static ChromeOptions chromeOptions = new ChromeOptions();

    @BeforeAll
    @Step("Базовая настройка драйвера")
    static void setUp() {
        chromeOptions.setPageLoadStrategy(NONE);//Требуется так как сайт demoqa очень долго загружается до конца
    }

    @BeforeEach
    @Step("Базовая настройка браузера перед тестом")
    void configBrowser() throws MalformedURLException {
        Configuration.baseUrl = environment.getBaseUrl();
        Configuration.browserSize = environment.getBrowserSize();
        Configuration.headless = environment.isHeadless();
        Configuration.webdriverLogsEnabled = environment.isWebdriverLogsEnabled();
        Configuration.clickViaJs = environment.isClickViaJs();
//        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
//        chromeDriver.manage().window().maximize();
//        WebDriverRunner.setWebDriver(chromeDriver);
        if (environment.isRemote) {
//            ChromeOptions options = new ChromeOptions();
//            options.setBrowserVersion("113");
            chromeOptions.setBrowserVersion("113");
            chromeOptions.setCapability("selenoid:options", new HashMap<String, Object>() {{
                put("name", "Test badge...");
                put("sessionTimeout", "15m");
                put("env", new ArrayList<String>() {{
                    add("TZ=UTC");
                }});
                put("labels", new HashMap<String, Object>() {{
                    put("manual", "true");
                }});
//                put("enableVideo", true);
                put("enableVNC", true);
            }});
            RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);

            WebDriverRunner.setWebDriver(driver);
        } else {
            chromeOptions.setBrowserVersion("118");
            WebDriverRunner.setWebDriver(new ChromeDriver(chromeOptions));
        }
    }

    @AfterAll
    @Step("Очитка браузера")
    static void tearDown() {
        Selenide.closeWebDriver();
        WebDriverRunner.closeWebDriver();
    }
}
