package uno;

import model.Baralho;

public class Uno {
    public static void main(String[] args) {
        Baralho.montar();

        System.out.println("Quantidade de cartas: "+Baralho.listaCartas().size());
    }
}
