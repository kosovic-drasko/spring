package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@Data
public class PostComment {
@Id
@GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;
    private String review;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Post post;


}
