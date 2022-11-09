/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author yamila
 */
public class Sala {
    
    private int nombre, precioTicket = 550;
    private HashMap<String,Butaca> hashButaca = new HashMap<>();
    private Pelicula movie;

    public Sala() {
    }

    public Sala(int nombre, int precioTicket, Pelicula movie) {
        this.nombre = nombre;
        this.precioTicket = precioTicket;
        this.movie = movie;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrecioTicket() {
        return precioTicket;
    }

    public void setPrecioTicket(int precioTicket) {
        this.precioTicket = precioTicket;
    }

    public HashMap<String, Butaca> getHashButaca() {
        return hashButaca;
    }

    public void setHashButaca(HashMap<String, Butaca> hashButaca) {
        this.hashButaca = hashButaca;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Sala{ " + "nombre: " + nombre + ", precioTicket: " + precioTicket + ", hashButaca: " + hashButaca + ", movie: " + movie + " }";
    }
    
    
    
}
