package Log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import Get_Set.Usuario;

public class Log {
       private String user, pass;
     
    public static void escrever(String mensagem, String user) throws IOException {
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
