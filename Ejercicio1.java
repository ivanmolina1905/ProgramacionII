import java.util.Scanner;

public class Ejercicio1
{
   /*Escribir un programa que pida dos números enteros por teclado y calcule
   la suma de los dos. El programa deberá después mostrar el resultado de
   la suma*/
     public static void main (String args[])
     {
      //la clase scanner se usa para "scanear" lo que se ingresa desde el teclado es necesario crear un objeto tipo scaner por unica vez en el programa
      Scanner scanner=new Scanner(System.in);

      //Solicitar al usuario que ingrese el primer numero
      System.out.println("Ingrese el primer numero");
      //guardamos el int
      int a=scanner.nextInt();
      //Solicita el segundo numero
      System.out.println("Ingrese el segundo numero");
      //guardamos el segundo numero
      int b=scanner.nextInt();
      System.out.println("La suma de a y b es :"+ (a+b));

      //cerro scanner para liberar recursos
      scanner.close();
     }
}