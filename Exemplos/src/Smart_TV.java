import java.util.Scanner;

public class Smart_TV implements Opcoes {
    private boolean ligado;
    private int volume;
    private int canal;
    private boolean pause;

    public Smart_TV(){
        ligado = true;
        volume = 50;
        canal = 0;
        pause = false;
    }
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public String getPauseAtual(){
        String pauseAtual;
        if (isPause())
            pauseAtual = "Pausado";
        else
            pauseAtual = "Não Pausado";
        return pauseAtual;
    }

    @Override
    public void ligar() {
        if (!isLigado()){
            System.out.println("A TV foi ligada");
            setLigado(true);
            setVolume(50);
            setCanal(0);
            setPause(false);

        } else {
            System.out.println("A TV já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()){
            System.out.println("Desligando...");
            setLigado(false);
            setVolume(0);
            setCanal(0);
            setPause(true);
        } else {
            System.out.println("A TV ja está desligada");
        }
    }

    @Override
    public void aumentarVolume() {
        if (isLigado() & getVolume() < 100){
            System.out.println("Aumentando volume...");
            setVolume(getVolume() + 5);
            System.out.println("VOLUME: " + getVolume());
        } else if (getVolume() > 100){
            System.out.println("O Volume está no maximo");
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void diminuirVolume() {
        if (isLigado() & getVolume() > 0){
            System.out.println("Diminuindo volume...");
            setVolume(getVolume() - 5);
            System.out.println("VOLUME: " + getVolume());
        } else if (getVolume() < 0)
            System.out.println("O Volume está no 0");
          else
            System.out.println("TV desligada");

    }

    @Override
    public void mutar() {
        int mudo = 0;
        if (isLigado()){
            System.out.println("Volume mutado...");
            setVolume(mudo);
            System.out.println("VOLUME: " + getVolume());
        } else
            System.out.println("TV desligada");
    }

    @Override
    public void desmutar() {
        if (isLigado()){
            System.out.println("desmutando...");
            setVolume(50);
            System.out.println("VOLUME: " + getVolume());
        } else
            System.out.println("TV desligada");
    }

    @Override
    public void avancarCanal() {
        if (isLigado() & getCanal() < 1000){
            System.out.println("Mudando canal...");
            setCanal(getCanal()+1);
            System.out.println("CANAL: " + getCanal());
            if (isPause())
                setPause(false);
        } else if (getCanal() == 1000)
            System.out.println("Ja chegou no ultimo canal");
          else
            System.out.println("TV Desligada");
    }

    @Override
    public void retornarCanal() {
        if (isLigado() & getCanal() > 0){
            System.out.println("Mudando canal...");
            setCanal(getCanal()-1);
            System.out.println("CANAL: " + getCanal());
            if (isPause())
                setPause(false);
        } else if (isLigado() && getCanal() == 0)
            System.out.println("Ja esta no primeiro canal");
            else
                System.out.println("TV desligada");
    }

    @Override
    public void mudarCanalManual() {
        Scanner canal = new Scanner(System.in);
        if (isLigado()){
            System.out.println("Qual canal deseja acessar?");
            System.out.println("Limite: 0-1000");
            setCanal(canal.nextInt());
            if (getCanal() > 1000){
                System.out.println("Canal inexistente");
            } else {
                System.out.println("Entrando no canal");
                System.out.println("CANAL: " + getCanal());
                if (isPause())
                    setPause(false);
            }
        } else {
            System.out.println("TV desligada");
        }
    }
    @Override
    public void pausar(){
        if (isLigado() & !isPause()){
            System.out.println("Pausando...");
            setPause(true);
            System.out.println("PAUSE: " + getPauseAtual());
        } else if (isPause())
            System.out.println("Programa ja esta pausado");
        else if (!isLigado())
            System.out.println("TV desligada");
    }

    @Override
    public void despausar(){
        if (isLigado() & isPause()){
            System.out.println("Despausando...");
            setPause(false);
        } else if (!isPause()){
            System.out.println("Programa ja esta despausado");
        } else if (!isLigado()){
            System.out.println("TV desligada");
        }
    }

    @Override
    public void menu() {
        String estadoAtual;
        if (isLigado())
            estadoAtual = "ligado";
        else
            estadoAtual = "Desligado";
        System.out.println("ªº°ªº°ªº° MENU ªºªº°ªº°");
        System.out.println("VOLUME ATUAL: " + getVolume());
        System.out.println("CANAL ATUAL: " + getCanal());
        System.out.println("ESTADO ATUAL: " + estadoAtual);
        System.out.println("PROGRAMA: " + getPauseAtual());
        }
    }
