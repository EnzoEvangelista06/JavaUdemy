package introducao;
// Classe principal do programa

// public -> pode ser acessado em qualquer lugar
// class -> define uma classe (estrutura base do Java)
// PrimeiroPrograma -> nome da classe (deve ser igual ao nome do arquivo: PrimeiroPrograma.java)  
public class PrimeiroPrograma {

  // Método principal (ponto de entrada do programa)
  // É aqui que o Java começa a execução
  public static void main(String[] args) {

    // static -> pertence à classe, não precisa criar objeto
    // void -> não retorna nenhum valor
    // main -> nome obrigatório que o Java reconhece
    // "String[] args" -> array de textos que recebe argumentos da linha de comando

    // Exibe uma mensagem no console
    // System -> classe padrão do Java
    // out -> saída padrão (console)
    // println -> imprime texto e quebra linha
    // "Olá, mundo!" -> mensagem exibida
    System.out.println("Olá, mundo!");
  }
}