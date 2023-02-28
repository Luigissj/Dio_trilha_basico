import java.util.Scanner;

public class ReprodutorMusical {
    Scanner escolha = new Scanner(System.in);
    protected String musica;
    protected boolean pausado = false;


    public void pausar(){
        if (!pausado){
            tocar();
            System.out.println("Musica Despausada\n");
        } else {
            pausado = false;
            System.out.println("Musica Pausada\n");
        }
    }

    private void tocar(){
        System.out.println("\n agora esta tocando: " + musica + "\n");
        pausado = true;
    }

    public void selecionarMusica(){
        if (!pausado) {
            System.out.println("Escreva uma musica para tocar!");
            musica = escolha.next();
            System.out.println("\n");
        } else {
            System.out.println("A musica atual esta tocando, pause-a por favor");
            System.out.println("\n");
        }
    }
}
