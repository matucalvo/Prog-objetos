package poo.guia1;

public class Cola {
    private NodoSimple frente = null;
    private NodoSimple fin = null;


    public boolean esVacia(){
        return (frente == null);
    }

    public void encolar(Object dato){
        NodoSimple nuevoNodo = new NodoSimple();
        nuevoNodo.setDato(dato);
        if (esVacia()){
            fin = nuevoNodo;
            frente = nuevoNodo;
        }

        fin.setProximo(nuevoNodo);
        fin = nuevoNodo;
    }

    public Object desencolar(){
        if (esVacia()){
            System.out.println("Cola vacia");
            return null;
        }

        Object elemento = frente.getDato();
        frente = frente.getProximo();
        return elemento;

    }

    public Object frente(){
        if (esVacia()){
            System.out.println("Cola vacia");
            return null;
        }

        return frente.getDato();
    }

    public void mostrar(){
        if (esVacia()){
            System.out.println("Cola vacia");
            return;
        }

        Cola aux = new Cola();

        while (!esVacia()){
            System.out.println(frente());
            aux.encolar(desencolar());
        }

        while (!aux.esVacia()){
            encolar(aux.desencolar());
        }



    }




}
