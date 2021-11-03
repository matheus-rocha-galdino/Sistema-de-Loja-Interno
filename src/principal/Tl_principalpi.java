/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import telas.CadastroCliente;
import telas.RelatorioAnalitico;
import telas.CadastroFornecedor;
import telas.CadastroFuncionario;
import telas.CadastroProduto;
import telas.MeuPerfil;
import telas.Panel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.ItensdoMenu;
import telas.Cartoes;
import telas.EntradaMercadoria;
import telas.MeuPerfil;
import telas.RelatorioSintetico;
import telas.SaidaMercadoria;

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
                painelCorpo.add(new MeuPerfil());
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
        
        ItensdoMenu menuCadastro1 = new ItensdoMenu(iconSubmenu, "Cliente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroCliente());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuCadastro2 = new ItensdoMenu(iconSubmenu, "Fornecedor", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroFornecedor());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuCadastro3 = new ItensdoMenu(iconSubmenu, "Colaborador", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroFuncionario());
                painelCorpo.repaint();
                painelCorpo.revalidate();
                
            }
        });
        ItensdoMenu menuCadastro4 = new ItensdoMenu(iconSubmenu, "Produto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new CadastroProduto());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        
        ItensdoMenu menuCompra1 = new ItensdoMenu(iconSubmenu, "Venda de Produto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new SaidaMercadoria());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuCompra2 = new ItensdoMenu(iconSubmenu, "Compra de Produto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new EntradaMercadoria());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        
        ItensdoMenu menuRelatorio1 = new ItensdoMenu(iconSubmenu, "Analitíco", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new RelatorioAnalitico());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        ItensdoMenu menuRelotorio2 = new ItensdoMenu(iconSubmenu, "Sintético", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painelCorpo.removeAll();
                painelCorpo.add(new RelatorioSintetico());
                painelCorpo.repaint();
                painelCorpo.revalidate();
            }
        });
        
        ItensdoMenu menuRelatorio3 = new ItensdoMenu(iconSubmenu, "Historico do Dia", null);
        
        ItensdoMenu menuUser = new ItensdoMenu(iconUser, "USUÁRIO", null, menuUser1, menuUser2);
        ItensdoMenu menuCadastro = new ItensdoMenu(iconCadastro, "CADASTROS", null, menuCadastro1, menuCadastro2, menuCadastro3, menuCadastro4);
        ItensdoMenu menuCompra = new ItensdoMenu(iconCompra, "VENDA/COMPRA", null, menuCompra1, menuCompra2);
        ItensdoMenu menuRelatorio = new ItensdoMenu(iconRelatorio, "RELATÓRIOS", null, menuRelatorio1, menuRelotorio2, menuRelatorio3);
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        painelCorpo = new javax.swing.JPanel();

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("cadastros");

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCabeca.setBackground(new java.awt.Color(3, 150, 166));
        painelCabeca.setPreferredSize(new java.awt.Dimension(795, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo35-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Iniciar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCabecaLayout = new javax.swing.GroupLayout(painelCabeca);
        painelCabeca.setLayout(painelCabecaLayout);
        painelCabecaLayout.setHorizontalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );
        painelCabecaLayout.setVerticalGroup(
            painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(painelCabecaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCabecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        getContentPane().add(painelMenu, java.awt.BorderLayout.LINE_START);

        jScrollPane3.setBorder(null);

        painelCorpo.setLayout(new java.awt.BorderLayout());
        jScrollPane3.setViewportView(painelCorpo);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(811, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        painelCorpo.removeAll();
        painelCorpo.add(new Cartoes());
        painelCorpo.repaint();
        painelCorpo.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel painelCabeca;
    private javax.swing.JPanel painelCorpo;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}
