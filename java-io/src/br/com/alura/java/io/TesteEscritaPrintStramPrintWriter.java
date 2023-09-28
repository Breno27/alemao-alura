package br.com.alura.java.io;


import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStramPrintWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));

//        PrintStream ps = new PrintStream("java-io/lorem2.txt");
        PrintWriter pw = new PrintWriter("java-io/lorem2.txt", "UTF-8");

        pw.println("Lorem ipwum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println();
        pw.println();
        pw.println();
        pw.println("haha to inserindo um texto aqui - encoding joão é");

        pw.close();

    }
}
