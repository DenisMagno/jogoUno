package model;

import java.util.ArrayList;
import java.util.List;

public class Descarte extends Baralho{
    private List<Carta> cartas;
    private int quantidade;

    public Descarte(){
        this.cartas = new ArrayList<Carta>();
        this.quantidade = 1;
    }

    //Retorna uma CÓPIA da ultima carta da pilha de descarte para comparação
    public Carta getCarta() {
        return cartas.get(cartas.size() - 1);
    }

    
    public void setCarta(Carta carta) {
        this.cartas.add(carta);
        Baralho.listaCarta.get(Baralho.listaCarta.lastIndexOf(carta)).setStatus(3);
        this.quantidade++;
    }

    public List getListaCartas() {
        return this.cartas;
    }
}