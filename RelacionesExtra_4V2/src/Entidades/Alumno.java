/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author yamila
 */
public class Alumno {
    
    String nombreAp;
    private int dni;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombreAp, int dni, int votos) {
        this.nombreAp = nombreAp;
        this.dni = dni;
        this.votos = 0;
    }

    public String getNombreAp() {
        return nombreAp;
    }

    public void setNombreAp(String nombreAp) {
        this.nombreAp = nombreAp;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public static Comparator<Alumno> orden = (Alumno t, Alumno t1) -> t1.getVotos()+(t.getVotos());        
    
    @Override
    public String toString() {
        return nombreAp + " -> " + " DNI: " + dni + " -> Votos: " + votos;
    }
    
  
}
