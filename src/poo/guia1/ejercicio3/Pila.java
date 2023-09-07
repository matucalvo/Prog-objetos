package poo.guia1.ejercicio3;

import poo.guia1.NodoSimple;

public class Pila {
    private NodoSimple tope = null;




    public boolean esVacia(){
        return tope == null;
    }

    private void intercambiarP(Pila pila1, Pila pila2){
        Object elemento = null;

        while (!pila1.esVacia()){
            elemento = pila1.desapilar();
            pila2.apilar(elemento);
        }

    }


    public void apilar(Object dato){
        NodoSimple nuevoNodo = new NodoSimple();
        nuevoNodo.setDato(dato);

        if (esVacia()){
            tope = nuevoNodo;
            return;
        }

        nuevoNodo.setProximo(tope);
        tope = nuevoNodo;

    }

    public Object desapilar(){
        if (esVacia()){
            System.out.println("Pila vacia");
            return null;
        }

        NodoSimple aux = tope;
        tope = aux.getProximo();
        return aux.getDato();
    }

    public Object tope(){
        if (esVacia()){
            System.out.println("Pila vacia");
            return null;
        }

        return tope.getDato();

    }

    public void mostrar(Pila pila){
        Pila aux = new Pila();
        Object elemento;
        int i = 0;


        while (!pila.esVacia()){
            i++;
            elemento = pila.desapilar();
            System.out.println(i + ": " + elemento);
            aux.apilar(elemento);
        }

        intercambiarP(aux, pila);
    }

}
