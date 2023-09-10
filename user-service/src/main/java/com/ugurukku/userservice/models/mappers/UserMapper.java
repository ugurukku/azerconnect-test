package com.ugurukku.userservice.models.mappers;

import com.ugurukku.userservice.models.dto.UserRequest;
import com.ugurukku.userservice.models.enums.Role;
import com.ugurukku.userservice.models.mybatis.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserRequest request){
        return User.builder()
                .name(request.name())
                .surname(request.surname())
                .email(request.email())
                .password(request.password())
                .role(Role.USER)
                .build();
    }

}
