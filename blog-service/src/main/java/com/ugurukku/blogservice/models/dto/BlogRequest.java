package com.ugurukku.blogservice.models.dto;

import java.time.LocalDate;

public record BlogRequest(
        String header,

        String content,

        long userId,

        LocalDate addedDate
) {

}
