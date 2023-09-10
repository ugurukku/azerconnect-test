package com.ugurukku.userservice.controllers;


import com.ugurukku.userservice.models.dto.UserRequest;
import com.ugurukku.userservice.models.dto.UserResponse;
import com.ugurukku.userservice.models.mybatis.user.User;
import com.ugurukku.userservice.services.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1/users")
public record UserController(
        UserService service
) {


    @GetMapping("/{id}")
    public ResponseEntity<User> retrieveById(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/{id}/blogs")
    public ResponseEntity<UserResponse> retrieveByIdWithBlogs(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.findWithBlogsById(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody UserRequest userRequest){
        service.insert(userRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
