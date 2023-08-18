import poo.guia1.ListaDoble;
import poo.guia1.ListaSimple;

import java.awt.font.FontRenderContext;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1

        ListaSimple nuevaLista = new ListaSimple();   // creo una instancia de la clase 'ListaSimple'

        for (int i = 1; i < 10; i++){
            nuevaLista.agregar(i);                   // usando el metodo agregar, cargo la lista
        }

        System.out.println("Lista con 10 elementos: \n");

        nuevaLista.mostrar();

        System.out.println("\n");


        System.out.println("\n Inserto '10' en posicion 5: \n");
        nuevaLista.insertar(10,5);  // inserto '10' en posicion 5
        nuevaLista.mostrar();

        System.out.println("Elimino el dato de la posicion 7: \n");
        nuevaLista.eliminar(7);  // elimino el dato que esta en la posicion 7
        nuevaLista.mostrar();


        System.out.println("\nBusco si se encuentra el '5' dentro de la lista: ");
        System.out.println(nuevaLista.buscar(5));
        System.out.println("\nBusco si se encuentra el '100' dentro de la lista: ");
        System.out.println(nuevaLista.buscar(100));


        System.out.println("\nVerifico si la lista esta vacia: ");
        System.out.println(nuevaLista.es_vacia() + "\n");

        System.out.println("Longitud de la lista: ");
        System.out.println(nuevaLista.longitud());


        System.out.println("Recuperar elemento de la posicion 5:");
        System.out.println(nuevaLista.recuperar(5));

        // EJERCICIO 2

        ListaDoble nuevaListaDoble = new ListaDoble();

        nuevaListaDoble.agregar(6);





    }
}