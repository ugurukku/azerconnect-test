package com.ugurukku.userservice.services.user;

import com.ugurukku.userservice.models.dto.UserRequest;
import com.ugurukku.userservice.models.dto.UserResponse;
import com.ugurukku.userservice.models.mybatis.user.User;

public interface UserService {
    void insert(UserRequest userRequest);

    User findById(long id);

    UserResponse findWithBlogsById(long id);
}
