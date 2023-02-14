public class Pessoa implements Opcoes {
    @Override
    public void abrirLivro() {
        if (!Livro.isAberto()){
            System.out.println("Livro aberto");
            Livro.setAberto(true);
        } else {
            System.out.println("O Livro já está aberto");
        }
    }

    @Override
    public void fecharLivro() {
        if (Livro.isAberto()) {
            System.out.println("Livro fechado");
            Livro.setAberto(false);
        } else
            System.out.println("O livro ja está fechado");
    }

    @Override
    public void avancarPagina() {
        if (Livro.isAberto() && Livro.getPaginaAtual() < Livro.getPaginas()){
            Livro.setPaginaAtual(Livro.getPaginaAtual() + 1);
            System.out.println("PAGINA ATUAL: " + Livro.getPaginaAtual());
        } else if (!Livro.isAberto()){
            System.out.println("Livro fechado, abre-o");
        } else {
            System.out.println("Você já terminou o livro");
        }
    }

    @Override
    public void voltarPagina() {
        if (Livro.isAberto() && Livro.getPaginaAtual() >= 0 && Livro.getPaginaAtual() < Livro.getPaginas()){
            Livro.setPaginaAtual(Livro.getPaginaAtual() - 1);
            System.out.println("PAGINA ATUAL: " + Livro.getPaginaAtual());
        } else if (!Livro.isAberto()){
            System.out.println("Livro fechado, abre-o");
        } else {
            System.out.println("Você está no inicio");
        }
    }

    @Override
    public void mudarPagina() {
        if (Livro.isAberto()){
            do {
                System.out.println("Qual pagina deseja acessar?");
                Livro.setPaginaAtual(Livro.escolha.nextInt());
                if (Livro.getPaginaAtual() > Livro.getPaginas())
                    System.out.println("Não existe essa pagina");
                else {
                    System.out.println("Pagina escolhida com sucesso");
                    System.out.println("PAGINA ATUAL: " + Livro.getPaginas());
                }
            } while (Livro.getPaginaAtual() > Livro.getPaginas());
        }
    }
}
