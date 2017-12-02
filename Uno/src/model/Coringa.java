package model;

// corSelecionada pode ser: 0 (status inicial), amarelo(1), azul(2), verde(3), vermelho(4)
public class Coringa extends Carta{
    private int corSelecionada;

    public Coringa(int cor, int numero) {
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
        
    }
}
