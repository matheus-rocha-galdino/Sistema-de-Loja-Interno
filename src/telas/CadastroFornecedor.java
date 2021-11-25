/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import org.json.JSONException;
import org.json.JSONObject;
import util.ConnectionUtils;
import util.StringUtils;

public class CadastroFornecedor extends javax.swing.JPanel {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    public int a;

    public CadastroFornecedor() {
        initComponents();

        btnAlterarFornecedor.setEnabled(false);
        btnExcluirFornecedor.setEnabled(false);
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
        txtNomeFornecedor.setText("");
        txtCNPJFornecedor.setText("");
        txtTelefoneFornecedor.setText("");
        txtIdFornecedor.setText("");
        txtEmailFornecedor.setText("");
        txtNumeroFornecedor.setText("");
        txtCepFornecedor.setText("");
        txtComplementoFornecedor.setText("");
        txtLogradouroFornecedor.setText("");
        txtBairroFornecedor.setText("");
        cbxUFFornecedor.setSelectedItem(null);
        txtMunicipioFornecedor.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdc = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jPanelCRUD = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdFornecedor = new javax.swing.JTextField();
        btnConsultarFornecedor = new javax.swing.JButton();
        btnCriarFornecedor = new javax.swing.JButton();
        btnAlterarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        jPanelDadosFornecedor = new javax.swing.JPanel();
        lblNomeFornecedor = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmailFornecedor = new javax.swing.JTextField();
        txtCNPJFornecedor = new javax.swing.JFormattedTextField();
        txtTelefoneFornecedor = new javax.swing.JFormattedTextField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMunicipioFornecedor = new javax.swing.JTextField();
        txtNumeroFornecedor = new javax.swing.JTextField();
        txtBairroFornecedor = new javax.swing.JTextField();
        txtLogradouroFornecedor = new javax.swing.JTextField();
        txtComplementoFornecedor = new javax.swing.JTextField();
        txtCepFornecedor = new javax.swing.JFormattedTextField();
        cbxUFFornecedor = new javax.swing.JComboBox<>();
        btnConsultarCep = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 238, 251));

        cdc.setBackground(new java.awt.Color(226, 238, 251));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Fornecedor");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(572, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanelBody.setBackground(new java.awt.Color(226, 238, 251));

        jPanelCRUD.setBackground(new java.awt.Color(226, 238, 251));
        jPanelCRUD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Busca pelo Id:");

        txtIdFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdFornecedor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdFornecedorCaretUpdate(evt);
            }
        });
        txtIdFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFornecedorActionPerformed(evt);
            }
        });

        btnConsultarFornecedor.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarFornecedor.setBorder(null);
        btnConsultarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFornecedorActionPerformed(evt);
            }
        });

        btnCriarFornecedor.setBackground(new java.awt.Color(226, 238, 251));
        btnCriarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar.png"))); // NOI18N
        btnCriarFornecedor.setBorder(null);
        btnCriarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarFornecedorActionPerformed(evt);
            }
        });

        btnAlterarFornecedor.setBackground(new java.awt.Color(226, 238, 251));
        btnAlterarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atualizar.png"))); // NOI18N
        btnAlterarFornecedor.setBorder(null);
        btnAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setBackground(new java.awt.Color(226, 238, 251));
        btnExcluirFornecedor.setForeground(new java.awt.Color(51, 51, 55));
        btnExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        btnExcluirFornecedor.setBorder(null);
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCRUDLayout = new javax.swing.GroupLayout(jPanelCRUD);
        jPanelCRUD.setLayout(jPanelCRUDLayout);
        jPanelCRUDLayout.setHorizontalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConsultarFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriarFornecedor)
                .addGap(73, 73, 73)
                .addComponent(btnAlterarFornecedor)
                .addGap(70, 70, 70)
                .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirFornecedor)
                    .addComponent(btnConsultarFornecedor)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnCriarFornecedor)
                    .addComponent(btnAlterarFornecedor))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanelDadosFornecedor.setBackground(new java.awt.Color(226, 238, 251));
        jPanelDadosFornecedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDadosFornecedor.setRequestFocusEnabled(false);

        lblNomeFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeFornecedor.setText("Nome:");

        txtNomeFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNomeFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeFornecedorMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CNPJ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("E-mail:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Dados do Fornecedor");

        txtEmailFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmailFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailFornecedorMouseEntered(evt);
            }
        });
        txtEmailFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailFornecedorActionPerformed(evt);
            }
        });

        try {
            txtCNPJFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJFornecedor.setText("");
        txtCNPJFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCNPJFornecedorMouseEntered(evt);
            }
        });
        txtCNPJFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJFornecedorActionPerformed(evt);
            }
        });

        try {
            txtTelefoneFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTelefoneFornecedorMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosFornecedorLayout = new javax.swing.GroupLayout(jPanelDadosFornecedor);
        jPanelDadosFornecedor.setLayout(jPanelDadosFornecedorLayout);
        jPanelDadosFornecedorLayout.setHorizontalGroup(
            jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosFornecedorLayout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addGroup(jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosFornecedorLayout.createSequentialGroup()
                        .addComponent(lblNomeFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosFornecedorLayout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(750, 750, 750))
        );
        jPanelDadosFornecedorLayout.setVerticalGroup(
            jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeFornecedor))
                .addGap(30, 30, 30)
                .addGroup(jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanelEndereco.setBackground(new java.awt.Color(226, 238, 251));
        jPanelEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEndereco.setEnabled(false);
        jPanelEndereco.setPreferredSize(new java.awt.Dimension(1048, 517));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Endereço");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cep:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("UF:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Bairro:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cidade:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Logradouro:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Número:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Complemento:");

        txtMunicipioFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumeroFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBairroFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLogradouroFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtComplementoFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtCepFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxUFFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        btnConsultarCep.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarCep.setBorder(null);
        btnConsultarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(740, 740, 740)
                        .addComponent(jLabel13)
                        .addGap(100, 100, 100))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroFornecedor)
                            .addComponent(txtCepFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtMunicipioFornecedor)
                            .addComponent(txtLogradouroFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarCep)
                        .addGap(57, 57, 57)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplementoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(550, 550, 550))))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(btnConsultarCep)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtMunicipioFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtLogradouroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbxUFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtComplementoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(10, 10, 10))
                            .addComponent(txtNumeroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 1358, Short.MAX_VALUE)
                    .addComponent(jPanelDadosFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jPanelDadosFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cdcLayout = new javax.swing.GroupLayout(cdc);
        cdc.setLayout(cdcLayout);
        cdcLayout.setHorizontalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1403, Short.MAX_VALUE)
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cdcLayout.setVerticalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdcLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cdcLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFornecedorActionPerformed

    private void btnConsultarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFornecedorActionPerformed

        String minhasql = "SELECT * from fornecedor where id = ?";
        Connection conexao = null;
        PreparedStatement ps = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionUtils.getConnection();
            ps = conexao.prepareStatement(minhasql);
            Long idFornecedor = Long.parseLong(txtIdFornecedor.getText());
            ps.setLong(1, idFornecedor);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                txtNomeFornecedor.setText(resultado.getString("nome"));
                txtEmailFornecedor.setText(resultado.getString("email"));
                txtCNPJFornecedor.setText(resultado.getString("cnpj"));
                txtTelefoneFornecedor.setText(resultado.getString("telefone"));
                txtCepFornecedor.setText(resultado.getString("cep"));
                txtMunicipioFornecedor.setText(resultado.getString("cidade"));
                txtLogradouroFornecedor.setText(resultado.getString("logradouro"));
                txtNumeroFornecedor.setText(resultado.getString("numero"));
                cbxUFFornecedor.setSelectedItem(resultado.getString("uf"));
                txtBairroFornecedor.setText(resultado.getString("bairro"));
                txtComplementoFornecedor.setText(resultado.getString("complemento"));

            } else {
                JOptionPane.showMessageDialog(null, "Registro não existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não existe");

        } finally {
            ConnectionUtils.closeConnection(conexao, ps, resultado);
        }

    }//GEN-LAST:event_btnConsultarFornecedorActionPerformed

    private void btnCriarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarFornecedorActionPerformed

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja inserir um novo registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            String minhasql = "INSERT INTO fornecedor (cnpj, nome, telefone, email, cep, cidade, logradouro, numero, complemento, uf, bairro)"
                    + " VALUES "
                    + "(?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?);";
            Connection conexao = null;
            PreparedStatement ps = null;

            try {
                conexao = ConnectionUtils.getConnection();
                ps = conexao.prepareStatement(minhasql);
                String CNPJ = StringUtils.limpaValorParaOBanco(txtCNPJFornecedor.getText());
                ps.setString(1, CNPJ);
                ps.setString(2, txtNomeFornecedor.getText());
                String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneFornecedor.getText());
                ps.setString(3, telefone);
                ps.setString(4, txtEmailFornecedor.getText());
                ps.setString(5, StringUtils.limpaValorParaOBanco(txtCepFornecedor.getText()));
                ps.setString(6, txtMunicipioFornecedor.getText());
                ps.setString(7, txtLogradouroFornecedor.getText());
                ps.setString(8, txtNumeroFornecedor.getText());
                ps.setString(9, txtComplementoFornecedor.getText());
                ps.setString(10, cbxUFFornecedor.getSelectedItem().toString());
                ps.setString(11, txtBairroFornecedor.getText());
                ps.execute();

                JOptionPane.showMessageDialog(null, "Registro Inserido com Sucesso");

                limpaTela();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel inserir o registro");
            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        }


    }//GEN-LAST:event_btnCriarFornecedorActionPerformed

    private void btnAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFornecedorActionPerformed

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja atualizar este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            String minhasql = "UPDATE fornecedor SET cnpj = ?,"
                    + " nome = ?,"
                    + "telefone =?,"
                    + "email =?,"
                    + "cep =?,"
                    + "cidade =?,"
                    + "logradouro =?,"
                    + "numero =?,"
                    + "complemento =?,"
                    + "uf =?,"
                    + " bairro  =?"
                    + " where id = ?;";
            Connection conexao = null;
            PreparedStatement ps = null;

            try {
                conexao = ConnectionUtils.getConnection();
                ps = conexao.prepareStatement(minhasql);
                String CNPJ = StringUtils.limpaValorParaOBanco(txtCNPJFornecedor.getText());
                ps.setString(1, CNPJ);
                ps.setString(2, txtNomeFornecedor.getText());
                String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneFornecedor.getText());
                ps.setString(3, telefone);
                ps.setString(4, txtEmailFornecedor.getText());
                ps.setString(5, StringUtils.limpaValorParaOBanco(txtCepFornecedor.getText()));
                ps.setString(6, txtMunicipioFornecedor.getText());
                ps.setString(7, txtLogradouroFornecedor.getText());
                ps.setString(8, txtNumeroFornecedor.getText());
                ps.setString(9, txtComplementoFornecedor.getText());
                ps.setString(10, cbxUFFornecedor.getSelectedItem().toString());
                ps.setString(11, txtBairroFornecedor.getText());
                Long idFornecedor = Long.parseLong(txtIdFornecedor.getText());
                ps.setLong(12, idFornecedor);
                ps.execute();

                JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso");

                limpaTela();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o registro");

            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        }

    }//GEN-LAST:event_btnAlterarFornecedorActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (escolha == 0) {
            String minhasql = "delete from fornecedor where id = ?;";
            Connection conexao = null;
            PreparedStatement ps = null;

            try {
                conexao = ConnectionUtils.getConnection();
                ps = conexao.prepareStatement(minhasql);
                Long idFornecedor = Long.parseLong(txtIdFornecedor.getText());
                ps.setLong(1, idFornecedor);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");

                limpaTela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro");
            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        }

    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void txtTelefoneFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneFornecedorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFornecedorMouseEntered

    private void txtCNPJFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCNPJFornecedorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJFornecedorMouseEntered

    private void txtEmailFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFornecedorActionPerformed

    private void txtEmailFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailFornecedorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFornecedorMouseEntered

    private void txtNomeFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeFornecedorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFornecedorMouseEntered

    private void txtCNPJFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJFornecedorActionPerformed

    private void txtIdFornecedorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdFornecedorCaretUpdate

        if (!txtIdFornecedor.getText().isEmpty()) {
            btnCriarFornecedor.setEnabled(false);
            btnAlterarFornecedor.setEnabled(true);
            btnExcluirFornecedor.setEnabled(true);
        } else {
            btnCriarFornecedor.setEnabled(true);
            btnAlterarFornecedor.setEnabled(false);
            btnExcluirFornecedor.setEnabled(false);
        }
    }//GEN-LAST:event_txtIdFornecedorCaretUpdate

    private void btnConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCepActionPerformed
        String CEP = (util.StringUtils.limpaValorParaOBanco(txtCepFornecedor.getText()));
        JSONObject endereco = util.ViaCep.buscarCep(CEP);
        try {
            txtMunicipioFornecedor.setText(endereco.getString("localidade"));
            txtLogradouroFornecedor.setText(endereco.getString("logradouro"));
            txtBairroFornecedor.setText(endereco.getString("bairro"));
            cbxUFFornecedor.setSelectedItem(endereco.getString("uf"));
            txtComplementoFornecedor.setText(endereco.getString("complemento"));
        } catch (JSONException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o CEP", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarCepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFornecedor;
    private javax.swing.JButton btnConsultarCep;
    private javax.swing.JButton btnConsultarFornecedor;
    private javax.swing.JButton btnCriarFornecedor;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JComboBox<String> cbxUFFornecedor;
    private javax.swing.JPanel cdc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelCRUD;
    private javax.swing.JPanel jPanelDadosFornecedor;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JLabel lblNomeFornecedor;
    private javax.swing.JTextField txtBairroFornecedor;
    private javax.swing.JFormattedTextField txtCNPJFornecedor;
    private javax.swing.JFormattedTextField txtCepFornecedor;
    private javax.swing.JTextField txtComplementoFornecedor;
    private javax.swing.JTextField txtEmailFornecedor;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtLogradouroFornecedor;
    private javax.swing.JTextField txtMunicipioFornecedor;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNumeroFornecedor;
    private javax.swing.JFormattedTextField txtTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
