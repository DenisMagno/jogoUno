package model;

// corSelecionada pode ser: 0 (status inicial), amarelo(1), azul(2), verde(3), vermelho(4)

import javax.swing.JOptionPane;

public class CoringaQuatro extends Carta{

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
        this.corSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina a cor: "));
        Jogo.compraMais(4);
    }
}