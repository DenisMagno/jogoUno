package model;

/*
    CONVENÇÃO

Cor pode ser: amarelo(1), azul(2), verde(3), vermelho(4) e preta/coringa(5)
Cores numeradas pode ser: 1 a 9, 10(bloqueio), 11(inverte), 12(mais2)
Sendo duas para cada cor e 0 uma para cada cor
Coringa: 4 (mais quatro), 0(coringa), ambas quatro cartas apenas
status pode ser: 0 (não utilizavel - já sendo usada), 1 (utilizavel - não sendo usada)
*/

public abstract class Carta {
    protected int cor;
    protected int numero;
    protected int status;

    public Carta(int cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public abstract void jogar();
}
