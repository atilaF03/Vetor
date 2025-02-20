import java.util.ArrayList;

public class Arraylist {
   public static void main(String[] args) {
       // definido arrayslist
      ArrayList<Integer> numeros = new ArrayList<>();
      // Adicionando elementos ao arrayslist
      numeros.add(10);
      numeros.add(20);
      numeros.add(30);
      // exibindo os elementos do arrayslist
      System.out.println("Elementos");

      for (Integer numero : numeros) {
         System.out.println(numero);

      }
      // exibindo os elementeos do arraylist

      System.out.println("elementos do Arrayliste de inteiros:" + numeros);
      // Verificando o tamnho arraylist
      int tamanho = numeros.size();
      System.out.println("Tamanho do  Arraylist: "+ tamanho);

      // Verificando a existencia de um elemento
      boolean existeElemento30 = numeros.contains(30);
      System.out.println("EXISTE O ELEMENTO 30: " + existeElemento30);

      // removendo um elemento
      numeros.remove(Integer.valueOf(30));

      System.out.println("após a remoção do elemento 30: ");

      for (Integer numero : numeros) {

         System.out.println(numero);
      }

   }

}