import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo
        //muestre por pantalla.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=scanner.nextLine();
        System.out.println("Su nombre es: "+ nombre);
    }
}
