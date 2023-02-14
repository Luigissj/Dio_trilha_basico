import java.util.Scanner;
public class Estante {
    Scanner escolha = new Scanner(System.in);
    public String [] espacos = new String[8];
    private String livroAtual;

    public String getLivroAtual() {
        return Livro.getNome();
    }
    public void setLivroAtual(String livroAtual) {
        this.livroAtual = livroAtual;
    }

    public void guardarLivro () {
            String espaco;
            if (!Livro.isAberto()) {
                System.out.println("Em que espaço adoraria guardar seu livro?");
                System.out.println("OBS: Para escolher o espaço, use a formula: [numero]X[numero]");
                System.out.println("LIMTIE DE ESPAÇO: 3x3 ___________ MINIMO DE ESPACO: 1X1");
                espaco = escolha.next();
                switch (espaco) {
                    case "1X1" -> {
                        if (espacos [0] == null) {
                            espacos [0] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [0] + "adicionado ao espaço 1X1");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "1X2" -> {
                        if (espacos [1] == null) {
                            espacos [1] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [1] + "adicionado ao espaço 1X2");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "1X3" -> {
                        if (espacos [2] == null) {
                            espacos [2] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos[2] + "adicionado ao espaço 1X3");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "2X1" -> {
                        if (espacos [3] == null) {
                            espacos[3] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos[3] + "adicionado ao espaço 2X1");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "2X2" -> {
                        if (espacos [4] == null) {
                            espacos [4] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [4] + "adicionado ao espaço 2X2");
                        }else {
                            System.out.println("Esse espaço já esta ocupado por um livro");
                        }
                    }
                    case "2X3" -> {
                        if (espacos [5] == null) {
                            espacos [5] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos[5] + "adicionado ao espaço 2X3");
                        }else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "3X1" -> {
                        if (espacos [6] == null) {
                            espacos [6] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [6] + "adicionado ao espaço 3X1");
                        }else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "3X2" -> {
                        if (espacos [7] == null) {
                            espacos [7] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [7] + "adicionado ao espaço 3X2");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    case "3X3" -> {
                        if (espacos [8] == null) {
                            espacos [8] = getLivroAtual();
                            livroAtual = null;
                            System.out.println(espacos [8] + "adicionado ao espaço 3X3");
                        } else {
                            System.out.println("Esse espaço ja esta ocupado por um livro");
                        }
                    }
                    default -> System.out.println("Espaço inexistente");
                }
            }
        }
        public void retirarLivro() {
            if (getLivroAtual() == null || livroAtual.isEmpty()){
                String espaco;
                System.out.println("Que livro adoraria pegar?");
                System.out.println("OBS: Para escolher o espaço, use a formula: [numero]X[numero]");
                System.out.println("LIMTIE DE ESPAÇO: 3x3 ___________ MINIMO DE ESPACO: 1X1");
                espaco = escolha.next();
                switch (espaco) {
                    case "1X1" -> {
                        if (espacos [0] != null) {
                            setLivroAtual(espacos[0]);
                            System.out.println("Livro retirado do espaço 1X1");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "1X2" -> {
                        if (espacos[1] != null) {
                            setLivroAtual(espacos[1]);
                            System.out.println("Livro retirado do espaço 1X2");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "1X3" -> {
                        if (espacos[2] != null) {
                            setLivroAtual(espacos[2]);
                            System.out.println("Livro retirado do espaço 1X3");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "2X1" -> {
                        if (espacos[3] != null) {
                            setLivroAtual(espacos[3]);
                            System.out.println("Livro retirado do espaço 2X1");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "2X2" -> {
                        if (espacos[4] != null) {
                            setLivroAtual(espacos[4]);
                            System.out.println("Livro retirado do espaço 2X2");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "2X3" -> {
                        if (espacos[5] != null) {
                            setLivroAtual(espacos[5]);
                            System.out.println("Livro retirado do espaço 2X3");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "3X1" -> {
                        if (espacos[6] != null) {
                            setLivroAtual(espacos[6]);
                            System.out.println("Livro retirado do espaço 3X1");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "3X2" -> {
                        if (espacos[7] != null) {
                            setLivroAtual(espacos[7]);
                            System.out.println("Livro retirado do espaço 3X2");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    case "3X3" -> {
                        if (espacos[8] != null) {
                            setLivroAtual(espacos[8]);
                            System.out.println("Livro retirado do espaço 3X3");
                        } else {
                            System.out.println("Não há livro aqui!!!");
                        }
                    }
                    default -> System.out.println("Espaço inexistente");
            }
        }
    }
}
