
package Janelas;
// TESTE COMMIT TESTANDO
import javax.swing.ImageIcon;

public class Ajuda extends javax.swing.JInternalFrame {

    public Ajuda() {
        initComponents();
         this.setFrameIcon(new ImageIcon("src/Icones/ajuda.png"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_duarte1 = new javax.swing.JLabel();
        label_michael1 = new javax.swing.JLabel();
        label_icones1 = new javax.swing.JLabel();
        label_descrição1 = new javax.swing.JLabel();
        label_clientes1 = new javax.swing.JLabel();
        label_funcionarios1 = new javax.swing.JLabel();
        label_animais1 = new javax.swing.JLabel();
        label_logo1 = new javax.swing.JLabel();
        label_estoque1 = new javax.swing.JLabel();
        label_programadores1 = new javax.swing.JLabel();
        label_bernardo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Ajuda");

        jPanel1.setBackground(new java.awt.Color(115, 59, 30));

        label_duarte1.setForeground(new java.awt.Color(255, 255, 255));
        label_duarte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ironman.png"))); // NOI18N
        label_duarte1.setText("Duarte");

        label_michael1.setForeground(new java.awt.Color(255, 255, 255));
        label_michael1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/batman.png"))); // NOI18N
        label_michael1.setText("Michael");

        label_icones1.setForeground(new java.awt.Color(255, 255, 255));
        label_icones1.setText("www.fatcow.com/free-icons");

        label_descrição1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_descrição1.setForeground(new java.awt.Color(255, 255, 255));
        label_descrição1.setText("Software para gestão e controle de um PetShop");

        label_clientes1.setForeground(new java.awt.Color(255, 255, 255));
        label_clientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        label_clientes1.setText("Cadastro de clientes");

        label_funcionarios1.setForeground(new java.awt.Color(255, 255, 255));
        label_funcionarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funcionario.png"))); // NOI18N
        label_funcionarios1.setText("Cadastro de funcionários");

        label_animais1.setForeground(new java.awt.Color(255, 255, 255));
        label_animais1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dog.png"))); // NOI18N
        label_animais1.setText("Cadastro de animais");

        label_logo1.setForeground(new java.awt.Color(255, 204, 0));
        label_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bigdog.png"))); // NOI18N
        label_logo1.setText("PetControl");

        label_estoque1.setForeground(new java.awt.Color(255, 255, 255));
        label_estoque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estoque.png"))); // NOI18N
        label_estoque1.setText("Controle de estoque");

        label_programadores1.setForeground(new java.awt.Color(255, 255, 255));
        label_programadores1.setText("Programadores");

        label_bernardo1.setForeground(new java.awt.Color(255, 255, 255));
        label_bernardo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/spider.png"))); // NOI18N
        label_bernardo1.setText("Bernardo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_clientes1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_estoque1)
                            .addComponent(label_funcionarios1)
                            .addComponent(label_animais1)
                            .addComponent(label_icones1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_michael1)
                                    .addComponent(label_duarte1)
                                    .addComponent(label_bernardo1))
                                .addGap(9, 9, 9))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_programadores1)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_logo1)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 80, Short.MAX_VALUE)
                .addComponent(label_descrição1)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_descrição1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_clientes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_funcionarios1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_animais1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_programadores1)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_estoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_icones1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label_bernardo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_duarte1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_michael1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_animais1;
    private javax.swing.JLabel label_bernardo1;
    private javax.swing.JLabel label_clientes1;
    private javax.swing.JLabel label_descrição1;
    private javax.swing.JLabel label_duarte1;
    private javax.swing.JLabel label_estoque1;
    private javax.swing.JLabel label_funcionarios1;
    private javax.swing.JLabel label_icones1;
    private javax.swing.JLabel label_logo1;
    private javax.swing.JLabel label_michael1;
    private javax.swing.JLabel label_programadores1;
    // End of variables declaration//GEN-END:variables
}
