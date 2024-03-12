public class DesafioString {
    public static void inverterString(String input) {
        if (input.matches("[a-zA-Z]+")) {
            StringBuilder invertedString = new StringBuilder();

            for(int i = input.length() - 1; i >= 0; --i) {
                invertedString.append(input.charAt(i));
            }

            System.out.println("String invertida: " + invertedString.toString());
        } else {
            System.out.println("Erro: Por favor, digite apenas letras.");
        }
    }
}
