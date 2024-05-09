public class EjercicioArreglo1 {
    
    /*crear un arreglo de tipo string con los nombres  */
    public static void main(String[] args) {
       int [] n=new int[100];
       for (int i =0; i <100; i++) {
        n[i]=100-i;
       }
       for (int i = 0; i <100; i++) {
        System.out.println(n[i]);
       }
       
    }
}
