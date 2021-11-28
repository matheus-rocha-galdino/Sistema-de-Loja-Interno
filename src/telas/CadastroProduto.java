package telas;

import java.awt.Dimension;
import java.awt.Toolkit;
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
        btnAlterarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        try {
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/NdocPxAAyg", "NdocPxAAyg", "SbEfPjeOfH");
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado.");
        }
        
         Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamTela = kit.getScreenSize();

//Pega largura e altura da tela 
        int larg = tamTela.width;
        int alt = tamTela.height;

        /* larg x 0.7; para ocupar 70% da tela por exemplo  */
 /* alt x 0.7;*/
//Manda o JFrame utilizar suas dimensões  
        setSize(larg, alt);
        
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
            String adicionaProduto = "insert into produto(nome, descricao, valor_venda, estoque) values ('" + nomeProduto + "', '" + descricaoProduto + "', '" + valorProduto + "', 0)";
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
        jPanelHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 238, 251));
        setPreferredSize(new java.awt.Dimension(1150, 895));

        jPanel1.setBackground(new java.awt.Color(226, 238, 251));

        cdc.setBackground(new java.awt.Color(226, 238, 251));
        cdc.setPreferredSize(new java.awt.Dimension(1150, 887));

        jPanelBody.setBackground(new java.awt.Color(226, 238, 251));

        jPanelCRUD.setBackground(new java.awt.Color(226, 238, 251));
        jPanelCRUD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCRUD.setPreferredSize(new java.awt.Dimension(1051, 83));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID Produto:");

        txtIdProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdProdutoCaretUpdate(evt);
            }
        });
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCRUDLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriarProduto)
                .addGap(67, 67, 67)
                .addComponent(btnAlterarProduto)
                .addGap(70, 70, 70)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addComponent(btnConsultarProduto))
                    .addComponent(btnAlterarProduto)
                    .addComponent(btnCriarProduto)
                    .addComponent(btnExcluirProduto))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanelDados.setBackground(new java.awt.Color(226, 238, 251));
        jPanelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDados.setPreferredSize(new java.awt.Dimension(1053, 303));

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
        lblValorProduto.setText("Valor:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(lblDescricaoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(txtValorProduto))))
                .addGap(650, 650, 650))
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(978, 978, 978)
                        .addComponent(imgProduto))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorProduto)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblDescricaoProduto)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(imgProduto)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cdcLayout = new javax.swing.GroupLayout(cdc);
        cdc.setLayout(cdcLayout);
        cdcLayout.setHorizontalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cdcLayout.setVerticalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdcLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(360, 360, 360))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addContainerGap(404, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(508, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 942, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void txtIdProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdProdutoCaretUpdate
        if (!txtIdProduto.getText().isEmpty()) {
            btnCriarProduto.setEnabled(false);
            btnAlterarProduto.setEnabled(true);
            btnExcluirProduto.setEnabled(true);
        } else {
            btnCriarProduto.setEnabled(true);
            btnAlterarProduto.setEnabled(false);
            btnExcluirProduto.setEnabled(false);
        }
    }//GEN-LAST:event_txtIdProdutoCaretUpdate


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
