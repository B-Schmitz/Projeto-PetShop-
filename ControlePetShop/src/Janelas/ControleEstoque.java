package Janelas;

import Exceções.TeclasPermitidas;
import Get_Set.Estoque_Get_Set;
import actionListener.ControleAction;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleEstoque extends javax.swing.JInternalFrame {

    private final ControleAction control = new ControleAction(this);
    private String DataAtual;

    public ControleEstoque() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/Icones/estoque.png"));
        TextField_Id_Produto.setDocument(new TeclasPermitidas());
        TextField_Quant.setDocument(new TeclasPermitidas());

        botao_adicionar.addActionListener(control);
        botao_excluir.addActionListener(control);
        botao_limpar_estoque.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_Quantidade = new javax.swing.JLabel();
        Label_DataCompra = new javax.swing.JLabel();
        Label_Id_Produto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Mostra_info = new javax.swing.JTable();
        Label_Fornecedor = new javax.swing.JLabel();
        TextField_Nome_Produto = new javax.swing.JTextField();
        TextField_Fornecedor = new javax.swing.JTextField();
        FormattedTextField_data = new javax.swing.JFormattedTextField();
        botao_adicionar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        TextField_Id_Produto = new javax.swing.JTextField();
        TextField_Quant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botao_limpar_estoque = new javax.swing.JButton();

        setClosable(true);
        setTitle("Controle de estoque");

        Label_Quantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Quantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cestinha.png"))); // NOI18N
        Label_Quantidade.setText("Quantidade");

        Label_DataCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_DataCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/calendario.png"))); // NOI18N
        Label_DataCompra.setText("Data da compra");

        Label_Id_Produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Id_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/barcode.png"))); // NOI18N
        Label_Id_Produto.setText("Id do produto");

        Table_Mostra_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table_Mostra_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Produto", "Nome ", "Quant.", "Data Compra", "Fornecedor", "Quant. em Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        FormattedTextField_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            FormattedTextField_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botao_adicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/add.png"))); // NOI18N
        botao_adicionar.setText("Adicionar");
        botao_adicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_excluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove.png"))); // NOI18N
        botao_excluir.setText("Remover");
        botao_excluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextField_Id_Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextField_Quant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/text.png"))); // NOI18N
        jLabel3.setText("Nome do produto");

        botao_limpar_estoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_limpar_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/limpar.png"))); // NOI18N
        botao_limpar_estoque.setText("Limpar");
        botao_limpar_estoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextField_Id_Produto)
                                .addComponent(Label_Id_Produto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextField_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextField_Quant)
                                    .addComponent(Label_Quantidade))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_DataCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FormattedTextField_data, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(Label_Fornecedor))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(TextField_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(botao_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Id_Produto)
                    .addComponent(Label_Quantidade)
                    .addComponent(jLabel3)
                    .addComponent(Label_DataCompra)
                    .addComponent(Label_Fornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Id_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormattedTextField_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_limpar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTextField_data;
    private javax.swing.JLabel Label_DataCompra;
    private javax.swing.JLabel Label_Fornecedor;
    private javax.swing.JLabel Label_Id_Produto;
    private javax.swing.JLabel Label_Quantidade;
    private javax.swing.JTable Table_Mostra_info;
    private javax.swing.JTextField TextField_Fornecedor;
    private javax.swing.JTextField TextField_Id_Produto;
    private javax.swing.JTextField TextField_Nome_Produto;
    private javax.swing.JTextField TextField_Quant;
    private javax.swing.JButton botao_adicionar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_limpar_estoque;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public Estoque_Get_Set getestoq() {
        Estoque_Get_Set estoque = new Estoque_Get_Set();

        //O codigo a baixo, pega a data atual do sistema
        Date hoje = new Date();
        SimpleDateFormat data;
        data = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = data.format(hoje);
        //estoque.setData(FormattedTextField_data.getText());
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
        FormattedTextField_data.setText(null);
    }

    public void setExcluitabela(int row) {
        ((DefaultTableModel) Table_Mostra_info.getModel()).removeRow(row);
    }

}
