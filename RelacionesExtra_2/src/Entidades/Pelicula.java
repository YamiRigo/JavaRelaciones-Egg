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
public class Pelicula {
    
    private String titulo, director;
    private int durMin = 150, edadMin = 18;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int durMin, int edadMin) {
        this.titulo = titulo;
        this.director = director;
        this.durMin = durMin;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurMin() {
        return durMin;
    }

    public void setDurMin(int durMin) {
        this.durMin = durMin;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public String toString() {
        return "Pelicula{ " + "titulo: " + titulo + ", director: " + director + ", durMin: " + durMin + ", edadMin: " + edadMin + " }";
    }
 
    
}
