package br.pet.log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Log {

    private static String user;

    public void setUser(String user) {
        Log.user = user;
    }

    public static void escrever(String mensagem) throws IOException {
        FileWriter fileWriter = new FileWriter("log.txt", true);
        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String data = (new java.util.Date()).toString();
            String msg = data + " : " + user + " " + mensagem + "\r\n";
            bufferedWriter.write(msg);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
