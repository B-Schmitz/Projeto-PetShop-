package Janelas;

import actionListener.LoginAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final LoginAction login = new LoginAction(this);
    private String senha_nova, senha_atual = "admin";
    private ImageIcon icone;
    private Principal p;

    public Login() {

        initComponents();
        icone = new ImageIcon("src/Icones/bigdog.png");

        // Configurações da Janela
        this.setResizable(false);
        field_senha.grabFocus();
        this.setTitle("Login");
        this.setIconImage(icone.getImage());
        this.setLocationRelativeTo(null);

        botao_entrar.addActionListener(login);
        botao_cancelar.addActionListener(login);

    }

    public void Testa_Senha() {
        senha_nova = new String(field_senha.getPassword());
        if (senha_nova.equals(senha_atual)) {
            p = new Principal();
            p.setVisible(true);
            dispose();
        } else {
            field_senha.setText("");
            JOptionPane.showMessageDialog(null, "Por favor, informe senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        field_usuario = new javax.swing.JTextField();
        label_user = new javax.swing.JLabel();
        botao_entrar = new javax.swing.JButton();
        botao_cancelar = new javax.swing.JButton();
        field_senha = new javax.swing.JPasswordField();
        label_logo = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        label_trocar_senha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        Jpanel.setBackground(new java.awt.Color(115, 59, 30));

        field_usuario.setText("admin");
        field_usuario.setToolTipText("Informe seu nome de usúario");

        label_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 255, 255));
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N
        label_user.setText("Nome de usúario");

        botao_entrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/entrar.png"))); // NOI18N
        botao_entrar.setText("Entrar");
        botao_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        botao_cancelar.setText("Cancelar");
        botao_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        field_senha.setText("admin");
        field_senha.setToolTipText("Informe sua senha");
        field_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_senhaActionPerformed(evt);
            }
        });

        label_logo.setForeground(new java.awt.Color(255, 204, 0));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bigdog.png"))); // NOI18N
        label_logo.setText("PetControl");

        label_senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_senha.setForeground(new java.awt.Color(255, 255, 255));
        label_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/senha.png"))); // NOI18N
        label_senha.setText("Senha");

        label_trocar_senha.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        label_trocar_senha.setForeground(new java.awt.Color(255, 255, 255));
        label_trocar_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/config.png"))); // NOI18N
        label_trocar_senha.setText("Trocar senha");
        label_trocar_senha.setToolTipText("Alterar senha de usúario");
        label_trocar_senha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_trocar_senha.setDisabledIcon(null);
        label_trocar_senha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label_trocar_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_trocar_senhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addComponent(botao_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_logo)
                                .addComponent(label_user))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(label_senha)
                                .addGap(18, 18, 18)
                                .addComponent(label_trocar_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo)
                .addGap(11, 11, 11)
                .addComponent(label_user)
                .addGap(1, 1, 1)
                .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(label_trocar_senha))
                .addGap(1, 1, 1)
                .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_trocar_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_trocar_senhaMouseClicked
        /*
         Esquema básico sem uso de salvamento externo ou BD para uma senha.
         Também não sei se pode por MouseClicked, como não
         é algo que o professor solicitou, deixei assim mesmo.
         */
        senha_nova = JOptionPane.showInputDialog(null, "Informe a senha atual", "Trocar senha", 1);
        if (senha_nova.equals(senha_atual)) {
            senha_atual = JOptionPane.showInputDialog(null, "Informe uma nova senha", "Trocar senha", 1);
            if (senha_atual == null || senha_atual.equals("")) {
                senha_atual = senha_nova; // Recebe senha anterior ou seja não muda.
                JOptionPane.showMessageDialog(null, "A senha não pode estar vazia", "Troca não efetuada", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
            } else if (senha_atual != null || !"".equals(senha_atual)) {
                JOptionPane.showMessageDialog(null, "Senha modificada", "Troca efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/Icones/aceito.png"));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, informe a senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
        }
    }//GEN-LAST:event_label_trocar_senhaMouseClicked

    private void field_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_senhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JButton botao_entrar;
    private javax.swing.JPasswordField field_senha;
    private javax.swing.JTextField field_usuario;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_trocar_senha;
    private javax.swing.JLabel label_user;
    // End of variables declaration//GEN-END:variables
}
