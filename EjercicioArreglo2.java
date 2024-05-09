import java.util.Scanner;

public class EjercicioArreglo2 {

    /*vector de tamaño n con valores aleatorios, pedir al usuario que ingrese un numero y buscarlo en el vector
     * ver en que posicion esta mostrarlo y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int n=scanner.nextInt();
        int [] numeros=new int[n];
        //cargo el arreglo con numeros aleatorios
        for (int i = 0; i <n-1; i++) {
            numeros[i]=(int)(Math.random()*10);
        }
        //muestro arreglo
        for (int i = 0; i <n; i++) {
            System.out.println(numeros[i]);
        }

        //se pide al usuario un numero a buscar
        System.out.println("Ingrese un numero a buscar");
        int b=scanner.nextInt();
        boolean encontrado=false;
        for (int j = 0; j < n-1; j++) {
            if(numeros[j]==b){
                System.out.println("El numero a buscar esta en la posicion: "+ j);
                System.out.println(numeros[j]);
                encontrado=true;
            }
        }

        
        if (!encontrado){
            System.out.println("El numero no se encontro");
        }

    }
}