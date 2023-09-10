package com.ugurukku.userservice.services.user;

import com.ugurukku.userservice.exceptions.user.UserNotFoundException;
import com.ugurukku.userservice.external.model.Blog;
import com.ugurukku.userservice.external.services.BlogService;
import com.ugurukku.userservice.models.dto.UserRequest;
import com.ugurukku.userservice.models.dto.UserResponse;
import com.ugurukku.userservice.models.mappers.UserMapper;
import com.ugurukku.userservice.models.mybatis.user.User;
import com.ugurukku.userservice.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    UserMapper mapper;
    UserRepository repository;

    BlogService blogService;

    @Override
    public void insert(UserRequest userRequest) {
        User user = mapper.toEntity(userRequest);
        repository.insert(user);
        log.info("User inserted to db with the id : {}",user.getId());
    }

    @Override
    public User findById(long id) {
        User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        log.info("User retrieved with the id : {}",user.getId());
        return user;
    }

    public UserResponse findWithBlogsById(long id){
        User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        List<Blog> blogsByUserId = blogService.getBlogsByUserId(id);
        log.info("User with blogs retrieved with the id : {}",user.getId());
        return new UserResponse(user.getName(), user.getSurname(), blogsByUserId);
    }

}
