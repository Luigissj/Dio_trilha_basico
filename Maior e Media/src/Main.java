import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int contar = 0;
        do {
            System.out.println("Digite um numero");
            numero = num.nextInt();
            System.out.println(".");
            if (numero > maior)
                maior = numero;
            soma = soma + numero;
            contar++;
        }while(contar < 5);

        System.out.println("Numero maior: " + maior);
        System.out.println("Media: " + soma/contar );
    }
}