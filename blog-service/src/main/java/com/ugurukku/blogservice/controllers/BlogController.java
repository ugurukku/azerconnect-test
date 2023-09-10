package com.ugurukku.blogservice.controllers;

import com.ugurukku.blogservice.models.dto.BlogRequest;
import com.ugurukku.blogservice.models.mybatis.blog.Blog;
import com.ugurukku.blogservice.services.blog.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/blogs")
public record BlogController(BlogService service) {

    @GetMapping("/{userId}")
    public ResponseEntity<List<Blog>> retrieveAllByUserId(@PathVariable("userId") long userId) {
        return ResponseEntity.ok(service.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody BlogRequest request){
        service.add(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
