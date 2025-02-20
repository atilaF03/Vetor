import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os numeros");
            numero = sc.nextInt();
        }
        numeros.add(numero);

    
        sc.close();
    }
}
