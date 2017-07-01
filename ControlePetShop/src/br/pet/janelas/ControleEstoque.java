package br.pet.janelas;

import br.pet.excecoes.Letras;
import br.pet.excecoes.Numeros;
import br.pet.getset.EstoqueGetSet;
import br.pet.listeners.ControleAction;
import br.pet.excecoes.LogExceptions;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class ControleEstoque extends javax.swing.JInternalFrame {

    private final ControleAction control = new ControleAction(this);
    private EstoqueGetSet estoque;
    private String DataAtual;
    private String Preco;
    private LogExceptions execao = new LogExceptions();

    private Double Big_Preco;
    private Date hoje;
    private SimpleDateFormat data;

    public ControleEstoque() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/br/pet/icones/estoque.png"));
        field_Idproduto.setDocument(new Numeros());
        field_quantidade.setDocument(new Numeros());

        field_nome_produto.setDocument(new Letras());
        field_fornecedor.setDocument(new Letras());

        botao_adicionar.addActionListener(control);
        botao_remover.addActionListener(control);
        botao_editar.addActionListener(control);
        botao_limpar_estoque.addActionListener(control);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        label_quantidade = new javax.swing.JLabel();
        label_preco = new javax.swing.JLabel();
        label_Idproduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_mostra_info = new javax.swing.JTable();
        label_fornecedor = new javax.swing.JLabel();
        field_nome_produto = new javax.swing.JTextField();
        field_fornecedor = new javax.swing.JTextField();
        field_preco = new javax.swing.JFormattedTextField();
        botao_adicionar = new javax.swing.JButton();
        botao_remover = new javax.swing.JButton();
        field_Idproduto = new javax.swing.JTextField();
        field_quantidade = new javax.swing.JTextField();
        label_nome_produto = new javax.swing.JLabel();
        botao_editar = new javax.swing.JButton();
        botao_limpar_estoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Controle de estoque");

        label_quantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_quantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cestinha.png"))); // NOI18N
        label_quantidade.setText("Quantidade");

        label_preco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_preco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/dinheiro.png"))); // NOI18N
        label_preco.setText("Preço");

        label_Idproduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Idproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/barcode.png"))); // NOI18N
        label_Idproduto.setText("IdProduto");

        tabela_mostra_info.setBackground(new java.awt.Color(234, 242, 240));
        tabela_mostra_info.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabela_mostra_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabela_mostra_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProduto", "Nome ", "Quantidade", "Preço", "Fornecedor", "Data da Compra", "QtdEstoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_mostra_info.setToolTipText("");
        tabela_mostra_info.setGridColor(new java.awt.Color(0, 153, 255));
        tabela_mostra_info.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tabela_mostra_info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_mostra_info.setSurrendersFocusOnKeystroke(true);
        tabela_mostra_info.getTableHeader().setReorderingAllowed(false);
        tabela_mostra_info.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabela_mostra_info);

        label_fornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/fornecedor.png"))); // NOI18N
        label_fornecedor.setText("Fornecedor");

        field_nome_produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        field_fornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        field_preco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        botao_adicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/table_add.png"))); // NOI18N
        botao_adicionar.setText("Adicionar");
        botao_adicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botao_remover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/remove_tabela.png"))); // NOI18N
        botao_remover.setText("Remover");
        botao_remover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_remover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        field_Idproduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_Idproduto.setPreferredSize(new java.awt.Dimension(6, 20));

        field_quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_nome_produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_nome_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/text.png"))); // NOI18N
        label_nome_produto.setText("Nome do produto");

        botao_editar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/editar_tabela.png"))); // NOI18N
        botao_editar.setText("Editar");
        botao_editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_editarActionPerformed(evt);
            }
        });

        botao_limpar_estoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_limpar_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/limpar_tabela.PNG"))); // NOI18N
        botao_limpar_estoque.setText("Limpar");
        botao_limpar_estoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_limpar_estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(botao_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_Idproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(label_Idproduto)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_nome_produto))
                                .addGap(18, 18, 18)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_quantidade))
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(field_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(field_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(label_preco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGap(28, 28, 28))))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Idproduto)
                    .addComponent(label_quantidade)
                    .addComponent(label_nome_produto)
                    .addComponent(label_preco)
                    .addComponent(label_fornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_Idproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton botao_adicionar;
    private javax.swing.JButton botao_editar;
    private javax.swing.JButton botao_limpar_estoque;
    private javax.swing.JButton botao_remover;
    private javax.swing.JTextField field_Idproduto;
    private javax.swing.JTextField field_fornecedor;
    private javax.swing.JTextField field_nome_produto;
    private javax.swing.JFormattedTextField field_preco;
    private javax.swing.JTextField field_quantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Idproduto;
    private javax.swing.JLabel label_fornecedor;
    private javax.swing.JLabel label_nome_produto;
    private javax.swing.JLabel label_preco;
    private javax.swing.JLabel label_quantidade;
    private javax.swing.JTable tabela_mostra_info;
    // End of variables declaration//GEN-END:variables

    public EstoqueGetSet getestoq() {
        estoque = new EstoqueGetSet();

        //O codigo a baixo, pega a data atual do sistema
        hoje = new Date();
        data = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = data.format(hoje);

        Preco = field_preco.getText().replaceAll("[.]", "");
        Preco = Preco.replaceAll("[,]", ".");
        if (field_preco.getText().trim().isEmpty() || field_quantidade.getText().trim().isEmpty() || field_nome_produto.getText().trim().isEmpty()
                || field_Idproduto.getText().trim().isEmpty() || field_fornecedor.getText().trim().isEmpty()) {
            estoque = null;
        } else {

            try{
            Big_Preco = Double.parseDouble(Preco);
            estoque.setId_produto(Long.parseLong(field_Idproduto.getText()));
            estoque.setQantAdd(Long.parseLong(field_quantidade.getText()));

            }
            catch(NumberFormatException ex){
            
                estoque = null;
                execao.exception(ex);
                return estoque;
            }
            catch(Exception ex){
                
            }
            estoque.setPreco(Big_Preco);

            estoque.setPrecoStr(field_preco.getText());
            estoque.setData(DataAtual);
            estoque.setNome_Produto(field_nome_produto.getText().trim());
            estoque.setFornecedor(field_fornecedor.getText().trim());
            limpa();
            field_Idproduto.requestFocus();
        }
        return estoque;
    }

    public JTable getTabela() {

        return tabela_mostra_info;

    }

    public void limpa() {
        field_fornecedor.setText(null);
        field_quantidade.setText(null);
        field_nome_produto.setText(null);
        field_Idproduto.setText(null);
        field_preco.setText(null);
        field_preco.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }

    public void Editar(EstoqueGetSet estoq) {

        field_Idproduto.setText(estoq.getId_produto() + "");
        field_fornecedor.setText(estoq.getFornecedor());
        field_nome_produto.setText(estoq.getNome_Produto());
        field_preco.setText(estoq.getPrecoStr());
        field_quantidade.setText(estoq.getQantAdd() + "");

    }

}
