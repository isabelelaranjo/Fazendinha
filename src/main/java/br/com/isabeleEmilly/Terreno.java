package br.com.isabeleEmilly;

public class Terreno{
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y){
        this.x = x;
        this.y = y;
    }

    //plantar
    public void plantar(Batata batataPlantada){
        this.batata = batataPlantada;
    }

    public void plantar(Morango morangoPlantado){
        this.morango = morangoPlantado;
    }

    public void plantar(Cenoura cenouraPlantada){
        this.cenoura = cenouraPlantada;
    }

    //verificar se está ocupado
    public boolean estaOcupado(){

        if (batata != null) {
            return true;
        }
        if (morango != null) {
            return true;
        }
        if (cenoura != null) {
            return true;
        }
        return false;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //colhendo
    public void colher(Celeiro celeiro){

        if (batata != null){
            if (batata.podeColher() == true){
                celeiro.armazenarBatata();
                batata = null;
            }
        }
        if (cenoura != null){
            if (cenoura.podeColher() == true){
                celeiro.armazenarCenoura();
                cenoura = null;
            }
        }
        if (morango != null) {
            if (morango.podeColher() == true) {
                celeiro.armazenarMorango();
                morango = null;
            }
        }
    }
}
