package com.haryharsono.aplikasihary.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class agama {
    @Id
    @GenericGenerator(name = "agama_id",strategy = "uuid2")
    @GeneratedValue(generator = "agama_id")
    @Column(name = "kode_agama")
    private String id;
    @Column(name = "nama_agama",nullable = false,unique = true,length = 50)
    private String nama;
    private String deskripsi;
    @Column(nullable = false)
    private Timestamp createdate;
    @Column(length = 50)
    private String createdby;


}
