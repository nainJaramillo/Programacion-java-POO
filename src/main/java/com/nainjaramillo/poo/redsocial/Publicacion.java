package com.nainjaramillo.poo.redsocial;

public class Publicacion {
	private String contenido;
	private int likes;
	private String hora;
	
	
	public Publicacion(String publicacion) {
		super();
		this.contenido = publicacion;
	}
	
	
	public String getPublicacion() {
		return contenido;
	}
	
	
	public void setPublicacion(String publicacion) {
		this.contenido = publicacion;
	}
	
	
	public int getLikes() {
		return likes;
	}
	
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	public String getHora() {
		return hora;
	}
	
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
		
	
}

