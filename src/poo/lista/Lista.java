package poo.lista;

public class Lista {
    private Nodo primero = null;




    public Lista crearLista(){
        return new Lista();
    }

    public boolean es_vacia(){
        return primero == null;
    }

    public int longitud(){
        Nodo aux = primero;
        int longitud = 0;

        while (aux != null){
            longitud++;
            aux = aux.getProximo();
        }

        return longitud;
    }


    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (primero == null) {
            primero = nuevoNodo;
        }
        else {
            Nodo aux = primero;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }

            aux.setProximo(nuevoNodo);

        }
    }

    public void mostrar(){
        Nodo aux = primero;
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
        Nodo aux = primero;
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
        Nodo aux = primero;
        Nodo nuevoNodo = new Nodo();
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

            Nodo aux1 = aux.getProximo();
            aux.setProximo(nuevoNodo);
            nuevoNodo.setProximo(aux1);

        }

    }

    public void eliminar(Object posicion){

    }
}
