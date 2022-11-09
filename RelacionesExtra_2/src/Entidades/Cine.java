/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author yamila
 */
public class Cine {
    
    private ArrayList<Sala> listaSala = new ArrayList<>();

    public Cine() {
    }

    public ArrayList<Sala> getListaSala() {
        return listaSala;
    }

    public void setListaSala(ArrayList<Sala> listaSala) {
        this.listaSala = listaSala;
    }

    @Override
    public String toString() {
        return "Cine{ " + "listaSala: " + listaSala + " }";
    }
    
    
    
}
