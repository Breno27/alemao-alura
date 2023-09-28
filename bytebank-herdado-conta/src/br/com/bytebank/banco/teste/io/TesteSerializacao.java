package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Breno");
        cliente.setProfissao("Dev");
        cliente.setCpf("12345678901");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bytebank-herdado-conta/src/br/com/bytebank/banco/teste/io/cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
