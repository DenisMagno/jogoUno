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
    
    //Literalmente TIRA a ultima carta do monte de compras
    public Carta getCarta() {
        Carta carta = cartas.get(cartas.size() - 1);

        cartas.remove(cartas.size() - 1);

        return carta;
    }

    public List getListaCartas() {
        return cartas;
    }

    //Retorna uma CÓPIA da carta do monte de compra para comparação
    public Carta leCarta(int i) {
        return cartas.get(i);
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
