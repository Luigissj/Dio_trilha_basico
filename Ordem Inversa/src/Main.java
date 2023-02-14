import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Quantos valores deseja?");
        int valor = info.nextInt();
        int[] numero = new int[valor];
        for (int i = 0; i < valor; i++) {
            System.out.println("Qual valor estará na posição Nº " + i + "?");
            numero [i] = info.nextInt();
        }
        System.out.println("ªº°ªº°ªº° ORDEM CORRETA ªº°ªº°ªº°");
        for (int i = 0; i < valor; i++)
            System.out.println(numero [i]);

        System.out.println("ªº°ªº°ªº° ORDEM INVERSA ªº°ªº°ªº°");
            for (int i = (valor - 1); i >= 0; i--)
                System.out.println(numero [i] + " ");
    }
}