package com.ugurukku.blogservice.models.mybatis.blog;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {

    Long id;

    String header;

    String content;

    Long userId;

    LocalDate addedDate;

}
