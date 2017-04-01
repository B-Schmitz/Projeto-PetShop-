package actionListener;

import Get_Set.Cliente_Get_Set;
import Janelas.Clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastroClienteAction implements ActionListener {

    Clientes cliente;

    public CadastroClienteAction(Clientes cliente) {

        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {
            
            Cliente_Get_Set client = cliente.getcliente();
           
            System.out.println(client.toString());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }

        if (e.getActionCommand().equals("Limpar")) {
            
            cliente.limpar();
        }

    }

}
