package model;

public class Bloqueio extends Carta{

    public Bloqueio(int cor, int numero) {
        super(cor, numero);
    }

    @Override
    public void jogar(){
        Jogo.alteraTurno();
        Jogo.compraMais(1);
    }
}
