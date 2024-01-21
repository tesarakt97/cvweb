package com.example.cvweb.data.constant;

import com.example.cvweb.data.dto.TextBoxDTO;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TextBoxConstant extends BaseConstant {

    private final TextBoxDTO textBoxDTOHappy = new TextBoxDTO(
            faker.name().fullName(),
            faker.internet().emailAddress(),
            faker.address().streetAddress(),
            faker.address().fullAddress()
    );

}
