import java.util.Scanner;


public class Calculadora 
{

	public static void main(String[] args) 
	{
		
		// Esta es una calculadora de Practica para Programacion 2
		// Parte principal de funciones if, switch, etc.
		
		float num1, num2, resu;
		int esco;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***CALCULADORA BASICA***");
		
		System.out.println("\nPor favor ingresar el primer numero: ");
		num1 = input.nextFloat();
				
		System.out.println("Por favor ingresar el segundo numero: ");
		num2 = input.nextFloat();

		System.out.println("\nEscoger la operacion a ejecutar:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		
		esco = input.nextInt();
		
		 switch (esco) 	
		 
		 {
         case 1:
         resu = num1 + num2;
         System.out.println("\nEl resultado de la suma es " + resu);
         break;
         
         case 2:
         resu = num1 - num2;
         System.out.println("\nEl resultado de la resta es " + resu);
         break;
         
         case 3:  
         resu = num1 * num2;
         System.out.println("\nEl resultado de la multiplicacion es " + resu);
         break;
        
         case 4:  
         resu = num1 / num2;
         System.out.println("\nEl resultado de la division es " + resu);
         break;
		 }
	}

}
