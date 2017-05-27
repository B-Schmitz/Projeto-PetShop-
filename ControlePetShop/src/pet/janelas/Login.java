package pet.janelas;

import pet.listeners.LoginAction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pet.log.Log;
import pet.excecoes.LogExceptions;
import pet.getset.UsuarioGetSet;

public class Login extends javax.swing.JFrame {

    private UsuarioGetSet usuario = new UsuarioGetSet();
    private LogExceptions execao = new LogExceptions();
    private LoginAction login = new LoginAction(this);
    private Log log = new Log();
    private String senha_nova, senha_atual = "admin";
    private String user;
    private final ImageIcon icone;
    private Principal p;
    private static String linha;

    public Login() {

        initComponents();
        try {
            ler();
            field_usuario.setText(linha);
        } catch (IOException ex) {
        }
        user = linha;
        log.setUser(user);

        icone = new ImageIcon("src/pet/icones/bigdog.png");

        // Configurações da Janela
        this.setResizable(false);
        this.setTitle("Login");
        this.setIconImage(icone.getImage());
        this.setLocationRelativeTo(null);

        botao_entrar.addActionListener(login);
        botao_cancelar.addActionListener(login);

    }

    public static void escrever(String user) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em questao.
        String a = "usuario.txt";
        FileWriter fileWriter = new FileWriter(a);
        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(user);
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }

    public static void ler() throws IOException {
        FileReader fileReader = new FileReader("usuario.txt");
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready()) {
                linha = bufferedReader.readLine();
            }
        }
    }

    public void Testa_Usuario() {
        user = field_usuario.getText();
        try {
            escrever(user);
        } catch (IOException e) {
            execao.exception(e);
        }
    }

    public void Testa_Senha() {
        senha_nova = new String(field_senha.getPassword());
        if (senha_nova.equals(senha_atual)) {
            log.setUser(user);

            try {
                Log.escrever("!Entrou");
            } catch (IOException ex) {
                execao.exception(ex);
            }
            p = new Principal();
            p.setVisible(true);
            dispose();
        } else {
            field_senha.setText("");
            JOptionPane.showMessageDialog(null, "Por favor, informe senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/pet/icones/erro.png"));
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
        label_alterar_senha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        Jpanel.setBackground(new java.awt.Color(115, 59, 30));

        field_usuario.setToolTipText("Informe seu nome de usúario");

        label_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 255, 255));
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/user.png"))); // NOI18N
        label_user.setText("Nome de usúario");

        botao_entrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/entrar.png"))); // NOI18N
        botao_entrar.setText("Entrar");
        botao_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/sair.png"))); // NOI18N
        botao_cancelar.setText("Cancelar");
        botao_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        field_senha.setText("admin");
        field_senha.setToolTipText("Informe sua senha");

        label_logo.setForeground(new java.awt.Color(255, 204, 0));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/bigdog.png"))); // NOI18N
        label_logo.setText("PetControl");

        label_senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_senha.setForeground(new java.awt.Color(255, 255, 255));
        label_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/senha.png"))); // NOI18N
        label_senha.setText("Senha");

        label_alterar_senha.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        label_alterar_senha.setForeground(new java.awt.Color(255, 255, 255));
        label_alterar_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/config.png"))); // NOI18N
        label_alterar_senha.setText("Alterar senha");
        label_alterar_senha.setToolTipText("Alterar senha de usúario");
        label_alterar_senha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_alterar_senha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label_alterar_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_alterar_senhaMouseClicked(evt);
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
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_user)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(label_senha)
                                .addGap(18, 18, 18)
                                .addComponent(label_alterar_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(label_logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_user)
                .addGap(1, 1, 1)
                .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(label_alterar_senha))
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

    private void label_alterar_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_alterar_senhaMouseClicked
        /*
        Esquema básico sem uso de salvamento externo ou BD para uma senha.
        Também não sei se pode por MouseClicked, como não
        é algo que o professor solicitou, deixei assim mesmo.
         */
        senha_nova = JOptionPane.showInputDialog(null, "Informe a senha atual", "Alterar senha", 1);
        try {
            if (senha_nova.equals(senha_atual)) {
                senha_atual = JOptionPane.showInputDialog(null, "Informe uma nova senha", "Alterar senha", 1);
                if (senha_atual.trim().isEmpty()) {
                    senha_atual = senha_nova; // Recebe senha anterior ou seja não muda.
                    JOptionPane.showMessageDialog(null, "A senha não pode estar vazia", "Alteração não efetuada", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/pet/icones/erro.png"));
                } else if (!senha_atual.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Senha modificada", "Alteração efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/pet/icones/aceito.png"));
                    try {
                        Log.escrever("!Alterou a senha");
                    } catch (IOException ex) {
                        execao.exception(ex);
                    }
                } else {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, informe a senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/pet/icones/erro.png"));
            }
        } catch (Exception ex) {
            senha_atual = senha_nova;
        }
    }//GEN-LAST:event_label_alterar_senhaMouseClicked

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
    private javax.swing.JLabel label_alterar_senha;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_user;
    // End of variables declaration//GEN-END:variables
}
