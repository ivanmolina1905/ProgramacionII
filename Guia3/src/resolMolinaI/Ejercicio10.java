package resolMolinaI;

public class Ejercicio10 {
	
	public static void ejecutar(int cod) {
	
	  String codigo=String.valueOf(cod);
	  if (codigo.length() != 9 ) {
          System.out.println("El código ISBN debe contener exactamente 9 dígitos numéricos.");
          return;
      }

      int suma = 0;
      for (int i = 0; i < 9; i++) {
          int digito = Character.getNumericValue(codigo.charAt(i));
          suma += (i + 1) * digito;
      }

      int digitoControl = suma % 11;
      String digitoControls;

      if (digitoControl == 10) {
          digitoControls = "X";
      } else {
          digitoControls = String.valueOf(digitoControl);
      }

      System.out.println("ISBN calculado: " + codigo + "-" + digitoControls);
  }

}
