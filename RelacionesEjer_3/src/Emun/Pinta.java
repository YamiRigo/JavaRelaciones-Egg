/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emun;

/**
 *
 * @author yamila
 */
public enum Pinta {
    ESPADA, BASTO, ORO, COPA;
    
    //Así hago un método para obtener un value Random
    public static Pinta getRandom(){
        return values()[(int)(Math.random() * values().length)];
    }
}
