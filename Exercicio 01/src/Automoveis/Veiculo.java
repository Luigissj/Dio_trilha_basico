package Automoveis;

public class Veiculo {
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo (String placa, int ano, String modelo){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
     public void exibirDados(){
         System.out.println("ªº°ªº° Detalhes ªº°ªº°");
         System.out.println("CARRO: " + modelo);
         if (placa.length() != 7){
             System.out.printf("%.7s", placa);
             System.out.println("\n");
         } else {
             System.out.println("PLACA: " + placa);
         }
         System.out.println("ANO: " + ano);
     }
}
