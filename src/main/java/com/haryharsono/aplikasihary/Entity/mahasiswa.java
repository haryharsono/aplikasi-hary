package com.haryharsono.aplikasihary.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nama;
    private JenisKelamin jeniskelamin;
    private String agama;
    private String email;
    private Date tglLahir;


}
