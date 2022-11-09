/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yamila
 */
public class Espectador {
    
    private String nombre;
    private int edad, dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Espectador{ " + "nombre: " + nombre + ", edad: " + edad + ", dineroDisp: " + dineroDisp + " }";
    }
    
    
    
}
