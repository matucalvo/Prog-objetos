import poo.lista.Nodo;
import poo.lista.Lista;

public class Main {
    public static void main(String[] args) {


        Lista nuevaLista = new Lista();

        nuevaLista.agregar(1);
        nuevaLista.agregar(2);
        nuevaLista.agregar(3);
        nuevaLista.agregar(4);
        nuevaLista.agregar(5);
        nuevaLista.agregar(6);
        nuevaLista.agregar(7);
        nuevaLista.agregar(8);
        nuevaLista.insertar(10,5);




        nuevaLista.mostrar();




        System.out.println(nuevaLista.buscar(5));
        System.out.println(nuevaLista.es_vacia());
        System.out.println(nuevaLista.longitud());




    }
}