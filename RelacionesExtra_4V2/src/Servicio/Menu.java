/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class Menu {
   
    private final Scanner leer = new Scanner(System.in);
    
    final ArrayList<String> listaNames = new ArrayList();
    final ArrayList<Integer> listaDni = new ArrayList();
    final ArrayList<Alumno> listaAlumno = new ArrayList();
    final HashSet<Voto> listavotos = new HashSet();
    private final Simulador simu = new Simulador();
    
    public void menu() {

        simu.crearDni(listaDni);
        simu.crearNombres(listaNames);
        System.out.println("------------------------- M E N U --------------------------");
        System.out.println("------- 1-Ingrese la cantidad de alumnos a cargar ----------");
        System.out.println("------- 2-Mostrar lista de alumnos -------------------------");
        System.out.println("------- 3-Votar --------------------------------------------");
        System.out.println("------- 4-Mostrar Alumnos cantidad de votos y a quien voto -");
        System.out.println("------- 5-Recuento de votos --------------------------------");
        System.out.println("------- 6-Mostrar los Facilitadores y los suplentes --------");
        System.out.println("------- 7-Salir --------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.print("------->");

        int opc = Integer.parseInt(leer.next());
        
        switch(opc){
            case 1:
                simu.armarPersona(listaNames, listaDni, listaAlumno);
                menu();
            case 2:
                listaAlumno.sort(Alumno.orden);
                simu.mostrar(listaAlumno);
                menu();
            case 3:
                simu.votacion(listaAlumno, listavotos);
                menu();
            case 4:
                simu.mostrarVote(listavotos);
                menu();
            case 5:
                simu.recuento(listaAlumno);
                menu();
            case 6:
                listaAlumno.sort(Alumno.orden);
                simu.primeros(listaAlumno);
                menu();
            case 7:
                System.out.println("Fin de la simulación");
                break;
        }


    }
    
}
