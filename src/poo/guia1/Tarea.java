package poo.guia1;

import java.time.LocalDate;


public class Tarea {
    private boolean estado = false;
    private Prioridades prioridad;
    private LocalDate fechaRecordatorio;

    private String descripcion;


    public Tarea(String descripcion, boolean estado, Prioridades prioridad){
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public void modificarDescripcion(String nuevaDescripcion){
        descripcion = nuevaDescripcion;
    }

    public void modificarPrioridad(Prioridades nuevaPrioridad){
        prioridad = nuevaPrioridad;
    }

    public void tareaTerminada(){
        estado = true;
    }

    public void mostrarTarea(){
        System.out.println(descripcion);
    }

    public boolean verificarEstado(){
        return estado;
    }








}




