package org.ejercicios;

import java.util.Scanner;

public class AppEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
   
    
    
    
    Scanner entrada = new Scanner(System.in);
	int edad;
	String respuesta="";
	Condicionales pruebaCondicionales=new Condicionales();
	// pruebaCondicionales.MensajeEdad();
	System.out.println("Ingresa edad ");
	edad=entrada.nextInt();
    respuesta=pruebaCondicionales.MensajeEdadOOP(edad);
    System.out.println(respuesta);
    entrada.close();
    
    
    
    
	}

}
