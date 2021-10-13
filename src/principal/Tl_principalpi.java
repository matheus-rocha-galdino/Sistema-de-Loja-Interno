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
import telas.Cartoes;

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
        
        painelCorpo.add(new Cartoes());
        painelCorpo.repaint();
        painelCorpo.revalidate();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        painelCorpo = new javax.swing.JPanel();

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("cadastros");

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCabeca.setBackground(new java.awt.Color(3, 150, 166));
        painelCabeca.setPreferredSize(new java.awt.Dimension(795, 55));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Iniciar.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N

        javax.swing.GroupLayout painelCabecaLayout = new javax.swing.GroupLayout(painelCabeca);
        painelCabeca.setLayout(painelCabecaLayout);
        painelCabecaLayout.setHorizontalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );
        painelCabecaLayout.setVerticalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecaLayout.createSequentialGroup()
                .addGroup(painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCabecaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
        painelCorpo.setLayout(new java.awt.BorderLayout());
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel painelCabeca;
    private javax.swing.JPanel painelCorpo;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}
