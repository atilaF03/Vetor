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
          String telefone = sc.next();
          nomes.add(nome);
          telefones.add(telefone);
          break;
        case 2:
          if (nomes.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
          } else {
            System.out.println("\nLista de Contatos:");
            for (int i = 0; i < nomes.size(); i++) {
              System.out.println((i + 1) + ". " + nomes.get(i) + " - " + telefones.get(i));
            }
          }
          break;
        case 3:
          if (nomes.isEmpty()) {
            System.out.println("sua lista telefonica está vazia");
          } else {
            System.out.println("informe o númer do contato para excluir: ");
            int indice = sc.nextInt();
            sc.nextLine();
            if (indice > 0 && indice <= nomes.size()) {
              nomes.remove(indice - 1);
              telefones.remove(indice - 1);
            } else {
              System.err.println("indice invalido");
            }

          }
          break;
        case 4:
          System.out.println("Power off...");
          sc.close();
          return;
        default:
          System.out.println("opção invalida");
      }

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
