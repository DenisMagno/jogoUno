package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mao extends Baralho{
    private List<Carta> cartas;
    private int quantidade;

    public Mao(){
        this.quantidade = 7;
        defineMao();
    }

    public List getListaCarta() {
        return cartas;
    }

    public void setListaCarta(List listaCarta) {
        this.cartas = listaCarta;
    } 

    private void defineMao(){
        cartas = new ArrayList<Carta>();

        Random random = new Random();

        int rand = random.nextInt(108);

        int i = 0;
        while(i < this.quantidade){
            if(Baralho.listaCarta.get(rand).getStatus() != 0){
                this.cartas.add(Baralho.listaCarta.get(rand));
                Baralho.listaCarta.get(rand).setStatus(0);

                i++;
            }
        }
    }
}
