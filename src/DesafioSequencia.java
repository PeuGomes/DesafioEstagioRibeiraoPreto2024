public class DesafioSequencia {
    public static void completarSequencias() {
        // Sequência a) 1, 3, 5, 7, ___
        int proximoA = calcularProximoA(7);
        System.out.println("a) 1, 3, 5, 7, " + proximoA);

        // Sequência b) 2, 4, 8, 16, 32, 64, ____
        int proximoB = calcularProximoB(64);
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + proximoB);

        // Sequência c) 0, 1, 4, 9, 16, 25, 36, ____
        int proximoC = calcularProximoC(7);
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + proximoC);

        // Sequência d) 4, 16, 36, 64, ____
        int proximoD = calcularProximoD(64);
        System.out.println("d) 4, 16, 36, 64, " + proximoD);

        // Sequência e) 1, 1, 2, 3, 5, 8, ____
        int proximoE = calcularProximoE(8, 5);
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + proximoE);

        // Sequência f) 2, 10, 12, 16, 17, 18, 19, ____
        int proximoF = calcularProximoF(19);
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + proximoF + "\n");
    }

    public static int calcularProximoA(int ultimo) {
        // Para a sequência a), cada número é o número ímpar consecutivo
        return ultimo + 2;
    }

    public static int calcularProximoB(int ultimo) {
        // Para a sequência b), cada número é o dobro do anterior
        return ultimo * 2;
    }

    public static int calcularProximoC(int indice) {
        // Para a sequência c), cada número é o quadrado do índice
        return indice * indice;
    }

    public static int calcularProximoD(int ultimo) {
        // Para a sequência d), cada número é um quadrado perfeito
        // Encontrar o próximo quadrado perfeito após o último número
        int raiz = (int) Math.sqrt(ultimo) + 1;
        return raiz * raiz;
    }

    public static int calcularProximoE(int a, int b) {
        // Para a sequência e), cada número é a soma dos dois anteriores (sequência de Fibonacci)
        return a + b;
    }

    public static int calcularProximoF(int ultimo) {
        // Para a sequência f), cada número é o próximo número na sequência aritmética
        return ultimo + 1;
    }


}
