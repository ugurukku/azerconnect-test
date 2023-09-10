package com.ugurukku.userservice.models.dto;

public record UserRequest(
        String name,

        String surname,

        String email,

        String password
) {
}
