package com.huy.JavaSpringBoot.dto.request;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public UserRequestDTO(String firstName, String email, String phone, String lastName) {
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
