package com.example.cvweb.test;

import com.example.cvweb.assertions.TextBoxAssertions;
import com.example.cvweb.data.constant.TextBoxConstant;
import com.example.cvweb.steps.TextBoxSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

}
