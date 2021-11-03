package telas;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class CadastroProduto extends javax.swing.JPanel {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;

    public CadastroProduto() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/NdocPxAAyg", "NdocPxAAyg", "SbEfPjeOfH");
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado.");
        }
    }

    public void limpaTela() {
        txtIdProduto.setText("");
        txtDescricaoProduto.setText("");
        txtNomeProduto.setText("");
        txtValorProduto.setText("");
    }

    public void pesquisaItem() {
        try {
            String pesquisaProduto = "select * from produto where id = " + txtIdProduto.getText();
            resultado = st.executeQuery(pesquisaProduto);
            if (resultado.next()) {
                txtNomeProduto.setText(resultado.getString("nome"));
                txtDescricaoProduto.setText(resultado.getString("descricao"));
                txtValorProduto.setText(resultado.getString("valor_venda"));
            } else {
                JOptionPane.showMessageDialog(null, "ID inexistente.");
            }
        } catch (Exception e) {
        }
    }

    public boolean validaPesquisaItem() {
        boolean vazio = false;

        String pesquisaItem = txtIdProduto.getText().trim();

        if (pesquisaItem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo ID PRODUTO vazio!");
            vazio = true;
        }

        return vazio;
    }

    public void adicionaItem() {
        try {
            txtIdProduto.setText("");
            String nomeProduto = txtNomeProduto.getText();
            String descricaoProduto = txtDescricaoProduto.getText();
            String valorProduto = txtValorProduto.getText().replaceAll(",", ".");
            String adicionaProduto = "insert into produto(nome, descricao, valor_venda) values ('" + nomeProduto + "', '" + descricaoProduto + "', '" + valorProduto + "')";
            st.executeUpdate(adicionaProduto);
            JOptionPane.showMessageDialog(null, "Item adicionado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar item!");
        }
    }

    public boolean validaAdicionaItem() {
        boolean vazio = false;

        String nomeProduto = txtNomeProduto.getText().trim();
        String descricaoProduto = txtDescricaoProduto.getText().trim();
        String valorProduto = txtValorProduto.getText().trim();

        if (nomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo NOME vazio!");
            vazio = true;
        }

        if (descricaoProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo DESCRIÇÃO vazio!");
            vazio = true;
        }

        if (valorProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo VALOR vazio!");
            vazio = true;
        }

        return vazio;
    }

    public void atualizaItem() {
        try {
            String nomeProduto = txtNomeProduto.getText();
            String descricaoProduto = txtDescricaoProduto.getText();
            String valorProduto = txtValorProduto.getText().replaceAll(",", ".");
            String atualizaProduto = "update produto set nome = '" + nomeProduto + "', descricao = '" + descricaoProduto + "', valor_venda = '" + valorProduto + "' where id = " + txtIdProduto.getText();
            st.executeUpdate(atualizaProduto);
            JOptionPane.showMessageDialog(null, "Item Atualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Atualiza Item!");
        }
    }

    public boolean validaAtualizaItem() {
        boolean vazio = false;

        String idProduto = txtIdProduto.getText().trim();
        String nomeProduto = txtNomeProduto.getText().trim();
        String descricaoProduto = txtDescricaoProduto.getText().trim();
        String valorProduto = txtValorProduto.getText().trim();

        if (idProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo ID PRODUTO vazio!");
            vazio = true;
        }

        if (nomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo NOME vazio!");
            vazio = true;
        }

        if (descricaoProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo DESCRIÇÃO vazio!");
            vazio = true;
        }

        if (valorProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo VALOR vazio!");
            vazio = true;
        }

        return vazio;
    }

    public void excluiItem() {
        try {
            String excluiItem = "delete from produto where id = " + txtIdProduto.getText();
            st.executeUpdate(excluiItem);
            JOptionPane.showMessageDialog(null, "Item Excluido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Exclui Item");
        }
    }

    public boolean validaExcluiItem() {
        boolean vazio = false;

        String idProduto = txtIdProduto.getText().trim();
        String nomeProduto = txtNomeProduto.getText().trim();
        String descricaoProduto = txtDescricaoProduto.getText().trim();
        String valorProduto = txtValorProduto.getText().trim();

        if (idProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo ID PRODUTO vazio!");
            vazio = true;
        }

        if (nomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo NOME vazio!");
            vazio = true;
        }

        if (descricaoProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo DESCRIÇÃO vazio!");
            vazio = true;
        }

        if (valorProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo VALOR vazio!");
            vazio = true;
        }

        return vazio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cdc = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jPanelCRUD = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        btnConsultarProduto = new javax.swing.JButton();
        btnCriarProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoProduto = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        imgProduto = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cdc.setBackground(new java.awt.Color(226, 238, 251));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Produto");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelBody.setBackground(new java.awt.Color(226, 238, 251));

        jPanelCRUD.setBackground(new java.awt.Color(226, 238, 251));
        jPanelCRUD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID Produto:");

        txtIdProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });

        btnConsultarProduto.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarProduto.setBorder(null);
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        btnCriarProduto.setBackground(new java.awt.Color(226, 238, 251));
        btnCriarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar.png"))); // NOI18N
        btnCriarProduto.setBorder(null);
        btnCriarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setBackground(new java.awt.Color(226, 238, 251));
        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atualizar.png"))); // NOI18N
        btnAlterarProduto.setBorder(null);
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setBackground(new java.awt.Color(226, 238, 251));
        btnExcluirProduto.setForeground(new java.awt.Color(51, 51, 55));
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        btnExcluirProduto.setBorder(null);
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCRUDLayout = new javax.swing.GroupLayout(jPanelCRUD);
        jPanelCRUD.setLayout(jPanelCRUDLayout);
        jPanelCRUDLayout.setHorizontalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriarProduto)
                .addGap(70, 70, 70)
                .addComponent(btnAlterarProduto)
                .addGap(70, 70, 70)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnConsultarProduto)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirProduto)
                        .addComponent(btnCriarProduto)
                        .addComponent(btnAlterarProduto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDados.setBackground(new java.awt.Color(226, 238, 251));
        jPanelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeProduto.setText("Nome:");

        txtNomeProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNomeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeProdutoMouseEntered(evt);
            }
        });
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        lblDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricaoProduto.setText("Descrição:");

        lblValorProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorProduto.setText("Valor");

        txtDescricaoProduto.setColumns(20);
        txtDescricaoProduto.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoProduto);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Dados");

        txtValorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addContainerGap(816, Short.MAX_VALUE))
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeProduto)
                    .addComponent(lblDescricaoProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(lblValorProduto)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgProduto)
                .addGap(106, 106, 106))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeProduto)
                            .addComponent(lblValorProduto)
                            .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(lblDescricaoProduto)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 35, Short.MAX_VALUE))))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(imgProduto)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout cdcLayout = new javax.swing.GroupLayout(cdc);
        cdc.setLayout(cdcLayout);
        cdcLayout.setHorizontalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
            .addGroup(cdcLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        cdcLayout.setVerticalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdcLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 502, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1067, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed

    }//GEN-LAST:event_txtIdProdutoActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        boolean vazio = validaPesquisaItem();
        if (vazio == false) {
            pesquisaItem();
        }
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnCriarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarProdutoActionPerformed
        boolean vazio = validaAdicionaItem();
        if (vazio == false) {
            adicionaItem();
        }
        limpaTela();
    }//GEN-LAST:event_btnCriarProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        boolean vazio = validaAtualizaItem();
        if (vazio == false) {
            atualizaItem();
        }
        limpaTela();
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        boolean vazio = validaExcluiItem();
        if (vazio == false) {
            excluiItem();
        }
        limpaTela();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtNomeProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeProdutoMouseEntered

    }//GEN-LAST:event_txtNomeProdutoMouseEntered

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed

    }//GEN-LAST:event_txtNomeProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnCriarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JPanel cdc;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelCRUD;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JTextArea txtDescricaoProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
