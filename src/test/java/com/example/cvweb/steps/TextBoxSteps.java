package com.example.cvweb.steps;

import com.example.cvweb.data.dto.TextBoxDTO;
import com.example.cvweb.page.TextBoxPage;
import io.qameta.allure.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextBoxSteps extends BaseSteps {

    @Autowired
    private TextBoxPage textBoxPage;

    @Step("Заполнить форму TextBoxPage")
    public TextBoxSteps fillForm(TextBoxDTO textBoxDTO) {
        textBoxPage.setFullName(textBoxDTO.getFullName());
        textBoxPage.getBaseElements().setEmailInput(textBoxDTO.getEmail());
        textBoxPage.getBaseElements().setCurrentAddress(textBoxDTO.getCurrentAddress());
        textBoxPage.setPermanentInput(textBoxDTO.getPermanentAddress());
        textBoxPage.getBaseElements().clickSubmitButton();
        return this;
    }

}
