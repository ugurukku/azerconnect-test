package com.ugurukku.userservice.external.services;

import com.ugurukku.userservice.external.model.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BLOG-SERVICE",path = "/api/v1/blogs")
public interface BlogService {

    @GetMapping("/{userId}")
    List<Blog> getBlogsByUserId(@PathVariable("userId") long userId);

}
