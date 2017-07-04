package br.pet.listeners;

import br.pet.dao.AnimalDao;
import br.pet.dao.ClienteDao;
import br.pet.getset.AnimalGetSet;
import br.pet.janelas.Animal;
import br.pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.pet.excecoes.LogExceptions;
import br.pet.getset.ClienteGetSet;
import br.pet.janelas.Principal;

public class AnimaisAction implements ActionListener {

    private final Animal animais;
    private AnimalGetSet ani;
    private AnimalGetSet aniUpdate;
    private final LogExceptions execao = new LogExceptions();
    private final AnimalDao AnimalDao = new AnimalDao();
    private ClienteDao clienteDao = new ClienteDao();
    private ClienteGetSet cli = new ClienteGetSet();
    private String resAnimal;
    private Principal p ;

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

                ClienteGetSet cli = clienteDao.buscaNome(ani.getProprietario());
                if (cli.getNome() != null) {

                    ani.setCliente(cli);
                    AnimalDao.Insert(ani);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Cadastrou um novo animal");
                } else {
                    
                    //Aquiiiiii
                    
                    JOptionPane.showMessageDialog(null, "Proprietario não existe no banco", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    // Se puder colocar um joptinpane para o usuario decidir se quer ou não adicionar um cliente
                    int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novo cliente?");
                    if(op == 0){
                    p = animais.RetornaPrincipal();
                    p.Chamacliente();}
                    
                   
                }
                //precisa terminar
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }
        if (e.getActionCommand().equals("Limpar")) {
            Log("!Clicou em 'Limpar'");
            animais.limpar();

        }

        if (e.getActionCommand().equals("Deletar")) {
            buscar();
            if (ani != null) {
                boolean t = AnimalDao.buscaNome(ani, resAnimal);
                if (t) {
                    AnimalDao.Delete(ani);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Animal não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                }
            }

            //animais.Deletar();
            //falta log
        }
        if (e.getActionCommand().equals("Atualizar")) {
            Log("!Clicou em 'Atualizar Animal'");

            if (animais.Verifica()) {

                ani = new AnimalGetSet();
                aniUpdate = new AnimalGetSet();

                aniUpdate = animais.getAnimais();

                cli = clienteDao.buscaNome(aniUpdate.getProprietario());
                if (cli.getNome() != null) {
                    ani.setCliente(cli);
                    aniUpdate.setCliente(cli);

                    ani.setNome(aniUpdate.getNome());

                    AnimalDao.buscaNome(ani, ani.getNome());

                    aniUpdate.setId(ani.getId());

                    AnimalDao.Update(aniUpdate);
                    animais.limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Cadastro não encontrado", "Atualização falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Atualizar falhou. Animal: " + ani.getNome() + " não encontrado no banco de dados");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar a atualização", "Atualização falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Atualização de cliente falhou");
            }

        }
        if (e.getActionCommand().equals("Buscar")) {
            Log("!Clicou em 'Buscar Animal'");

            buscar();
            if (ani != null) {
                boolean t = AnimalDao.buscaNome(ani, resAnimal);
                if (t) {
                    animais.Escreve();
                } else {
                    JOptionPane.showMessageDialog(null, "Animal não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                }
            }
        }
    }

    public void buscar() {
        String resProprietario = (JOptionPane.showInputDialog(null, "Informe o nome do proprietario:", "Buscar cliente", JOptionPane.PLAIN_MESSAGE));
        if (resProprietario == null ) {
             Log("!Buscar proprietario falhou. Ação cancelada ");
             JOptionPane.showMessageDialog(null, "A busca foi cancelada", "Buscar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
        } else {

            cli.setNome("");
            cli = clienteDao.buscaNome(resProprietario);

            if (cli.getNome() == null) {
                JOptionPane.showMessageDialog(null, "Proprietario não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Buscar falhou. Cliente: " + resProprietario + " não encontrado no banco de dados");
            } else {
                resAnimal = (JOptionPane.showInputDialog(null, "Informe o nome do animal:", "Buscar Animal", JOptionPane.PLAIN_MESSAGE));
                if (resAnimal == null ) {

                    Log("!Buscar animal falhou. Ação cancelada ");
             JOptionPane.showMessageDialog(null, "A busca foi cancelada", "Buscar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    
                } else {
                    ani = animais.getAnimais();
                    ani.setNome("");
                    ani.setCliente(cli);

                }

                // Log("!Buscou cliente: " + client.getCPF());
            }
        }
    }
}
