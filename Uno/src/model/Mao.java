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

    //Literalmente TIRA a carta da mão do jogador
    public Carta getCarta(int i) {
        Carta carta = cartas.get(i);
        
        cartas.remove(i);
        
        this.quantidade--; 

        return carta;
    }

    public void setCarta(Carta carta) {
        this.cartas.add(carta);
        this.quantidade++;
    } 
    
    public List getListaCartas() {
        return cartas;
    }
    
    //Retorna uma CÓPIA da carta da mão do jogador para comparação
    public Carta leCarta(int i) {
        return cartas.get(i);
    }

    private void defineMao(){
        cartas = new ArrayList<Carta>();

        Random random = new Random();

        int i = 0;
        do{
            int rand = random.nextInt(108);

            if(Baralho.listaCarta.get(rand).getStatus() == 0){
                this.cartas.add(Baralho.listaCarta.get(rand));
                Baralho.listaCarta.get(rand).setStatus(1);
                
                i++;
            }
        }while(i < this.quantidade);
    }
}
