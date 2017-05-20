package Janelas;

import Exceções.Letras;
import Exceções.Numeros;
import Get_Set.Estoque_Get_Set;
import ActionListeners.ControleAction;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class ControleEstoque extends javax.swing.JInternalFrame {

    private final ControleAction control = new ControleAction(this);
    private Estoque_Get_Set estoque;
    private String DataAtual;
    private String Preco;

    private Double Big_Preco;
    private Date hoje;
    private SimpleDateFormat data;

    public ControleEstoque() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/Icones/estoque.png"));
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
        label_quantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cestinha.png"))); // NOI18N
        label_quantidade.setText("Quantidade");

        label_preco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_preco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dinheiro.png"))); // NOI18N
        label_preco.setText("Preço");

        label_Idproduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Idproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/barcode.png"))); // NOI18N
        label_Idproduto.setText("IdProduto");

        tabela_mostra_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabela_mostra_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProduto", "Nome ", "Quantade", "Preço", "Fornecedor", "Data da Compra", "Qtd Estoque"
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
        tabela_mostra_info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_mostra_info.setSurrendersFocusOnKeystroke(true);
        tabela_mostra_info.getTableHeader().setReorderingAllowed(false);
        tabela_mostra_info.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabela_mostra_info);

        label_fornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fornecedor.png"))); // NOI18N
        label_fornecedor.setText("Fornecedor");

        field_nome_produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        field_fornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        field_preco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        botao_adicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/table_add.png"))); // NOI18N
        botao_adicionar.setText("Adicionar");
        botao_adicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_remover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove_tabela.png"))); // NOI18N
        botao_remover.setText("Remover");
        botao_remover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        field_Idproduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_Idproduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_IdprodutoKeyReleased(evt);
            }
        });

        field_quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_nome_produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_nome_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/text.png"))); // NOI18N
        label_nome_produto.setText("Nome do produto");

        botao_editar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar_tabela.png"))); // NOI18N
        botao_editar.setText("Editar");
        botao_editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_limpar_estoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_limpar_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/limpar_tabela.PNG"))); // NOI18N
        botao_limpar_estoque.setText("Limpar");
        botao_limpar_estoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(botao_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_Idproduto)
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
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
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
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_IdprodutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_IdprodutoKeyReleased

    }//GEN-LAST:event_field_IdprodutoKeyReleased


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

    public Estoque_Get_Set getestoq() {
        estoque = new Estoque_Get_Set();

        //O codigo a baixo, pega a data atual do sistema
        hoje = new Date();
        data = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = data.format(hoje);

        Preco = field_preco.getText().replaceAll("[.]", "");
        Preco = Preco.replaceAll("[,]", ".");
        if (field_preco.getText().isEmpty() || field_quantidade.getText().isEmpty() || field_nome_produto.getText().isEmpty()
                || field_Idproduto.getText().isEmpty() || field_fornecedor.getText().isEmpty()) {
            estoque = null;
        } else {

            Big_Preco = Double.parseDouble(Preco);
            estoque.setPreco(Big_Preco);

            estoque.setPrecoStr(field_preco.getText());
            estoque.setData(DataAtual);
            estoque.setId_produto(Long.parseLong(field_Idproduto.getText()));
            estoque.setNome_Produto(field_nome_produto.getText().trim());
            estoque.setQantAdd(Integer.parseInt(field_quantidade.getText()));
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
    }

    public void Editar(Estoque_Get_Set estoq) {

        field_Idproduto.setText(estoq.getId_produto() + "");
        field_fornecedor.setText(estoq.getFornecedor());
        field_nome_produto.setText(estoq.getNome_Produto());
        field_preco.setText(estoq.getPrecoStr());
        field_quantidade.setText(estoq.getQantAdd() + "");

    }

}
