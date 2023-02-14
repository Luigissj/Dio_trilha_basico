package Automoveis;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, String modelo, int assentos) {
        super(placa, ano, modelo);
        this.assentos = assentos;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("ASSENTOS: " + assentos);
        System.out.println("\n");
    }
}
