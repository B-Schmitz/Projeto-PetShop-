package actionListener;

import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import java.math.BigDecimal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleAction implements ActionListener {

    private ControleEstoque controle;

    private long Id, EmEstoque;
    private String nome;
    private String Fornecedor;
    private int QuantAdd;
    private String DataAtual;
    private String preco;
    private BigDecimal Preco;
    private Estoque_Get_Set estoq;
    private JTable tabela;
    private StringBuilder stringBuilder;
    private DefaultTableModel v;

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {

            estoq = controle.getestoq();

            // Se quando a funçao getestoq() for chamada e não hover nada nos capos de texto, ela retorna null e armazena em estoq
            // Se estoque estiver como null nao faz nada.
            if (estoq == null) {
                return;

            } //Se estoque nao estiver como null significa q todos os campos de texto estão preenchidos e serão adicionados a lista
            else {
                System.out.println(estoq.toString());
                Id = estoq.getId_produto();
                nome = estoq.getNome_Produto().trim();
                Fornecedor = estoq.getFornecedor().trim();
                QuantAdd = estoq.getQantAdd();
                DataAtual = estoq.getData();
                Preco = estoq.getPreco();
                preco = Preco + "";

                // Isso é pra tirar qualquer ponto que possa haver.
                //Foi feito dessa forma pois Double trabalha com ponto
                // em quanto o campo de texto de preço trabalha com virgula.
                preco = preco.replaceAll("[.]", "");

                //A partir daqui pontos serão adicionados correspondentes a mil, milhao bilhao .....
                //OBS: só é possivel trabalhar com 2 casas decimais
                //Foi utilizado a classe BigDecimal pois se o numero informado fosse muito grande
                //ele nao aparecia inteiro aparecia ex: 1,0E7 que causava conflito com essa funçao
                if (preco.length() > 5) {
                    int Tam = preco.length();
                    for (int i = 3; i < Tam - 1; i++) {

                        if (i % 3 == 1) {
                            stringBuilder = new StringBuilder(preco);
                            int a = 2;
                            a += (i - 1);
                            stringBuilder.insert(Tam - a, '.');

                            preco = stringBuilder.toString();

                        }
                    }

                }
                //Aqui é adicionado virgula antes dos dois numeros finais por ser em ponto flutuante.
                StringBuilder stringBuilder = new StringBuilder(preco);
                int a = 2;
                stringBuilder.insert(preco.length() - a, ',');

                preco = stringBuilder.toString();
                //isso a baixo é apenas pra teste
                EmEstoque = QuantAdd;

                tabela = controle.getTabela();

                v = (DefaultTableModel) tabela.getModel();

                v.addRow(new String[]{Id + "", nome, QuantAdd + "", preco, Fornecedor, DataAtual, EmEstoque + ""});

            }

        }

        if (e.getActionCommand().equals("Limpar")) {

            controle.limpa();

        }

        if (e.getActionCommand().equals("Remover")) {
            tabela = controle.getTabela();
            if (tabela.getSelectedRow() == -1) {
                return;

            } else {

                int i = tabela.getSelectedRow();
                controle.setExcluitabela(i);
            }
        }

        if (e.getActionCommand().equals("Editar")) {
            tabela = controle.getTabela();

            if (tabela.getSelectedRow() == -1) {
                return;

            } else {
                controle.Editar();
            }
        }

    }
}
