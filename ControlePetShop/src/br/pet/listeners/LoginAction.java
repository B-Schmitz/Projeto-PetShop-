package br.pet.listeners;

import br.pet.dao.LoginDao;
import br.pet.excecoes.LogExceptions;
import br.pet.getset.LoginGetSet;
import br.pet.janelas.Login;
import br.pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginAction implements ActionListener {

    private final Login login;
    private LoginGetSet Login;
    private final LoginDao logindao = new LoginDao();
    private final LogExceptions execao = new LogExceptions();

    public LoginAction(Login login) {
        this.login = login;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Entrar")) {
           

            Login = login.getLogin();
            LoginGetSet l;

            l = logindao.GetUsuario(Login.getLogin());

            if (l.getLogin() != null) {
               
                try {
                    Log.escrever("Usuario validado");
                } catch (IOException ex) {
                    // Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                    execao.exception(ex);
                }
                if (l.getSenha().equals(Login.getSenha())) {

                    login.CarregaPrincipal();
                } else {
                    try {
                        Log.escrever("Senha invalida");
                        JOptionPane.showMessageDialog(null, "Senha incorreta!", "Login", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    } catch (IOException ex) {
                        execao.exception(ex);
                        //  Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                try {
                    Log.escrever("Usuario não encontrado");
                    JOptionPane.showMessageDialog(null, "Usuario não encontrado!", "Login", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    
                } catch (IOException ex) {
                    execao.exception(ex);
                    // Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (e.getActionCommand().equals("Cancelar")) {
            try {
                Log.escrever("!Login cancelado");
            } catch (IOException ex) {
                execao.exception(ex);
            }
            System.exit(0);
        }
        if (e.getActionCommand().equals("Alterar senha")) {
            Login = login.getLogin();
             LoginGetSet l;

            l = logindao.GetUsuario(Login.getLogin());

            if (l.getLogin() != null) {
                try {
                    Log.escrever("Usuario validado");
                } catch (IOException ex) {
                    execao.exception(ex);
                   // Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            String senha = login.AlterarSenha(l.getSenha());
            
            if(!senha.equals(l.getSenha())){
                    try {
                        Log.escrever("Nova senha validado");
                    } catch (IOException ex) {
                        execao.exception(ex);
                       // Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                Login.setSenha(senha);
                logindao.Update(Login);
            }
            }
            else {
                try {
                    Log.escrever("Usuario não encontrado");
                    JOptionPane.showMessageDialog(null, "Usuario não encontrado!", "Alterar senha", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                } catch (IOException ex) {
                    execao.exception(ex);
                    // Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }

}
