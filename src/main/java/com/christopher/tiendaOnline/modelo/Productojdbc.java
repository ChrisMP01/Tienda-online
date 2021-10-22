package com.christopher.tiendaOnline.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Productojdbc implements ProductoDao{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int index() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int guardar(Producto producto) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into productos (titulo,descripcion,precio,descuento) values(?,?,?,?)",producto.getNomProd(),producto.getDescripcion(),producto.getPrecio(),producto.getDescuento());
	}

	@Override
	public int buscar(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM productos", (rs,rowNum)->new Producto(rs.getString("titulo"),rs.getString("descripcion"),rs.getFloat("precio"),rs.getInt("descuento")));
	}

}
