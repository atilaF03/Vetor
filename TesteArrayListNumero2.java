import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite 10 numeros: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("numero: " + (i++) + ": ");
            int numero = sc.nextInt();
            lista.add(numero);
        }
        for (int numero : lista) {
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Parabéns! Você ganhou um bônus de R$ 50,00 por digitar " + numero + "!");
            }
        }
        sc.close();
    }
}
