/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.*;
import java.util.*;

/**
 *
 * @author yamila
 */
public class BarajaService {
    
    private Baraja baraja;
    private ArrayList<Carta> mazo;

    public BarajaService() {
        this.baraja = new Baraja();
        this.mazo = new ArrayList<>(baraja.getBaraja());
    }
    
    public void muestraBaraja(){
        
        for(Carta aux : mazo){
            System.out.println(aux);
        }
        
    }
    
    public void barajar(){
        System.out.println("***** BARAJA MEZCLADA *****");
        Collections.shuffle(mazo);
    }
    
    public Carta siguieteCarta(){
        Carta aux = mazo.get(0);
        mazo.remove(0);
        return aux;
    }
    
    public void darCartas(int cantidad){
        ArrayList<Carta> mano = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            mano.add(mazo.get(i));
            mazo.remove(i);
        }
        System.out.println("***** LA MANO DADA ES: *****");
        for(Carta carta : mano){
            System.out.println(carta);
        }
        System.out.println("Quedan " + mazo.size() + " cartas");
    }
    
    public static Comparator<Carta> porPinta = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getPinta().compareTo(c2.getPinta());
        }
    };
    
    public static Comparator<Carta> porNumero = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getNumero().compareTo(c2.getNumero());
        }
    };
    
    public void ordenBaraja(){
        System.out.println("***** BARAJA ORDENADA *****");
        Collections.sort(mazo, porNumero);
        Collections.sort(mazo, porPinta);
        
        for(Carta carta : mazo){
            System.out.println(carta);
        }
    }
}
