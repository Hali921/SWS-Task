package com.sws.swstask.forms;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserForm {

    private String last_name;

    private String first_name;

    private String patronymic;

    private String email;

    private String phone_number;
}
