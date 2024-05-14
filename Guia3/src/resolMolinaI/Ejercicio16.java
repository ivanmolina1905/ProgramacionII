package resolMolinaI;
import java.util.Scanner;
public class Ejercicio16 {

	public static void ejecutar(int tamano) {
		
        double[] notas = new double[tamano];
        String[] nombres = new String[tamano];
        String[] resultados = new String[tamano];

        leerDatos(notas, nombres);

        determinarResultados(notas, resultados);

        mostrarResultados(nombres, notas, resultados);
    }

    public static void leerDatos(double[] notas, String[] nombres) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (entre 0 y 10): ");
                notas[i] = scanner.nextDouble();
            } while (!validarNota(notas[i]));
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public static void determinarResultados(double[] notas, String[] resultados) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] < 5) {
                resultados[i] = "Suspenso";
            } else if (notas[i] >= 5 && notas[i] < 7) {
                resultados[i] = "Bien";
            } else if (notas[i] >= 7 && notas[i] < 9) {
                resultados[i] = "Notable";
            } else {
                resultados[i] = "Sobresaliente";
            }
        }
    }

    public static void mostrarResultados(String[] nombres, double[] notas, String[] resultados) {
        System.out.println("\nResultados de los alumnos:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - Nota: " + notas[i] + " - Resultado: " + resultados[i]);
        }
    }

}

