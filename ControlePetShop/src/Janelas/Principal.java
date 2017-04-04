package Janelas;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    Clientes c_cliente = new Clientes();
    Funcionarios funcionario = new Funcionarios();
    Animal animal = new Animal();
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

    public void Janela(JInternalFrame frame) {
        DesktopPane_Principal.remove(frame);
        DesktopPane_Principal.add(frame);
        frame.moveToFront();
        frame.setVisible(true);
        Centralizar(frame);

    }

    public void Centralizar(JInternalFrame frame) {
        Dimension d = frame.getDesktopPane().getSize();
        frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane_Principal = new javax.swing.JDesktopPane();
        label_patinhas = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        menu_cliente = new javax.swing.JMenuItem();
        menu_funcionario = new javax.swing.JMenuItem();
        menu_animal = new javax.swing.JMenuItem();
        menu_estoque = new javax.swing.JMenuItem();
        menu_ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPane_Principal.setBackground(new java.awt.Color(240, 240, 240));
        DesktopPane_Principal.setForeground(new java.awt.Color(240, 240, 240));
        DesktopPane_Principal.setToolTipText("");

        label_patinhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pegadas.png"))); // NOI18N

        DesktopPane_Principal.setLayer(label_patinhas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPane_PrincipalLayout = new javax.swing.GroupLayout(DesktopPane_Principal);
        DesktopPane_Principal.setLayout(DesktopPane_PrincipalLayout);
        DesktopPane_PrincipalLayout.setHorizontalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 917, Short.MAX_VALUE)
        );
        DesktopPane_PrincipalLayout.setVerticalGroup(
            DesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 609, Short.MAX_VALUE)
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

        jMenuBar1.add(menu_cadastros);

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ajuda.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");
        menu_ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_ajudaMousePressed(evt);
            }
        });
        jMenuBar1.add(menu_ajuda);

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

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        Janela(c_cliente);
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void menu_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_funcionarioActionPerformed
        Janela(funcionario);
    }//GEN-LAST:event_menu_funcionarioActionPerformed

    private void menu_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_animalActionPerformed
        Janela(animal);
    }//GEN-LAST:event_menu_animalActionPerformed

    private void menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_estoqueActionPerformed
        Janela(controle);
    }//GEN-LAST:event_menu_estoqueActionPerformed

    private void menu_ajudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ajudaMousePressed
        Janela(ajuda);
    }//GEN-LAST:event_menu_ajudaMousePressed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label_patinhas;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenuItem menu_animal;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenuItem menu_cliente;
    private javax.swing.JMenuItem menu_estoque;
    private javax.swing.JMenuItem menu_funcionario;
    // End of variables declaration//GEN-END:variables
}
