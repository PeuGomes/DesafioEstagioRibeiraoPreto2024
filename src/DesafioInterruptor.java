public class DesafioInterruptor {
    public static void descobrirInterruptores() {
        // Inicializa um array para representar o estado dos interruptores (true = ligado, false = desligado)
        boolean[] interruptores = new boolean[3];

        // Primeira ida: Liga o primeiro interruptor
        ligarInterruptor(0, interruptores);
        // Segunda ida: Liga o segundo interruptor
        ligarInterruptor(1, interruptores);

        // Verifica quais interruptores foram ligados após as duas idas
        verificarInterruptoresLigados(interruptores);
    }

    // Método para ligar um interruptor e alterar o estado dos interruptores correspondentes
    private static void ligarInterruptor(int interruptor, boolean[] interruptores) {
        interruptores[interruptor] = true;
    }

    // Método para verificar quais interruptores foram ligados após as duas idas
    private static void verificarInterruptoresLigados(boolean[] interruptores) {
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                System.out.println("Interruptor " + (i + 1) + " ligou a lâmpada da sala " + (i + 1));
            } else {
                System.out.println("Interruptor " + (i + 1) + " não está ligado e corresponde à sala " + (i + 1));
            }
        }
    }
}
