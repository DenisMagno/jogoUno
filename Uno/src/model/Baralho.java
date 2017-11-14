package model;

import java.util.ArrayList;
import java.util.List;

public class Baralho{
    protected static List<Carta> listaCarta;

    public static void montar() {
        int num, cor, i;
        
        listaCarta = new ArrayList<Carta>();
        
        //Criação das numeradas
        for(num = 1; num <= 9; num++){
            for(cor = 1; cor <= 4; cor++){
                listaCarta.add(new Numerada(cor, num));
                listaCarta.add(new Numerada(cor, num));
            }
        }
        
        //Criação bloqueio, inverte e maisDois
        for(cor = 1; cor <= 4; cor++){
            listaCarta.add(new Bloqueio(cor, 10));
            listaCarta.add(new Bloqueio(cor, 10));
        }
            
        for(cor = 1; cor <= 4; cor++){
            listaCarta.add(new Inverte(cor, 11));
            listaCarta.add(new Inverte(cor, 11));
        }
            
        for(cor = 1; cor <= 4; cor++){
            listaCarta.add(new MaisDois(cor, 12));
            listaCarta.add(new MaisDois(cor, 12));
        }

        //Criação cartas 0
        for(cor = 1; cor <= 4; cor++){
            listaCarta.add(new Numerada(cor, 0));//Numerada zero possui uma de cada cor(0)
            listaCarta.add(new Coringa(5, 13));//Carta coringa escolhe cor(13)
            listaCarta.add(new CoringaQuatro(5, 14));//Carta coringa escolhe cor, compra mais quatro(14)
        }
    }

    public static List<Carta> listaCartas(){
        return listaCarta;
    }
}
