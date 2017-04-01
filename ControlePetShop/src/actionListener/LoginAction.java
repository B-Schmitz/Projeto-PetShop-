package actionListener;

import Janelas.Login;
import Janelas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAction implements ActionListener {

    private final Login login;

    public LoginAction(Login login) {
        this.login = login;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Entrar")) {
            Principal p = new Principal();
            p.setVisible(true);
            login.dispose();

        }
        if (e.getActionCommand().equals("Cancelar")) {
            System.exit(0);
        }
    }

}
