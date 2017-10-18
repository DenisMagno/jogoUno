package model;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    protected List listaCarta = new ArrayList<Carta>();

    public Baralho() {
        int num, cor, i;
        
        this.listaCarta = new ArrayList<Carta>();
        
        //Criação das numeradas
        for(num = 1; num <= 9; num++){
            for(cor = 1; cor <= 4; cor++){
                this.listaCarta.add(new Numerada(cor, num));
                this.listaCarta.add(new Numerada(cor, num));
            }
        }
        
        //Criação inverte, bloqueio e maisDois
        for(num = 10; num <= 12; num++){
            for(cor = 1; cor <= 4; cor++){
                this.listaCarta.add(new Numerada(cor, num));
                this.listaCarta.add(new Numerada(cor, num));
            }
        }
        
        //Criação cartas 0
        for(cor = 1; cor <= 4; cor++){
            this.listaCarta.add(new Numerada(cor, 0));//Numerada zero possui uma de cada cor(0)
            this.listaCarta.add(new Numerada(5, 13));//Carta coringa escolhe cor(13)
            this.listaCarta.add(new Numerada(5, 14));//Carta coringa escolhe cor, compra mais quatro(14)
        }
    }
    
    public List<Carta> listaCartas(){
        return this.listaCarta;
    }
}
