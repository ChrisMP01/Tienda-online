package com.christopher.tiendaOnline.modelo;

public class Producto {
	
	private Long idProd;
	private String nomProd;
	private String descripcion;
	private float precio;
	private int descuento;
	
	public Producto(String nomProd, String descripcion, float precio, int descuento) {
		super();
		this.nomProd = nomProd;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	public Producto(Long idProd, String nomProd, String descripcion, float precio, int descuento) {
		super();
		this.idProd = idProd;
		this.nomProd = nomProd;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Producto() {
		super();
	}

	public Long getIdProd() {
		return idProd;
	}

	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}

	public String getNomProd() {
		return nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
