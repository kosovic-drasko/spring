package com.spring.spring.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "uloge")
public class Uloge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ulogaId;
    private String nazivUloge;

    @OneToMany(mappedBy = "uloge")
    private List<Korisnik> korisnik;

}
