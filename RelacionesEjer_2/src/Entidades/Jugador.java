/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Servicios.RevolverDeAgua;

/**
 *
 * @author yamila
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Jugador(int id){
        if(id <= 0 || id > 6){
            this.id = 6;
        }else{
            this.id = id;
        }
        
        this.nombre = "JUGADOR " + this.id;
        this.mojado = false;
    }
    
    //disparo(Revolver r): el método, recibe el revolver de agua y llama a los
    //métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
    //aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
    //atributo mojado pasa a false y el método devuelve true, sino false.
    public boolean disparo(RevolverDeAgua arma){
        
        if(arma.mojar() == true){
            //El jugador se moja
            this.mojado = true;
        }else{
            this.mojado = false;
            arma.siguienteChorro();
        }
        
        return mojado;
        
    }

    
}
