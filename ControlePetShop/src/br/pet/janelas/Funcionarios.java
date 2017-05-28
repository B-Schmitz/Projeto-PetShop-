package br.pet.janelas;

import br.pet.excecoes.Letras;
import br.pet.excecoes.LimitandoCamposNumericos;
import br.pet.getset.FuncionarioGetSet;
import br.pet.listeners.FuncionarioAction;
import br.pet.excecoes.LogExceptions;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

public class Funcionarios extends javax.swing.JInternalFrame {

    private final FuncionarioAction funcionario = new FuncionarioAction(this);
    private FuncionarioGetSet fun;
    private String cpf, tel;
    private LogExceptions execao = new LogExceptions();

    public Funcionarios() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/br/pet/icones/funcionario.png"));
        botao_cadastrar_funcionario.addActionListener(funcionario);
        botao_limpar_funcionario.addActionListener(funcionario);
        field_idade_funcionario.setDocument(new LimitandoCamposNumericos(3));
        field_pis.setDocument(new LimitandoCamposNumericos(11));

        field_cargo.setDocument(new Letras());
        field_nome_funcionario.setDocument(new Letras());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nome_funcionario = new javax.swing.JLabel();
        label_cargo_funcionario = new javax.swing.JLabel();
        label_CPF_funcionario = new javax.swing.JLabel();
        label_sexo_funcionario = new javax.swing.JLabel();
        label_pis_funcionario = new javax.swing.JLabel();
        label_endereco_funcionario = new javax.swing.JLabel();
        field_nome_funcionario = new javax.swing.JTextField();
        field_cargo = new javax.swing.JTextField();
        field_endereco_funcionario = new javax.swing.JTextField();
        comboBox_sexo_funcionario = new javax.swing.JComboBox<>();
        field_CPF_funcionario = new javax.swing.JFormattedTextField();
        field_pis = new javax.swing.JTextField();
        botao_cadastrar_funcionario = new javax.swing.JButton();
        label_idade_funcionaro = new javax.swing.JLabel();
        label_telefone_funcionario = new javax.swing.JLabel();
        field_telefone_funcionario = new javax.swing.JFormattedTextField();
        field_idade_funcionario = new javax.swing.JTextField();
        label_email_funcionario = new javax.swing.JLabel();
        field_email_funcionario = new javax.swing.JTextField();
        botao_limpar_funcionario = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de funcionário");
        setVisible(false);

        label_nome_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nome_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/funcionario.png"))); // NOI18N
        label_nome_funcionario.setText("Nome:");

        label_cargo_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cargo_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/funcao.png"))); // NOI18N
        label_cargo_funcionario.setText("Cargo:");

        label_CPF_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_CPF_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cpf.png"))); // NOI18N
        label_CPF_funcionario.setText("CPF:");

        label_sexo_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_sexo_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/sexo.PNG"))); // NOI18N
        label_sexo_funcionario.setText("Sexo:");

        label_pis_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_pis_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/carteiradetrabalho.png"))); // NOI18N
        label_pis_funcionario.setText("N°Pis:");

        label_endereco_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_endereco_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/mapa.png"))); // NOI18N
        label_endereco_funcionario.setText("Endereço:");

