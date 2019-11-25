/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.view;

/**
 *
 * @author Roberto
 */
public class TelaInicialView extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialView
     */
    ClienteProdutoView cliente = new ClienteProdutoView();
    CadastroProdutoView produto = new CadastroProdutoView();
    CadastroVendaView venda = new CadastroVendaView();
    RelatórioVendaView relatorio = new RelatórioVendaView();
    AnaliticoVendaView analitico = new AnaliticoVendaView();
    SobreView sobre = new SobreView();
    public TelaInicialView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        relatorioButton = new javax.swing.JButton();
        clienteButton = new javax.swing.JButton();
        produtoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vendasButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clienteMenu = new javax.swing.JMenuItem();
        produtoMenu = new javax.swing.JMenuItem();
        vendaMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        setResizable(false);

        relatorioButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        relatorioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/blue-chart-icon.png"))); // NOI18N
        relatorioButton.setText("Relatórios");
        relatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioButtonActionPerformed(evt);
            }
        });

        clienteButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        clienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-user-icon.png"))); // NOI18N
        clienteButton.setText("Clientes");
        clienteButton.setBorder(new javax.swing.border.MatteBorder(null));
        clienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteButtonActionPerformed(evt);
            }
        });

        produtoButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        produtoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-archive-icon.png"))); // NOI18N
        produtoButton.setText("Produtos");
        produtoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/blue-home-icon.png"))); // NOI18N
        jLabel1.setText("JAVA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 128));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        vendasButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        vendasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-tag-icon.png"))); // NOI18N
        vendasButton.setText("Vendas");
        vendasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 2, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Home Center");

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("Sistema desenvolvido pela Equipe Senac | Versão 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jMenu1.setText("Arquivos");
        jMenu1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (2).png"))); // NOI18N
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Módulos");
        jMenu2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        clienteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        clienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-user-icon (1).png"))); // NOI18N
        clienteMenu.setText("Cliente");
        clienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMenuActionPerformed(evt);
            }
        });
        jMenu2.add(clienteMenu);

        produtoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        produtoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-archive-icon.png"))); // NOI18N
        produtoMenu.setText("Produtos");
        produtoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoMenuActionPerformed(evt);
            }
        });
        jMenu2.add(produtoMenu);

        vendaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        vendaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-tag-icon.png"))); // NOI18N
        vendaMenu.setText("Vendas");
        vendaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaMenuActionPerformed(evt);
            }
        });
        jMenu2.add(vendaMenu);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");
        jMenu4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-chart-icon.png"))); // NOI18N
        jMenuItem8.setText("Vendas no Periodo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioMenuActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-chart-icon.png"))); // NOI18N
        jMenuItem9.setText("Analítico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analiticoMenuActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Sobre");
        jMenu3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-notes-icon.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produtoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vendasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(clienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clienteButton, produtoButton, relatorioButton, vendasButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(produtoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vendasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addComponent(relatorioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(168, 168, 168)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void relatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioButtonActionPerformed
        // TODO add your handling code here:
        relatorio.setVisible(true);
    }//GEN-LAST:event_relatorioButtonActionPerformed

    private void produtoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoButtonActionPerformed
        // TODO add your handling code here:
        produto.setVisible(true);
    }//GEN-LAST:event_produtoButtonActionPerformed

    private void vendasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasButtonActionPerformed
        // TODO add your handling code here:
        venda.setVisible(true);
    }//GEN-LAST:event_vendasButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteButtonActionPerformed
        // TODO add your handling code here:
        cliente.setVisible(true);
    }//GEN-LAST:event_clienteButtonActionPerformed

    private void clienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMenuActionPerformed
        // TODO add your handling code here:
        cliente.setVisible(true);
    }//GEN-LAST:event_clienteMenuActionPerformed

    private void produtoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoMenuActionPerformed
        // TODO add your handling code here:
        produto.setVisible(true);
    }//GEN-LAST:event_produtoMenuActionPerformed

    private void vendaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaMenuActionPerformed
        // TODO add your handling code here:
        venda.setVisible(true);
    }//GEN-LAST:event_vendaMenuActionPerformed

    private void relatorioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioMenuActionPerformed
        relatorio.setVisible(true);
    }//GEN-LAST:event_relatorioMenuActionPerformed

    private void analiticoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analiticoMenuActionPerformed
        analitico.setVisible(true);
    }//GEN-LAST:event_analiticoMenuActionPerformed

    private void sobreMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuActionPerformed
     sobre.setVisible(true)  ;      // TODO add your handling code here:
    }//GEN-LAST:event_sobreMenuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clienteButton;
    private javax.swing.JMenuItem clienteMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton produtoButton;
    private javax.swing.JMenuItem produtoMenu;
    private javax.swing.JButton relatorioButton;
    private javax.swing.JMenuItem vendaMenu;
    private javax.swing.JButton vendasButton;
    // End of variables declaration//GEN-END:variables
}
