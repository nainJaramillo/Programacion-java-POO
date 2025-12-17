package com.nainjaramillo.poo.redsocial;



public class GeneradorPerfiles {

    
    public static PerfilRedSocial crearPerfilPrueba(String nombreUsuario) {
        PerfilRedSocial p= new PerfilRedSocial();
        p.setNombreUsuario(nombreUsuario);
        p.setCiudad("Madrid");
        return p;
        
    }
    
    public static PerfilRedSocial crearPerfilPrueba(String nombreUsuario, int numeroPublicaciones) {
    	PerfilRedSocial p= crearPerfilPrueba(nombreUsuario);
    	
    	return p;
    }

   
}

