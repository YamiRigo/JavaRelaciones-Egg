/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashSet;

/**
 *
 * @author yamila
 */
public class Voto {
 
    private Alumno alumn;
    private HashSet<String> votos = new HashSet();

    public Voto() {
    }

    public Voto(Alumno alumn) {
        this.alumn = alumn;
    }

    public Alumno getAlumn() {
        return alumn;
    }

    public void setAlumn(Alumno alumn) {
        this.alumn = alumn;
    }

    public HashSet<String> getVotos() {
        return votos;
    }

    public void setVotos(HashSet<String> votos) {
        this.votos = votos;
    }
    
    @Override
    public String toString() {
        return "Voto{ " + "alumno: " + alumn + ", votos: " + votos + " }";
    }


}
