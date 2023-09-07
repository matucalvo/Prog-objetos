package poo.guia1.ejercicio2;

import poo.guia1.NodoDoble;

public class ListaDoble {
    private NodoDoble primero = null;
    private NodoDoble fin = null;


    public boolean esVacia(){
        return (primero == null && fin == null);
    }

    public int longitud(){
        NodoDoble aux = primero;

        int i = 0;

        while(aux != null){
            aux = aux.getProximo();
            i++;
        }
        return i;
    }


    public void agregar(Object dato){
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);

        if ((primero == null) && (fin == null)){
            primero = nuevoNodo;
        } else {

            NodoDoble aux = primero;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }



            aux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(aux);
            fin = nuevoNodo;

        }


    }

    public void mostrar(){
        NodoDoble aux = primero;
        int i = 1;

        if (aux == null){
            System.out.println("Lista vacia");
        }

        while (aux != null){
            System.out.println(i + ": " +aux.getDato());
            aux = aux.getProximo();
            i++;
        }

    }



    public boolean buscar(Object dato){
        NodoDoble aux = primero;
        boolean condicion = false;

        if (aux == null){
            return false;
        }

        while ((aux != null) && !condicion){
            if (aux.getDato() == dato){
                condicion = true;
            }
            aux = aux.getProximo();
        }

        return condicion;
    }


    public void insertar(Object dato, int posicion){
        NodoDoble aux = primero;
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);
        int i = 1;

        if ((primero == null && fin == null)){
            primero = nuevoNodo;
        } else {

            while ((aux != null) && (i != posicion-1)){
                i++;
                aux = aux.getProximo();
            }

            if (aux == null){
                System.out.println("Posicion se excede del tamaño de la lista ");
                return;
            }

            if (aux.getProximo() == null){
                aux.setProximo(nuevoNodo);
                nuevoNodo.setAnterior(aux);
                fin = nuevoNodo;
            } else {
                NodoDoble aux1 = aux.getProximo();
                aux.setProximo(nuevoNodo);
                nuevoNodo.setProximo(aux1);

                aux1.setAnterior(nuevoNodo);
                nuevoNodo.setAnterior(aux);
            }




        }

    }

    public Object recuperar(int posicion){
        NodoDoble aux = primero;
        int i = 1;

        while ((aux != null) && (i != posicion)){
            i++;
            aux = aux.getProximo();
        }

        if (aux == null){
            System.out.println("Posicion no encontrada");
            return null;
        } else return aux.getDato();


    }

    public void eliminar(int posicion){
        NodoDoble aux = primero;

        int i = 1;

        while ((aux != null) && (i != posicion-1)){
            aux = aux.getProximo();
            i++;
        }



        if (aux != null){
            NodoDoble temp = aux.getProximo();
            aux.setProximo(temp.getProximo());
            temp.setAnterior(aux.getAnterior());

        } else System.out.println("Posicion no encontrada");




    }




}


