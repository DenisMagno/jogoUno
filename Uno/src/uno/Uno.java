package uno;

import model.*;

public class Uno {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciaJogo("Denis", "Mariana");
        
        System.out.println("Quantidade na pilha de compras: "+ jogo.monteCompra.getListaCartas().size());
        System.out.println("Quantidade na pilha de descarte: "+ jogo.pilhaDescarte.getListaCartas().size());
        System.out.println("Quantidade na mão do jogador Denis: "+ jogo.jogador1.getMao().getListaCartas().size());
        System.out.println("Quantidade na mão do jogador Mariana: "+ jogo.jogador2.getMao().getListaCartas().size());
    }
}