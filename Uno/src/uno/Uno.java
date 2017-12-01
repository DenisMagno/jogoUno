package uno;

import model.*;

public class Uno {
    public static void main(String[] args) {
        Baralho.montar();

        Jogador j1 = new Jogador("Denis");
        Jogador j2 = new Jogador("Gabriel");
        
        Compra monteCompra = new Compra();
        
        Descarte pilhaDescarte = new Descarte();

        System.out.println("Quantidade na pilha de compras: "+ monteCompra.getListaCartas().size());
        System.out.println("Quantidade na pilha de descarte: "+ pilhaDescarte.getListaCartas().size());
        System.out.println("Quantidade na mão do jogador Denis: "+ j1.getMao().getListaCartas().size());
        System.out.println("Quantidade na mão do jogador Gabriel: "+ j2.getMao().getListaCartas().size());
    }
}
