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
public class Voto {
    
    private Alumno votoAlumn;
    private ArrayList<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno votoAlumn, ArrayList<Alumno> votados) {
        this.votoAlumn = votoAlumn;
        this.votados = votados;
    }

    public void votando() {

    }

    public Alumno getAlumnoQueVota() {
        return votoAlumn;
    }

    public void setAlumnoQueVota(Alumno votoAlumn) {
        this.votoAlumn = votoAlumn;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return votados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto del Alumno: " + votoAlumn.getNombre() + " DNI: " + votoAlumn.getDni();

    }
    
}
