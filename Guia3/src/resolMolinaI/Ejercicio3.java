package resolMolinaI;

public class Ejercicio3 {

	public static void ejecutar(int n) {
		
		
	        if (esCapicua(n)) {
	            System.out.println(n + " es capicúa.");
	        } else {
	            System.out.println(n + " no es capicúa.");
	        }
	    }

	    // Método para determinar si un número es capicúa
	    public static boolean esCapicua(int numero) {
	        // Convertir el número a una cadena
	        String numeros = String.valueOf(numero);
	        
	        // Obtener la longitud del número
	        int longitud = numeros.length();
	        
	        // Iterar sobre la mitad del número para comparar los dígitos desde el inicio y el final
	        for (int i = 0; i < longitud / 2; i++) {
	            if (numeros.charAt(i) != numeros.charAt(longitud - 1 - i)) {
	                // Si los dígitos no coinciden, el número no es capicúa
	                return false;
	            }
	        }
	        
	        // Si todos los dígitos coinciden, el número es capicúa
	        return true;
	    }
	}

	
	

