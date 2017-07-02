package br.pet.janelas;

import br.pet.dao.AnimalDao;
import br.pet.dao.ClienteDao;
import br.pet.excecoes.Letras;
import br.pet.excecoes.LimitandoCamposNumericos;
import br.pet.getset.ClienteGetSet;
import br.pet.log.Log;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import br.pet.listeners.CadastroClienteAction;
import br.pet.excecoes.LogExceptions;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JInternalFrame {

    private final CadastroClienteAction cliente = new CadastroClienteAction(this);
    private final ClienteDao dao = new ClienteDao();
    private String cpf;
    private String tel;
    private ClienteGetSet client;
    private final Log log = new Log();
    private final LogExceptions execao = new LogExceptions();

    public Clientes() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/br/pet/icones/cliente.png"));
        botao_cadastrar_cliente.addActionListener(cliente);
        botao_deletar_cliente.addActionListener(cliente);
        botao_limpar_cliente.addActionListener(cliente);
        botao_buscar_cliente.addActionListener(cliente);
        botao_atualizar_cliente.addActionListener(cliente);
        field_idade_cliente.setDocument(new LimitandoCamposNumericos(3));
        field_nome_cliente.setDocument(new Letras());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nome_cliente = new javax.swing.JLabel();
        label_idade_cliente = new javax.swing.JLabel();
        label_cpf_cliente = new javax.swing.JLabel();
        label_telefone_cliente = new javax.swing.JLabel();
        field_nome_cliente = new javax.swing.JTextField();
        label_sexo_cliente = new javax.swing.JLabel();
        comboBox_sexo_cliente = new javax.swing.JComboBox<>();
        field_CPF_cliente = new javax.swing.JFormattedTextField();
        label_endereco_cliente = new javax.swing.JLabel();
        field_endereco_cliente = new javax.swing.JTextField();
        botao_cadastrar_cliente = new javax.swing.JButton();
        field_telefone_cliente = new javax.swing.JFormattedTextField();
        label_email_cliente = new javax.swing.JLabel();
        field_email_cliente = new javax.swing.JTextField();
        field_idade_cliente = new javax.swing.JTextField();
        botao_limpar_cliente = new javax.swing.JButton();
        botao_deletar_cliente = new javax.swing.JButton();
        botao_buscar_cliente = new javax.swing.JButton();
        botao_atualizar_cliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setNormalBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setVisible(false);

        label_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nome_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cliente.png"))); // NOI18N
        label_nome_cliente.setText("Nome:");

        label_idade_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_idade_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/calendario.png"))); // NOI18N
        label_idade_cliente.setText("Idade:");
        label_idade_cliente.setDoubleBuffered(true);

        label_cpf_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cpf_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cpf.png"))); // NOI18N
        label_cpf_cliente.setText("CPF:");

        label_telefone_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_telefone_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/telefone.png"))); // NOI18N
        label_telefone_cliente.setText("Telefone:");

        label_sexo_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_sexo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/sexo.PNG"))); // NOI18N
        label_sexo_cliente.setText("Sexo:");

        comboBox_sexo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        try {
            field_CPF_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        label_endereco_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_endereco_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/mapa.png"))); // NOI18N
        label_endereco_cliente.setText("Endereço:");

        botao_cadastrar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cadastrar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/add.png"))); // NOI18N
        botao_cadastrar_cliente.setText("Cadastrar");
        botao_cadastrar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cadastrar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        try {
            field_telefone_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)######### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        label_email_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_email_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/email.png"))); // NOI18N
        label_email_cliente.setText("E-mail:");

        botao_limpar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_limpar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/limpar.png"))); // NOI18N
        botao_limpar_cliente.setText("Limpar");
        botao_limpar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_limpar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_deletar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_deletar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/remove.png"))); // NOI18N
        botao_deletar_cliente.setText("Deletar");
        botao_deletar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_deletar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_buscar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/buscar.png"))); // NOI18N
        botao_buscar_cliente.setText("Buscar");
        botao_buscar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_buscar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_atualizar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_atualizar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/update.png"))); // NOI18N
        botao_atualizar_cliente.setText("Atualizar");
        botao_atualizar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_atualizar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(label_idade_cliente)
                            .addGap(104, 104, 104)
                            .addComponent(label_cpf_cliente)
                            .addGap(18, 18, 18)
                            .addComponent(field_CPF_cliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(label_nome_cliente))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_email_cliente)
                                        .addComponent(label_endereco_cliente))))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_email_cliente)
                                .addComponent(field_nome_cliente)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(field_idade_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(comboBox_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(label_telefone_cliente)
                                            .addGap(18, 18, 18)
                                            .addComponent(field_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(field_endereco_cliente))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(botao_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_deletar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(botao_limpar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_atualizar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nome_cliente)
                            .addComponent(field_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_idade_cliente)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field_idade_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_cpf_cliente)
                                .addComponent(field_CPF_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_telefone_cliente)
                            .addComponent(field_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_email_cliente))
                    .addComponent(field_email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_endereco_cliente)
                    .addComponent(field_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_cadastrar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_deletar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_atualizar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_atualizar_cliente;
    private javax.swing.JButton botao_buscar_cliente;
    private javax.swing.JButton botao_cadastrar_cliente;
    private javax.swing.JButton botao_deletar_cliente;
    private javax.swing.JButton botao_limpar_cliente;
    private javax.swing.JComboBox<String> comboBox_sexo_cliente;
    private javax.swing.JFormattedTextField field_CPF_cliente;
    private javax.swing.JTextField field_email_cliente;
    private javax.swing.JTextField field_endereco_cliente;
    private javax.swing.JTextField field_idade_cliente;
    private javax.swing.JTextField field_nome_cliente;
    private javax.swing.JFormattedTextField field_telefone_cliente;
    private javax.swing.JLabel label_cpf_cliente;
    private javax.swing.JLabel label_email_cliente;
    private javax.swing.JLabel label_endereco_cliente;
    private javax.swing.JLabel label_idade_cliente;
    private javax.swing.JLabel label_nome_cliente;
    private javax.swing.JLabel label_sexo_cliente;
    private javax.swing.JLabel label_telefone_cliente;
    // End of variables declaration//GEN-END:variables

    public ClienteGetSet getcliente() {

        client = new ClienteGetSet();
        cpf = field_CPF_cliente.getText().replaceAll("[-.]", "").trim();
        tel = field_telefone_cliente.getText().replaceAll("[()]", "").trim();
        try {
            client.setTelefone(Long.parseLong(tel));
            client.setIdade(Integer.parseInt(field_idade_cliente.getText()));
        } catch (Exception ex) {
            execao.exception(ex);
        }

        client.setEndereco(field_endereco_cliente.getText().trim());
        client.setNome(field_nome_cliente.getText().trim());
        client.setSexo((String) comboBox_sexo_cliente.getSelectedItem());
        client.setEmail(field_email_cliente.getText().trim());
        client.setCPF(cpf);
        limpar();

        return client;

    }

    public void Log(String msg) {
        try {
            Log.escrever(msg);
        } catch (IOException ex) {
            execao.exception(ex);
        }
    }

    public void limpar() {
        field_nome_cliente.setText(null);
        field_email_cliente.setText(null);
        field_CPF_cliente.setText(null);
        field_CPF_cliente.setFocusLostBehavior(JFormattedTextField.PERSIST);
        field_endereco_cliente.setText(null);
        field_idade_cliente.setText(null);
        field_telefone_cliente.setText(null);
        field_telefone_cliente.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }

    public boolean Verifica() {
        return !(field_nome_cliente.getText().trim().isEmpty()
                || field_idade_cliente.getText().isEmpty()
                || field_CPF_cliente.getText().replaceAll("[-.]", "").trim().isEmpty()
                || field_email_cliente.getText().trim().isEmpty()
                || field_telefone_cliente.getText().replaceAll("[()]", "").trim().isEmpty()
                || field_endereco_cliente.getText().trim().isEmpty());
    }

    public ClienteGetSet Deletar() {
        String result = (JOptionPane.showInputDialog(null, "Informe o CPF: ", "Deletar cliente", JOptionPane.PLAIN_MESSAGE));
        if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
            JOptionPane.showMessageDialog(null, "O delete foi cancelado ou CPF inserido é inválido", "Deletar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            Log("!Deletar cliente falhou. Ação cancelada ");
            client = null;
        } else {
            client = new ClienteGetSet();
            client.setCPF(result);
            /* dao.Read(client);
            if ("".equals(client.getNome().trim())) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Deletar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
            } else {
                AnimalDao daAni = new AnimalDao();
                daAni.Delete(client.getId());
                dao.Delete(client);
                Log("!Deletou cliente: " + client.getCPF());
            }*/
        }
        return client;
    }

    public void Buscar() {
        client.setNome(""); // Define o nome como vazio para verificação no banco depois.
        String result = (JOptionPane.showInputDialog(null, "Informe o CPF:", "Buscar cliente", JOptionPane.PLAIN_MESSAGE));
        if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
            Log("!Buscar cliente falhou. Ação cancelada ");
            JOptionPane.showMessageDialog(null, "A busca foi cancelada ou CPF inserido é inválido", "Buscar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
        } else {
            client.setCPF(result);
            dao.Read(client);
            if ("".equals(client.getNome().trim())) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Buscar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
            } else {
                Escreve();
                Log("!Buscou cliente: " + client.getCPF());
            }
        }
    }

    public void Atualizar() {
        if (Verifica()) {
            client.setCPF(field_CPF_cliente.getText().replaceAll("[-.]", "").trim());
            dao.Read(client);
            System.out.println(client.getNome());
            if ("".equals(client.getNome().trim())) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Atualizar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
            } else {
                dao.Update(client);
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso", "Atualização concluída", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                Log("!Atualizou cliente: " + client.getCPF());
                client.setNome("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar a atualização", "Atualização falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            Log("!Atualização de cliente falhou");
        }

    }

    public void Escreve() {
        int num;
        if (client.getSexo().equals("Masculino")) {
            num = 0;
        } else {
            num = 1;
        }
        field_CPF_cliente.setText((client.getCPF()));
        field_nome_cliente.setText(client.getNome());
        field_idade_cliente.setText(String.valueOf(client.getIdade()));
        comboBox_sexo_cliente.setSelectedIndex(num);
        field_email_cliente.setText(client.getEmail());
        field_endereco_cliente.setText(client.getEndereco());
        field_telefone_cliente.setText(String.valueOf(client.getTelefone()));

        client.setNome("");
    }
}
