package resolMolinaI;

public class Principal {
	public static void main(String[] args) {
		
		        
		     
		        // Variable para seleccionar el ejercicio
		        int opcion = 16; 
		        
		        // Switch para seleccionar el ejercicio
		        switch (opcion) {
		            case 1:
		            	System.out.println("Ejercicio 1");
		                Ejercicio1.ejecutar();
		                break;
		            case 2:
		            	System.out.println("Ejercicio 2");
		            	Ejercicio2.ejecutar();
		                break;
		            case 3:
		            	System.out.println("Ejercicio 3");
		            	int a=100101;
		            	Ejercicio3.ejecutar(a);
		            	break;
		            case 4:
		            	System.out.println("Ejercico 4");
		            	String c="Sp2K2sk300";
		            	Ejercicio4.ejecutar(c);
		            	break;
		            case 5:
		            	System.out.println("Ejercico 5");
		            	int n=7;
		            	Ejercicio5.ejecutar(n);
		            	break;
		            case 6:
		            	System.out.println("Ejercicio 6");
		            	int n1=13;
		            	Ejercicio6.ejecutar(n1);
		            	break;
		            case 7:
		            	System.out.println("Ejercicio 7");
		            	String palabra="hola    mundo";
		                Ejercicio7.ejecutar(palabra);
		                break;
		            case 8:
		            	System.out.println("Ejercicio 8");
		            	int monto=1250;
		            	Ejercicio8.ejecutar(monto);
		            	break;
		            case 9:
		            	System.out.println("Ejercicio 9");
		            	int [] arreglo=new int[10];
		            	for (int i = 0; i <10; i++) {
		                    arreglo[i]=(int)(Math.random()*10);
		                }
		            	Ejercicio9.ejecutar(arreglo);
		            	break;
		            case 10:
		            	System.out.println("Ejercicio 10");
		            	//no me toma el 0 pero los otros si
		            	Ejercicio10.ejecutar(017645264);
		            	break;
		            case 11:
		            	System.out.println("Ejercicio 11");
		            	int N=11;
		            	double A=22;
		            	char C='h';
		            	Ejercicio11.ejecutar(N,A,C);
		            	break;
		            case 12:
		            	System.out.println("Ejercicio 12");
		            	int numero=11;
		            	Ejercicio12.ejecutar(numero);
		            	break;
		            case 13:
		            	System.out.println("Ejercicio 13");
		            	int numerosasumar=10;
		            	Ejercicio13.ejecutar(numerosasumar);
		            	break;
		            case 14:
		            	System.out.println("Ejercicio 14");
		            	Ejercicio14.ejecutar();
		            	break;
		            case 15:
		            	System.out.println("Ejercicio 15");
		            	Ejercicio15.ejecutar();
		            	break;
		            case 16:
		            	System.out.println("Ejercicio 16");
		            	int tamano=10;
		            	Ejercicio16.ejecutar(tamano);
		            default:
		                System.out.println("Opción inválida.");
		                
		        }
		    }
		    
		   
		  
		  
	}

