import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        Smart_TV V1 = new Smart_TV();
        boolean vontadeDeVer = true;
        System.out.println("Ola usuario, seja bem vindo!!!");
        while (vontadeDeVer) {
            System.out.println("O que deseja fazer?");
            System.out.println("[0] DESLIGAR..... [P] LIGAR..... [+] AUMENTAR VOLUME..... [-] DIMINUIR VOLUME..... ");
            System.out.println("[M] MUTAR/DESMUTAR..... [,] AVANÇAR CANAL..... [.] RETORNAR CANAL..... [.,] ESCOLHER CANAL..... ");
            System.out.println("[C] PAUSAR/DESPAUSAR..... [I] MENU..... [Q] SAIR.....");
            String decisao = escolha.next();
            switch (decisao) {
                case "O" -> {
                    V1.desligar();
                    System.out.print("\n");
                }
                case "P" -> {
                    V1.ligar();
                    System.out.print("\n");
                }
                case "+" -> {
                    V1.aumentarVolume();
                    System.out.print("\n");
                }
                case "-" -> {
                    V1.diminuirVolume();
                    System.out.print("\n");
                }
                case "M" -> {
                    if (V1.getVolume() > 0) {
                        V1.mutar();
                        System.out.print("\n");
                    } else
                        V1.desmutar();
                    System.out.print("\n");
                }
                case "," -> {
                    V1.avancarCanal();
                    System.out.print("\n");
                }
                case "." -> {
                    V1.retornarCanal();
                    System.out.print("\n");
                }
                case ".," -> {
                    V1.mudarCanalManual();
                    System.out.print("\n");
                }
                case "C" -> {
                    if (V1.isPause()) {
                        V1.despausar();
                        System.out.print("\n");
                    } else {
                        V1.pausar();
                        System.out.print("\n");
                    }
                }
                case "I" -> {
                    V1.menu();
                    System.out.print("\n");
                }
                case "Q" -> {
                    System.out.println("Deseja sair?");
                    System.out.println("Y/N");
                    String simOuNao = escolha.next();
                    System.out.print("\n");
                    if (simOuNao.equalsIgnoreCase("Y")) {
                        System.out.println("OK, adeus!!!");
                        vontadeDeVer = false;
                    } else
                        System.out.println("Ok, prosseguiremos então");
                    System.out.print("\n");
                }
            }
        }
    }
}