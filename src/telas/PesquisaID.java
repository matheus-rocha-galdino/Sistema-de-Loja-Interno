/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionUtils;
import static util.tableUtils.carregaTabela;

/**
 *
 * @author giovana.santos
 */
public class PesquisaID extends javax.swing.JPanel {

    /**
     * Creates new form PesquisaID
     */
    public PesquisaID() {
        initComponents();

        Connection conexao = null;
        PreparedStatement psProduto = null;
        ResultSet resultadoProduto = null;
        PreparedStatement psCliente = null;
        ResultSet resultadoCliente = null;
        PreparedStatement psFornecedor = null;
        ResultSet resultadoFornecedor = null;
        PreparedStatement psColaborador = null;
        ResultSet resultadoColaborador = null;

        try {
            conexao = ConnectionUtils.getConnection();
            String selectProduto = "select * from produto;";
            psProduto = conexao.prepareStatement(selectProduto);
            resultadoProduto = psProduto.executeQuery(selectProduto);
            String selectCliente = "select * from cliente;";
            psCliente = conexao.prepareStatement(selectCliente);
            resultadoCliente = psCliente.executeQuery(selectCliente);
            String selectFornecedor = "select * from fornecedor;";
            psFornecedor = conexao.prepareStatement(selectFornecedor);
            resultadoFornecedor = psFornecedor.executeQuery(selectFornecedor);
            String selectColaborador = "select * from colaborador;";
            psColaborador = conexao.prepareStatement(selectColaborador);
            resultadoColaborador = psColaborador.executeQuery(selectColaborador);

            String[] camposProduto = {"id", "nome", "valor_venda", "estoque"};
            String[] camposColaborador = {"id", "nome", "cpf", "telefone"};
            String[] camposCliente = {"id", "nome", "cpf", "telefone"};
            String[] camposFornecedor = {"id", "nome", "cnpj", "telefone"};

            //chama função
            carregaTabela(jTable1, camposProduto, resultadoProduto);
            carregaTabela(jTable2, camposCliente, resultadoCliente);
            carregaTabela(jTable3, camposColaborador, resultadoColaborador);
            carregaTabela(jTable4, camposFornecedor, resultadoFornecedor);

        } catch (SQLException ex) {
            Logger.getLogger(PesquisaID.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionUtils.closeConnection(conexao, psProduto, resultadoProduto);
            ConnectionUtils.closeConnection(conexao, psCliente, resultadoCliente);
            ConnectionUtils.closeConnection(conexao, psColaborador, resultadoColaborador);
            ConnectionUtils.closeConnection(conexao, psFornecedor, resultadoFornecedor);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setBackground(new java.awt.Color(226, 238, 251));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane6.setBackground(new java.awt.Color(226, 238, 251));
        jTabbedPane6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(226, 238, 251));
        jPanel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(226, 238, 251));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor", "Estoque"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jTabbedPane6.addTab("           Produto           ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(226, 238, 251));
        jPanel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(226, 238, 251));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jTabbedPane6.addTab("            Cliente            ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(226, 238, 251));
        jPanel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(226, 238, 251));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel8.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jTabbedPane6.addTab("          Colaborador          ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(226, 238, 251));
        jPanel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(226, 238, 251));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CNPJ", "Telefone"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel9.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jTabbedPane6.addTab("          Fornecedor          ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}