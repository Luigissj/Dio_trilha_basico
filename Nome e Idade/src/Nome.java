import java.util.Random;
import java.util.Scanner;
public class Nome {
    Scanner opcao = new Scanner(System.in);
    Random numero = new Random();
    int numeroSecreto = numero.nextInt(0,2000);
    boolean test = true;

    public void iniciarTeste() {
        System.out.println("Ola, usuario, gostaria que participasse de um jogo." +
                "Poderia me conceder essa honra?");
        System.out.println("Y/N?");
        String escolha = opcao.next();
        if (escolha.equalsIgnoreCase("y") || escolha.equalsIgnoreCase("sim")) {
            System.out.println("Otimo! as regras são simples: você vai receber" +
                    "um numero aleatório de 0 a 2000 e você tem que descobrir qual é" +
                    ",");
            System.out.println("mas não se preocupe que eu te ajudarei ao percorrer do" +
                    "desafio. eu estarei citando o quão proximo está do numero.");
            System.out.println("Boa sorte!!!");
                while (test){
                System.out.println("Digita um numero");
                int numerico = opcao.nextInt();
                if (numerico < numeroSecreto){
                    System.out.println("Coloque um numero maior!");
                } else if (numerico > numeroSecreto) {
                    System.out.println("Coloque um numero menor!");
                } else {
                    System.out.println("Parabens, você acertou o numero");
                    System.out.println("NUMERO ESCOLHIDO: " + numeroSecreto);
                    test = false;
                }
            }
        } else {
            System.out.println("Que pena, então te vejo uma outra hora. ;_;");
        }
    }
}
