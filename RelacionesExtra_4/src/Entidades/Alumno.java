/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author yamila
 */
public class Alumno {
    
    private String nombre;
    private String dni;
    private int cantVotes = 0;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, int cantVotes) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantVotes = cantVotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotes;
    }

    public void setCantVotos(int cantVotes) {
        this.cantVotes = cantVotes;
    }

    public void incrementaVoto() {
        this.cantVotes++;
    }

    public String vistaSimple() {
        return nombre + ", DNI: " + dni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + this.cantVotes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.cantVotes != other.cantVotes) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Alumno: " + nombre + ", DNI: " + dni + ", Votos: " + cantVotes;
    }
    
}
