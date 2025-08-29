package co.edu.uniquindio;

public class TrianguloCaracteres {
    /*
     * Metodo para imprimir un triangulo de caracteres con altura N usando recursion
     * @MaicolPaez
     */
    public static void main(String[] args) {
        
        System.out.println("=== TRIÁNGULO DE CARACTERES ===\n");
        
        char caracter1 = '*';
        int altura1 = 5;
        System.out.println("Triángulo de '" + caracter1 + "' con altura " + altura1 + ":");
        imprimirTrianguloRecursivo(caracter1, altura1, 1);
        
        System.out.println();
        
        char caracter2 = '#';
        int altura2 = 4;
        System.out.println("Triángulo de '" + caracter2 + "' con altura " + altura2 + ":");
        imprimirTrianguloRecursivo(caracter2, altura2, 1);
        
        System.out.println();
        
        char caracter3 = '+';
        int altura3 = 3;
        System.out.println("Triángulo de '" + caracter3 + "' con altura " + altura3 + ":");
        imprimirTrianguloRecursivo(caracter3, altura3, 1);
        
        System.out.println("\n=== FIN ===");
        
    }
    
    public static void imprimirTrianguloRecursivo(char caracter, int altura, int filaActual) {
        if (filaActual > altura) {
            return;
        }
        
        imprimirFila(caracter, filaActual);
        imprimirTrianguloRecursivo(caracter, altura, filaActual + 1);
    }
    
    public static void imprimirFila(char caracter, int cantidad) {
        if (cantidad <= 0) {
            System.out.println();
            return;
        }
        
        System.out.print(caracter + " ");
        imprimirFila(caracter, cantidad - 1);
    }
    
}
