import java.util.Scanner;

public class Ejercicio4 {
    /* Dada una cantidad de grados centígrados se debe mostrar su
    equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
    + (9 * C / 5).*/
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese los grados");
        float g=scanner.nextFloat();
        float grados=32+(9*(g/5));
        System.out.println("Los grados en fahrenheit son: "+ grados);
        
    }
}
