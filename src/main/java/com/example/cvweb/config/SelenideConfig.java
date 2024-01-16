package com.example.cvweb.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "sut")
public class SelenideConfig {
//    void BaseSelenideConfig(){
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
//                .screenshots(TestConfig.SCREENSHOTS)
//                .savePageSource(TestConfig.SAVE_PAGE_SOURCE));
//    }

    public String defaultValue;
}
