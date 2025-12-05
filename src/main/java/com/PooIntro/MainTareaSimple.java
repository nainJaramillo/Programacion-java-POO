package com.PooIntro;

public class MainTareaSimple {


public static void main(String[] args) {
        TareaSimple objeto1 = new TareaSimple();
        objeto1.setTitulo("Nueva Tarea");
        System.out.println(objeto1.getTitulo());

        TareaSimple objeto2 = new TareaSimple("Otra tarea", false);
        System.out.println(objeto2.getTitulo());

        TareaSimple objeto3 = new TareaSimple("Tercera tarea", true);
        objeto3.mostrarTarea();
        
        
    }


}
