package Janelas;

import actionListener.LoginAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final LoginAction login = new LoginAction(this);
    private String senha_nova, senha_atual = "admin";

    public Login() {

        initComponents();
        ImageIcon icone = new ImageIcon("src/Icones/bigdog.png");

        // Configurações da Janela
        this.setResizable(false);
        field_senha.grabFocus();
        this.setTitle("Login");
        this.setIconImage(icone.getImage());
        this.setLocationRelativeTo(null);

        Entrar.addActionListener(login);
        Cancelar.addActionListener(login);

    }

    public void Testa_Senha() {
        senha_nova = new String(field_senha.getPassword());
        if (senha_nova.equals(senha_atual)) {
            Principal p = new Principal();
            p.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, informe senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        field_user = new javax.swing.JTextField();
        label_user = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        field_senha = new javax.swing.JPasswordField();
        label_logo = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        label_trocar_senha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(115, 59, 30));

        field_user.setText("admin");
        field_user.setToolTipText("Informe seu nome de usúario");

        label_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 255, 255));
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N
        label_user.setText("Nome de usúario");

        Entrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/entrar.png"))); // NOI18N
        Entrar.setText("Entrar");
        Entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        field_senha.setToolTipText("Informe sua senha");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_logo)
                                .addComponent(label_user))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_senha)
                                .addGap(18, 18, 18)
                                .addComponent(label_trocar_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo)
                .addGap(11, 11, 11)
                .addComponent(label_user)
                .addGap(1, 1, 1)
                .addComponent(field_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(label_trocar_senha))
                .addGap(1, 1, 1)
                .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Entrar;
    private javax.swing.JPasswordField field_senha;
    private javax.swing.JTextField field_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_trocar_senha;
    private javax.swing.JLabel label_user;
    // End of variables declaration//GEN-END:variables
}
