package uno;

import model.*;

public class Uno {
    public static void main(String[] args) {
        Baralho.montar();

        System.out.println("Quantidade de cartas: "+Baralho.listaCartas().size());

        Jogador j1 = new Jogador("Mariana");
        Jogador j2 = new Jogador("Mariana");
        System.out.println("Nome: "+j1.getNome());
        System.out.println("Mao: ");
        System.out.println("Carta Cor: "+j1.getMao().getCarta(0).getCor());
        System.out.println("Carta Número: "+j1.getMao().getCarta(0).getNumero());
        
        Jogo jogo = new Jogo();
        Descarte descarte = new Descarte();
        System.out.println("Descart cor: "+j2.getMao().getCarta(0).getCor());
        System.out.println("Descarte numero "+j2.getMao().getCarta(0).getNumero());
        descarte.setCarta(j2.getMao().getCarta(0));

        System.out.println(jogo.verificaMao(j1.getMao(), descarte));
    }
}
