import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que fatorial desejaria ver?");
        int numero = scan.nextInt();
        int multiplicacao = 1;

        for (int i = numero; i > 1; i--)
            multiplicacao *= i;
        System.out.println("O fatorial de " + numero + " é igual á " + multiplicacao);
    }
}