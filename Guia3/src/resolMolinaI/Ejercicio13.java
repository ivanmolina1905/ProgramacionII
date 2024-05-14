package resolMolinaI;

public class Ejercicio13 {
	//forma recursiva
	public static void ejecutar(int n) {
		
		int resultado = sumarRecursivamente(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }

    public static int sumarRecursivamente(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumarRecursivamente(n - 1);
        }
	}
    //forma iterativa
    /*int resultado = sumarIterativamente(n);
    System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
	

	public static int sumarIterativamente(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i;
    }
    return suma;*/
}

