package uno;

import model.*;

public class Uno {
    public static void main(String[] args) {
        Baralho.montar();

        Jogador j1 = new Jogador("Denis");
        
        Compra monteCompra = new Compra();
        
        System.out.println("Quantidade: "+ monteCompra.getListaCartas().size());
        
        int i;
        for(i = 0; i < monteCompra.getListaCartas().size(); i++){
            System.out.println("Numero: "+ i +"; cor: " + monteCompra.getCarta(i).getCor());
        }
    }
}
