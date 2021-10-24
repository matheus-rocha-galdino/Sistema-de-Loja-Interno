/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.ConnectionUtils;
import util.StringUtils;
import util.buttonGroupUtils;
import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCliente extends javax.swing.JPanel {

    String genero = null;

    public CadastroCliente() {
        initComponents();
        btnAlterarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generoCliente = new javax.swing.ButtonGroup();
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
        rbtnMascCliente = new javax.swing.JRadioButton();
        rbtnFeminCliente = new javax.swing.JRadioButton();
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
        txtBairroCliente = new javax.swing.JTextField();
        txtLogradouroCliente = new javax.swing.JTextField();
        txtComplementoCliente = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        cbxUFCliente = new javax.swing.JComboBox<>();
        btnConsultarCEP = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 238, 251));

        cdc.setBackground(new java.awt.Color(226, 238, 251));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Cliente");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        txtIdCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdClienteCaretUpdate(evt);
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

        rbtnMascCliente.setBackground(new java.awt.Color(226, 238, 251));
        generoCliente.add(rbtnMascCliente);
        rbtnMascCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnMascCliente.setText("Masculino");
        rbtnMascCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnMascCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnMascClienteStateChanged(evt);
            }
        });

        rbtnFeminCliente.setBackground(new java.awt.Color(226, 238, 251));
        generoCliente.add(rbtnFeminCliente);
        rbtnFeminCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnFeminCliente.setText("Feminino");
        rbtnFeminCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnFeminCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnFeminClienteStateChanged(evt);
            }
        });

        rbtnOutrosCliente.setBackground(new java.awt.Color(226, 238, 251));
        generoCliente.add(rbtnOutrosCliente);
        rbtnOutrosCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnOutrosCliente.setText("Outros");
        rbtnOutrosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnOutrosCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnOutrosClienteStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Dados Pessoais");

        txtEmailCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        txtBairroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLogradouroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtComplementoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxUFCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        btnConsultarCEP.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarCEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarCEP.setBorder(null);
        btnConsultarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCEPActionPerformed(evt);
            }
        });

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
                                .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(45, 45, 45)
                                .addComponent(cbxUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnConsultarCEP))))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultarCEP))
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
                            .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
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
                .addContainerGap(848, Short.MAX_VALUE))
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdc, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
                txtCPFCliente.setText(resultado.getString("cpf"));
                txtNomeCliente.setText(resultado.getString("nome"));
                String nascimento = StringUtils.converteDataParaOPrograma(resultado.getString("nascimento"));
                txtDataCliente.setText(nascimento);
                buttonGroupUtils.setButtonGroup(resultado.getString("genero"), generoCliente.getElements());
                txtTelefoneCliente.setText(resultado.getString("telefone"));
                txtEmailCliente.setText(resultado.getString("email"));
                cbxEstadoCivCliente.setSelectedItem(resultado.getString("estado_civil"));
                txtCepCliente.setText(resultado.getString("cep"));
                txtMunicipioCliente.setText(resultado.getString("cidade"));
                txtLogradouroCliente.setText(resultado.getString("logradouro"));
                txtNumeroCliente.setText(resultado.getString("numero"));
                txtComplementoCliente.setText(resultado.getString("complemento"));
                cbxUFCliente.setSelectedItem(resultado.getString("uf"));
                txtBairroCliente.setText(resultado.getString("bairro"));

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

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja inserir um novo registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            String minhasql = "INSERT INTO cliente (cpf, nome, nascimento,genero, telefone, email, estado_civil, cep, cidade, logradouro, numero, complemento, uf, bairro)"
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
                String CPF = StringUtils.limpaValorParaOBanco(txtCPFCliente.getText());
                ps.setString(1, CPF);
                ps.setString(2, txtNomeCliente.getText());
                String dataConvertida = StringUtils.converteDataParaOBanco(txtDataCliente.getText());
                ps.setString(3, dataConvertida);
                ps.setString(4, genero);
                String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneCliente.getText());
                ps.setString(5, telefone);
                ps.setString(6, txtEmailCliente.getText());
                ps.setString(7, cbxEstadoCivCliente.getSelectedItem().toString());
                ps.setString(8, txtCepCliente.getText());
                ps.setString(9, txtMunicipioCliente.getText());
                ps.setString(10, txtLogradouroCliente.getText());
                ps.setString(11, txtNumeroCliente.getText());
                ps.setString(12, txtComplementoCliente.getText());
                ps.setString(13, cbxUFCliente.getSelectedItem().toString());
                ps.setString(14, txtBairroCliente.getText());
                ps.execute();

                JOptionPane.showMessageDialog(null, "Registro Inserido com Sucesso");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel inserir o registro");

            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        }
    }//GEN-LAST:event_btnCriarClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja atualizar este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            String minhasql = "UPDATE cliente SET cpf = ?,"
                    + " nome = ?,"
                    + " nascimento =?,"
                    + "genero =?, "
                    + "telefone =?,"
                    + "email =?,"
                    + "estado_civil =?,"
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
                String CPF = StringUtils.limpaValorParaOBanco(txtCPFCliente.getText());
                ps.setString(1, CPF);
                ps.setString(2, txtNomeCliente.getText());
                String dataConvertida = StringUtils.converteDataParaOBanco(txtDataCliente.getText());
                ps.setString(3, dataConvertida);
                ps.setString(4, genero);
                String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneCliente.getText());
                ps.setString(5, telefone);
                ps.setString(6, txtEmailCliente.getText());
                ps.setString(7, cbxEstadoCivCliente.getSelectedItem().toString());
                ps.setString(8, txtCepCliente.getText());
                ps.setString(9, txtMunicipioCliente.getText());
                ps.setString(10, txtLogradouroCliente.getText());
                ps.setString(11, txtNumeroCliente.getText());
                ps.setString(12, txtComplementoCliente.getText());
                ps.setString(13, cbxUFCliente.getSelectedItem().toString());
                ps.setString(14, txtBairroCliente.getText());
                Long idCliente = Long.parseLong(txtIdCliente.getText());
                ps.setLong(15, idCliente);
                ps.execute();

                JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o registro");

            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            String minhasql = "delete from cliente where id = ?;";
            Connection conexao = null;
            PreparedStatement ps = null;

            try {
                conexao = ConnectionUtils.getConnection();
                ps = conexao.prepareStatement(minhasql);
                Long idCliente = Long.parseLong(txtIdCliente.getText());
                ps.setLong(1, idCliente);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro");

            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        } else {

        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void txtIdClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdClienteCaretUpdate
        if (!txtIdCliente.getText().isEmpty()) {
            btnCriarCliente.setEnabled(false);
            btnAlterarCliente.setEnabled(true);
            btnExcluirCliente.setEnabled(true);
        } else {
            btnCriarCliente.setEnabled(true);
            btnAlterarCliente.setEnabled(false);
            btnExcluirCliente.setEnabled(false);
        }
    }//GEN-LAST:event_txtIdClienteCaretUpdate

    private void rbtnMascClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnMascClienteStateChanged
        // TODO add your handling code here:

        if (rbtnMascCliente.isSelected()) {
            genero = "Masculino";
        }
    }//GEN-LAST:event_rbtnMascClienteStateChanged

    private void rbtnFeminClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnFeminClienteStateChanged
        // TODO add your handling code here:
        if (rbtnFeminCliente.isSelected()) {
            genero = "Feminino";
        }
    }//GEN-LAST:event_rbtnFeminClienteStateChanged

    private void rbtnOutrosClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnOutrosClienteStateChanged
        // TODO add your handling code here:
        if (rbtnOutrosCliente.isSelected()) {
            genero = "Outros";
        }
    }//GEN-LAST:event_rbtnOutrosClienteStateChanged

    private void btnConsultarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCEPActionPerformed
        // TODO add your handling code here:
        ViaCEP viaCep = new ViaCEP();

        try {
            viaCep.buscar(util.StringUtils.limpaValorParaOBanco(txtCepCliente.getText()));
            txtMunicipioCliente.setText(viaCep.getLocalidade());
            txtLogradouroCliente.setText(viaCep.getLogradouro());
            cbxUFCliente.setSelectedItem(viaCep.getUf());
            txtBairroCliente.setText(viaCep.getBairro());

        } catch (ViaCEPException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o CEP", "ERRO", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnConsultarCEPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnConsultarCEP;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnCriarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JComboBox<String> cbxEstadoCivCliente;
    private javax.swing.JComboBox<String> cbxUFCliente;
    private javax.swing.JPanel cdc;
    private javax.swing.ButtonGroup generoCliente;
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
    private javax.swing.JLabel lblDataNasCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JRadioButton rbtnFeminCliente;
    private javax.swing.JRadioButton rbtnMascCliente;
    private javax.swing.JRadioButton rbtnOutrosCliente;
    private javax.swing.JTextField txtBairroCliente;
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
