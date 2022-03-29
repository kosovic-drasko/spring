package com.spring.spring.repository;

import com.spring.spring.domain.Korisnik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Korisnik,Long> {



}
