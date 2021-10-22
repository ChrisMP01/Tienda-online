USE tiendaOnline
;

CREATE TABLE productos(
idProd bigint auto_increment primary key,
titulo varchar(10),
descripcion varchar(150),
precio float,
descuento int
);
