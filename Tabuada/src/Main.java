import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;
        int [] numeroTabuada = new int[11];


        System.out.println("Que numero deseja ver na tabuada?");
        numero = num.nextInt();

        System.out.println("ªº°ªº°ªº° TABUADA ªº°ªº°ªº°");
        for (int i = 0; i <= 10; i++){
            numeroTabuada [i] = numero * i;
            System.out.println("N " + i + " = " + numeroTabuada [i]);
        }
    }
}