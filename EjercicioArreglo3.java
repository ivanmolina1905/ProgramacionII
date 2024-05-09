import java.util.Scanner;

public class EjercicioArreglo3 {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de
    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arreglo=new int[n];
        //cargo el arreglo con valores de hasta 5 unidades
        for (int i = 0; i <n ; i++) {
            arreglo[i]=(int)(Math.random()*99999);
        }
        //prueba para ver si leia los numeros con 1 y 2 cifras (tenia problemas con esta parte)
        arreglo[0]=2;
        arreglo[1]=1;
        arreglo[2]=66;
        //muestro arreglo
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arreglo[i]);
        }
        System.out.println();
        int c1digito=0;
        int c2digito=0;
        int c3digito=0;
        int c4digito=0;
        int c5digito=0;
       
        for (int i = 0; i < n; i++) {
            if (arreglo[i]<10) {
                c1digito++;
            }else  if (arreglo[i]<100) {
                c2digito++; 
            }else  if (arreglo[i]<1000) {
                c3digito++; 
            }else  if (arreglo[i]<10000) {
                c4digito++; 
            }else if (arreglo[i]<100000) {
                c5digito++;
            }
        }

        System.out.println("Tenemos "+c1digito+" Numeros de 1 digito");
        System.out.println("Tenemos "+c2digito+" Numeros de 2 digito");
        System.out.println("Tenemos "+c3digito+" Numeros de 3 digito");
        System.out.println("Tenemos "+c4digito+" Numeros de 4 digito");
        System.out.println("Tenemos "+c5digito+" Numeros de 5 digito");
    }
}