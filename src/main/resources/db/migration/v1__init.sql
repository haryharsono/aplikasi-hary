create table mahasiswa(
    id int not null,
    nama character varying (255),
    jeniskelamin ENUM ('pria','wanita')
    agama character varying (255),
    email character varying (255),
    tanggalLahir Date not null,
    Constraint id PRIMARY KEY (id)
);
create table agama (
    id int not null,
    agama character varying (255),
    Constraint id PRIMARY KEY (id)
);