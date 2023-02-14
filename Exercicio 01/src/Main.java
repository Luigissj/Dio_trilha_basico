import Automoveis.Caminhao;
import Automoveis.Onibus;
import Automoveis.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("OS104KL", 2004, "UNO");
        Onibus o1 = new Onibus("OJ867IN", 2077, "Convencional", 200);
        Caminhao c1 = new Caminhao("HE30W266K", 1965, "Uber", 20);

        v1.exibirDados();
        o1.exibirDados();
        c1.exibirDados();
    }
}