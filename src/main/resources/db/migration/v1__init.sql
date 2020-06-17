
create table agama (
    kode_agama character varying (255) not null primary key,
    nama_agama character varying (255) not null unique,
    created_date timestamp not null,
    created_by character varying (50)


);