package br.com.bytebank.banco.modelo;

public class GuardardorDeContas {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardardorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Conta refConta) {
        this.referencias[this.posicaoLivre] = refConta;
        this.posicaoLivre++;
    }


    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
