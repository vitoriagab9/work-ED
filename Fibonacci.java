public class Fibonacci {

    // Função recursiva para calcular o número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 3; // Exemplo: calcular Fibonacci de 3

        System.out.println("Fibonacci de " + n + " (recursivo): " + fibonacci(n));
    }
}

