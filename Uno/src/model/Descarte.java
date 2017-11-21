package model;

import java.util.ArrayList;
import java.util.List;

public class Descarte extends Baralho{
    private List<Carta> listaCarta;
    
    public Descarte(){
        this.listaCarta = new ArrayList<Carta>();
    }

    public Carta getUltimaCarta() {
        return listaCarta.get(listaCarta.size() - 1);
    }

    public void setCarta(Carta carta) {
        this.listaCarta.add(carta);
    }   
}
