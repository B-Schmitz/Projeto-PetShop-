package Janelas;

import Log.Log;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    private final Clientes c_cliente = new Clientes();
    private final Funcionarios funcionario = new Funcionarios();
    private final Animal animal = new Animal();
    private final ControleEstoque controle = new ControleEstoque();
    private final Ajuda ajuda = new Ajuda();
    private final ImageIcon icone;
    private Dimension d;
   

    public Principal() {
        initComponents();
        icone = new ImageIcon("src/Icones/login.png");

        // Configuração da Janela
        this.setLocationRelativeTo(null);
        this.setTitle("Painel de controle");
        this.setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")

    public void Janela(JInternalFrame frame) {
        desktopPane_principal.remove(frame);
        desktopPane_principal.add(frame);
        frame.moveToFront();
        frame.setVisible(true);
        Centralizar(frame);
    }

    public void Centralizar(JInternalFrame frame) {
        d = frame.getDesktopPane().getSize();
        frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane_principal = new javax.swing.JDesktopPane();
        label_patinhas = new javax.swing.JLabel();
        menu_bar = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        menu_cliente = new javax.swing.JMenuItem();
        menu_funcionario = new javax.swing.JMenuItem();
        menu_animal = new javax.swing.JMenuItem();
        menu_estoque = new javax.swing.JMenuItem();
        menu_ajuda = new javax.swing.JMenu();
        menu_sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane_principal.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane_principal.setForeground(new java.awt.Color(240, 240, 240));
        desktopPane_principal.setToolTipText("");

        label_patinhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pegadas.png"))); // NOI18N

        desktopPane_principal.setLayer(label_patinhas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPane_principalLayout = new javax.swing.GroupLayout(desktopPane_principal);
        desktopPane_principal.setLayout(desktopPane_principalLayout);
        desktopPane_principalLayout.setHorizontalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 917, Short.MAX_VALUE)
        );
        desktopPane_principalLayout.setVerticalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, Short.MAX_VALUE)
        );

        menu_cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro.png"))); // NOI18N
        menu_cadastros.setText("Cadastro");

        menu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        menu_cliente.setText("Cadastro de cliente");
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_cliente);

        menu_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funcionario.png"))); // NOI18N
        menu_funcionario.setText("Cadastro de funcionário");
        menu_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_funcionarioActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_funcionario);

        menu_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dog.png"))); // NOI18N
        menu_animal.setText("Cadastro de animal");
        menu_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_animalActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_animal);

        menu_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estoque.png"))); // NOI18N
        menu_estoque.setText("Controle de estoque");
        menu_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_estoqueActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_estoque);

        menu_bar.add(menu_cadastros);

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/help.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");

        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ajuda.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_sobreMousePressed(evt);
            }
        });
        menu_ajuda.add(menu_sobre);

        menu_bar.add(menu_ajuda);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        try {
            Log.escrever("!Abriu a janela Cliente");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela(c_cliente);
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void menu_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_funcionarioActionPerformed
        try {
            Log.escrever("!Abriu a janela Funcionário");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela(funcionario);
    }//GEN-LAST:event_menu_funcionarioActionPerformed

    private void menu_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_animalActionPerformed
        try {
            Log.escrever("!Abriu a janela Animal");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela(animal);
    }//GEN-LAST:event_menu_animalActionPerformed

    private void menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_estoqueActionPerformed
        try {
            Log.escrever("!Abriu a janela Controle de Estoque");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela(controle);
    }//GEN-LAST:event_menu_estoqueActionPerformed

    private void menu_sobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMousePressed
        try {
            Log.escrever("!Abriu a janela Ajuda");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Janela(ajuda);

    }//GEN-LAST:event_menu_sobreMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane_principal;
    private javax.swing.JLabel label_patinhas;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenuItem menu_animal;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenuItem menu_cliente;
    private javax.swing.JMenuItem menu_estoque;
    private javax.swing.JMenuItem menu_funcionario;
    private javax.swing.JMenuItem menu_sobre;
    // End of variables declaration//GEN-END:variables
}
