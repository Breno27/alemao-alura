package br.com.bytebank.banco.modelo;


import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 *
 * @autor Breno Fernandes
 * @version 0.1
 */
 public abstract class Conta implements Comparable<Conta>, Serializable {

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular; //Quando definido como transiente, nem é gravado no momento de serialização, então no momento de deserialização é retornado como null.
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto conta a partir da agência e numero
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia){
            return false;
        }

        if (this.numero != outra.numero) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }

}