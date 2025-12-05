package com.PooIntro;

public class MainTareaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TareaSimple objeto1 = new TareaSimple();
		objeto1.setTitulo = "Nueva Tarea";
		System.out.println(objeto1.getTitulo);
		
		TareaSimple objeto2 = new TareaSimple("Otra tarea", false);
		System.out.println(objeto2.titulo);
	
		TareaSimple objeto3 = new TareaSimple("demo",true);
		objeto3.MostrarTarea();
		
	 
		
		
		
		
		
		
		
	}

}
