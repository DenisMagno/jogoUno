package model;

public class Inverte extends Carta{

    public Inverte(int cor, int numero) {
        super(cor, numero);
    }

    @Override
    public void jogar(){
        Jogo.pilhaDescarte.setCarta(this);
        Jogo.alteraTurno();
    }
}
