package model;

public class Inverte extends Carta{

    public Inverte(int cor, int numero) {
        super(cor, numero);
    }

    @Override
    public void jogar(){
        Jogo.compraMais(1);
        Jogo.alteraTurno();
    }
}
