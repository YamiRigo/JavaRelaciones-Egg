/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import Servicios.RevolverDeAgua;

/**
 *
 * @author yamila
 */
public class Juego {
    
    private RevolverDeAgua arma;
    private List<Jugador> listaJugadores = new ArrayList<>();

    public Juego() {
    }

    public RevolverDeAgua getArma() {
        return arma;
    }

    public void setArma(RevolverDeAgua arma) {
        this.arma = arma;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
    //jugadores y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(List<Jugador>listaJugadores, RevolverDeAgua arma){
        this.listaJugadores = listaJugadores;
        this.arma = arma;
    }
    
    //ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    //aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
    //sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
    //tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
    //Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(){
        
        String nombreJugadorMojado = "";
        
        //Recorrer la lista de jugadores
        for(Jugador jugadorRonda : listaJugadores){
            System.out.println("[Turno del Jugador " + jugadorRonda.getId() + "]");
            
            //Jugador se "apunta" y dispara
            if(jugadorRonda.disparo(arma) == true){
                //Finaliza el juego y muestra el jugador que se mojo
                nombreJugadorMojado = jugadorRonda.getNombre();
                System.out.println("=====================================");
                System.out.println(">>>> BAAM!!! Se disparo el arma!!!!");
                System.out.println("=====================================");
                break;
            }else{
                System.out.println("El Jugador: " + jugadorRonda.getId() + " Se ha salvado!!");
                System.out.println("Siguiente...");
            }
        }
        System.out.println("El perdedor del juego ha sido el: [" + nombreJugadorMojado + "]");
    }
    
    
}
