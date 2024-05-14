package resolMolinaI;

public class Ejercicio12 {

	public static void ejecutar(int numero) {
		
		String mensajepn = (numero >= 0) ? "positivo" : "negativo";
        String mensajepi = (numero % 2 == 0) ? "par" : "impar";
        String mensajemultiplo5 = (numero % 5 == 0) ? "múltiplo de 5" : "no múltiplo de 5";
        String mensajemultiplo10 = (numero % 10 == 0) ? "múltiplo de 10" : "no múltiplo de 10";
        String mensajemm100 = (numero > 100) ? "mayor que 100" : (numero < 100) ? "menor que 100" : "igual a 100";

        System.out.println("El número " + numero + " es " + mensajepn);
        System.out.println("Es " + mensajepi );
        System.out.println("Es " + mensajemultiplo5 );
        System.out.println("Es " + mensajemultiplo10 );
        System.out.println("Es " + mensajemm100 );
	}
}
