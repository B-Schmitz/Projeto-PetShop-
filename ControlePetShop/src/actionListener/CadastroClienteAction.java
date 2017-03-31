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
            System.out.println(""+ client.getClass());
           // System.out.println("" + client.getNome());
            //System.out.println("" + client.getIdade());
            //System.out.println("" + client.getCPF());
            //System.out.println("" + client.getSexo());
            //System.out.println("" + client.getTelefone());
            //System.out.println("" + client.getEmail());
            //System.out.println("" + client.getEndereco());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }

        if (e.getActionCommand().equals("Limpar")) {
            
            Cliente_Get_Set client = cliente.getcliente();
            
            client.setNome(null);
            client.setIdade(null);
            client.setCPF(null);
            client.setSexo(null);
            client.setTelefone(null);
            client.setEmail(null);
            client.setEndereco(null);
        }

    }

}
