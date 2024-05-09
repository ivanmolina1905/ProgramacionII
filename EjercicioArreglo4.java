public class EjercicioArreglo4 {
    
    /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
    A se denota por B y se obtiene cambiando sus filas por columnas (o
    viceversa). */
    
    public static void main(String[] args) {
            
        int[][] m=new int[4][4];
        //creo la matriz y la cargo
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                m[i][j]=(int)(Math.random()*10);
            }
            
        }
    
        //muestro matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //muestro la matriz transpuesta
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+m[j][i]);
            }
            System.out.println();
        }
    }
}
