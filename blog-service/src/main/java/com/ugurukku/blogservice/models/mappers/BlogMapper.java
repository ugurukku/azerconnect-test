package com.ugurukku.blogservice.models.mappers;

import com.ugurukku.blogservice.models.dto.BlogRequest;
import com.ugurukku.blogservice.models.mybatis.blog.Blog;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BlogMapper {

    public Blog toEntity(BlogRequest request){
        return Blog
                .builder()
                .header(request.header())
                .content(request.content())
                .userId(request.userId())
                .addedDate(LocalDate.now())
                .build();
    }

}
