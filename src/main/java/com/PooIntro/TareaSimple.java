package com.PooIntro;


public class TareaSimple {
    int duracionEnHoras;
    private String titulo;
    boolean completado;

    public TareaSimple(String titulo, boolean completado) {
        this.titulo = titulo;
        this.completado = completado;
    }

    public TareaSimple() {
        // TODO Auto-generated constructor stub
    }

    public void cambiarEstado() {
        completado = !completado;
        /* 
        if (this.completado) {
            this.completado = false;
        } else { 
            this.completado = true;
        }
        */
    }

    public void mostrarTarea() {
        if (completado) {
            System.out.println("La tarea " + titulo + " está completada");
        } else {
            System.out.println("La tarea " + titulo + " no está completada");
        }
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCompletado() {
        return completado;
    }
}
