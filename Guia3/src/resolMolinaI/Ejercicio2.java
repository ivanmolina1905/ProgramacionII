package resolMolinaI;

public class Ejercicio2 {

	public static void ejecutar() {
		
		int [] arreglo=new  int[10];
		for (int i = 0; i <10; i++) {
            arreglo[i]=(int)(Math.random()*10);
        }
		
		float promedio=0;
		for (int i = 0; i <10; i++) {
            promedio=promedio+arreglo[i];
        }
		promedio=promedio/10;
	
		int [] arreglo2=new int[10];
		int c=0;
		//recorremos el arreglo y vemos cuales numeros son mayores al promedio y lo cargamos en otro arreglo
		for (int i = 0; i <10; i++) {
           if(arreglo[i]>promedio) {
        	   arreglo2[c]=arreglo[i];
        	   c++;
           }
        }
		
		System.out.println(promedio);
		for (int i = 0; i <10; i++) {
            System.out.print(" "+arreglo2[i]);
        }
	}
}
