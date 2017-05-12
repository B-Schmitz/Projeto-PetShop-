package Janelas;

import javax.swing.ImageIcon;

public class Ajuda extends javax.swing.JInternalFrame {

    public Ajuda() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/Icones/ajuda.png"));
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

        setClosable(true);
        setTitle("Ajuda");

        Jpanel.setBackground(new java.awt.Color(115, 59, 30));

        label_duarte.setForeground(new java.awt.Color(255, 255, 255));
        label_duarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ironman.png"))); // NOI18N
        label_duarte.setText("Duarte");

        label_michael.setForeground(new java.awt.Color(255, 255, 255));
        label_michael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/batman.png"))); // NOI18N
        label_michael.setText("Michael");

        label_icones.setForeground(new java.awt.Color(255, 255, 255));
        label_icones.setText("www.fatcow.com/free-icons");

        label_descrição.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_descrição.setForeground(new java.awt.Color(255, 255, 255));
        label_descrição.setText("Software para gestão e controle de um PetShop");

        label_clientes.setForeground(new java.awt.Color(255, 255, 255));
        label_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        label_clientes.setText("Cadastro de clientes");

        label_funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        label_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funcionario.png"))); // NOI18N
        label_funcionarios.setText("Cadastro de funcionários");

        label_animais.setForeground(new java.awt.Color(255, 255, 255));
        label_animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dog.png"))); // NOI18N
        label_animais.setText("Cadastro de animais");

        label_logo.setForeground(new java.awt.Color(255, 204, 0));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bigdog.png"))); // NOI18N
        label_logo.setText("PetControl");

        label_estoque.setForeground(new java.awt.Color(255, 255, 255));
        label_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estoque.png"))); // NOI18N
        label_estoque.setText("Controle de estoque");

        label_programadores.setForeground(new java.awt.Color(255, 255, 255));
        label_programadores.setText("Programadores");

        label_bernardo.setForeground(new java.awt.Color(255, 255, 255));
        label_bernardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/spider.png"))); // NOI18N
        label_bernardo.setText("Bernardo");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_clientes)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_estoque)
                            .addComponent(label_funcionarios)
                            .addComponent(label_animais)
                            .addComponent(label_icones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_michael)
                                    .addComponent(label_duarte)
                                    .addComponent(label_bernardo))
                                .addGap(9, 9, 9))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addComponent(label_programadores)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_logo)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                .addGap(34, 80, Short.MAX_VALUE)
                .addComponent(label_descrição)
                .addGap(62, 62, 62))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_descrição)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_funcionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_animais))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_programadores)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_estoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_icones))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label_bernardo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_duarte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_michael)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JSeparator jSeparator2;
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
    // End of variables declaration//GEN-END:variables

}
