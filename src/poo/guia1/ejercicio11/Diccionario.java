package poo.guia1.ejercicio11;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private Map<String, String> diccionario = new HashMap<>();

    public boolean buscarPalabra(String palabra){
        return diccionario.containsKey(palabra);
    }

    public void agregarPalabra(String palabra, String significado){
        diccionario.put(palabra, significado);
    }


}
