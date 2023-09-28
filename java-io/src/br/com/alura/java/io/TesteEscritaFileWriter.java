package br.com.alura.java.io;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("haha to inserindo um texto aqui");

        bw.close();
    }
}
