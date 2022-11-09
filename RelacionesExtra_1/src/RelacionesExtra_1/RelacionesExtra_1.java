/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesExtra_1;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import Servicios.AdopcionService;

/**
 *
 * @author yamila
 */

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/

public class RelacionesExtra_1 {

    public static void main(String[] args) {
        
        ArrayList<Perro> listaPerro = new ArrayList<>();
        ArrayList<Persona> listaPersona = new ArrayList<>();
        
        listaPersona.add(new Persona("Elba", "Gala", 37, 32422572));
        listaPersona.add(new Persona("Elena", "Gomez", 27, 34456571));
        listaPersona.add(new Persona("Yamila", "Rigo", 29, 37811618));
        listaPersona.add(new Persona("Debora", "Montaña", 39, 30021570));
        listaPersona.add(new Persona("Maria", "Blanco", 25, 39402577));
        listaPersona.add(new Persona("Jorge", "Lito", 49, 22472595));
        listaPersona.add(new Persona("Igor", "Paramo", 33, 32420073));
        listaPersona.add(new Persona("Vander", "Lanes", 47, 25412508));
        listaPersona.add(new Persona("Eber", "Cala", 42, 29062309));
        listaPersona.add(new Persona("Martin", "Heredia", 23, 45429800));
        
        Collections.shuffle(listaPersona);
        
        AdopcionService s = new AdopcionService();
        s.personaAdopta(listaPersona);
    }
    
}
