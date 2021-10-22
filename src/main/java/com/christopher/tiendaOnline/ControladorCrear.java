package com.christopher.tiendaOnline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.christopher.tiendaOnline.modelo.Producto;
import com.christopher.tiendaOnline.modelo.ProductoDao;

@Controller
public class ControladorCrear {
	
	@Autowired
	ProductoDao productoDao;
	
	@RequestMapping(value="crear", method=RequestMethod.GET)
	public String crearProducto_get() {
		
		return "crearProducto";
	}
	
	@RequestMapping(value="crearProducto", method=RequestMethod.POST)
	public String crearProducto(Model modelo, @RequestParam String titulo,@RequestParam String descripcion,@RequestParam float precio, @RequestParam int descuento) {
		
		modelo.addAttribute("",titulo);
		modelo.addAttribute("",descripcion);
		modelo.addAttribute("",descuento);
		
		Producto p = new Producto(null, titulo, descripcion, precio, descuento);
		
		productoDao.guardar(p);
		List<Producto>productos=productoDao.findAll();
		modelo.addAttribute("lista_prod",productos);
		return "index";
	}
}
