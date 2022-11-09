/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.*;
import Enum.*;
import java.util.*;

/**
 *
 * @author yamila
 */
public class AdopcionService {
    
    Scanner leer; 
    ArrayList<Perro> adoptados;
    ArrayList<String> nombres;

    public AdopcionService() {
        this.leer = new Scanner(System.in);
        this.adoptados = new ArrayList<>();
        this.nombres = new ArrayList<>();
        
        nombres.add("Loki");
        nombres.add("Tomas");
        nombres.add("Beto");
        nombres.add("Pulgas");
        nombres.add("Tori");
        nombres.add("Pia");
        nombres.add("Lola");
        nombres.add("Alita");
        nombres.add("Frida");
        nombres.add("Lupe");
        
    }
    
    public void adoptarPerro(Persona per){
        System.out.println("***** LISTA DE NOMBRES DISPONIBLES *****");
        nombres.forEach(nomb -> {
            System.out.println(nomb + ", ");        
        } );
        
        System.out.println("Elija uno...");
        String selection = leer.next().toUpperCase();
        
        Perro p = new Perro();
        if(nombres.contains(selection)){
            p = razaTamanio(p);
            p.setNombre(selection);
            per.setPerros((List<Perro>) p);
            nombres.remove(selection);
            adoptados.add(p);
            System.out.println(per.getNombre() + " " + per.getApellido() + " adopta a: " + p.toString());
        }else{
            System.out.println("Ese nombre ya no se encuentra a la lista para adoptar");
        }
    }
    
    public void personaAdopta(ArrayList<Persona> listaPersona){
        for(Persona aux : listaPersona){
            System.out.println("Hola!! " + aux.getNombre().toUpperCase() + " " + aux.getApellido().toUpperCase() + " vamos a adoptar un perro");
            adoptarPerro(aux);
        }
    }
    
    private Perro  razaTamanio(Perro choco){
        System.out.println("********** RAZAS **********");
        //Recorre desde los valores del enum Raza y por cada vuelta del for
        //le asigna un valor del enum a la variable aux.
        for(Raza aux : Raza.values()){
            System.out.println(aux);
        }
        System.out.println("********** TAMAÑOS **********");
        for(Tamanio aux : Tamanio.values()){
            System.out.println(aux);
        }
        System.out.println("Elija la raza y el tamaño");
        String eleRaza = leer.next();
        String eleTam = leer.next();
        
        for(Raza aux : Raza.values()){
            //Si lo que escribe el usuario es igual a el obj aux del enum convertido a String
            if(eleRaza.equalsIgnoreCase(aux.toString())){
                choco.setRaza(aux);
            }
        }
        
        for(Tamanio aux : Tamanio.values()){
            if(eleTam.equalsIgnoreCase(aux.toString())){
                choco.setTamanio(aux);
            }
        }
        return choco;
    }
    
}
