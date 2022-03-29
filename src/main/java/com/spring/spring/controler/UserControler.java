package com.spring.spring.controler;

import com.spring.spring.domain.Korisnik;
import com.spring.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserControler {
    @Autowired
    UserRepository userRepository;

   @GetMapping("/korisnici")
    List<Korisnik> findAllUser(){
        return (List<Korisnik>) userRepository.findAll();
    }


}
