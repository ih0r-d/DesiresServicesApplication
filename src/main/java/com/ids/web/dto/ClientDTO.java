package com.ids.web.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ClientDTO {
    @NotNull(message = "firstName can not be NULL")
    @Size(min = 3, max = 15, message = "firstName should be from 3 to 15 chars")
    private String name;

    @NotNull(message = "lastName can not be NULL")
    @Size(min = 3, max = 15, message = "lastName should be from 3 to 15 chars")
    private String secondName;

    @NotNull(message = "password can not be NULL")
    @Size(min = 4, message = "password min size 4 chars")
    private String password;

    @NotNull(message = "phoneNumber can not be NULL")
    @Size(min = 10, max = 20, message = "phoneNumber should be from 10 to 20 chars")
    private String phoneNumber;

    @NotNull(message = "email can not be NULL")
    @Email(message = "INVALID EMAIL")
    private String email;

}