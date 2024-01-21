package com.example.cvweb.assertions;

import com.example.cvweb.data.dto.TextBoxDTO;
import com.example.cvweb.page.TextBoxPage;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextBoxAssertions extends BaseAssertions {

    @Autowired
    private TextBoxPage textBoxPage;

    // Поля для заполнения
    @Step("Проверка что поле 'Full Name' содержит значение {fullName}")
    public TextBoxAssertions checkFullName(String fullName) {
        Assertions.assertThat(textBoxPage.getFullNameInput()).isEqualTo(fullName);
        return this;
    }

    @Step("Проверка что поле 'Email' содержит значение {email}")
    public TextBoxAssertions checkEmail(String email) {
        Assertions.assertThat(textBoxPage.getBaseElements().getEmailInput().getText()).isEqualTo(email);
        return this;
    }

    @Step("Проверка что поле 'Current Address' содержит значение {currentAddress}")
    public TextBoxAssertions checkCurrentAddress(String currentAddress) {
        Assertions.assertThat(textBoxPage.getBaseElements().getEmailInput().getText()).isEqualTo(currentAddress);
        return this;
    }

    @Step("Проверка что поле 'Permanent Address' содержит значение {permanentAddress}")
    public TextBoxAssertions checkPermanentAddress(String permanentAddress) {
        Assertions.assertThat(textBoxPage.getBaseElements().getEmailInput().getText()).isEqualTo(permanentAddress);
        return this;
    }

    // Форма отправленных данных
    @Step("Проверка что строка 'Name' содержит значение {name}")
    public TextBoxAssertions checkFormNameField(String name) {
        Assertions.assertThat(textBoxPage.getOutputFullName().getText()).isEqualTo("Name:" + name);
        return this;
    }

    @Step("Проверка что строка 'Email' содержит значение {email}")
    public TextBoxAssertions checkFormEmailField(String email) {
        Assertions.assertThat(textBoxPage.getOutputEmail().getText()).isEqualTo("Email:" +email);
        return this;
    }

    @Step("Проверка что строка 'Current Address' содержит значение {currentAddress}")
    public TextBoxAssertions checkFormCurrentAddressField(String currentAddress) {
        Assertions.assertThat(textBoxPage.getOutputCurrentAddress().getText()).isEqualTo("Current Address :" +currentAddress);
        return this;
    }

    @Step("Проверка что строка 'Permanent Address' содержит значение {permanentAddress}")
    public TextBoxAssertions checkFormPermanentAddressField(String permanentAddress) {
        Assertions.assertThat(textBoxPage.getOutputPermanentAddress().getText()).isEqualTo("Permananet Address :" +permanentAddress);
        return this;
    }

    // Общий метод
    @Step("Проверить форму с отправленным данными")
    public TextBoxAssertions checkOutputForm(TextBoxDTO textBoxDTO) {
        checkFormNameField(textBoxDTO.getFullName());
        checkFormEmailField(textBoxDTO.getEmail());
        checkFormCurrentAddressField(textBoxDTO.getCurrentAddress());
        checkFormPermanentAddressField(textBoxDTO.getPermanentAddress());
        return this;
    }
}
