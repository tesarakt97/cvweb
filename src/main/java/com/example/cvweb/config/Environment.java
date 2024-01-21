package com.example.cvweb.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Environment {

    @Value("${selenide.baseUrl}")
    public String baseUrl;

    @Value("${selenide.browserSize}")
    public String browserSize;

    @Value("${selenide.defaultAwaiting}")
    public String defaultAwaiting;

    @Value("${selenide.browser}")
    public String browser;

    @Value("${selenide.headless}")
    public boolean headless;

    @Value("${selenide.fastSetValue}")
    public boolean fastSetValue;

    @Value("${selenide.clickViaJs}")
    public boolean clickViaJs;

    @Value("${selenide.webdriverLogsEnabled}")
    public boolean webdriverLogsEnabled;

    @Value("${selenide.fileDownload}")
    public boolean fileDownload;

}
