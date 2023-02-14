import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner escolher = new Scanner(System.in);
        boolean vontadeDeLer = true;
        Estante e = new Estante();
        Livro l1 = new Livro(300, "Gato de Botas", "Eddie Murpy");
        Livro l2 = new Livro(450, "O Homem-Aranha", "Stan Lee");
        Livro l3 = new Livro(600, "O Senhor das Moscas", "Anonimus");
        Livro l4 = new Livro(200, "Senhor dos Aneis", "Jorge R.R. Martini");
        Livro l5 = new Livro(248, "The Game of Thrones", "Jorge R.R. Martini");
        Livro l6 = new Livro(632, "Mascara de Ferro", "Maylor Swift");
        Livro l7 = new Livro(218, "A Sociedade dos Poetas Mortos", null);
        Livro l8 = new Livro(539, "Romeu e Julieta", "William Shakespeare");
        Livro l9 = new Livro(8, "Guerra e Paz", "Tolstoy");
        e.espacos[0] = l1.getNome();
        e.espacos[1] = l2.getNome();
        e.espacos[2] = l3.getNome();
        e.espacos[3] = l4.getNome();
        e.espacos[4] = l5.getNome();
        e.espacos[5] = l6.getNome();
        e.espacos[6] = l7.getNome();
        e.espacos[7] = l8.getNome();
        e.espacos[8] = l9.getNome();
        while (vontadeDeLer) {
            System.out.println("Ola leitor, adoraria ler um livro?");
            String decisao = escolher.next();
            if (decisao.equalsIgnoreCase("sim")) {
                System.out.println("Excelente, escolha o livro que deseja ler:");
                System.out.println("ªº°ªº°ªº° LIVROS EM DESTAQUE ªº°ªº°ªº°");
                System.out.println("Espaço 1X1: Titulo:" + e.espacos[0] + "Autor: " + Livro.getAutor());
                System.out.println("Espaço 1X2: Titulo:" + e.espacos[1] + "Autor: " + l2.getAutor());
                System.out.println("Espaço 1X3: Titulo:" + e.espacos[2] + "Autor: " + l3.getAutor());
                System.out.println("Espaço 2X1: Titulo:" + e.espacos[3] + "Autor: " + l4.getAutor());
                System.out.println("Espaço 2X2: Titulo:" + e.espacos[4] + "Autor: " + l5.getAutor());
                System.out.println("Espaço 2X3: Titulo:" + e.espacos[5] + "Autor: " + l6.getAutor());
                System.out.println("Espaço 3X1: Titulo:" + e.espacos[6] + "Autor: " + l7.getAutor());
                System.out.println("Espaço 3X2: Titulo:" + e.espacos[7] + "Autor: " + l8.getAutor());
                System.out.println("Espaço 3X3: Titulo:" + e.espacos[8] + "Autor: " + l9.getAutor() + "\n");
                do {
                    e.retirarLivro();
                } while (e.getLivroAtual() != null);
            } else if (decisao.equalsIgnoreCase("não")) {
                System.out.println("Ok, te vejo mais tarde");
                vontadeDeLer = false;
            }
        }
    }
}
