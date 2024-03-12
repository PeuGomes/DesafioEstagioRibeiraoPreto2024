
public class DesafioFibonacci {
    public static void verificaFibonacci(int numero) {
        try {
            if (numero < 0) {
                throw new IllegalArgumentException("O número não pode ser negativo.");
            }

            int a = 0, b = 1, soma;
            while (a <= numero) {
                if (a == numero) {
                    System.out.println("\n" + numero + " pertence à sequência de Fibonacci.\n");
                    return;
                }
                soma = a + b;
                a = b;
                b = soma;
            }
            System.out.println("\n" + numero + " não pertence à sequência de Fibonacci.\n");
        } catch (IllegalArgumentException e) {
            System.out.println("\n Erro: " + e.getMessage() + "\n");
        }
    }
}
