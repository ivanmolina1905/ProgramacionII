package resolMolinaI;

public class Ejercicio4 {

	public static void ejecutar(String contrasena) {
		if (esContraseñaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

    // Método para determinar si una contraseña es segura
    public static boolean esContraseñaSegura(String contrasena) {
        // Verificar la longitud de la contraseña
        if (contrasena.length() < 8) {
            return false;
        }

        // Contadores para letras mayúsculas, letras minúsculas y dígitos
        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;

        // Iterar sobre cada caracter de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            // Verificar si es una letra mayúscula
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
            // Verificar si es una letra minúscula
            else if (Character.isLowerCase(caracter)) {
                minusculas++;
            }
            // Verificar si es un dígito numérico
            else if (Character.isDigit(caracter)) {
                digitos++;
            }
            // Verificar si es un guión bajo
            else if (caracter != '_') {
                // Si el caracter no es válido, la contraseña no es segura
                return false;
            }
        }

        // Verificar si cumple con los criterios de seguridad
        return mayusculas >= 2 && minusculas >= 3 && digitos >= 2;
    }
}