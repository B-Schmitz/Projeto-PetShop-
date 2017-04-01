package actionListener;

import Get_Set.Animais_Get_Set;
import Janelas.Animais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AnimaisAction implements ActionListener {

    Animais animais;

    public AnimaisAction(Animais animais) {

        this.animais = animais;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            Animais_Get_Set ani = animais.getAnimais();

            System.out.println("" + ani.getProprietario());
            System.out.println("" + ani.getAnimal());
            System.out.println("" + ani.getNome());
            System.out.println("" + ani.getRaca());
            System.out.println("" + ani.getCor());
            System.out.println("" + ani.getSexo());
            System.out.println("" + ani.getIdade());
            System.out.println("" + ani.getAltura());
            System.out.println("" + ani.getPeso());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }

        if (e.getActionCommand().equals("Limpar")) {
            animais.limpar();

        }

    }

}
