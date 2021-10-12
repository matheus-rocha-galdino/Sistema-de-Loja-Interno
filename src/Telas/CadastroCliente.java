/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import util.ConnectionUtils;

public class CadastroCliente extends javax.swing.JPanel {

    public CadastroCliente() {
        initComponents();
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
        txtIdCliente = new javax.swing.JTextField();
        btnConsultarCliente = new javax.swing.JButton();
        btnCriarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        jPanelDadosPessoais = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblDataNasCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtnFeminCliente = new javax.swing.JRadioButton();
        rbtnMascCliente = new javax.swing.JRadioButton();
        rbtnOutrosCliente = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        imgCliente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDataCliente = new javax.swing.JFormattedTextField();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        txtTelefoneCliente = new javax.swing.JFormattedTextField();
        cbxEstadoCivCliente = new javax.swing.JComboBox<>();
        jPanelEndereco = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMunicipioCliente = new javax.swing.JTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        txtLogradouroCliente = new javax.swing.JTextField();
        txtComplementoCliente = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        cbxUFCliente = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        cdc.setBackground(new java.awt.Color(226, 238, 251));

        jPanelHeader.setBackground(new java.awt.Color(4, 102, 140));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Cliente");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2)
                .addContainerGap(479, Short.MAX_VALUE))
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
        jLabel3.setText("Busca pelo Id:");

        txtIdCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        btnConsultarCliente.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarCliente.setBorder(null);
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnCriarCliente.setBackground(new java.awt.Color(226, 238, 251));
        btnCriarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar.png"))); // NOI18N
        btnCriarCliente.setBorder(null);
        btnCriarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setBackground(new java.awt.Color(226, 238, 251));
        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atualizar.png"))); // NOI18N
        btnAlterarCliente.setBorder(null);
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setBackground(new java.awt.Color(226, 238, 251));
        btnExcluirCliente.setForeground(new java.awt.Color(51, 51, 55));
        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        btnExcluirCliente.setBorder(null);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
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
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConsultarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriarCliente)
                .addGap(73, 73, 73)
                .addComponent(btnAlterarCliente)
                .addGap(70, 70, 70)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnConsultarCliente)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnCriarCliente)
                    .addComponent(btnAlterarCliente))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelDadosPessoais.setBackground(new java.awt.Color(226, 238, 251));
        jPanelDadosPessoais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome:");

        txtNomeCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeClienteMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        lblDataNasCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataNasCliente.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("E-mail:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Genêro:");

        rbtnFeminCliente.setBackground(new java.awt.Color(226, 238, 251));
        rbtnFeminCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnFeminCliente.setText("Feminino");
        rbtnFeminCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbtnMascCliente.setBackground(new java.awt.Color(226, 238, 251));
        rbtnMascCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnMascCliente.setText("Masculino");
        rbtnMascCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbtnOutrosCliente.setBackground(new java.awt.Color(226, 238, 251));
        rbtnOutrosCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnOutrosCliente.setText("Outros");
        rbtnOutrosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Dados Pessoais");

        txtEmailCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmailCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailClienteMouseEntered(evt);
            }
        });
        txtEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClienteActionPerformed(evt);
            }
        });

        imgCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Estado Civil:");

        try {
            txtDataCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCPFClienteMouseEntered(evt);
            }
        });

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTelefoneClienteMouseEntered(evt);
            }
        });

        cbxEstadoCivCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)" }));

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(375, 375, 375)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)))
                                .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(lblNomeCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxEstadoCivCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(lblDataNasCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(imgCliente)
                        .addGap(82, 82, 82))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(25, 25, 25)
                                .addComponent(rbtnMascCliente)
                                .addGap(27, 27, 27)
                                .addComponent(rbtnFeminCliente)
                                .addGap(40, 40, 40)
                                .addComponent(rbtnOutrosCliente))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(51, 51, 51)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblDataNasCliente)
                            .addComponent(txtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEstadoCivCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                    .addComponent(imgCliente))
                .addGap(23, 23, 23)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbtnMascCliente)
                    .addComponent(rbtnFeminCliente)
                    .addComponent(rbtnOutrosCliente))
                .addContainerGap(48, Short.MAX_VALUE))
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

        txtMunicipioCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumeroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLogradouroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtComplementoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxUFCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCepCliente))
                                .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLogradouroCliente))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplementoCliente))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(45, 45, 45)
                                .addComponent(cbxUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtLogradouroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cdcLayout = new javax.swing.GroupLayout(cdc);
        cdc.setLayout(cdcLayout);
        cdcLayout.setHorizontalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(33, 33, 33)))
        );
        cdcLayout.setVerticalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdcLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 830, Short.MAX_VALUE))
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed

        String minhasql = "SELECT * from cliente where id = ?";
        Connection conexao = null;
        PreparedStatement ps = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionUtils.getConnection();
            ps = conexao.prepareStatement(minhasql);
            Long idCliente = Long.parseLong(txtIdCliente.getText());
            ps.setLong(1, idCliente);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                txtNomeCliente.setText(resultado.getString("nome"));
                txtEmailCliente.setText(resultado.getString("email"));
                txtCPFCliente.setText(resultado.getString("cpf"));
                txtTelefoneCliente.setText(resultado.getString("telefone"));

            } else {
                JOptionPane.showMessageDialog(null, "Registro não existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não existe");

        } finally {
            ConnectionUtils.closeConnection(conexao, ps, resultado);
        }

    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnCriarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarClienteActionPerformed
        String teste = txtDataCliente.getText();
        
        
        String minhasql = "INSERT INTO cliente (cpf, nome, nascimento,genero, endereco, telefone, email, cep, cidade, logradouro, numero, complemento, uf, bairro)"
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
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?);";
        Connection conexao = null;
        PreparedStatement ps = null;

        try {
            conexao = ConnectionUtils.getConnection();
            ps = conexao.prepareStatement(minhasql);
            //Long CPF = Long.parseLong(txtCPFCliente.getText());
            ps.setString(1, txtCPFCliente.getText());
            ps.setString(2, txtNomeCliente.getText());
            //new java.sql.Timestamp(date.getTime());
            //ps.setString(2, txtDataCliente.());
            ps.setString(2, txtNomeCliente.getText());
            ps.setString(2, txtNomeCliente.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não existe");

        } finally {
            ConnectionUtils.closeConnection(conexao, ps);
        }

    }//GEN-LAST:event_btnCriarClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
