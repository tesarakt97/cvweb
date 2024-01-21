package com.example.cvweb.config;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class SelenideConfig {


    // allure-selenide
    public static final boolean SCREENSHOTS = true;
    public static final boolean SAVE_PAGE_SOURCE = true;
    public static final String BROWSER_SIZE = "1900x1000";

}
