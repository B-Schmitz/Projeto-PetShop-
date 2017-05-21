package ActionListeners;

import Exceções.LogExceptions;
import Janelas.Login;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginAction implements ActionListener {

    private final Login login;
    private LogExceptions execao = new LogExceptions();

    public LoginAction(Login login) {
        this.login = login;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Entrar")) {
            login.Testa_Usuario();
            login.Testa_Senha();

        }
        if (e.getActionCommand().equals("Cancelar")) {
            try {
                Log.escrever("!Login cancelado");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }
            System.exit(0);
        }
    }

}
