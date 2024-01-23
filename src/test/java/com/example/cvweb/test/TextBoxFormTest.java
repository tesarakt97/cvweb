package com.example.cvweb.test;

import com.example.cvweb.assertions.TextBoxAssertions;
import com.example.cvweb.data.constant.TextBoxConstant;
import com.example.cvweb.steps.TextBoxSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
public class TextBoxFormTest extends BaseTest {

    @Autowired
    private TextBoxSteps textBoxSteps;

    @Autowired
    private TextBoxAssertions textBoxAssertions;

    @Autowired
    private TextBoxConstant textBoxConstant;

    @Test
    @DisplayName("Проверка заполнения формы TestBox - happyCase")
    void testTextBox() {
        mainMenu.openTextBoxForm();
        textBoxSteps.fillForm(textBoxConstant.getTextBoxDTOHappy());
        textBoxAssertions.checkOutputForm(textBoxConstant.getTextBoxDTOHappy());
    }

    @Test
    void selenoidTest() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("113");
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "Test badge...");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});

            /* How to add "trash" button */
            put("labels", new HashMap<String, Object>() {{
                put("manual", "true");
            }});

            /* How to enable video recording */
//            put("enableVideo", true);
            put("enableVNC", true);
        }});
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        driver.get("https://demoqa.com");
//        driver.getScreenshotAs()
    }

}
