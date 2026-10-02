package br.com.isabeleEmilly;

public class Celeiro{
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade) {
        this.capacidade =capacidade;
    }

    public int getEspacoDisponivel() {
        int ocupado = qtdeBatatas+qtdeCenouras+qtdeMorangos;
        return capacidade - ocupado;
    }
    public boolean celeiroCheio() {
        if(getEspacoDisponivel() <= 0) {
            return true;
        } else{
            return false;
        }
    }
    public void armazenarBatata(){
        if (celeiroCheio() == true){
            System.out.println("O celeiro está cheio"); // alterar campo, está errado, não deve conter mensagem
        } else{
            qtdeBatatas = qtdeBatatas + 2;
        }
    }

    public void armazenarCenoura(){
        if (celeiroCheio() == true){
            System.out.println("O celeiro está cheio");
        } else{
            qtdeCenouras = qtdeCenouras + 2;
        }
    }

    public void armazenarMorango(){
        if (celeiroCheio() == true){
            System.out.println("O celeiro está cheio");
        } else{
            qtdeMorangos = qtdeMorangos + 2;
        }
    }

    public void consumirBatata(){
        if (qtdeBatatas > 0){
            qtdeBatatas = qtdeBatatas - 1;
        }
    }

    public void consumirCenoura(){
        if (qtdeCenouras > 0){
            qtdeCenouras = qtdeCenouras - 1;
        }
    }

    public void consumirMorango() {
        if (qtdeMorangos > 0) {
            qtdeMorangos = qtdeMorangos - 1;
        }
    }

    public double getOcupacao() {
        int ocupado = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        return (ocupado * 100.0) / capacidade;
    }

    public int getCapacidade(){
        return capacidade;
    }
    public int getQtdeBatatas(){
        return qtdeBatatas;
    }
    public int getQtdeCenouras(){
        return qtdeCenouras;
    }
    public int getQtdeMorangos(){
        return qtdeMorangos;
    }
}
