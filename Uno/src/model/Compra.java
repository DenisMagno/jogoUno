package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Compra extends Baralho{
    private List<Carta> cartas;
    
    public Compra(){
        this.cartas = new ArrayList<Carta>();
        defineCompra();
    }
    
    public Carta getCarta(int i) {
        return cartas.get(i);
    }

    public void setCarta(Carta carta) {
        this.cartas.add(carta);
    } 
    
    public List getListaCartas() {
        return cartas;
    }

    private void defineCompra(){
        int i;
        
        for(i = 0; i < Baralho.listaCarta.size(); i++){
            if(Baralho.listaCarta.get(i).getStatus() == 0){
                this.cartas.add(Baralho.listaCarta.get(i));
                Baralho.listaCarta.get(i).setStatus(2);
            }
        }
        
        Collections.shuffle(this.cartas);
    }
}
