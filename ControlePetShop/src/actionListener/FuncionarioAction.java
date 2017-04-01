package actionListener;

import Get_Set.Funcionario_Get_Set;
import Janelas.Funcionarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FuncionarioAction implements ActionListener {

    Funcionarios funcionario;

    public FuncionarioAction(Funcionarios funcionario) {

        this.funcionario = funcionario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            Funcionario_Get_Set fun = funcionario.getfuncio();
            
            System.out.println("" + fun.getNome());
            System.out.println("" + fun.getCargo());
            System.out.println("" + fun.getIdade());
            System.out.println("" + fun.getSexo());
            System.out.println("" + fun.getCPF());
            System.out.println("" + fun.getNum_Pis());
            System.out.println("" + fun.getTelefone());
            System.out.println("" + fun.getEmail());
            System.out.println("" + fun.getEndereco());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
        
         if (e.getActionCommand().equals("Limpar")) {
             
             funcionario.limpar();
           
         }

    }

}
