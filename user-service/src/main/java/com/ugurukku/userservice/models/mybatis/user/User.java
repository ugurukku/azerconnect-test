package com.ugurukku.userservice.models.mybatis.user;

import com.ugurukku.userservice.models.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Long id;

    String name;

    String surname;

    String email;

    String password;

    boolean isActive;

    Role role;


}
