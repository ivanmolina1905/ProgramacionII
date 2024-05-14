package resolMolinaI;

public class Ejercicio8 {

		public static void ejecutar(int monto) {
			int[] billetes = {100, 50, 20, 10, 5, 2, 1};
	        int[] cantidadBilletes = new int[billetes.length];

	        for (int i = 0; i < billetes.length; i++) {
	            cantidadBilletes[i] = monto / billetes[i];
	            monto %= billetes[i];
	        }

	        System.out.println("Cantidad de billetes:");
	        for (int i = 0; i < billetes.length; i++) {
	            if (cantidadBilletes[i] > 0) {
	                System.out.println("$" + billetes[i] + ": " + cantidadBilletes[i]);
	            }
	        }
	    }
	}
