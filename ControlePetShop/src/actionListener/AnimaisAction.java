package actionListener;

import Get_Set.Animal_Get_Set;
import Janelas.Animal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimaisAction implements ActionListener {

    private Animal animais;

    public AnimaisAction(Animal animais) {

        this.animais = animais;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            if (animais.Verifica()) {
                Animal_Get_Set ani = animais.getAnimais();
                System.out.println(ani.toString());
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/Icones/aceito.png"));
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
            }

            if (e.getActionCommand().equals("Limpar")) {
                animais.limpar();

            }

        }
    }
}
