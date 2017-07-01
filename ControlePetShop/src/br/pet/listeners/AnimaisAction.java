package br.pet.listeners;

import br.pet.dao.AnimalDao;
import br.pet.getset.AnimalGetSet;
import br.pet.janelas.Animal;
import br.pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.pet.excecoes.LogExceptions;

public class AnimaisAction implements ActionListener {

    private final Animal animais;
    private AnimalGetSet ani;
    private final LogExceptions execao = new LogExceptions();
     private final AnimalDao dao = new AnimalDao();

    public AnimaisAction(Animal animais) {

        this.animais = animais;
    }
    
     public void Log(String msg) {
        try {
            Log.escrever(msg);
        } catch (IOException ex) {
            execao.exception(ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

                Log("!Clicou em 'Cadastrar'");

            if (animais.Verifica()) {
                ani = animais.getAnimais();
                System.out.println(ani.toString());
                    Log("!Cadastrou um novo animal");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }
        if (e.getActionCommand().equals("Limpar")) {
                Log("!Clicou em 'Limpar'");
            animais.limpar();

        }
        
          if (e.getActionCommand().equals("Deletar")) {
              ani = animais.getAnimais();
              //animais.Deletar();
              //falta log
          

        }

    }
}
