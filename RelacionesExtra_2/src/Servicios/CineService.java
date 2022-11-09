/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Butaca;
import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author yamila
 */
public class CineService {
    
    Scanner leer = new Scanner(System.in);
    
    public ArrayList<Espectador> listaEspectador(){
        ArrayList<Espectador> es = new ArrayList<>();
        
        for (int i = 0; i < 90; i++) {
            es.add(new Espectador("Espectador " + i, ThreadLocalRandom.current().nextInt(15, 81), ThreadLocalRandom.current().nextInt(200, 1001)));
        }
        return es;
    }
    
    public HashMap<String,Butaca> creaHashButaca(){
        HashMap<String,Butaca> b = new HashMap<>();
        String aux = "";
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                switch(j){
                    case 1:
                        aux = i + "A";
                        break;
                    case 2:
                        aux = i + "B";
                        break;
                    case 3:
                        aux = i + "C";
                        break;
                    case 4:
                        aux = i + "D";
                        break;
                    case 5:
                        aux = i + "E";
                        break;
                    case 6:
                        aux = i + "F";
                        break;
                }
                b.put(aux, new Butaca());
            }
        }
        return b;
    }
    
    public void muestraButacaOrd(HashMap<String,Butaca> orden){
        String aux = "";
        String x = "";
        
        System.out.println("\n");
        for (int i = 8; i > 0; i--) {
            System.out.println("|");
            for (int j = 1; j < 7; j++) {
                switch(j){
                    case 1:
                        aux = i + "A";
                        break;
                    case 2:
                        aux = i + "B";
                        break;
                    case 3:
                        aux = i + "C";
                        break;
                    case 4:
                        aux = i + "D";
                        break;
                    case 5:
                        aux = i + "E";
                        break;
                    case 6:
                        aux = i + "F";
                        break;
                }
                if(orden.get(aux).getVacante()){
                    x = " ";
                }else{
                    x = "X";
                }
                System.out.print(aux + " " + x + "|");
            }
            System.out.print("");
        }
    }
    
    public void sitEspectadorAlt(Sala sala, Espectador client){
        String aux = "";
        ArrayList<String> listaKey = new ArrayList<>();
        
        sala.getHashButaca().forEach((key, value) -> {
            if(value.getVacante()){
                listaKey.add(key);
            }
        });
        
        if(client.getEdad() >= sala.getMovie().getEdadMin() && client.getDineroDisp() >= sala.getPrecioTicket()){
            if(listaKey.isEmpty()){
                System.out.println("OCURRIO UN ERROR, SALA LLENA");
            }else{
                Collections.shuffle(listaKey);
                sala.getHashButaca().forEach((key, value) -> {
                    if(key.equals(listaKey.get(0))){
                        value.setVacante(false);
                        value.setClient(client);
                    }
                });
            }
        }
    }
    
    public void llenarSala(ArrayList<Espectador> client, Sala sala){
        for(Espectador clients : client){
            sitEspectadorAlt(sala, clients);
        }
    }
    
}
