package com.cvicse.blog.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

}
