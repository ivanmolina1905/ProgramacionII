package resolMolinaI;
import java.util.Scanner;

public class Ejercicio15 {

	
	    public static void ejecutar() {
	        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
	        Scanner scanner = new Scanner(System.in);
	        StringBuilder cadenaResultante = new StringBuilder();

	        System.out.println("Ingrese las posiciones del array (0-4) para añadir las vocales (A, E, I, O, U).");
	        System.out.println("Ingrese -1 para terminar.");

	        while (true) {
	            System.out.print("Ingrese una posición (-1 para terminar): ");
	            int posicion = scanner.nextInt();

	            if (posicion == -1) {
	                break;
	            } else if (posicion < 0 || posicion >= vocales.length) {
	                System.out.println("Error: la posición debe estar entre 0 y " + (vocales.length - 1) + ".");
	            } else {
	                cadenaResultante.append(vocales[posicion]);
	            }
	        }

	        System.out.println("Cadena resultante: " + cadenaResultante.toString());
	    }
	}