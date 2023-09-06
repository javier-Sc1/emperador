
package mx.itson.emperador.ui;

import java.util.Scanner;



public class Main {

    
    public static void main(String[] args) {
        System.out.println("ingrese los alumnos");
        Scanner entrada = new Scanner(System.in);
        String alumnos = entrada.nextLine();
        
                
        String[] resultado = alumnos.split(",");
        for(String r : resultado){
            //System.out.println(s);
            String[] alumno = r.split(" ");
            String id = alumno[0];
            String primerNombre = alumno[3];
            String primerApellido = alumno[1];
            System.out.println("ID: " + id + " - " + primerNombre + " " + primerApellido);
        }
        
    }
    
}
