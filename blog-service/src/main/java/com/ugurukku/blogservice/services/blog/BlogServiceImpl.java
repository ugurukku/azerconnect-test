package com.ugurukku.blogservice.services.blog;

import com.ugurukku.blogservice.models.dto.BlogRequest;
import com.ugurukku.blogservice.models.mappers.BlogMapper;
import com.ugurukku.blogservice.models.mybatis.blog.Blog;
import com.ugurukku.blogservice.repository.BlogRepository;
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
public class BlogServiceImpl implements BlogService{

    BlogRepository repository;
    BlogMapper mapper;

    @Override
    public List<Blog> findByUserId(long userId) {
        List<Blog> blogs = repository.findByUserId(userId);
        log.info("Blogs successfully retrieved for user with id : {}",userId);
        return blogs;
    }

    @Override
    public void add(BlogRequest request) {
        Blog blog = mapper.toEntity(request);
        repository.insert(blog);
        log.info("Blog inserted to db with the id : {}",blog.getId());

    }
}
