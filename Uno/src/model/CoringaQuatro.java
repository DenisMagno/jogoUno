package model;

// corSelecionada pode ser: 0 (status inicial), amarelo(1), azul(2), verde(3), vermelho(4)
public class CoringaQuatro extends Carta{
    private int corSelecionada;

    public CoringaQuatro(int cor, int numero) {
        super(cor, numero);
    }
    
    public int getCorSelecionada() {
        return corSelecionada;
    }
    
    private void setCorSelecionada(int corSelecionada) {
        this.corSelecionada = corSelecionada;
    }

    @Override
    public void jogar(){
        this.setCorSelecionada(2);
        Jogo.pilhaDescarte.setCarta(this);
        Jogo.compraMais(4);
    }
}
