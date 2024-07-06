public class Exemplo02 {
    public static void main(String[] args) {
        int inicio = 1; // início do intervalo
        int fim = 10;   // fim do intervalo
        int resultado = somaIntervalo(inicio, fim);
        System.out.println("A soma dos números entre " + inicio + " e " + fim + " é: " + resultado);
    }

    public static int somaIntervalo(int inicio, int fim) {
        if (inicio > fim) {
            return 0; // Caso base: retorna 0 se o início for maior que o fim
        } else {
            return inicio + somaIntervalo(inicio + 1, fim); // Caso recursivo: soma início com a soma dos números restantes
        }
    }
}
