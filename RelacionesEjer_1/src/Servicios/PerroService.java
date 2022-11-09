/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Perro;


/**
 *
 * @author yamila
 */
public class PerroService {
    
    private Scanner leer;
    private List<Perro> lista_perros;
    
    public PerroService(){
        this.leer = new Scanner(System.in);
        this.lista_perros = new ArrayList<>();
    }
    
    //Pide los datos al usuario para crear un perro
    //@return perroCreado
    public Perro crearPerro(){
        
        Perro perroCreado;
        
        System.out.println("---- INGRESO DE DATOS PERROS ----");
        System.out.println("Ingrese Nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese Raza: ");
        String raza = leer.nextLine();
        System.out.println("Ingrese Edad: ");
        int edad = Integer.parseInt(leer.nextLine());
        System.out.println("Ingrese el Tamaño: ");
        int tam = Integer.parseInt(leer.nextLine());
        
        //Creamos el Objeto
        perroCreado = new Perro(nombre, edad, raza, tam);
        
        lista_perros.add(perroCreado); //Agregamos el perro a la lista
        
        return null;
    }
    
    //Recorre la lista e imprime los objetos
    public void mostrarPerros(){
        
        System.out.println("-> PERROS EN LA LISTA <-");
        
        for(Perro aux : lista_perros){
            System.out.println(aux);
        }
        
    }
    
    //Retorna la lista de perros
    public List<Perro> obtenerListaPerros(){
        return lista_perros;
    }
    
}
