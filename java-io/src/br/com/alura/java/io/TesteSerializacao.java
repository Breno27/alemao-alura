package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String nome = "Breno Fernandes";

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-io/objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-io/objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();

        System.out.println(nome);
    }
}
