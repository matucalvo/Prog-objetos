package poo.guia1.ejercicio8;

import java.util.ArrayList;

public class ColeccionPass {
    private ArrayList<Password> coleccion = new ArrayList<Password>();

    public void addPassword(Password password){
        coleccion.add(password);
    }


    public void mostrarColeccion(){
        for (Password p: coleccion){
            System.out.println(p.getPassword() + " - "+ p.seguridadPassword() + "\n");
        }
    }

    public void hacerQueTodasLasPassSeanFuertes(){
        for (Password password : coleccion){
            if (password.seguridadPassword().equals("Debil")){
                int longitud = password.getPassword().length();
                while (password.seguridadPassword().equals("Debil")){
                    password.setPassword(longitud);
                }
            }
        }
    }


}
