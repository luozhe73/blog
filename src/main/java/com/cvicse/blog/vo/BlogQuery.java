package com.cvicse.blog.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Data
@NoArgsConstructor
@Transactional
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;

}
