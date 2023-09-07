import poo.guia1.ejercicio1.ListaSimple;
import poo.guia1.ejercicio11.Diccionario;
import poo.guia1.ejercicio11.Juego;
import poo.guia1.ejercicio11.Jugador;
import poo.guia1.ejercicio2.ListaDoble;
import poo.guia1.ejercicio3.Pila;
import poo.guia1.ejercicio4.Cola;
import poo.guia1.ejercicio5y10.Prioridades;
import poo.guia1.ejercicio5y10.Tarea;
import poo.guia1.ejercicio6.Biblioteca;
import poo.guia1.ejercicio6.Libro;
import poo.guia1.ejercicio8.ColeccionPass;
import poo.guia1.ejercicio8.Password;
import poo.guia1.ejercicio9.Fecha;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void auxiliarEstado(boolean estado){
        if (estado){
            System.out.println("Su tarea ya ha sido realizada");
        } else System.out.println("Su tarea no ha sido realizada");
    }
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


        /* / EJERCICIO 5 */

        LocalDate fechaActual = LocalDate.now();

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 5 \n");


        Tarea tarea1 = new Tarea("Ir al supermercado mañana", false, Prioridades.RELEVANTE);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", true, Prioridades.IRRELEVANTE);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva pelicula de Marvel", false, Prioridades.IRRELEVANTE);

        System.out.println("Mostramos las 3 tareas que creamos: \n");
        tarea1.mostrarTarea();
        tarea2.mostrarTarea();
        tarea3.mostrarTarea();

        System.out.println("\nLa tarea 1 esta terminada? ");
        auxiliarEstado(tarea1.verificarEstado());

        System.out.println("\nLa tarea 2 esta terminada? ");
        auxiliarEstado(tarea2.verificarEstado());

        System.out.println("\nLa tarea 3 esta terminada? ");
        auxiliarEstado(tarea3.verificarEstado());


        // EJERCICIO 6 //

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 6 \n");

        System.out.println(" Clase Biblioteca:\n" +
                "Estructura: \n" +
                "Parametros: Un ArrayList de Libros\n" +
                "Comportamiento: agregarLibro(), mostrarLibro(), contarPrestamos(), libroConMayorPaginas()\n");

        System.out.println(" Clase Libro:\n" +
                "Estructura: \n" +
                "Parametros: autor, titulo, ejemplares, ejemplaresDisponibles, numeroPaginas, cantPrestamos\n" +
                "Comportamiento: un constructor para que instancie todos los parametros de cada objeto en especifico, \n" +
                "setCantidadDisponible(), prestar(), devolver(), y demas getters\n");

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Franz Kafka", "La metamorfosis", 266, 10);
        Libro libro2 = new Libro("George Orwell", "1985", 366, 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println("Creamos y mostramos el primer libro: \n");


        biblioteca.mostrarLibro(libro1);

        System.out.println("Hacemos un prestamo del mismo: \n");
        libro1.prestar();
        biblioteca.mostrarLibro(libro1);


        System.out.println("\n Creamos y mostramos el segundo libro: \n");


        biblioteca.mostrarLibro(libro2);

        System.out.println("\n Hacemos un prestamo del mismo: \n");
        libro2.prestar();
        biblioteca.mostrarLibro(libro2);


        biblioteca.libroConMayorPaginas();
        System.out.println("Cantidad total de prestamos hechos por la biblioteca: " + biblioteca.contPrestamos());



        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 8 \n");

        ColeccionPass coleccionPasswords = getColeccionPass();

        coleccionPasswords.mostrarColeccion();

        coleccionPasswords.hacerQueTodasLasPassSeanFuertes();

        System.out.println("Modificando las debiles: \n");

        coleccionPasswords.mostrarColeccion();

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 9 \n");

        System.out.println("Estructura: \n" +
                "Atributos: String fecha \n" +
                "Comportamiento: transformarFecha(), esMayor(), esMenor(), getFecha(), y ver si se encuentra entre dos fechas \n");

        Fecha fecha = new Fecha("2023-09-05");

        System.out.println("Fecha: " +
                fecha.getFecha());

        System.out.println(fecha.esMayor("2023-09-06"));
        System.out.println(fecha.esMenor("2023-09-06"));

        System.out.println(fecha.seEncuentraEntreDosFechas("2023-09-06", "2023-09-08"));

        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 10 - EXTENSION CLASE TAREA \n");

        System.out.println("Estructura: \n" +
                "Atributos: boolean estado, enum prioridad, LocalDate fechaRecordatorio, String descripcion  \n" +
                "Comportamiento: modificarDescripcion(), tareaTerminada(), mostrarTarea(), verificarEstado(), y setFechaRecordatorio() \n");

        tarea1.setFechaRecordatorio("2023-11-06");  //por vencer
        tarea2.setFechaRecordatorio("2023-07-06");
        tarea3.setFechaRecordatorio("2023-09-06");

        tarea1.mostrarTarea();
        tarea2.mostrarTarea();
        tarea3.mostrarTarea();


        System.out.println("\n --------------------------------------------------------------------\n");

        System.out.println("\n EJERCICIO 11  \n");

        System.out.println("\n Objetos que participan del problema: \n" +
                "'juego' de la clase Juego \n" +
                "'jugador1' y 'jugador2' de la clase Jugador\n" +
                "'diccionario' de la clase Diccionario\n");

        System.out.println("Existen asociaciones de comunicacion entre las clases Juego y Jugador, " +
                "ya que Juego tiene que agregar jugadores de la clase Jugador a traves de un metodo, es decir, se lo" +
                "envia por parametro. \n");

        System.out.println("Tambien hay una asosiacion de conocimiento entre Juego y Jugador, Juego contiene una lista de Jugadores, " +
                "es decir conoce la existencia de la otra\n");

        System.out.println("Comportamientos de la clase Juego: \n" +
                "agregar un jugador, calcular cual fue el ganador y mostrar tabla de jugadores \n" +
                "Comportamiento de la clase Jugador: \n" +
                "agregar una palabra, calcular el puntaje y algunos getters \n" +
                "Comportamiento de la clase Diccionario: \n" +
                "buscar una palabra en el, y agregar una \n");

        Diccionario diccionario = new Diccionario();
        diccionario.agregarPalabra("oceano", "Masa de agua salada que cubre aproximadamente las tres cuartas partes de la superficie terrestre.");
        diccionario.agregarPalabra("xilofon", "Instrumento musical");


        Juego juego = new Juego();
        Jugador jugador1 = new Jugador("Mateo");
        Jugador jugador2 = new Jugador("Lara");

        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);

        jugador1.agregarPalabra("oceano", diccionario);
        jugador2.agregarPalabra("xilofon", diccionario);

        jugador1.setPuntaje();
        jugador2.setPuntaje();

        juego.mostrarTablaPuntos();


        juego.ganador();










    }

    private static ColeccionPass getColeccionPass() {
        Scanner sc = new Scanner(System.in);
        ColeccionPass coleccionPasswords = new ColeccionPass();


        int opcion = 1;
        int longitud = 0;


        System.out.println("Ingrese cantidad de passwords que desea crear: \n");
        longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++){
            System.out.println("Ingrese una longitud: \n");
            opcion = sc.nextInt();
            Password contraseña = new Password();
            contraseña.setPassword(opcion);
            coleccionPasswords.addPassword(contraseña);
        }





        return coleccionPasswords;
    }

}