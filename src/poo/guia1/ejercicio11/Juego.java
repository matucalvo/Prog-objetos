package poo.guia1.ejercicio11;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void ganador(){
        int ganador = 0;
        String nombreGanador = "";
        for (Jugador jugador: jugadores){
            if (jugador.setPuntaje() > ganador){
                ganador = jugador.setPuntaje();
                nombreGanador = jugador.getNombre();
            }
        }
       System.out.println("\nGanador: " + nombreGanador + " con " + ganador + " puntos");
    }

    public void mostrarTablaPuntos(){
        System.out.println("Jugadores: \n");
        for (Jugador jugador: jugadores){
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntaje() + " puntos");
        }
    }


}
