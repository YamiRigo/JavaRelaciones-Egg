/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Emun.Pinta;
import java.util.Objects;

/**
 *
 * @author yamila
 */
public class Carta {
    
    private Integer numero;
    private Pinta pinta;

    public Carta() {
    }

    public Carta(Integer numero, Pinta pinta) {
        this.numero = numero;
        this.pinta = pinta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pinta getPinta() {
        return pinta;
    }

    public void setPinta(Pinta pinta) {
        this.pinta = pinta;
    }

    //hashCode: Método que regresa un nº entero que representa la instancia actual 
    //de una clase. Complementa el método equals para comparar de una forma más rápida en 
    //esta estructura. Si los obj del hashcode devuelve diferentes hash no seguirá comparando, 
    //en caso de tener el mismo hashcode invoca al equals() y revisa a detalle si se cumple la
    //igualdad.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.numero);
        hash = 73 * hash + Objects.hashCode(this.pinta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Carta other = (Carta)obj;
        //if(this.numero != other.numero){
        if(!Objects.equals(this.numero, other.numero)){
            return false;
        }
        if(this.pinta != other.pinta){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numero + " de " + pinta;
    }
    
    
    
}
