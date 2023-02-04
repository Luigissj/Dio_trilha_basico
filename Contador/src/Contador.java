import java.util.Scanner;
public class Contador{
    Scanner numeros = new Scanner(System.in);
    int numero1;
    int numero2;

    public void contador () {
        System.out.println("Digite um numero");
        numero1 = numeros.nextInt();
        System.out.println("Digite outro numero");
        numero2 = numeros.nextInt();
        int contar = numero2 - numero1;
        if (numero2 > numero1) {
            contar = numero2 - numero1;
        } else {
            System.out.println("O segundo numero é menor que o primeiro");
        }
        for (int i = 0; i < contar; i++){
            System.out.println("Numero " + i);
        }
    }
}
