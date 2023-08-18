package poo.guia1;

public class NodoDoble {
    private Object dato;
    private NodoDoble proximo = null;
    private NodoDoble anterior = null;


    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoDoble nodo){
        proximo = nodo;
    }

    public NodoDoble getProximo(){
        return proximo;
    }

    public void setAnterior(NodoDoble nodo){
        anterior = nodo;
    }

    public NodoDoble getAnterior(){
        return anterior;
    }



}
