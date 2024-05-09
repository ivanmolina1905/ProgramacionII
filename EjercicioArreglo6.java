import java.util.Scanner;

public class EjercicioArreglo6 {
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
    1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
    idénticas. Crear un programa que permita introducir un cuadrado por
    teclado y determine si este cuadrado es mágico o no. El programa
    deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9. */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas: ");
        int f=scanner.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int c=scanner.nextInt();
        int[][] m=new int[f][c];
        //pido que ingrese los numeros y compruebo que esten del 1 al 9
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {

                System.out.println("Ingrese un numero del 1 al 9: ");
                int num=scanner.nextInt();
                while (num>10){
                    System.out.println("Ingrese un numero del 1 al 9 correcto: ");
                    num=scanner.nextInt();
                }
                m[i][j]=num;
            }
        }

        //ver suma de diagonales
        int d1=0;
        int d2=0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                d1=d1+m[i][j+i];
                d2=d2+m[i][c-i];
            }
            
        }

        //ver suma de columnas y filas
        boolean suma=false; //si suma queda en true quiere decir que la suma de todas las filas es igual
        int s=0;
        //inicio a s con la suma de la primera fila para despues compararla
        for (int i = 0; i < f; i++) {
             for (int j = 0; j < c; j++) {
                s=s+m[i][j];
            }
        }   
        //arranco de la fila 2 por eso i=1
            for (int i = 1; i < f; i++) {
                int s1=0;
                for (int j = 0; j < c; j++) {
                   s1=s1+m[i][j];
               }
               //comparo la suma de la fila siguiente con la anterior
               if (s1==s){
                 suma=true;}
                 //sobreescribo la suma anterior con la nueva y calculo en el siguiente ciclo a s1 de vuelta
                 s=s1;
            }

            boolean sumac=false; //si suma queda en true quiere decir que la suma de todas las columnas es igual
        int z=0;
        //inicio a s con la suma de la primera columna para despues compararla
        for (int i = 0; i < f; i++) {
             for (int j = 0; j < c; j++) {
                z=z+m[j][i];
            }
        }   
        //arranco de la columna 2 por eso i=1
            for (int i = 1; i < f; i++) {
                int c1=0;
                for (int j = 0; j < c; j++) {
                    c1=c1+m[j][i];
               }
               //comparo la suma de la columna siguiente con la anterior
               if (c1==z){
                 sumac=true;}
                 //sobreescribo la suma anterior con la nueva y calculo en el siguiente ciclo a c1 de vuelta
                 z=c1;
            }
            
            if (d1==d2 && suma==true && sumac==true){
                System.out.println("La matriz cuadrada es magica: ");
            }else{
                System.out.println("La matriz no es magica");
            }

    }
}