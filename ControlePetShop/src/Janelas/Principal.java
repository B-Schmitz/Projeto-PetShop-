package Janelas;



import Janelas.Ajuda;
import Janelas.Animais;
import Janelas.Clientes;
import Janelas.ControleEstoque;
import Janelas.Funcionarios;
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
        Pricipal_Patinahs = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Cadastros = new javax.swing.JMenu();
        MenuItem_Clientes = new javax.swing.JMenuItem();
        MenuItem_Funcionarios = new javax.swing.JMenuItem();
        MenuItem_Animais = new javax.swing.JMenuItem();
        MenuItem_Estoque = new javax.swing.JMenuItem();
        Menu_Ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPane_Principal.setBackground(new java.awt.Color(240, 240, 240));
        DesktopPane_Principal.setForeground(new java.awt.Color(240, 240, 240));
        DesktopPane_Principal.setToolTipText("");

        Pricipal_Patinahs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pegadas.png"))); // NOI18N

        DesktopPane_Principal.setLayer(Pricipal_Patinahs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPane_PrincipalLayout = new javax.swing.GroupLayout(DesktopPane_Principal);
        DesktopPane_Principal.setLayout(DesktopPane_PrincipalLayout);
        DesktopPane_PrincipalLayout.setHorizontalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pricipal_Patinahs, javax.swing.GroupLayout.PREFERRED_SIZE, 917, Short.MAX_VALUE)
        );
        DesktopPane_PrincipalLayout.setVerticalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pricipal_Patinahs, javax.swing.GroupLayout.PREFERRED_SIZE, 609, Short.MAX_VALUE)
        );

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

        MenuItem_Funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funcionario.png"))); // NOI18N
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

        jMenuBar1.add(Menu_Cadastros);

        Menu_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ajuda.png"))); // NOI18N
        Menu_Ajuda.setText("Ajuda");
        Menu_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_AjudaMousePressed(evt);
            }
        });
        jMenuBar1.add(Menu_Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane_Principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane_Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ClientesActionPerformed
        DesktopPane_Principal.remove(c_cliente);
        DesktopPane_Principal.add(c_cliente);
        c_cliente.moveToFront();
        c_cliente.setVisible(true);
        c_cliente.Centralizar();
    }//GEN-LAST:event_MenuItem_ClientesActionPerformed

    private void MenuItem_FuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_FuncionariosActionPerformed
        DesktopPane_Principal.remove(funcionario);
        DesktopPane_Principal.add(funcionario);
        funcionario.moveToFront();
        funcionario.setVisible(true);
        funcionario.Centralizar();
    }//GEN-LAST:event_MenuItem_FuncionariosActionPerformed

    private void MenuItem_AnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AnimaisActionPerformed
        DesktopPane_Principal.remove(animais);
        DesktopPane_Principal.add(animais);
        animais.moveToFront();
        animais.setVisible(true);
        animais.Centralizar();
    }//GEN-LAST:event_MenuItem_AnimaisActionPerformed

    private void MenuItem_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_EstoqueActionPerformed
        DesktopPane_Principal.remove(controle);
        DesktopPane_Principal.add(controle);
        controle.moveToFront();
        controle.setVisible(true);
        controle.Centralizar();

    }//GEN-LAST:event_MenuItem_EstoqueActionPerformed

    private void Menu_AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AjudaMousePressed
        DesktopPane_Principal.remove(ajuda);
        DesktopPane_Principal.add(ajuda);
        ajuda.moveToFront();
        ajuda.setVisible(true);
        ajuda.Centralizar();
    }//GEN-LAST:event_Menu_AjudaMousePressed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane_Principal;
    private javax.swing.JMenuItem MenuItem_Animais;
    private javax.swing.JMenuItem MenuItem_Clientes;
    private javax.swing.JMenuItem MenuItem_Estoque;
    private javax.swing.JMenuItem MenuItem_Funcionarios;
    private javax.swing.JMenu Menu_Ajuda;
    private javax.swing.JMenu Menu_Cadastros;
    private javax.swing.JLabel Pricipal_Patinahs;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
