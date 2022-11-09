/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Emun.Pinta;
import java.util.*;

/**
 *
 * @author yamila
 */
public class Baraja {
    
    private int numero;
    private Set<Carta> baraja;

    public Baraja() {
        
        this.baraja = new HashSet<>();
        
        //CUATRO VUELTAS
        for (int i = 0; i < 4; i++) {
            //12 VUELTAS EMPEZANDO DESDE EL 1
            for (int j = 0; j < 13; j++) {
                if(j != 8 && j != 9){
                    //AGREGO UNA CARTA DE CADA PINTA POR VUELTA
                    this.baraja.add(new Carta(j , Pinta.BASTO));
                    this.baraja.add(new Carta(j, Pinta.COPA));
                    this.baraja.add(new Carta(j, Pinta.ESPADA));
                    this.baraja.add(new Carta(j , Pinta.ORO));
                }
            }
        }
        
    }

    public Baraja(int numero, Set<Carta> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Set<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(Set<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{ " + "numero = " + numero + ", baraja = " + baraja + " }";
    }
    
    
    
}
