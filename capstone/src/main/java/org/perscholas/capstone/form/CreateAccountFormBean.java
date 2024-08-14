package org.perscholas.capstone.form;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@ToString
public class CreateAccountFormBean {
    @Email(regexp = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$", message = "Please enter valid Email")
    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    private Integer age;

}
