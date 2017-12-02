package model;

public class Jogo {
    public Jogador jogador1;
    public Jogador jogador2;
    public Compra monteCompra;
    public static Descarte pilhaDescarte;
    
    private static int turno; //Vez do jogador... Turno 1 = Jogador 1, Turno 2 = Jogador dois.
    private static int qtdeCompra; //Quantidade de cartas que jogador pode/deve fazer;

    public Jogo(){
        //Monta baralho a ser utilizado na mão do jogador, na pilha de descarte e no monte de compras.
        Baralho.montar();
        Jogo.turno = 1;
        Jogo.qtdeCompra = 1;
    }

    //inicia jogo dando nome para os jogadores colocando uma carta do monte de compra na pilha de descarte;
    public void iniciaJogo(String jogador1, String jogador2){
        //Inicia jogadores com seus nomes
        this.jogador1 = new Jogador(jogador1);
        this.jogador2 = new Jogador(jogador2);
        
        //Inicia monte de compra, com todas as cartas do jogo, menos as que já foram distribuidadas para os jogadores
        this.monteCompra = new Compra();
        
        //Coloca uma carta do monte de compra na pilha de descarte para iniciar o jogo. A mesma sendo menor ou igual o número 9;
        int i = 0;
        while(i == 0){
            if(this.monteCompra.leCarta(i).getNumero() <= 9){
                this.pilhaDescarte = new Descarte();
                this.pilhaDescarte.setCarta(this.monteCompra.getCarta(i));
                
                i++;
            }
        }
    }
   
    public static void compraMais(int qtde){
        Jogo.qtdeCompra = qtde;
    }

    public static void alteraTurno(){
        if(Jogo.turno == 1){
            Jogo.turno = 2;
        }else{
            Jogo.turno = 1;
        }
    }

    // Verifica se há alguma carta na mão do jogador que ele possa jogar no monte de descarte
    public static boolean verificaMao(Mao mao, Descarte descarte){
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
