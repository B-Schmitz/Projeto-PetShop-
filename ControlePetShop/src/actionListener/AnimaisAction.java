package actionListener;

import Get_Set.Animais_Get_Set;
import Janelas.Animais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimaisAction implements ActionListener {

    private Animais animais;

    public AnimaisAction(Animais animais) {

        this.animais = animais;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            if (animais.Verifica()) {
                Animais_Get_Set ani = animais.getAnimais();
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
