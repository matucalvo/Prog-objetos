package poo.guia1.ejercicio5y10;

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
        StringBuilder cadena = new StringBuilder();
        LocalDate fechaHoy = LocalDate.now();
        cadena.append(descripcion);

        if (fechaRecordatorio != null){
            if (fechaRecordatorio.isAfter(fechaHoy) || fechaRecordatorio.equals(fechaHoy)){
                cadena.append(" (por vencer)");
                this.prioridad = Prioridades.RELEVANTE;
            }
        }

        cadena.append( " -> " + prioridad);



        System.out.println(cadena);
    }

    public boolean verificarEstado(){
        return estado;
    }

    public void setFechaRecordatorio(String fecha){
        this.fechaRecordatorio = LocalDate.parse(fecha);
    }










}




