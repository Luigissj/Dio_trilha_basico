import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random numb = new Random();
        int N;
        int par = 0;
        int impar = 0;
        System.out.println("Digite a quantidade de vezes que esse procedimento ocorrerá:");
        N = num.nextInt();
        int [] numeros = new int[N];
        System.out.println("------------------------------------");
        for (int i = 0; i < N; i++) {
            numeros [i] = numb.nextInt(0, 999999999);
                            System.out.println("O Numero escolhido foi: " + numeros [i]);
                if (numeros [i] % 2 == 0)
                    par++;
                else
                    impar++;

            }
        System.out.println("------------------------------------");
        System.out.println("ªº°ªº°ªº° Lista de Valores ªº°ªº°ªº°");
            for (int i = 0; i < N; i++){
                System.out.println(numeros [i]);
            }
        System.out.println(".");
        System.out.println("Quantidade de Pares: " + par);
        System.out.println("Quantidade de Impares: " + impar);
        }
    }