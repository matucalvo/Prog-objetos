package poo.guia1;

public class Libro {
    private String autor = "";
    private String titulo = "";
    private int ejemplares = 0;
    private int ejemplaresDisponibles = 0;
    private int numeroPaginas = 0;
    private int cantPrestamos = 0;




    public Libro(String autor, String titulo, int numeroPaginas, int ejemplares){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.ejemplares = ejemplares;
        this.ejemplaresDisponibles = ejemplares;
    }

    public void setCantidadDisponible(){
        this.ejemplaresDisponibles = ejemplaresDisponibles - cantPrestamos;
    }

    public boolean prestar(){
        boolean condicion = false;
        if (this.cantPrestamos < this.ejemplaresDisponibles){
            this.cantPrestamos++;
            condicion = true;
            setCantidadDisponible();  // cada vez que presta un libro, actualiza la cantidad disponible
        }



        return condicion;
    }

    public boolean devolver(){
        boolean condicion = false;
        if (this.cantPrestamos > 0){
            this.ejemplaresDisponibles++;
            this.cantPrestamos--;
            condicion = true;
            setCantidadDisponible();   // cada vez que devuelve un libro, actualiza la cantidad disponible
        }


        return condicion;
    }


    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getEjemplares(){
        return this.ejemplares;
    }

    public int getEjemplaresDisponibles(){
        return this.ejemplaresDisponibles;
    }

    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }

    public int getCantPrestamos(){
        return this.cantPrestamos;
    }


}


