package resolMolinaI;

public class Ejercicio5 {

	public static void ejecutar(int n) {
	
		        int resultado = fibonacci(n);
		        System.out.println("El " + n + "° elemento de la serie de Fibonacci es: " + resultado);
		    }

		    // Método recursivo para calcular el enésimo elemento de la serie de Fibonacci
		    public static int fibonacci(int n) {
		        // Caso base: los primeros dos elementos de la serie de Fibonacci son 1
		        if (n == 1 || n == 2) {
		            return 1;
		        }
		        // Paso recursivo: fib(n) = fib(n - 1) + fib(n - 2)
		        else {
		            return fibonacci(n - 1) + fibonacci(n - 2);
		        }
		    }
		}
