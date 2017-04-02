package Janelas;

import Exceções.TeclasPermitidas;
import Get_Set.Estoque_Get_Set;
import actionListener.ControleAction;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleEstoque extends javax.swing.JInternalFrame {

    private final ControleAction control = new ControleAction(this);
    private String DataAtual;
    private String Info;
    private int Row;

    public ControleEstoque() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/Icones/estoque.png"));
        TextField_Id_Produto.setDocument(new TeclasPermitidas());
        TextField_Quant.setDocument(new TeclasPermitidas());

        botao_adicionar.addActionListener(control);
        botao_excluir.addActionListener(control);
        botao_editar.addActionListener(control);
        botao_limpar_estoque.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_Quantidade = new javax.swing.JLabel();
        Label_Preco = new javax.swing.JLabel();
        Label_Id_Produto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Mostra_info = new javax.swing.JTable();
        Label_Fornecedor = new javax.swing.JLabel();
        TextField_Nome_Produto = new javax.swing.JTextField();
        TextField_Fornecedor = new javax.swing.JTextField();
        FormattedTextField_Preco = new javax.swing.JFormattedTextField();
        botao_adicionar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        TextField_Id_Produto = new javax.swing.JTextField();
        TextField_Quant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botao_editar = new javax.swing.JButton();
        botao_limpar_estoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Controle de estoque");

        Label_Quantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Quantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cestinha.png"))); // NOI18N
        Label_Quantidade.setText("Quantidade");

        Label_Preco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Preco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dinheiro.png"))); // NOI18N
        Label_Preco.setText("Preço");

        Label_Id_Produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Id_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/barcode.png"))); // NOI18N
        Label_Id_Produto.setText("IdProduto");

        Table_Mostra_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table_Mostra_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProduto", "Nome ", "Quant.", "Preço", "Fornecedor", "Data Compra", "Qtd Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        Table_Mostra_info.setToolTipText("");
        Table_Mostra_info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Table_Mostra_info.setSurrendersFocusOnKeystroke(true);
        Table_Mostra_info.getTableHeader().setReorderingAllowed(false);
        Table_Mostra_info.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(Table_Mostra_info);

        Label_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fornecedor.png"))); // NOI18N
        Label_Fornecedor.setText("Fornecedor");

        TextField_Nome_Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextField_Fornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FormattedTextField_Preco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FormattedTextField_Preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        botao_adicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/table_add.png"))); // NOI18N
        botao_adicionar.setText("Adicionar");
        botao_adicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_excluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove_tabela.png"))); // NOI18N
        botao_excluir.setText("Remover");
        botao_excluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextField_Id_Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextField_Quant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/text.png"))); // NOI18N
        jLabel3.setText("Nome do produto");

        botao_editar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar_tabela.png"))); // NOI18N
        botao_editar.setText("Editar");
        botao_editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_limpar_estoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_limpar_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/limpar_tabela.PNG"))); // NOI18N
        botao_limpar_estoque.setText("Limpar");
        botao_limpar_estoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Id_Produto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Label_Id_Produto)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Quantidade))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(FormattedTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextField_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Label_Preco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Label_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Id_Produto)
                    .addComponent(Label_Quantidade)
                    .addComponent(jLabel3)
                    .addComponent(Label_Preco)
                    .addComponent(Label_Fornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Id_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormattedTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTextField_Preco;
    private javax.swing.JLabel Label_Fornecedor;
    private javax.swing.JLabel Label_Id_Produto;
    private javax.swing.JLabel Label_Preco;
    private javax.swing.JLabel Label_Quantidade;
    private javax.swing.JTable Table_Mostra_info;
    private javax.swing.JTextField TextField_Fornecedor;
    private javax.swing.JTextField TextField_Id_Produto;
    private javax.swing.JTextField TextField_Nome_Produto;
    private javax.swing.JTextField TextField_Quant;
    private javax.swing.JButton botao_adicionar;
    private javax.swing.JButton botao_editar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_limpar_estoque;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public Estoque_Get_Set getestoq() {
        Estoque_Get_Set estoque = new Estoque_Get_Set();

        //O codigo a baixo, pega a data atual do sistema
        Date hoje = new Date();
        SimpleDateFormat data;
        data = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = data.format(hoje);
        estoque.setPreco(FormattedTextField_Preco.getText());
        estoque.setData(DataAtual);
        estoque.setId_produto(TextField_Id_Produto.getText());
        estoque.setNome_Produto(TextField_Nome_Produto.getText());
        estoque.setQantAdd(TextField_Quant.getText());
        estoque.setFornecedor(TextField_Fornecedor.getText());

        return estoque;
    }

    public JTable getTabela() {
        limpa();
        return Table_Mostra_info;

    }

    public void limpa() {
        TextField_Fornecedor.setText(null);
        TextField_Quant.setText(null);
        TextField_Nome_Produto.setText(null);
        TextField_Id_Produto.setText(null);
        FormattedTextField_Preco.setText(null);
    }

    public void setExcluitabela(int row) {
        ((DefaultTableModel) Table_Mostra_info.getModel()).removeRow(row);
    }

    public void Editar() {

        Row = Table_Mostra_info.getSelectedRow();


        for (int i = 0 ;i < 5; i++) {

            Info = (String) Table_Mostra_info.getModel().getValueAt(Row, i);

            switch (i) {
                case 0:
                    TextField_Id_Produto.setText(Info);
                    break;
                case 1:
                    TextField_Nome_Produto.setText(Info);
                    break;
                case 2:
                    TextField_Quant.setText(Info);
                    break;
                case 3:
                    FormattedTextField_Preco.setText(Info);
                    break;
                case 4:
                    TextField_Fornecedor.setText(Info);
                    break;
            }
        }

        setExcluitabela(Table_Mostra_info.getSelectedRow());
         
    }
    
     public void Centralizar() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

}
