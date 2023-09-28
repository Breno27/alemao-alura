package br.com.alura.java.io;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        //Socket s = new Socket(); para comunicação de rede/telefone

        InputStream fis = System.in; //new FileInputStream("java-io/lorem.txt"); // s.getInputStream (para comunicação de rede/telefone)
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; //new FileOutputStream("java-io/lorem2.txt"); // s.getOutputStream (para comunicação de rede/telefone)
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
