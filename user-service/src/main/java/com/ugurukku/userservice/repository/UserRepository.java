package com.ugurukku.userservice.repository;

import com.ugurukku.userservice.models.mybatis.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserRepository {

    void insert(User user);

    void update(User user);

    Optional<User> findById(@Param(value = "id") Long id);

    void deleteById(@Param(value = "id") Long id);

}
