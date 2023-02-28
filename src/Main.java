import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        ReprodutorMusical musical = new ReprodutorMusical();
        AparelhoTelefonico telefonico = new AparelhoTelefonico();
        NavegadorNaInternet internet = new NavegadorNaInternet();
        boolean sair = false;
        int decisao;

        while (!sair){
            System.out.println("O que deseja acessar?\n");
            System.out.println("[1] Reprodutor Musical... [2] Contato do Telefone... [3] Navegador... [4] Desligar...");
            decisao = escolha.nextInt();
            switch (decisao){
                case 1 -> {
                    boolean sairReprodutor = false;
                    System.out.println("Acessando o Reprodutor Musical...\n");
                    musical.selecionarMusica();
                    while (!sairReprodutor){
                        telefonico.atender();
                        System.out.println("O que deseja fazer agora?");
                        System.out.println("[1] Pausar/Tocar... [2] Selecionar Musica... [3] Sair do Reprodutor...");
                        int novaDecisao = escolha.nextInt();
                        switch (novaDecisao) {
                            case 1 -> {
                                if (musical.pausado) {
                                    System.out.println("Pausando Musica...\n");
                                    musical.pausar();
                                } else {
                                    System.out.println("Despausando Musica...\n");
                                    musical.pausar();
                                }
                            }
                            case 2 -> {
                                System.out.println("Trocando de Musica\n");
                                musical.selecionarMusica();
                            }
                            case 3 -> {
                                System.out.println("Saindo do Reprodutor...\n");
                                sairReprodutor = true;
                            }
                            default -> System.out.println("Opcão invalida");
                        }
                    }
                }
                case 2 -> {
                    boolean sairTelefone = false;
                    System.out.println("Acessando o Telefone...\n");
                    while (!sairTelefone){
                        telefonico.atender();
                        System.out.println("O que deseja fazer agora?\n");
                        System.out.println("[1] Ligar Dispositivo... [2] Iniciar Correio de Voz... [3] Sair dos Contatos do Telefone...");
                        int novaDecisao = escolha.nextInt();
                        switch (novaDecisao) {
                            case 1 -> {
                                System.out.println("Ligando Dispositivo...\n");
                                telefonico.ligar();
                            }
                            case 2 -> {
                                System.out.println("Iniciando Correio de Voz...\n");
                                telefonico.iniciarCorreioDeVoz();
                            }
                            case 3 -> {
                                System.out.println("Saindo dos Contatos do Telefone...\n");
                                sairTelefone = true;
                            }
                            default -> System.out.println("Opcão invalida");
                        }
                    }
                }
                case 3 -> {
                    boolean sairNavegador = false;
                    System.out.println("Acessando o Navegador...\n");
                    while (!sairNavegador){
                        telefonico.atender();
                        System.out.println("O que deseja fazer agora?\n");
                        System.out.println("[1] Adicionar Nova Aba... [2] Atualizar Pagina... [3] Exibir Pagina... [4] Sair do Navegador\n");
                        int novaDecisao = escolha.nextInt();
                        switch (novaDecisao) {
                            case 1 -> {
                                System.out.println("Adicionando Nova Aba...\n");
                                internet.adicionarNovaAba();
                            }
                            case 2 -> {
                                System.out.println("Atualizando Pagina...\n");
                                internet.atualizarPagina();
                            }
                            case 3 -> {
                                System.out.println("Acessando ferramenta...\n");
                                internet.exibirPagina();
                            }
                            case 4 -> {
                                System.out.println("Saindo do Navegador...\n");
                                sairNavegador = true;
                                telefonico.atender();
                            }
                            default -> System.out.println("Opção Invalida");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Deseja Desligar?");
                    System.out.println("Y/N");
                    String decisaoFinal;
                    do {
                        decisaoFinal = escolha.next();
                        switch (decisaoFinal) {
                            case "Y" -> {
                                System.out.println("Desligando...");
                                sair = true;
                            }
                            case "N" -> System.out.println("Ok");
                            default -> {
                                System.out.println("Opção Invalida");
                                decisaoFinal = "sj";
                            }
                        }
                    } while (decisaoFinal.equals("sj"));
                }
                default -> System.out.println("Opção Invalida");
            }
        }
    }
}