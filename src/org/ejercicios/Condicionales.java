package org.ejercicios;
import java.util.Scanner;


public class Condicionales {
	public void MensajeEdad()
	{
		Scanner entrada = new Scanner(System.in);
		int edad=0;
		
		System.out.println("Ingresa edad ");
		edad=entrada.nextInt();
		
		if(edad<12)
			System.out.println("niño");
		if(edad>=12&&edad<19)
			System.out.println("adolecente");
		if(edad>=19)
			System.out.println("chavo ruco");
		
		entrada.close();
	}
	
	public String MensajeEdadOOP(int edad)
			{
				String mensajeEdad="";
				if(edad<12)
					 mensajeEdad="niño";
				if(edad>=12&&edad<19)
					 mensajeEdad="adolecente";
				if(edad>=19)
					 mensajeEdad="chavo ruco";
				
				return mensajeEdad;
				
			}
	

}
