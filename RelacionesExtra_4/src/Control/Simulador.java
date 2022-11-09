/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.*;
import java.util.*;

/**
 *
 * @author yamila
 */
public class Simulador {
    
    public ArrayList<String> generaNames() {
        ArrayList<String> nombres = new ArrayList();

        nombres.add("Fulano Denadie");
        nombres.add("Elena Nito");
        nombres.add("Debora Montaña");
        nombres.add("Elber Gala");
        nombres.add("Nieve Blanca");
        nombres.add("Armando Paredes");
        nombres.add("Pedro Paramo");
        nombres.add("Angeles Wigs");
        nombres.add("Jorge Cala");
        nombres.add("Mary Lane");
        Collections.shuffle(nombres);

        return nombres;
    }

    private String generaDNI() {
        int dn = (int) (Math.random() * 2075 + 1);
        int ni = (int) (Math.random() * 4000 + 1);
        String dni = Integer.toString(dn) + Integer.toString(ni);

        if (dni.length() <= 6)
        {
            dni = dni + "00";
        } 

        return dni;

    }

    public HashSet<Alumno>listaAlumno(ArrayList<String>nombres, int cantAlumnos) {

        HashSet<Alumno> setAlumno = new HashSet();

        for (int i = 0; i < cantAlumnos; i++){
        
            Alumno a = new Alumno();
            a.setDni(generaDNI());
            setAlumno.add(a);
        }

        Iterator<Alumno> it = setAlumno.iterator();

        while (it.hasNext()){
        
            Collections.shuffle(nombres);
            it.next().setNombre(nombres.get((int) (Math.random() * nombres.size())));
        }
        return setAlumno;
    }

    public void imprimeLista(HashSet<Alumno> lista) {
        for (Alumno alumno : lista)
        {
            System.out.println(alumno);
        }

    }

    public HashSet<Alumno> votacion(HashSet<Alumno> lista) {

        Voto v = new Voto(); //creo un objeto Voto
        Random aleatorio = new Random(); //utilidad para hacer Random de una lista
        ArrayList<Alumno> auxAlumnos = new ArrayList(lista); //creo un arraylist auxiliar con todo lo que tiene el hashset que viene por parametro
        

        for (Alumno aux : lista) {
            auxAlumnos.remove(aux);//asi me aseguro que no se vote a si mismo
            ArrayList<Alumno> votados = new ArrayList();//creo un arraylist de alumnos para usarlo como set de Voto
            
            //creo 3 indices aleatorios para las votaciones
            int voto1 = aleatorio.nextInt(auxAlumnos.size()); 
            int voto2 = aleatorio.nextInt(auxAlumnos.size());  
            int voto3 = aleatorio.nextInt(auxAlumnos.size()); 
            
            int tam = auxAlumnos.size();
            
            //verifico que los votos no sean iguales
            if (voto1 == voto2){
                voto2 += 1;
                if(voto2 >= tam){
                    voto2 -= 2;
                }
                
            }else if(voto1 == voto3){
               voto3 += 1;
               if(voto3 >= tam){
                    voto3 -= 2;
                }
            }else if(voto2 == voto3){
                voto3 += 1;
               if(voto3 >= tam){
                    voto3 -= 2;
                }
            }else if(voto3 == voto1){
                voto1 += 1;
               if(voto1 >= tam){
                    voto1 -= 2;
                }
            }
            
            votados.add(auxAlumnos.get(voto3));
            votados.add(auxAlumnos.get(voto2));
            votados.add(auxAlumnos.get(voto1));
            
            auxAlumnos.get(voto1).incrementaVoto();
            auxAlumnos.get(voto2).incrementaVoto();
            auxAlumnos.get(voto3).incrementaVoto();
            
            v.setAlumnoQueVota(aux); //le seteo el alumno que vota al Voto creado
            v.setAlumnosVotados(votados); //le seteo el arraylist de votados al Voto
            auxAlumnos.add(aux);
            System.out.println(v.toString()); //mensajito para saber quien esta votando con el toString de Voto

            //recorro la lista de votados para mostrar a quien voto cada alumno
            for (Alumno vot : votados)
            {
                System.out.println("Vota a: " + vot.vistaSimple());
            }
            System.out.println("");
    
        }
   
        //transformo mi lista auxAlumnos de nuevo en un HashSet para retornarlo
        lista = new HashSet<Alumno>(auxAlumnos);
        return lista;
    }

    public void recuento(HashSet<Alumno> lista){
        List<Alumno> listaAux = new ArrayList(lista);
        Collections.sort(listaAux, porVotos);
        System.out.println("***** FACILITADORES TITULARES *****");
        for (int i = 0; i < 5; i++) {
            System.out.println(listaAux.get(i).toString());
        }
        System.out.println("");
            
        System.out.println("***** FACILITADORES SUPLENTES *****");
        for (int i = 6; i < 10; i++) {
            System.out.println(listaAux.get(i).toString());
        }
        
    }
    
     public static Comparator<Alumno> porVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a2.getCantVotos().compareTo(a1.getCantVotos());
        }
    };
    
    
}
