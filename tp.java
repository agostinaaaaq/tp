package tp;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class tp {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num_secreto, num_ingresado = 0, intentos = 0;
		
		Random random = new Random();
        
		num_secreto = random.nextInt(100) + 1;
		
		do {
			try {
				
				System.out.println("Ingresa un numero del 1 al 100: ");
				num_ingresado = entrada.nextInt();
			
				if (num_ingresado < num_secreto) {
					System.out.println("\nEl numero aleatorio es mayor");
				}
			
				else if (num_ingresado > num_secreto) {
					System.out.println("\nEl numero aleatorio es menor");
				}
			
				intentos += 1;
			
				if (num_secreto == num_ingresado) {
					System.out.println("\nGanaste!!!!!!!! Cantidad de intentos: " + intentos);
				}
			
				else if (intentos == 10) {
					System.out.println("\nPerdiste. Limite de intentos");
				}
				
				else if (num_ingresado < 1 || num_ingresado > 100) {
					throw new ArithmeticException();
				}
			
			} catch (ArithmeticException e) { 
	            System.out.println("Error: Numero menor/mayor al solicitado");
	        }
			
			catch (InputMismatchException e) {
				System.out.println("Error: Debes ingresar un dato valido.");
				entrada.nextLine();
			}
           
		} while (num_ingresado != num_secreto && intentos <= 9);
			
		System.out.println("Programa finalizado.");
        entrada.close();
        
	}
}
