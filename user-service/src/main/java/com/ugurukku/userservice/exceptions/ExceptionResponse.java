package com.ugurukku.userservice.exceptions;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ExceptionResponse {

    int code;
    String message;

}
