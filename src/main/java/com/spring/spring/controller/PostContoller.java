package com.spring.spring.controller;

import com.spring.spring.domain.Post;
import com.spring.spring.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/api")
@Transactional
public class PostContoller {

    PostRepository postRepository;


    @GetMapping("/post")
        public List<Post> getAll(){
            return postRepository.findAll();
        }


}
