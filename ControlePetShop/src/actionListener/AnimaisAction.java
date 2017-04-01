package actionListener;

import Get_Set.Animais_Get_Set;
import Janelas.Animais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AnimaisAction implements ActionListener {

    private Animais animais;

    public AnimaisAction(Animais animais) {

        this.animais = animais;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            Animais_Get_Set ani = animais.getAnimais();

            System.out.println(ani.toString());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }

        if (e.getActionCommand().equals("Limpar")) {
            animais.limpar();

        }

    }

}
