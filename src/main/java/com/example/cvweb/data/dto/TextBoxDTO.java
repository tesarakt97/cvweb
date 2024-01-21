package com.example.cvweb.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class TextBoxDTO extends BaseDTO {

    private final String fullName;
    private final String email;
    private final String currentAddress;
    private final String permanentAddress;

}
