package com.ugurukku.blogservice.services.blog;

import com.ugurukku.blogservice.models.dto.BlogRequest;
import com.ugurukku.blogservice.models.mybatis.blog.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findByUserId(long userId);

    void add(BlogRequest request);

}
