import java.util.Scanner;
public class Livro{
    protected static Scanner escolha = new Scanner(System.in);
    private static int paginas;
    private static String nome;
    private static String autor;
    private static int paginaAtual;
    private static boolean aberto;

    public Livro(int paginas, String nome, String autor) {
        setPaginas(paginas);
        setNome(nome);
        setAutor(autor);
        setPaginaAtual(0);
        setAberto(false);
    }

    protected static int getPaginas() {
        return paginas;
    }

    protected static void setPaginas(int paginas) {
        Livro.paginas = paginas;
    }

    protected static String getNome() {
        return Livro.nome;
    }

    protected static void setNome(String nome) {
        Livro.nome = nome;
    }

    protected static String getAutor() {
        return Livro.autor;
    }

    protected static void setAutor(String autor) {
        Livro.autor = autor;
    }

    protected static int getPaginaAtual() {
        return Livro.paginaAtual;
    }

    protected static void setPaginaAtual(int paginaAtual) { Livro.paginaAtual = paginaAtual; }

    protected static boolean isAberto() {
        return aberto;
    }

    protected static void setAberto(boolean aberto) {
        Livro.aberto = aberto;
    }
}
