package resolMolinaI;

public class Ejercicio9 {

	public static void ejecutar(int [] arreglo) {
		 for (int i = 0; i <arreglo.length - 1; i++) {
	            int indiceMinimo = i;
	            for (int j = i + 1; j < arreglo.length; j++) {
	                if (arreglo[j] < arreglo[indiceMinimo]) {
	                    indiceMinimo = j;
	                }
	            }
	            // Intercambiar el elemento mínimo con el primer elemento sin ordenar
	            int temp = arreglo[indiceMinimo];
	            arreglo[indiceMinimo] = arreglo[i];
	            arreglo[i] = temp;
	        }
		 for (int num : arreglo) {
	            System.out.print(num + " ");
	        }
	    }
}
	    
