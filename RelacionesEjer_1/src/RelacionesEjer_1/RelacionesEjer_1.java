/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEjer_1;

import java.util.Scanner;
import Servicios.PerroService;
import Servicios.PersonaService;

/**
 *
 * @author yamila
 */

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

public class RelacionesEjer_1 {

    public static void main(String[] args) {
        
        //Instanciamos los servicios
        PersonaService perS = new PersonaService();
        PerroService perroS = new PerroService();
        
        Scanner leer = new Scanner(System.in);
        String opcion;
        
        //Creamos los objetos
        do{
            perS.crearPersona();
            
            System.out.println("Desea agregar otra persona?");
            System.out.println("Si [S] / No [N]");
            opcion = leer.nextLine();
            
        }while(!"N".equalsIgnoreCase(opcion));
        
        do{
            perroS.crearPerro();
            
            System.out.println("Desea agregar otro perro?");
            System.out.println("Si [S] / No [N]");
            opcion = leer.nextLine();
            
        }while(!"N".equalsIgnoreCase(opcion));
        
        // ===========================================================
        
        perS.mostrarPersonas(); //Mostramos las personas en la lista
        
        System.out.println("----> SERVICIO DE ADOPCIÓN CANINA <----");
        System.out.println("Ingrese el nombre de la persona que adoptará un perro: ");
        String nombrePersona = leer.nextLine();
        
        perroS.mostrarPerros(); //Mostramos los perros en la lista
        
        System.out.println("Ingrese el nombre del perro que será adptado: ");
        String nombrePerro = leer.nextLine();
        
        //Llamada al metodo para adoptar
        perS.adoptarPerro(perroS.obtenerListaPerros(), nombrePerro, nombrePersona);
        
        //Mostramos los datos de la persona
        perS.mostrarPersonaPorNombre(nombrePersona);
    }
    
}
