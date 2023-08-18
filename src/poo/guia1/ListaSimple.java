package poo.guia1;

public class ListaSimple {
    private NodoSimple primero = null;




    public ListaSimple crearLista(){
        return new ListaSimple();
    }

    public boolean es_vacia(){
        return primero == null;
    }

    public int longitud(){
        NodoSimple aux = primero;
        int longitud = 0;

        while (aux != null){
            longitud++;
            aux = aux.getProximo();
        }

        return longitud;
    }


    public void agregar(Object dato){
        NodoSimple nuevoNodo = new NodoSimple();
        nuevoNodo.setDato(dato);

        if (primero == null) {
            primero = nuevoNodo;
        }
        else {
            NodoSimple aux = primero;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }

            aux.setProximo(nuevoNodo);

        }
    }

    public void mostrar(){
        NodoSimple aux = primero;
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
        NodoSimple aux = primero;
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
        NodoSimple aux = primero;
        NodoSimple nuevoNodo = new NodoSimple();
        nuevoNodo.setDato(dato);
        int i = 1;

        if (primero == null || i == posicion){
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

            NodoSimple aux1 = aux.getProximo();
            aux.setProximo(nuevoNodo);
            nuevoNodo.setProximo(aux1);

        }

    }

    public Object recuperar(int posicion){
        NodoSimple aux = primero;
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
        NodoSimple aux = primero;

        int i = 1;

        while ((aux != null) && (i != posicion-1)){
            aux = aux.getProximo();
            i++;
        }

        if (aux != null){
            NodoSimple temp = aux.getProximo();
            aux.setProximo(temp.getProximo());

        } else System.out.println("Posicion no encontrada");




    }
}
