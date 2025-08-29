package co.edu.uniquindio;

public class MultiplicacionSumas {
    /*
     * Metodo para multiplicar dos numeros usando solo sumas y recursion
     * @MaicolPaez
     */
    public static void main(String[] args) {
        
        System.out.println("=== MULTIPLICACIÓN CON SUMAS ===\n");
        
        int numero1 = 7;
        int numero2 = 5;
        int resultado1 = multiplicarRecursivo(numero1, numero2);
        System.out.println(numero1 + " x " + numero2 + " = " + resultado1);
        
        int numero3 = 12;
        int numero4 = 3;
        int resultado2 = multiplicarRecursivo(numero3, numero4);
        System.out.println(numero3 + " x " + numero4 + " = " + resultado2);
        
        int numero5 = 0;
        int numero6 = 8;
        int resultado3 = multiplicarRecursivo(numero5, numero6);
        System.out.println(numero5 + " x " + numero6 + " = " + resultado3);
        
        System.out.println("\n=== FIN ===");
        
    }
    
    public static int multiplicarRecursivo(int a, int b) {
        if (b == 0) {
            return 0;
        }
        
        if (b > 0) {
            return a + multiplicarRecursivo(a, b - 1);
        } else {
            return -multiplicarRecursivo(a, -b);
        }
    }
    
}
