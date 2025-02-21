import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<String> telefones = new ArrayList<>();

    while (true) {
      informacoes();
      int opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          System.out.println("informe um nome");
          String nome = sc.next();
          System.out.println("informe um telefone");
          String telefone = sc.nextLine();
          nomes.add(nome);
          telefones.add(telefone);
          break;
        case 2:
        
        
        
        
        break;

        default:
          break;
      }

      sc.close();
    }
  }
  public static void informacoes() {
    System.out.println("++++menu++++");
    System.out.println("1- cadastrar contatos");
    System.out.println("2-Listar Contatos");
    System.out.println("3-Excluir ");
    System.out.println("4- sair ");

  }
}
