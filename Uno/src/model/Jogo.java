package model;

public class Jogo {

    // Verifica se há alguma carta na mão do jogador que ele possa jogar no monte de descarte
    public boolean verificaMao(Mao mao, Descarte descarte){
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
