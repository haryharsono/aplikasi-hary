package com.haryharsono.aplikasihary.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class agama {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String agama;

}
