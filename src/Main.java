import poo.guia1.Cola;
import poo.guia1.ListaDoble;
import poo.guia1.ListaSimple;
import poo.guia1.Pila;

import java.awt.font.FontRenderContext;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1

        System.out.println("Objetos involucrados en una lista simple es 1, el principio");

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

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 2 \n");

        System.out.println("Objetos involucrados en una lista doble son 2, el principio y el fin");




        ListaDoble nuevaListaDoble = new ListaDoble();   // creo una instancia de la clase 'ListaSimple'

        for (int i = 5; i < 15; i++){
            nuevaListaDoble.agregar(i);                   // usando el metodo agregar, cargo la lista
        }

        System.out.println("Lista con 10 elementos: \n");

        nuevaListaDoble.mostrar();

        System.out.println("\n");


        System.out.println("\n Inserto '10' en posicion 5: \n");
        nuevaListaDoble.insertar(10,5);  // inserto '10' en posicion 5
        nuevaListaDoble.mostrar();

        System.out.println("Elimino el dato de la posicion 7: \n");
        nuevaListaDoble.eliminar(7);  // elimino el dato que esta en la posicion 7
        nuevaListaDoble.mostrar();


        System.out.println("\nBusco si se encuentra el '5' dentro de la lista: ");
        System.out.println(nuevaListaDoble.buscar(5));
        System.out.println("\nBusco si se encuentra el '100' dentro de la lista: ");
        System.out.println(nuevaListaDoble.buscar(100));


        System.out.println("\nVerifico si la lista esta vacia: ");
        System.out.println(nuevaListaDoble.esVacia() + "\n");

        System.out.println("Longitud de la lista: ");
        System.out.println(nuevaListaDoble.longitud());


        System.out.println("Recuperar elemento de la posicion 5:");
        System.out.println(nuevaListaDoble.recuperar(5));



        // EJERCICIO 3

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 3 \n");

        System.out.println("\n Interface a implementar de una pila: \n");
        System.out.println("Atributos:una instancia de la clase NodoSimple para indicar el tope \n");
        System.out.println("Metodos: apilar, desapilar, tope, esVacia y mostrar");
        System.out.println("Responsabilidad del objeto tope: Poder saber el elemento que esta en el tope. Poder apilar o desapilar. Y mantener la esencia principal de una pila, que es el ultimo elemento que entra es el primero en salir \n");


        Pila pila = new Pila();

        for (int i = 0; i < 10; i++){
            pila.apilar(i);
        }

        System.out.println("Pila con 10 elementos: \n");

        pila.mostrar(pila);

        System.out.println(" \n Desapilamos un elemento y lo mostramos: \n");

        System.out.println("Elemento desapilado: " + pila.desapilar());
        pila.mostrar(pila);

        System.out.println("Preguntamos si esta vacia: ");
        System.out.println(pila.esVacia());

        System.out.println("Mostramos el tope:  ");
        System.out.println(pila.tope());


        // EJERCICIO 4


        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 3 \n");
        System.out.println("\n Interface a implementar de una pila: \n");
        System.out.println("Atributos: Dos objetos de la clase NodoSimple para indicar el frente y el final \n");
        System.out.println("Metodos: encolar, desencolar, frente, esVacia y mostrar");

        Cola cola = new Cola();

        for (int i = 1; i < 11; i++){
            cola.encolar(i);
        }

        System.out.println("Cola con 10 elementos: \n");

        cola.mostrar();

        System.out.println(" \n Desencolamos un elemento y lo mostramos: \n");

        System.out.println("Elemento desencolado: " + cola.desencolar());
        cola.mostrar();

        System.out.println("Preguntamos si esta vacia: ");
        System.out.println(cola.esVacia());

        System.out.println("Mostramos el frente:  ");
        System.out.println(cola.frente());
















    }
}