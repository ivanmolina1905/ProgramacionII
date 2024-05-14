package resolMolinaI;

import java.util.Scanner;

public class Ejercicio14 {

	public static void ejecutar() {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int []arreglo=new int[10];
		for(int i=0;i<9;i++) {
			System.out.println("Ingrese un numero ");
			n=scanner.nextInt();
			arreglo[i]=n;
		}
		System.out.println("Muestro el arreglo: ");
		for (int i=0;i<9;i++) {
			
			System.out.print(" "+arreglo[i]);
			
		}
	}
}
