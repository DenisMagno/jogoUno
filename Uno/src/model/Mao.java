package model;

import java.util.ArrayList;
import java.util.List;

public class Mao extends Baralho{
    private List listaCarta;
    
    public Mao(){
        listaCarta = new ArrayList<Carta>();
    }

    public List getListaCarta() {
        return listaCarta;
    }

    public void setListaCarta(List listaCarta) {
        this.listaCarta = listaCarta;
    } 
}
