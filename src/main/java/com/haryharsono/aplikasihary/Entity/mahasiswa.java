package com.haryharsono.aplikasihary.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
//@Entity
public class mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nama;
    private JenisKelamin jeniskelamin;
    @OneToOne
    private String agama;
    private String email;
    private Date tglLahir;


}
