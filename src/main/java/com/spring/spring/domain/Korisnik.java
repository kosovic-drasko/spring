package com.spring.spring.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "korisnik")
public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long korisnikId;
    private String ime;
    private String prezime;

    @ManyToOne
    private Uloge uloge;

}

