import java.util.Locale;

public class SaidaDados {
  public static void main() {
    // print -> imprime o texto sem a quebra de linha
    System.out.print("Bom dia!");
    System.out.println("Perceba que a linha não foi quebrada!");

    // declaração de variável do tipo inteiro
    int y = 32;
    System.out.println(y);

    // declaração de variável do tipo double (decimal)
    double x = 10.35784;
    // Exibindo quantidade específica de casas decimais
    // printf -> imprime o valor com uma formatação específica
    System.out.printf("%.2f%n", x);

    // Setando o separador decimal para o dos EUA
    Locale.setDefault(Locale.US);
    System.out.printf("%.2f%n", x);

    // Concatenação
    System.out.println("Resultado: " + x + " metros");

    // Utilizando o printf para a concatenação. O %n no final é para acontecer uma
    // quebra de linha.
    System.out.printf("Resultado: %.2f metros%n", x);

    // Concatenar diversos elementos em um mesmo comando de escrita
    // %f: flutuante
    // %d: inteiro
    // %s: texto
    // %n: quebra de linha

    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;

    System.out.printf("%s tem %d anos e ganha R$%.2f por mês.%n", nome, idade, renda);
  }
}
