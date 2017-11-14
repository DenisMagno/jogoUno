package uno;

import model.*;

public class Uno {
    public static void main(String[] args) {
        Baralho.montar();

        System.out.println("Quantidade de cartas: "+Baralho.listaCartas().size());

        Jogador j1 = new Jogador("Mariana");
        System.out.println("Nome: "+j1.getNome());
        System.out.println("Mao: ");
        System.out.println("Carta Cor: "+j1.getMao().getCarta(0).getCor());
        System.out.println("Carta Número: "+j1.getMao().getCarta(0).getNumero());
    }
}
