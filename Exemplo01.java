public class Exemplo01 {
    public static void main(String[] args) {
        int num = 3;
        int resultado = fatorial(num); // Calcula o fatorial de 3
        System.out.println("O fatorial de " + num + " é: " + resultado);
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

