USE tiendaOnline;
DROP TABLE IF EXISTS productos;

CREATE TABLE productos(
idProd bigint auto_increment primary key,
titulo varchar(50),
descripcion varchar(150),
precio float,
descuento int
);


