package poo.guia1.ejercicio9;

import java.time.LocalDate;

public class Fecha {
    private String fecha = "";


    public Fecha(String fecha){
        this.fecha = fecha;
    }

    public String getFecha(){
        return this.fecha;
    }


    public LocalDate transformarFecha(){
        return LocalDate.parse(this.fecha);
    }

    public boolean seEncuentraEntreDosFechas(String fecha1, String fecha2){
        LocalDate fecha_1 = LocalDate.parse(fecha1);
        LocalDate fecha_2 = LocalDate.parse(fecha2);
        LocalDate fechaOriginal = transformarFecha();

        return fechaOriginal.isBefore(fecha_1) && fechaOriginal.isAfter(fecha_2);
    }

    public boolean esMayor(String fecha1){
        LocalDate fechaOriginal = transformarFecha();
        LocalDate fecha1t = LocalDate.parse(fecha1);

        return fechaOriginal.isAfter(fecha1t);
    }


    public boolean esMenor(String fecha1){
        LocalDate fechaOriginal = transformarFecha();
        LocalDate fecha1t = LocalDate.parse(fecha1);

        return fechaOriginal.isBefore(fecha1t);
    }

    
}
