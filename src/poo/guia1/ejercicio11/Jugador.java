package poo.guia1.ejercicio11;

import java.util.ArrayList;

public class Jugador {
    private String nombre = "";
    private int puntaje = 0;
    private ArrayList<String> palabras = new ArrayList<String>();

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public void agregarPalabra(String palabra, Diccionario diccionario){
        if (diccionario.buscarPalabra(palabra)){
            palabras.add(palabra);
        } else System.out.println("La palabra no se encuentra en el diccionario\n");
    }

    public int setPuntaje(){
        int contador = 0;

        for (String palabra: palabras){
            contador += palabra.length();
            String letrasImportantes = "kzxywq";

            for (int i = 0; i < letrasImportantes.length(); i++){
                if (palabra.contains(String.valueOf(letrasImportantes.charAt(i)))){
                    contador++;
                }
            }
        }

        this.puntaje = contador;
        return contador;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPuntaje(){
        return puntaje;
    }



}
