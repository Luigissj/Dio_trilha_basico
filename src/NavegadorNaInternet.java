import java.util.Scanner;

public class NavegadorNaInternet {
    Scanner escolha = new Scanner(System.in);
    public int abas = 1;
    public String [] paginas = new String[abas];
    int umaAba;


    public void atualizarPagina() {
        String [] paginas = new String[abas];
        System.out.println("Deseja atualizar qual pagina");
        for (int i = 0; i < paginas.length; i++)
            System.out.print("-" + i);
        System.out.println("\n");
        umaAba = escolha.nextInt();
        if (umaAba > paginas.length - 1) {
            System.out.println("\nNão existe essa pagina.");
        } else {
            System.out.println("\n o que deseja atualizar nela?");
            System.out.println("OBS: para escrever uma frase, os espaços devem ser substituidos por 'underline' (_)");
            System.out.println("EX: eu_te_amo_cara.");
            paginas[umaAba] = escolha.next();
            System.out.println("\no que foi adicionado: " + paginas[umaAba] + "\n");
        }
    }
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada\n");
        abas += 1;
        paginas = new String[abas];
        System.out.println("Quantidade de Abas atuais: " + abas + "\n");
    }
    public void exibirPagina() {
        paginas = new String[abas];
        System.out.println("Qual pagina deseja ser exibida");
        for (int i = 0; i < paginas.length; i++)
            System.out.print("-" + i);
        System.out.println("\n");
        umaAba = escolha.nextInt();
        if (umaAba > paginas.length - 1) {
            System.out.println("Não Existe essa pagina");
        } else
            System.out.println(paginas[umaAba] + "\n");
    }
}
