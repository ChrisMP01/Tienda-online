package com.christopher.tiendaOnline.modelo;

import java.util.List;

public interface ProductoDao {
	int index();
	int guardar(Producto producto);
	int buscar(Producto producto);
	int update(Producto producto);
	int delete(Producto producto);
	List<Producto> findAll();
}
