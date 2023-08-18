package poo.guia1;

public class ListaDoble {
    private NodoDoble primero = null;
    private NodoDoble fin = null;


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
            fin = nuevoNodo;

        }



    }




}


