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
public class Perro {
    
    private String nombre;
    private int edad;
    private String raza;
    private int tam;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, int tam) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tam = tam;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    
    @Override
    public String toString() {
        return "Perro: " + nombre + ", Edad:" + edad + ", Raza:" + raza + ", Tam:" + tam;
    }
    
    
    
}
