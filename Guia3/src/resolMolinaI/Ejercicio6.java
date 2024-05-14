package resolMolinaI;

public class Ejercicio6 {
		
	public static void ejecutar(int n) {
		boolean primo=true;
		for (int i=2;i<n;i++) {
			while (n!=i&& n!=1 ) {
				if(n%i==0) {
					primo=false;
					break;
				}
				i++;
			}
		}
		if(primo==true) {
		System.out.println("El numero es primo ");
		}else {
			System.out.println("El numero no es primo ");
		}
}
}