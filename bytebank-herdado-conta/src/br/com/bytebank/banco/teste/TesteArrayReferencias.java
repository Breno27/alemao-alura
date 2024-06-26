package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        for (Object conta: referencias) {
            System.out.println(conta);
        }

        ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast

//      System.out.println(referencias[1].getNumero()); // não funciona pois agora é uma referencia para a class Object
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
