package model;

public class MaisDois extends Carta{

    public MaisDois(int cor, int numero) {
        super(cor, numero);
    }

    @Override
    public void jogar(){
        Jogo.pilhaDescarte.setCarta(this);
        Jogo.compraMais(4);
    }
}
