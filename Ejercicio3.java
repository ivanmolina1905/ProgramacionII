import java.util.Scanner;

public class Ejercicio3 {
    
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
    y después toda en minúsculas.*/

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=scanner.nextLine();
        System.out.println("Su nombre en mayusculas es: "+ nombre.toUpperCase());

    }
}