        comboBox_sexo_funcionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        try {
            field_CPF_funcionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botao_cadastrar_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cadastrar_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/add.png"))); // NOI18N
        botao_cadastrar_funcionario.setText("Cadastrar");
        botao_cadastrar_funcionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cadastrar_funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_idade_funcionaro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_idade_funcionaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/calendario.png"))); // NOI18N
        label_idade_funcionaro.setText("Idade:");

        label_telefone_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_telefone_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/telefone.png"))); // NOI18N
        label_telefone_funcionario.setText("Telefone:");

        try {
            field_telefone_funcionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        label_email_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_email_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/email.png"))); // NOI18N
        label_email_funcionario.setText("Email:");

        botao_limpar_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_limpar_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/limpar.png"))); // NOI18N
        botao_limpar_funcionario.setText("Limpar");
        botao_limpar_funcionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_limpar_funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_limpar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cargo_funcionario)
                            .addComponent(label_pis_funcionario)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(label_nome_funcionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(field_nome_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label_email_funcionario)
                                    .addGap(369, 369, 369))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_idade_funcionaro)
                                        .addGap(42, 42, 42)
                                        .addComponent(field_idade_funcionario)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_CPF_funcionario)
                                        .addGap(18, 18, 18)
                                        .addComponent(field_CPF_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_endereco_funcionario)
                                            .addComponent(label_sexo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(comboBox_sexo_funcionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_telefone_funcionario)
                                                .addGap(18, 18, 18)
                                                .addComponent(field_telefone_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(field_pis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(field_endereco_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(field_email_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(field_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome_funcionario)
                    .addComponent(field_nome_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idade_funcionaro)
                    .addComponent(field_idade_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_CPF_funcionario)
                    .addComponent(field_CPF_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_sexo_funcionario)
                    .addComponent(comboBox_sexo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_telefone_funcionario)
                    .addComponent(field_telefone_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cargo_funcionario)
                    .addComponent(field_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email_funcionario)
                    .addComponent(field_email_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_endereco_funcionario)
                    .addComponent(field_endereco_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pis_funcionario)
                    .addComponent(field_pis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar_funcionario;
    private javax.swing.JButton botao_limpar_funcionario;
    private javax.swing.JComboBox<String> comboBox_sexo_funcionario;
    private javax.swing.JFormattedTextField field_CPF_funcionario;
    private javax.swing.JTextField field_cargo;
    private javax.swing.JTextField field_email_funcionario;
    private javax.swing.JTextField field_endereco_funcionario;
    private javax.swing.JTextField field_idade_funcionario;
    private javax.swing.JTextField field_nome_funcionario;
    private javax.swing.JTextField field_pis;
    private javax.swing.JFormattedTextField field_telefone_funcionario;
    private javax.swing.JLabel label_CPF_funcionario;
    private javax.swing.JLabel label_cargo_funcionario;
    private javax.swing.JLabel label_email_funcionario;
    private javax.swing.JLabel label_endereco_funcionario;
    private javax.swing.JLabel label_idade_funcionaro;
    private javax.swing.JLabel label_nome_funcionario;
    private javax.swing.JLabel label_pis_funcionario;
    private javax.swing.JLabel label_sexo_funcionario;
    private javax.swing.JLabel label_telefone_funcionario;
    // End of variables declaration//GEN-END:variables

    public FuncionarioGetSet getfuncio() {

        fun = new FuncionarioGetSet();

        cpf = field_CPF_funcionario.getText().replaceAll("[-.]", "");
        tel = field_telefone_funcionario.getText().replaceAll("[()]", "");

        try {
            fun.setCPF(Long.parseLong(cpf));
            fun.setIdade(Integer.parseInt(field_idade_funcionario.getText().trim()));
            fun.setNum_Pis(Long.parseLong(field_pis.getText()));
            fun.setTelefone(Long.parseLong(tel));
        } catch (Exception ex) {

            execao.exception(ex);
        }
        fun.setEndereco(field_endereco_funcionario.getText().trim());
        fun.setCargo(field_cargo.getText().trim());
        fun.setNome(field_nome_funcionario.getText().trim());
        fun.setEmail(field_email_funcionario.getText().trim());
        fun.setSexo((String) comboBox_sexo_funcionario.getSelectedItem());

        limpar();
       

        return fun;

    }

    public void limpar() {
        field_nome_funcionario.setText(null);
        field_CPF_funcionario.setFocusLostBehavior(JFormattedTextField.PERSIST);
        field_CPF_funcionario.setText(null);
        field_email_funcionario.setText(null);
        field_endereco_funcionario.setText(null);
        field_idade_funcionario.setText(null);
        field_pis.setText(null);
        field_telefone_funcionario.setText(null);
        field_telefone_funcionario.setFocusLostBehavior(JFormattedTextField.PERSIST);
        field_cargo.setText(null);
    }

    public boolean Verifica() {
        return !(field_nome_funcionario.getText().trim().isEmpty()
                || field_cargo.getText().trim().isEmpty()
                || field_CPF_funcionario.getText().replaceAll("[-.]", "").trim().isEmpty()
                || field_idade_funcionario.getText().isEmpty()
                || field_pis.getText().isEmpty()
                || field_endereco_funcionario.getText().trim().isEmpty()
                || field_telefone_funcionario.getText().replaceAll("[()]", "").trim().isEmpty()
                || field_email_funcionario.getText().trim().isEmpty());
    }

}
