package Automoveis;

public class Caminhao extends Veiculo{
    private int eixos;
    public Caminhao(String placa, int ano, String modelo, int eixos) {
        super(placa, ano, modelo);
        this.eixos = eixos;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("EIXOS: " + eixos);
        System.out.println("\n");
    }
}
