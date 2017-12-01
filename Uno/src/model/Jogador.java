package model;

public class Jogador {
    private String nome;
    private Mao mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new Mao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mao getMao() {
        return mao;
    }
}