package model;

public class Jogo {
    private int turno; //Vez do jogador... Turno 1 = Jogador 1, Turno 2 = Jogador dois.
    private int qtdeCompras; //Quantidade de compras que o próximo jogador terá que efetuar;

    public Jogo(){
        this.turno = 1;
    }

    public int getTurno(){
        return this.turno;
    }
    
    public void alteraTurno(){
        if(this.turno == 1){
            this.turno = 2;
        }else{
            this.turno = 1;
        }
    }

    // Verifica se há alguma carta na mão do jogador que ele possa jogar no monte de descarte
    private boolean verificaMao(Mao mao, Descarte descarte){
        int i;

        for(i = 0; i < mao.getListaCartas().size(); i++){
            if(mao.leCarta(i).getNumero() == descarte.getCarta().getNumero()){
                return true;
            }else if(mao.leCarta(i).getCor() == descarte.getCarta().getCor()){
                return true;
            }
        }

        return false;
    }    
}
