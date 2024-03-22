package br.com.isabeleEmilly;

public class Fazenda{
    private Celeiro celeiro;
    private Terreno[][] terrenos;

    public Fazenda() {
        celeiro = new Celeiro(30);

        terrenos = new Terreno[13][13];
        for (int x=0; x<13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos[x][y] = new Terreno(x, y);
            }
        }
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos[x][y];
    }

    public void plantarBatata(int x, int y) {
        if (terrenos[x][y].estaOcupado() == false) {
            Batata b = new Batata();
            terrenos[x][y].plantar(b);
        }
    }

    public void plantarCenoura(int x, int y) {
        if (terrenos[x][y].estaOcupado() == false) {
            Cenoura c = new Cenoura();
            terrenos[x][y].plantar(c);
        }
    }

    public void plantarMorango(int x, int y) {
        if (terrenos[x][y].estaOcupado() == false) {
            Morango m = new Morango();
            terrenos[x][y].plantar(m);
        }
    }

    public void colher(int x, int y) {
        terrenos[x][y].colher(celeiro);
    }
}