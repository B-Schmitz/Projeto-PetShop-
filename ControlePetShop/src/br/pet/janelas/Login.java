package br.pet.janelas;

import br.pet.listeners.LoginAction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.pet.log.Log;
import br.pet.excecoes.LogExceptions;
import java.awt.HeadlessException;
import javax.swing.event.AncestorListener;

public class Login extends javax.swing.JFrame {

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

        icone = new ImageIcon("src/br/pet/icones/bigdog.png");

        // Configurações da Janela
        this.setResizable(false);
        this.setTitle("Login");
        this.setIconImage(icone.getImage());
        this.setLocationRelativeTo(null);

        botao_entrar.addActionListener(login);
        botao_cancelar.addActionListener(login);
        botao_alterar_senha.addActionListener(login);

    }

    public static void escrever(String user) throws IOException {
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
            JOptionPane.showMessageDialog(null, "Por favor, informe senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
        }
    }
    
    public void AlterarSenha(){
        
        password.setText(null);
        password2.setText(null);

        try {
            password2.setEchoChar('*');
            JOptionPane.showMessageDialog(null, painel_senha2, "Alterar Senha", JOptionPane.PLAIN_MESSAGE);
            senha_nova = password2.getText();

            if (senha_nova.equals(senha_atual)) {

                password.setEchoChar('*');
                JOptionPane.showMessageDialog(null, painel_senha, "Alterar Senha", JOptionPane.PLAIN_MESSAGE);
                senha_atual = password.getText();

                if (senha_atual.trim().isEmpty()) {
                    senha_atual = senha_nova; // Recebe senha anterior ou seja não muda.
                    JOptionPane.showMessageDialog(null, "A senha não pode estar vazia", "Alteração não efetuada", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                } else {
                    JOptionPane.showMessageDialog(null, "Senha modificada", "Alteração efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    try {
                        Log.escrever("!Alterou a senha");
                    } catch (IOException ex) {
                        execao.exception(ex);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, informe a senha correta", "Senha incorreta", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        } catch (HeadlessException ex) {
            senha_atual = senha_nova;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_senha = new javax.swing.JPanel();
        rotulo = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        painel_senha2 = new javax.swing.JPanel();
        rotulo2 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        Jpanel = new javax.swing.JPanel();
        field_usuario = new javax.swing.JTextField();
        label_user = new javax.swing.JLabel();
        botao_entrar = new javax.swing.JButton();
        botao_cancelar = new javax.swing.JButton();
        field_senha = new javax.swing.JPasswordField();
        label_logo = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        botao_alterar_senha = new javax.swing.JButton();

        rotulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/senha.png"))); // NOI18N
        rotulo.setText("Informe a senha nova");

        javax.swing.GroupLayout painel_senhaLayout = new javax.swing.GroupLayout(painel_senha);
        painel_senha.setLayout(painel_senhaLayout);
        painel_senhaLayout.setHorizontalGroup(
            painel_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_senhaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(rotulo)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(painel_senhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password)
                .addContainerGap())
        );
        painel_senhaLayout.setVerticalGroup(
            painel_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_senhaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(rotulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        rotulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/senha.png"))); // NOI18N
        rotulo2.setText("Informe a senha atual");

        javax.swing.GroupLayout painel_senha2Layout = new javax.swing.GroupLayout(painel_senha2);
        painel_senha2.setLayout(painel_senha2Layout);
        painel_senha2Layout.setHorizontalGroup(
            painel_senha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_senha2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(rotulo2)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(painel_senha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password2)
                .addContainerGap())
        );
        painel_senha2Layout.setVerticalGroup(
            painel_senha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_senha2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(rotulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        Jpanel.setBackground(new java.awt.Color(0, 51, 102));

        field_usuario.setToolTipText("Informe seu nome de usúario");

        label_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 204, 0));
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/user.png"))); // NOI18N
        label_user.setText("Nome de usúario");

        botao_entrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/entrar.png"))); // NOI18N
        botao_entrar.setText("Entrar");
        botao_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/sair.png"))); // NOI18N
        botao_cancelar.setText("Cancelar");
        botao_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        field_senha.setText("admin");
        field_senha.setToolTipText("Informe sua senha");

        label_logo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 204, 0));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/bigdog.png"))); // NOI18N
        label_logo.setText("PetControl");

        label_senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_senha.setForeground(new java.awt.Color(255, 204, 0));
        label_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/senha.png"))); // NOI18N
        label_senha.setText("Senha");

        botao_alterar_senha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botao_alterar_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/alterarsenha.png"))); // NOI18N
        botao_alterar_senha.setText("Alterar senha");
        botao_alterar_senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_alterar_senha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addComponent(label_senha)
                        .addGap(168, 168, 168)
                        .addComponent(botao_alterar_senha))
                    .addComponent(label_user)
                    .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelLayout.createSequentialGroup()
                            .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botao_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(field_senha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(label_logo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(label_senha))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_alterar_senha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton botao_alterar_senha;
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JButton botao_entrar;
    private javax.swing.JPasswordField field_senha;
    private javax.swing.JTextField field_usuario;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_user;
    private javax.swing.JPanel painel_senha;
    private javax.swing.JPanel painel_senha2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JLabel rotulo;
    private javax.swing.JLabel rotulo2;
    // End of variables declaration//GEN-END:variables
}
