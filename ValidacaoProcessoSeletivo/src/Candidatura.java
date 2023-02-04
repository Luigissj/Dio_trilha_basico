import java.util.Random;
public class Candidatura {
    String [] candidatos = {"Fabiano", "Jessica", "Carlos", "Angelita",
            "Marcos", "Pedro", "Garcia", "Douglas", "Lauren", "Inacio "};
    double rendaBase = 2000;
    boolean [] passado = new boolean[candidatos.length];

    public double rendaIndividual(){
        return new Random().nextDouble(1800, 2200);
    }
    public void qualificarCandidatos(){
        for (int i = 0; i < candidatos.length; i++ ) {
            double [] rendaCandidato = {rendaIndividual(),rendaIndividual(),rendaIndividual(),rendaIndividual(),
            rendaIndividual(),rendaIndividual(),rendaIndividual(),rendaIndividual(),rendaIndividual(),rendaIndividual()};
            if (rendaCandidato [i] < rendaBase) {
                System.out.println("LIGANDO PARA O CANDIDATO");
                passado [i] = true;
            } else if (rendaCandidato [i] == rendaBase) {
                System.out.println("LIGANDO PARA O CANDIDATO COM CONTRA PROPOSTA");
                passado [i] = true;
            } else {
                System.out.println("RENDA INSUFICIENTE");
                passado [i] = false;
            }
        }
        System.out.println("\n");
    }
    public void listarCandidatos(){
        System.out.println("ªº°ªº°ªº° CANDIDATOS QUALIFICADOS ªº°ªº°ªº°");
        for (int j = 0; j < candidatos.length; j++){
            if (passado[j]){
                System.out.println("Nº" + (j + 1) + " = " + candidatos[j]);
            }
        }
        System.out.println("\n");
    }
    public void tentarLigar() {
        int tentativas = 1;
        boolean continuar = true;
        boolean [] atender = new boolean[passado.length];
        while (tentativas <= 3) {
            for (int k = 0; k < passado.length; k++)
                if (atendimento() && continuar) {
                    System.out.println("ATENDIMENTO CONCLUIDO COM SUCESSO!");
                    continuar = false;
                    atender [k] = true;
                } else {
                    System.out.println("ATENDIMENTO NÃO CONCLUIDO");
                    tentativas++;
                }
        }
        System.out.println("\n");
        System.out.println("ªº°ªº°ªº° CANDIDATOS ATENDIDOS ªº°ªº°ªº°");
        for (int j = 0; j < candidatos.length; j++){
            if (passado[j] && atender [j]){
                System.out.println("Nº" + (j + 1) + " = " + candidatos[j] + " ATENDEU E FOI QUALIFICADO");
            }
        }
        System.out.println("\n");
    }

    public boolean atendimento(){
        return new Random().nextInt(3)== 1;
    }
}
