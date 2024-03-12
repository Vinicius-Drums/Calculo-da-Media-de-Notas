public class CalculaMediaNotas {

    public static void main(String[] args) {
        // Inicializa um array com 10 notas
        double[] notas = {7.5, 8.0, 9.5, 6.0, 7.2, 8.5, 9.0, 8.8, 7.9, 6.5};

        // Chama a função para calcular a média e imprime o resultado
        double media = calcularMedia(notas);
        System.out.println("A média das notas é: " + media);
    }

    // Função para calcular a média das notas
    public static double calcularMedia(double[] notas) {
        // Verifica se o array de notas não está vazio
        if (notas.length == 0) {
            System.out.println("O array de notas está vazio. Não é possível calcular a média.");
            return 0.0;
        }

        // Inicializa a variável para armazenar a soma das notas
        double soma = 0.0;

        // Loop for para iterar sobre o array de notas e calcular a soma
        for (double nota : notas) {
            soma += nota;
        }

        // Calcula a média dividindo a soma pelo número de notas
        double media = soma / notas.length;

        // Retorna a média calculada
        return media;
    }
}
