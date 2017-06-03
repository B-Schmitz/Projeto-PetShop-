package br.pet.janelas;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import br.pet.excecoes.LogExceptions;

public class Ajuda extends javax.swing.JInternalFrame {

    private final LogExceptions execao = new LogExceptions();

    public Ajuda() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/br/pet/icones/ajuda.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        label_duarte = new javax.swing.JLabel();
        label_michael = new javax.swing.JLabel();
        label_icones = new javax.swing.JLabel();
        label_descrição = new javax.swing.JLabel();
        label_clientes = new javax.swing.JLabel();
        label_funcionarios = new javax.swing.JLabel();
        label_animais = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_estoque = new javax.swing.JLabel();
        label_programadores = new javax.swing.JLabel();
        label_bernardo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        label_programadores1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ajuda");

        Jpanel.setBackground(new java.awt.Color(82, 63, 33));

        label_duarte.setForeground(new java.awt.Color(255, 255, 255));
        label_duarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/ironman.png"))); // NOI18N
        label_duarte.setText("Duarte");

        label_michael.setForeground(new java.awt.Color(255, 255, 255));
        label_michael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/batman.png"))); // NOI18N
        label_michael.setText("Michael");

        label_icones.setForeground(new java.awt.Color(0, 204, 51));
        label_icones.setText("www.fatcow.com/free-icons");
        label_icones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_icones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconesMouseClicked(evt);
            }
        });

        label_descrição.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_descrição.setForeground(new java.awt.Color(255, 255, 255));
        label_descrição.setText("Software para gestão e controle de um PetShop");

        label_clientes.setForeground(new java.awt.Color(255, 255, 255));
        label_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cliente.png"))); // NOI18N
        label_clientes.setText("Cadastro de clientes");

        label_funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        label_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/funcionario.png"))); // NOI18N
        label_funcionarios.setText("Cadastro de funcionários");

        label_animais.setForeground(new java.awt.Color(255, 255, 255));
        label_animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/dog.png"))); // NOI18N
        label_animais.setText("Cadastro de animais");

        label_logo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 204, 0));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/bigdog.png"))); // NOI18N
        label_logo.setText("PetControl");

        label_estoque.setForeground(new java.awt.Color(255, 255, 255));
        label_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/estoque.png"))); // NOI18N
        label_estoque.setText("Controle de estoque");

        label_programadores.setForeground(new java.awt.Color(255, 204, 0));
        label_programadores.setText("Programadores");

        label_bernardo.setForeground(new java.awt.Color(255, 255, 255));
        label_bernardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/spider.png"))); // NOI18N
        label_bernardo.setText("Bernardo");

        label_programadores1.setForeground(new java.awt.Color(255, 204, 0));
        label_programadores1.setText("Funcionalidades do Sistema");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Versão: 2.0");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(label_logo))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(label_descrição))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_programadores1))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_estoque)
                            .addComponent(label_animais)
                            .addComponent(label_funcionarios)
                            .addComponent(label_clientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_michael)
                            .addComponent(label_duarte)
                            .addComponent(label_bernardo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(label_programadores))
                        .addGap(20, 20, 20))))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_icones))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_logo)
                .addGap(6, 6, 6)
                .addComponent(label_descrição)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(label_programadores1)
                .addGap(6, 6, 6)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(label_clientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_funcionarios)
                                .addGap(4, 4, 4)
                                .addComponent(label_animais)
                                .addGap(4, 4, 4)
                                .addComponent(label_estoque)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label_programadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(label_michael))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(label_duarte))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_bernardo))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(label_icones))
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

    private void label_iconesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconesMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://www.fatcow.com/free-icons"));
        } catch (URISyntaxException | IOException ex) {
            execao.exception(ex);
        }

    }//GEN-LAST:event_label_iconesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label_animais;
    private javax.swing.JLabel label_bernardo;
    private javax.swing.JLabel label_clientes;
    private javax.swing.JLabel label_descrição;
    private javax.swing.JLabel label_duarte;
    private javax.swing.JLabel label_estoque;
    private javax.swing.JLabel label_funcionarios;
    private javax.swing.JLabel label_icones;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_michael;
    private javax.swing.JLabel label_programadores;
    private javax.swing.JLabel label_programadores1;
    // End of variables declaration//GEN-END:variables

}
