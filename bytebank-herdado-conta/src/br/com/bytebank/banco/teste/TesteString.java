package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        String nome = "nome qualquer";

        //porém isso quebra a imutabilidade, o correto é o não comentado
        //nome = nome.replace("nome", "novo nome");

        String outro = nome.replace("nome","novo nome qualquer");
        System.out.println(nome);
        System.out.println(outro);
    }
}
