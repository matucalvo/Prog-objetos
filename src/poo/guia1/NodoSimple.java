package poo.guia1;

public class NodoSimple {
    private Object dato;
    private NodoSimple proximo = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoSimple nodo){
        proximo = nodo;
    }


    public NodoSimple getProximo(){
        return proximo;
    }


}





