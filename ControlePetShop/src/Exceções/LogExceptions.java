
package Exceções;

import Janelas.Login;
import Log.Log;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LogExceptions {
    
    public void exception(Exception e){
         StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            try {
                Log.escrever( sw.toString());
            } catch (IOException ex1) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
    }
    
}
