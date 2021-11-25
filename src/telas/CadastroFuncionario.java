/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.ConnectionUtils;
import util.StringUtils;
import util.buttonGroupUtils;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class CadastroFuncionario extends javax.swing.JPanel {

    String genero = null;

    public CadastroFuncionario() {
        initComponents();
        btnAlterarFuncionario.setEnabled(false);
        btnExcluirFuncionario.setEnabled(false);

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
        txtNomeFuncionario.setText("");
        txtCPFFuncionario.setText("");
        txtTelefoneFuncionario.setText("");
        txtIdFuncionario.setText("");
        txtEmailFuncionario.setText("");
        txtCPFFuncionario.setText("");
        txtNumeroFuncionario.setText("");
        txtCepFuncionario.setText("");
        txtComplementoFuncionario.setText("");
        txtDataFuncionario.setText("");
        txtLogradouroFuncionario.setText("");
        txtBairroFuncionario.setText("");
        generoFuncionario.clearSelection();
        cbxUFFuncionario.setSelectedItem(null);
        cbxEstadoCivFuncionario.setSelectedItem(null);
        txtMunicipioFuncionario.setText("");
        txtSenhaFuncionario.setText("");
        txtConfirmarSenhaFuncionario.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generoFuncionario = new javax.swing.ButtonGroup();
        cdc = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jPanelCRUD = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdFuncionario = new javax.swing.JTextField();
        btnConsultarFuncionario = new javax.swing.JButton();
        btnCriarFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        jPanelDadosPessoais = new javax.swing.JPanel();
        lblNomeFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblDataNasCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtnFeminFuncionario = new javax.swing.JRadioButton();
        rbtnMascFuncionario = new javax.swing.JRadioButton();
        rbtnOutrosFuncionario = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmailFuncionario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCPFFuncionario = new javax.swing.JFormattedTextField();
        txtTelefoneFuncionario = new javax.swing.JFormattedTextField();
        cbxEstadoCivFuncionario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JPasswordField();
        txtConfirmarSenhaFuncionario = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtDataFuncionario = new javax.swing.JFormattedTextField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMunicipioFuncionario = new javax.swing.JTextField();
        txtNumeroFuncionario = new javax.swing.JTextField();
        txtBairroFuncionario = new javax.swing.JTextField();
        txtLogradouroFuncionario = new javax.swing.JTextField();
        txtComplementoFuncionario = new javax.swing.JTextField();
        txtCepFuncionario = new javax.swing.JFormattedTextField();
        cbxUFFuncionario = new javax.swing.JComboBox<>();
        btnConsultarCEP = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 238, 251));

        cdc.setBackground(new java.awt.Color(226, 238, 251));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Colaborador");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(681, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(226, 238, 251));

        jPanelCRUD.setBackground(new java.awt.Color(226, 238, 251));
        jPanelCRUD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Busca pelo Id:");

        txtIdFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdFuncionario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdFuncionarioCaretUpdate(evt);
            }
        });
        txtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncionarioActionPerformed(evt);
            }
        });

        btnConsultarFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        btnConsultarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.png"))); // NOI18N
        btnConsultarFuncionario.setBorder(null);
        btnConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFuncionarioActionPerformed(evt);
            }
        });

        btnCriarFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        btnCriarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar.png"))); // NOI18N
        btnCriarFuncionario.setBorder(null);
        btnCriarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        btnAlterarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atualizar.png"))); // NOI18N
        btnAlterarFuncionario.setBorder(null);
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        btnExcluirFuncionario.setForeground(new java.awt.Color(51, 51, 55));
        btnExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        btnExcluirFuncionario.setBorder(null);
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
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
                .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConsultarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriarFuncionario)
                .addGap(73, 73, 73)
                .addComponent(btnAlterarFuncionario)
                .addGap(70, 70, 70)
                .addComponent(btnExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirFuncionario)
                    .addComponent(btnConsultarFuncionario)
                    .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnCriarFuncionario)
                    .addComponent(btnAlterarFuncionario))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelDadosPessoais.setBackground(new java.awt.Color(226, 238, 251));
        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNomeFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeFuncionario.setText("Nome:");

        txtNomeFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNomeFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeFuncionarioMouseEntered(evt);
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

        rbtnFeminFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        generoFuncionario.add(rbtnFeminFuncionario);
        rbtnFeminFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnFeminFuncionario.setText("Feminino");
        rbtnFeminFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnFeminFuncionario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnFeminFuncionarioStateChanged(evt);
            }
        });

        rbtnMascFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        generoFuncionario.add(rbtnMascFuncionario);
        rbtnMascFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnMascFuncionario.setText("Masculino");
        rbtnMascFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnMascFuncionario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnMascFuncionarioStateChanged(evt);
            }
        });
        rbtnMascFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMascFuncionarioActionPerformed(evt);
            }
        });

        rbtnOutrosFuncionario.setBackground(new java.awt.Color(226, 238, 251));
        generoFuncionario.add(rbtnOutrosFuncionario);
        rbtnOutrosFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnOutrosFuncionario.setText("Outros");
        rbtnOutrosFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnOutrosFuncionario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnOutrosFuncionarioStateChanged(evt);
            }
        });
        rbtnOutrosFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOutrosFuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Dados Pessoais");

        txtEmailFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmailFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailFuncionarioMouseEntered(evt);
            }
        });
        txtEmailFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailFuncionarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Estado Civil:");

        try {
            txtCPFFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCPFFuncionarioMouseEntered(evt);
            }
        });

        try {
            txtTelefoneFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTelefoneFuncionarioMouseEntered(evt);
            }
        });

        cbxEstadoCivFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar Senha:");

        try {
            txtDataFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lblNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(rbtnMascFuncionario)
                                .addGap(26, 26, 26)
                                .addComponent(rbtnFeminFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnOutrosFuncionario))
                            .addComponent(jLabel9))
                        .addGap(158, 158, 158)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxEstadoCivFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConfirmarSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(lblDataNasCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(771, 771, 771)
                        .addComponent(jLabel11)))
                .addGap(378, 378, 378))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblDataNasCliente)
                    .addComponent(txtDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoCivFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbtnMascFuncionario)
                    .addComponent(rbtnFeminFuncionario)
                    .addComponent(rbtnOutrosFuncionario)
                    .addComponent(jLabel1)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmarSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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

        txtMunicipioFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumeroFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBairroFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLogradouroFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtComplementoFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtCepFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepFuncionarioActionPerformed(evt);
            }
        });

        cbxUFFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

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
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCepFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLogradouroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMunicipioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarCEP)
                        .addGap(141, 141, 141)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxUFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultarCEP)
                    .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtMunicipioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbxUFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtLogradouroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(15, 15, 15)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 1718, Short.MAX_VALUE)
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cdcLayout = new javax.swing.GroupLayout(cdc);
        cdc.setLayout(cdcLayout);
        cdcLayout.setHorizontalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1763, Short.MAX_VALUE)
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cdcLayout.setVerticalGroup(
            cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdcLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(cdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdcLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(cdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncionarioActionPerformed

    private void btnConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFuncionarioActionPerformed
        String minhasql = "SELECT * from colaborador where id = ?";
        Connection conexao = null;
        PreparedStatement ps = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionUtils.getConnection();
            ps = conexao.prepareStatement(minhasql);
            Long idColaborador = Long.parseLong(txtIdFuncionario.getText());
            ps.setLong(1, idColaborador);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                txtCPFFuncionario.setText(resultado.getString("cpf"));
                txtNomeFuncionario.setText(resultado.getString("nome"));
                String nascimento = StringUtils.converteDataParaOPrograma(resultado.getString("nascimento"));
                txtDataFuncionario.setText(nascimento);
                buttonGroupUtils.setButtonGroup(resultado.getString("genero"), generoFuncionario.getElements());
                txtTelefoneFuncionario.setText(resultado.getString("telefone"));
                txtEmailFuncionario.setText(resultado.getString("email"));
                cbxEstadoCivFuncionario.setSelectedItem(resultado.getString("estado_civil"));
                txtCepFuncionario.setText(resultado.getString("cep"));
                txtMunicipioFuncionario.setText(resultado.getString("cidade"));
                txtLogradouroFuncionario.setText(resultado.getString("logradouro"));
                txtNumeroFuncionario.setText(resultado.getString("numero"));
                txtComplementoFuncionario.setText(resultado.getString("complemento"));
                cbxUFFuncionario.setSelectedItem(resultado.getString("uf"));
                txtBairroFuncionario.setText(resultado.getString("bairro"));

            } else {
                JOptionPane.showMessageDialog(null, "Registro não existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não existe");

        } finally {
            ConnectionUtils.closeConnection(conexao, ps, resultado);
        }


    }//GEN-LAST:event_btnConsultarFuncionarioActionPerformed

    private void btnCriarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarFuncionarioActionPerformed

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja inserir um novo registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        char[] senha1 = txtSenhaFuncionario.getPassword();
        char[] senha2 = txtConfirmarSenhaFuncionario.getPassword();
        if (util.PasswordFieldUtils.confirmaSenhaIguais(senha1, senha2)) {
            if (escolha == 0) {
                String minhasql = "INSERT INTO colaborador (cpf, nome, nascimento,genero, telefone, email, estado_civil, cep, cidade, logradouro, numero, complemento, uf, bairro, senha)"
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
                        + " ?,"
                        + " ?);";
                Connection conexao = null;
                PreparedStatement ps = null;

                try {
                    conexao = ConnectionUtils.getConnection();
                    ps = conexao.prepareStatement(minhasql);
                    String CPF = StringUtils.limpaValorParaOBanco(txtCPFFuncionario.getText());
                    ps.setString(1, CPF);
                    ps.setString(2, txtNomeFuncionario.getText());
                    String dataConvertida = StringUtils.converteDataParaOBanco(txtDataFuncionario.getText());
                    ps.setString(3, dataConvertida);
                    ps.setString(4, genero);
                    String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneFuncionario.getText());
                    ps.setString(5, telefone);
                    ps.setString(6, txtEmailFuncionario.getText());
                    ps.setString(7, cbxEstadoCivFuncionario.getSelectedItem().toString());
                    ps.setString(8, StringUtils.limpaValorParaOBanco(txtCepFuncionario.getText()));
                    ps.setString(9, txtMunicipioFuncionario.getText());
                    ps.setString(10, txtLogradouroFuncionario.getText());
                    ps.setString(11, txtNumeroFuncionario.getText());
                    ps.setString(12, txtComplementoFuncionario.getText());
                    ps.setString(13, cbxUFFuncionario.getSelectedItem().toString());
                    ps.setString(14, txtBairroFuncionario.getText());
                    ps.setString(15, new String(txtSenhaFuncionario.getPassword()));
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso");

                    limpaTela();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possivel inserir o registro");

                } finally {
                    ConnectionUtils.closeConnection(conexao, ps);
                }
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha divergente");
        }


    }//GEN-LAST:event_btnCriarFuncionarioActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed

        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja atualizar este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (escolha == 0) {
            Connection conexao = null;
            PreparedStatement ps = null;
            ResultSet resultado = null;
            String senhaBD = null;

            try {
                String minhasql = "SELECT senha from colaborador where id = ?";
                ps = conexao.prepareStatement(minhasql);
                conexao = ConnectionUtils.getConnection();
                Long idFuncionario = Long.parseLong(txtIdFuncionario.getText());
                ps.setLong(1, idFuncionario);
                resultado = ps.executeQuery();
                if (resultado.next()) {
                    senhaBD = resultado.getString("senha");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Confira se a sua senha está correta");
            } finally {
                ConnectionUtils.closeConnection(conexao, ps, resultado);
            }
            char[] senhaAtual = txtSenhaFuncionario.getPassword();
            if (util.PasswordFieldUtils.confirmaSenhaIguais(senhaBD, senhaAtual)) {
                String minhasql = "UPDATE colaborador SET cpf = ?,"
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
                        + " bairro  =?,"
                        + "senha =?"
                        + " where id = ?;";

                try {
                    conexao = ConnectionUtils.getConnection();
                    ps = conexao.prepareStatement(minhasql);
                    String CPF = StringUtils.limpaValorParaOBanco(txtCPFFuncionario.getText());
                    ps.setString(1, CPF);
                    ps.setString(2, txtNomeFuncionario.getText());
                    String dataConvertida = StringUtils.converteDataParaOBanco(txtDataFuncionario.getText());
                    ps.setString(3, dataConvertida);
                    ps.setString(4, genero);
                    String telefone = StringUtils.limpaValorParaOBanco(txtTelefoneFuncionario.getText());
                    ps.setString(5, telefone);
                    ps.setString(6, txtEmailFuncionario.getText());
                    ps.setString(7, cbxEstadoCivFuncionario.getSelectedItem().toString());
                    ps.setString(8, StringUtils.limpaValorParaOBanco(txtCepFuncionario.getText()));
                    ps.setString(9, txtMunicipioFuncionario.getText());
                    ps.setString(10, txtLogradouroFuncionario.getText());
                    ps.setString(11, txtNumeroFuncionario.getText());
                    ps.setString(12, txtComplementoFuncionario.getText());
                    ps.setString(13, cbxUFFuncionario.getSelectedItem().toString());
                    ps.setString(14, txtBairroFuncionario.getText());
                    ps.setString(15, new String(txtConfirmarSenhaFuncionario.getPassword()));
                    Long idFuncionario = Long.parseLong(txtIdFuncionario.getText());
                    ps.setLong(16, idFuncionario);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso");
                    limpaTela();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o registro");

                } finally {
                    ConnectionUtils.closeConnection(conexao, ps);
                }
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha divergente");
        }
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir este registro?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (escolha == 0) {
            String minhasql = "delete from colaborador where id = ?;";
            Connection conexao = null;
            PreparedStatement ps = null;

            try {
                conexao = ConnectionUtils.getConnection();
                ps = conexao.prepareStatement(minhasql);
                Long idFuncionario = Long.parseLong(txtIdFuncionario.getText());
                ps.setLong(1, idFuncionario);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");

                limpaTela();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro");

            } finally {
                ConnectionUtils.closeConnection(conexao, ps);
            }
        } else {

        }
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

    private void txtTelefoneFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFuncionarioMouseEntered

    private void txtCPFFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFFuncionarioMouseEntered

    private void txtEmailFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFuncionarioActionPerformed

    private void txtEmailFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFuncionarioMouseEntered

    private void txtNomeFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioMouseEntered

    private void txtDataFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFuncionarioActionPerformed

    private void rbtnMascFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMascFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMascFuncionarioActionPerformed

    private void rbtnMascFuncionarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnMascFuncionarioStateChanged
        if (rbtnMascFuncionario.isSelected()) {
            genero = "Masculino";
        }
    }//GEN-LAST:event_rbtnMascFuncionarioStateChanged

    private void rbtnFeminFuncionarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnFeminFuncionarioStateChanged
        if (rbtnFeminFuncionario.isSelected()) {
            genero = "Feminino";
        }


    }//GEN-LAST:event_rbtnFeminFuncionarioStateChanged

    private void rbtnOutrosFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOutrosFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOutrosFuncionarioActionPerformed

    private void rbtnOutrosFuncionarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnOutrosFuncionarioStateChanged
        if (rbtnOutrosFuncionario.isSelected()) {
            genero = "Outros";
        }

    }//GEN-LAST:event_rbtnOutrosFuncionarioStateChanged

    private void txtIdFuncionarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdFuncionarioCaretUpdate

        if (!txtIdFuncionario.getText().isEmpty()) {
            btnCriarFuncionario.setEnabled(false);
            btnAlterarFuncionario.setEnabled(true);
            btnExcluirFuncionario.setEnabled(true);
            jLabel1.setText("Senha Atual:");
            jLabel4.setText("Nova Senha:");
        } else {
            btnCriarFuncionario.setEnabled(true);
            btnAlterarFuncionario.setEnabled(false);
            btnExcluirFuncionario.setEnabled(false);
            jLabel1.setText("Senha :");
            jLabel4.setText("Confirmar Senha:");
        }
    }//GEN-LAST:event_txtIdFuncionarioCaretUpdate

    private void txtCepFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepFuncionarioActionPerformed

    private void btnConsultarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCEPActionPerformed
        String CEP = (util.StringUtils.limpaValorParaOBanco(txtCepFuncionario.getText()));
        JSONObject endereco = util.ViaCep.buscarCep(CEP);
        try {
            txtMunicipioFuncionario.setText(endereco.getString("localidade"));
            txtLogradouroFuncionario.setText(endereco.getString("logradouro"));
            txtBairroFuncionario.setText(endereco.getString("bairro"));
            cbxUFFuncionario.setSelectedItem(endereco.getString("uf"));
            txtComplementoFuncionario.setText(endereco.getString("complemento"));
        } catch (JSONException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o CEP", "ERRO", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnConsultarCEPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnConsultarCEP;
    private javax.swing.JButton btnConsultarFuncionario;
    private javax.swing.JButton btnCriarFuncionario;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JComboBox<String> cbxEstadoCivFuncionario;
    private javax.swing.JComboBox<String> cbxUFFuncionario;
    private javax.swing.JPanel cdc;
    private javax.swing.ButtonGroup generoFuncionario;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JRadioButton rbtnFeminFuncionario;
    private javax.swing.JRadioButton rbtnMascFuncionario;
    private javax.swing.JRadioButton rbtnOutrosFuncionario;
    private javax.swing.JTextField txtBairroFuncionario;
    private javax.swing.JFormattedTextField txtCPFFuncionario;
    private javax.swing.JFormattedTextField txtCepFuncionario;
    private javax.swing.JTextField txtComplementoFuncionario;
    private javax.swing.JPasswordField txtConfirmarSenhaFuncionario;
    private javax.swing.JFormattedTextField txtDataFuncionario;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtLogradouroFuncionario;
    private javax.swing.JTextField txtMunicipioFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNumeroFuncionario;
    private javax.swing.JPasswordField txtSenhaFuncionario;
    private javax.swing.JFormattedTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
