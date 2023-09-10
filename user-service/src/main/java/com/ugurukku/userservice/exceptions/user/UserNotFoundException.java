package com.ugurukku.userservice.exceptions.user;

import com.ugurukku.userservice.exceptions.NotFoundException;

public class UserNotFoundException extends NotFoundException {

    public UserNotFoundException(long id) {
        super(String.format("User not found for id : %s",id));
    }
}