//        try {
//            String cpf, nome, telefone, email;
//
//            nome = txtNomeCliente.getText();
//            cpf = txtCPFCliente.getText();
//            telefone = txtTelefoneCliente.getText();
//            email = txtEmailCliente.getText();
//
//            String minhasql = "update cliente set nome = '"
//                    + nome + "',cpf = '"
//                    + cpf + "',email ='"
//                    + email + "',,telefone ='"
//                    + telefone + "' where id = " + txtIdCliente.getText();
//            st.executeUpdate(minhasql);
//            JOptionPane.showMessageDialog(null, "Registro Atualizado");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Registro Não Atualizado");
//        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
//        try {
//            String minhasql = "delete from cliente where id = " + txtIdCliente.getText();
//            st.executeUpdate(minhasql);
//            JOptionPane.showMessageDialog(null, "Registro Excluido");
//            txtNomeCliente.setText("");
//            txtCPFCliente.setText("");
//            txtTelefoneCliente.setText("");
//            txtEmailCliente.setText("");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Resgistro não existe " + e);
//        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void txtTelefoneClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteMouseEntered

    private void txtCPFClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFClienteMouseEntered

    private void txtEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailClienteActionPerformed

    private void txtEmailClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailClienteMouseEntered

    private void txtNomeClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnCriarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JComboBox<String> cbxEstadoCivCliente;
    private javax.swing.JComboBox<String> cbxUFCliente;
    private javax.swing.JPanel cdc;
    private javax.swing.JLabel imgCliente;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelCRUD;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JLabel lblDataNasCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JRadioButton rbtnFeminCliente;
    private javax.swing.JRadioButton rbtnMascCliente;
    private javax.swing.JRadioButton rbtnOutrosCliente;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JFormattedTextField txtCepCliente;
    private javax.swing.JTextField txtComplementoCliente;
    private javax.swing.JFormattedTextField txtDataCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtLogradouroCliente;
    private javax.swing.JTextField txtMunicipioCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JFormattedTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}