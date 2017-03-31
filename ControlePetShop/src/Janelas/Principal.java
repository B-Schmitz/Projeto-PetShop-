package Janelas;

import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    Clientes c_cliente = new Clientes();
    Funcionarios funcionario = new Funcionarios();
    Animais animais = new Animais();
    ControleEstoque controle = new ControleEstoque();
    Ajuda ajuda = new Ajuda();

    public Principal() {

        initComponents();
        ImageIcon icone = new ImageIcon("src/Icones/login.png");

        // Configuração da Janela
        this.setLocationRelativeTo(null);
        this.setTitle("Painel de controle");
        this.setIconImage(icone.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane_Principal = new javax.swing.JDesktopPane();
        Menu_Bar = new javax.swing.JMenuBar();
        Menu_Cadastros = new javax.swing.JMenu();
        MenuItem_Clientes = new javax.swing.JMenuItem();
        MenuItem_Funcionarios = new javax.swing.JMenuItem();
        MenuItem_Animais = new javax.swing.JMenuItem();
        MenuItem_Estoque = new javax.swing.JMenuItem();
        Menu_Ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de controle");

        DesktopPane_Principal.setBackground(new java.awt.Color(234, 234, 234));

        javax.swing.GroupLayout DesktopPane_PrincipalLayout = new javax.swing.GroupLayout(DesktopPane_Principal);
        DesktopPane_Principal.setLayout(DesktopPane_PrincipalLayout);
        DesktopPane_PrincipalLayout.setHorizontalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        DesktopPane_PrincipalLayout.setVerticalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        Menu_Bar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Menu_Cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro.png"))); // NOI18N
        Menu_Cadastros.setText("Cadastro");

        MenuItem_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        MenuItem_Clientes.setText("Cadastro de cliente");
        MenuItem_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ClientesActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(MenuItem_Clientes);

        MenuItem_Funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funcionario.PNG"))); // NOI18N
        MenuItem_Funcionarios.setText("Cadastro de funcionário");
        MenuItem_Funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_FuncionariosActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(MenuItem_Funcionarios);

        MenuItem_Animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dog.png"))); // NOI18N
        MenuItem_Animais.setText("Cadastro de animal");
        MenuItem_Animais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AnimaisActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(MenuItem_Animais);

        MenuItem_Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estoque.png"))); // NOI18N
        MenuItem_Estoque.setText("Controle de estoque");
        MenuItem_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_EstoqueActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(MenuItem_Estoque);

        Menu_Bar.add(Menu_Cadastros);

        Menu_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ajuda.png"))); // NOI18N
        Menu_Ajuda.setText("Ajuda");
        Menu_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_AjudaMousePressed(evt);
            }
        });
        Menu_Bar.add(Menu_Ajuda);

        setJMenuBar(Menu_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane_Principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ClientesActionPerformed
        DesktopPane_Principal.remove(c_cliente);
        DesktopPane_Principal.add(c_cliente);
        c_cliente.setVisible(true);
        c_cliente.setLocation(200, 150);


    }//GEN-LAST:event_MenuItem_ClientesActionPerformed

    private void MenuItem_FuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_FuncionariosActionPerformed
        DesktopPane_Principal.remove(funcionario);
        DesktopPane_Principal.add(funcionario);
        funcionario.setVisible(true);
        funcionario.setLocation(200, 150);

    }//GEN-LAST:event_MenuItem_FuncionariosActionPerformed

    private void MenuItem_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_EstoqueActionPerformed
        DesktopPane_Principal.remove(controle);
        DesktopPane_Principal.add(controle);
        controle.setVisible(true);
        controle.setLocation(15, 15);

    }//GEN-LAST:event_MenuItem_EstoqueActionPerformed

    private void Menu_AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AjudaMousePressed
        DesktopPane_Principal.remove(ajuda);
        DesktopPane_Principal.add(ajuda);
        ajuda.setVisible(true);
        ajuda.setLocation(200, 150);
    }//GEN-LAST:event_Menu_AjudaMousePressed

    private void MenuItem_AnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AnimaisActionPerformed
        DesktopPane_Principal.remove(animais);
        DesktopPane_Principal.add(animais);
        animais.setVisible(true);
        animais.setLocation(200, 150);
    }//GEN-LAST:event_MenuItem_AnimaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane_Principal;
    private javax.swing.JMenuItem MenuItem_Animais;
    private javax.swing.JMenuItem MenuItem_Clientes;
    private javax.swing.JMenuItem MenuItem_Estoque;
    private javax.swing.JMenuItem MenuItem_Funcionarios;
    private javax.swing.JMenu Menu_Ajuda;
    private javax.swing.JMenuBar Menu_Bar;
    private javax.swing.JMenu Menu_Cadastros;
    // End of variables declaration//GEN-END:variables
}
