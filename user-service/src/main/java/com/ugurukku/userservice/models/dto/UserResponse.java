package com.ugurukku.userservice.models.dto;

import com.ugurukku.userservice.external.model.Blog;

import java.util.List;

public record UserResponse(
        String name,

        String surname,
        List<Blog> blogs
){
}
