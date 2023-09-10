package com.ugurukku.blogservice.repository;

import com.ugurukku.blogservice.models.mybatis.blog.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogRepository {

    void insert(Blog blog);

    List<Blog> findByUserId(long userId);

}
