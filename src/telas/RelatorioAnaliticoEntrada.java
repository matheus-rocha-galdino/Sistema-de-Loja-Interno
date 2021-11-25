package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class RelatorioAnaliticoEntrada extends javax.swing.JPanel {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;

    public RelatorioAnaliticoEntrada() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/NdocPxAAyg", "NdocPxAAyg", "SbEfPjeOfH");
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado.");
        }
    }

    private void carregaTabelaVendaAnalitica() {

        DefaultTableModel tabela = (DefaultTableModel) tblResumoDaVenda.getModel();
        tabela.setNumRows(0);

        tblResumoDaVenda.getColumnModel().getColumn(0);
        tblResumoDaVenda.getColumnModel().getColumn(1);
        tblResumoDaVenda.getColumnModel().getColumn(2);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tblResumoDaVenda.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblResumoDaVenda.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tblResumoDaVenda.getColumnModel().getColumn(2).setCellRenderer(centralizado);

        try {
            String comandoTabela = "select CO.id as Id, CO.valor_compra as total, CO.hora_compra as data_compra, FO.nome as nome, PO.nome as produto, POC.quantidade as quantidade, POC.total_item as valor_unitario\n"
                    + "from compra as CO \n"
                    + "inner join produto_compra as POC on CO.id = POC.fk_id_compra\n"
                    + "inner join fornecedor as FO on CO.fk_cnpj = FO.cnpj\n"
                    + "inner join produto as PO on POC.fk_id_produto = PO.id \n"
                    + "where CO.id = " + txtIdVenda.getText();
            resultado = st.executeQuery(comandoTabela);
            while (resultado.next()) {
                tabela.addRow(new Object[]{
                    resultado.getString("produto"),
                    resultado.getString("valor_unitario"),
                    resultado.getString("quantidade"),});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void carregaVendaAnalitica() {
        try {
            String pesquisaAnalitica = "select CO.id as Id, CO.valor_compra as total, CO.hora_compra as data_compra, FO.nome as nome, PO.nome as produto, POC.quantidade as quantidade, POC.total_item as valor_unitario\n"
                    + "from compra as CO \n"
                    + "inner join produto_compra as POC on CO.id = POC.fk_id_compra\n"
                    + "inner join fornecedor as FO on CO.fk_cnpj = FO.cnpj\n"
                    + "inner join produto as PO on POC.fk_id_produto = PO.id \n"
                    + "where CO.id = " + txtIdVenda.getText();
            resultado = st.executeQuery(pesquisaAnalitica);
            if (resultado.next()) {
                lblRecebeNomeCliente1.setText(resultado.getString("nome"));
                String data = carregaData(resultado.getString("data_compra"));
                jLabel1.setText(data);
                jLabel5.setText(resultado.getString("total"));
            } else {
                JOptionPane.showMessageDialog(null, "ID não existente!");
            }
        } catch (Exception e) {
        }
    }

    private boolean verificaId() {
        boolean vazio = false;

        String id = txtIdVenda.getText().trim();

        if (id.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo ID DA COMPRA vazio!");
            vazio = true;
        }

        return vazio;
    }

    private void limpaDados() {
        txtIdVenda.setText("");
        lblRecebeNomeCliente1.setText("");
        jLabel1.setText("");
        jLabel5.setText("");
        DefaultTableModel dm = (DefaultTableModel) tblResumoDaVenda.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    private String carregaData(String data) {
        String ano = data.substring(0, 4);
        String mes = data.substring(5, 7);
        String dia = data.substring(8, 10);
        String barra = "/";
        String complemento = data.substring(10, data.length());

        String dataFormatada = dia.concat(barra.concat(mes.concat(barra.concat((ano.concat(complemento))))));
        return dataFormatada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanelBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResumoDaVenda = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnConsultarVenda = new javax.swing.JButton();
        txtIdVenda = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        lblRecebeNomeCliente1 = new javax.swing.JLabel();
        lblNomeVendedor1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelHead = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 238, 251));

        jPanel1.setBackground(new java.awt.Color(226, 238, 251));

        jPanelBody.setBackground(new java.awt.Color(226, 238, 251));
        jPanelBody.setLayout(new java.awt.GridBagLayout());

        tblResumoDaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor Unitário", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResumoDaVenda);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1276;
        gridBagConstraints.ipady = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 12);
        jPanelBody.add(jScrollPane1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID da entrada:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jPanelBody.add(jLabel3, gridBagConstraints);

        btnConsultarVenda.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarVenda.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelBody.add(btnConsultarVenda, gridBagConstraints);

        txtIdVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdVendaFocusGained(evt);
            }
        });
        txtIdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVendaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanelBody.add(txtIdVenda, gridBagConstraints);

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeCliente.setText("Nome do Fornecedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelBody.add(lblNomeCliente, gridBagConstraints);

        lblRecebeNomeCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecebeNomeCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecebeNomeCliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 346;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelBody.add(lblRecebeNomeCliente1, gridBagConstraints);

        lblNomeVendedor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeVendedor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeVendedor1.setText("Valor Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 50, 0);
        jPanelBody.add(lblNomeVendedor1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data da Entrada:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanelBody.add(jLabel4, gridBagConstraints);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanelBody.add(jButton1, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanelBody.add(jLabel1, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 50, 0);
        jPanelBody.add(jLabel5, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelHead.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Relatório Analítico");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Detalhes dos Produtos Entrada");

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdVendaFocusGained
        limpaDados();
    }//GEN-LAST:event_txtIdVendaFocusGained

    private void txtIdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVendaActionPerformed

    }//GEN-LAST:event_txtIdVendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean verificacao = verificaId();
        if (verificacao == false) {
            carregaVendaAnalitica();
            carregaTabelaVendaAnalitica();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeVendedor1;
    private javax.swing.JLabel lblRecebeNomeCliente1;
    private javax.swing.JTable tblResumoDaVenda;
    private javax.swing.JTextField txtIdVenda;
    // End of variables declaration//GEN-END:variables
}
