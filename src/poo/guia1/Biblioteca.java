package poo.guia1;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibro(Libro libro){
        System.out.println(" \nEl libro " + libro.getTitulo() + " creado por el autor " + libro.getAutor() + " tiene " + libro.getNumeroPaginas() +" páginas, quedan "+ libro.getEjemplaresDisponibles() + " disponibles y se prestaron " + libro.getCantPrestamos() + "\n");
    }

    public void libroConMayorPaginas(){
        int cant = 0;
        String nombre = "";
        for (Libro l: libros){
            if (l.getNumeroPaginas() > cant){
                cant = l.getNumeroPaginas();
                nombre = l.getTitulo();
            }
        }
        System.out.println("Libro con mayor paginas: " + nombre);
    }

    public int contPrestamos(){
        int cont = 0;
        for (Libro l: libros){
            cont += l.getCantPrestamos();
        }
        return cont;
    }
}
