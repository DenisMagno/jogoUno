package uno;

import model.Baralho;

public class Uno {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        
        System.out.println("Quantidade de cartas: "+baralho.listaCartas().size());
    }
}
