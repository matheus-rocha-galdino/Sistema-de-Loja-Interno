/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import telas.CadastroCliente;
import telas.CadastroFornecedor;
import telas.CadastroFuncionario;
import telas.CadastroProduto;
import telas.Panel1;
import telas.Panel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.ItensdoMenu;

/**
 *
 * @author guilh
 */
public class Tl_principalpi extends javax.swing.JFrame {

    /**
     * Creates new form Tl_principalpi
     */
    public Tl_principalpi() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        ImageIcon iconUser = new ImageIcon(getClass().getResource("/menu/usuario.png"));
        ImageIcon iconCadastro = new ImageIcon(getClass().getResource("/menu/cadastro.png"));
        ImageIcon iconCompra = new ImageIcon(getClass().getResource("/menu/compra.png"));
        ImageIcon iconRelatorio = new ImageIcon(getClass().getResource("/menu/relatorio.png"));
        ImageIcon iconSubmenu = new ImageIcon(getClass().getResource("/menu/submenu.png"));

        ItensdoMenu menuUser1 = new ItensdoMenu(iconSubmenu, "Meu Perfil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new Panel1());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuUser2 = new ItensdoMenu(iconSubmenu, "Minhas Vendas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new Panel2());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuUser3 = new ItensdoMenu(iconSubmenu, "Sair",null);

        ItensdoMenu menuCadastro1 = new ItensdoMenu(iconSubmenu, "Cliente",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroCliente());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuCadastro2 = new ItensdoMenu(iconSubmenu, "Fornecedor",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroFornecedor());
                painelCorpo.repaint();
                painelCorpo.revalidate(); 
            }
        });
        ItensdoMenu menuCadastro3 = new ItensdoMenu(iconSubmenu, "Colaborador",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroFuncionario());
                painelCorpo.repaint();
                painelCorpo.revalidate();
               
            }
        });
        ItensdoMenu menuCadastro4 = new ItensdoMenu(iconSubmenu, "Produto",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               painelCorpo.removeAll();
                painelCorpo.add(new CadastroProduto());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });

        ItensdoMenu menuCompra1 = new ItensdoMenu(iconSubmenu, "Venda de Produto", null);
        ItensdoMenu menuCompra2 = new ItensdoMenu(iconSubmenu, "Compra de Produto",null);
        ItensdoMenu menuCompra3 = new ItensdoMenu(iconSubmenu, "Historico do Dia",null);

        ItensdoMenu menuRelatorio1 = new ItensdoMenu(iconSubmenu, "Analitíco",null);
        ItensdoMenu menuRelotorio2 = new ItensdoMenu(iconSubmenu, "Sintético",null);

        ItensdoMenu menuUser = new ItensdoMenu(iconUser, "USUÁRIO", null, menuUser1, menuUser2, menuUser3);
        ItensdoMenu menuCadastro = new ItensdoMenu(iconCadastro, "CADASTROS", null, menuCadastro1, menuCadastro2, menuCadastro3, menuCadastro4);
        ItensdoMenu menuCompra = new ItensdoMenu(iconCompra, "VENDA/COMPRA", null, menuCompra1, menuCompra2, menuCompra3);
        ItensdoMenu menuRelatorio = new ItensdoMenu(iconRelatorio, "RELATÓRIOS", null, menuRelatorio1, menuRelotorio2);

        addmenu(menuUser, menuCadastro, menuCompra, menuRelatorio);

    }

    private void addmenu(ItensdoMenu... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);

            ArrayList<ItensdoMenu> subMenu = menu[i].getSubMenu();
            for (ItensdoMenu m : subMenu) {
                addmenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        painelCabeca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        painelCorpo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("cadastros");

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCabeca.setBackground(new java.awt.Color(3, 150, 166));
        painelCabeca.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout painelCabecaLayout = new javax.swing.GroupLayout(painelCabeca);
        painelCabeca.setLayout(painelCabecaLayout);
        painelCabecaLayout.setHorizontalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        painelCabecaLayout.setVerticalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecaLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(painelCabeca, java.awt.BorderLayout.PAGE_START);

        painelMenu.setBackground(new java.awt.Color(204, 204, 204));
        painelMenu.setPreferredSize(new java.awt.Dimension(250, 375));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(7, 51, 89));
        menus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        getContentPane().add(painelMenu, java.awt.BorderLayout.LINE_START);

        painelCorpo.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102)));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel2.setText("Vendas Mensal");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("8");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-performance-de-vendas-40 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(32, 178, 170));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102)));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 70));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel5.setText("Colaboradores");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("4");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-funcionário-homem-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(32, 178, 170));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102)));
        jPanel4.setMaximumSize(new java.awt.Dimension(200, 70));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel3.setText("Clientes");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("6");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-customers-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102)));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 70));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel4.setText("Lucro Mensal");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("R$ 1.200,00");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-performance-de-vendas-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelCorpoLayout = new javax.swing.GroupLayout(painelCorpo);
        painelCorpo.setLayout(painelCorpoLayout);
        painelCorpoLayout.setHorizontalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        painelCorpoLayout.setVerticalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        getContentPane().add(painelCorpo, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(811, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tl_principalpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tl_principalpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tl_principalpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tl_principalpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tl_principalpi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel painelCabeca;
    private javax.swing.JPanel painelCorpo;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}
