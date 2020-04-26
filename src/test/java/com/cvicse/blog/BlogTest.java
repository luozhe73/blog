package com.cvicse.blog;

import com.cvicse.blog.dao.BlogRepository;
import com.cvicse.blog.exception.NotFoundException;
import com.cvicse.blog.po.Blog;
import com.cvicse.blog.util.MarkdownUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogTest {

    @Autowired
    BlogRepository blogRepository;

    @Test
    void TestBlog(){

        Blog blog = blogRepository.getOne(1L);
        if (blog == null) {
            throw new NotFoundException("该博客不存在");
        }
        Blog b = new Blog();
        BeanUtils.copyProperties(blog,b);
        String content = b.getContent();
        b.setContent(MarkdownUtils.markdownToHtmlExtensions(content));

    }
}
