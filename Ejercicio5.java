import java.util.Scanner;
import java.math.*;

public class Ejercicio5{

    /*Escribir un programa que lea un número entero por teclado y muestre
    por pantalla el doble, el triple y la raíz cuadrada de ese número. */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        double n=scanner.nextDouble();
        System.out.println("EL doble del numero es: "+ (n*2));
        System.out.println("El triple es: "+ n*3);
        System.out.println("LA raiz cuadrada es: "+ Math.sqrt(n) );

    }
}