package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Breno");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("12345678901");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-io/cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-io/cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());

    }
}
