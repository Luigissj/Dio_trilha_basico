import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {
    Scanner escolha = new Scanner(System.in);
    protected boolean ligado;
    protected String correioDeVoz;


    public void ligar(){
        if (ligado){
            System.out.println("Dispositivo ja está ligado\n");
        } else {
            System.out.println("Dispositivo Ligado\n");
            ligado = true;
        }
    }
    public void atender() {
        if (ligacao()) {
            String opcao;
            System.out.println("Alguem esta ligando para você, deseja atender");
            System.out.println("Y/N");
            do {
                opcao = escolha.next();
                System.out.println("\n");
                switch (opcao) {
                    case "Y" -> System.out.println("Ligação atendida\n");
                    case "N" -> System.out.println("Ligação bloqueada\n");
                    default -> {
                        System.out.println("Opção invalida\n");
                        opcao = "ps";
                    }
                }
            } while (opcao.equals("ps"));
        }
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Escreva o que deseja mandar no correio de voz");
        System.out.println("OBS: para escrever uma frase, os espaços devem ser substituidos por 'underline' (_)");
        System.out.println("EX: eu_te_amo_cara.");
        correioDeVoz = escolha.next();
        System.out.println("\n" + correioDeVoz.toUpperCase());
    }
    private boolean ligacao(){
        Random chance = new Random();
        return chance.nextInt(0, 5)==3;
    }
}
