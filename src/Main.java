import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Desafio 1
        System.out.println("\nDesafio Soma:\n");
        DesafioSoma.calculaSoma();

        // Desafio 2
        System.out.println("Desafio Fibonacci:\n");
        int numero = 0;
        boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.print("Informe um número inteiro para verificar se pertence à sequência de Fibonacci: ");
                numero = scanner.nextInt();
                if (numero <= 0) {
                    throw new IllegalArgumentException("O número deve ser positivo e diferente de zero.");
                }
                inputValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        DesafioFibonacci.verificaFibonacci(numero);

        // Desafio Sequência
        System.out.println("Desafio Sequência:\n");
        DesafioSequencia.completarSequencias();

        // Desafio String
        System.out.println("Desafio String:\n");
        System.out.print("Informe letras ou nome para inverter os caracteres: \n");
        String entrada = "";
        boolean entradaValida = false;
        while (!entradaValida) {
            entrada = scanner.next();
            if (entrada.matches("[a-zA-Z]+")) {
                entradaValida = true;
            } else {
                System.out.println("Erro: Por favor, digite apenas letras.");
            }
        }
        DesafioString.inverterString(entrada);

        scanner.close();
    }
}
