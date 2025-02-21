import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteArrayListString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        // Adiciona 10 Strings informadas pelo usuário
        System.out.println("Digite 10 palavras:");
        for (int i = 1; i < 10; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            lista.add(scanner.nextLine());
        }
        
        // Imprime os valores da lista
        System.out.println("\nLista antes da ordenação:");
        for (String s : lista) {
            System.out.println(s);
        }
        
        // Ordena a lista
        Collections.sort(lista);
        
        // Imprime os valores ordenados da lista
        System.out.println("\nLista depois  a ordenação:");
        for (String nomes : lista) {
            System.out.println(nomes);
        }
        
        scanner.close();
    }}