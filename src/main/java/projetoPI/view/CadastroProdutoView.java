/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.view;



import projetoPI.controller.ProdutoController;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import projetoPI.view.ListaProdutoView;


public final class CadastroProdutoView extends javax.swing.JFrame {
    ListaProdutoView produto = new ListaProdutoView ();
   // ListaProdutoView tblProduto = new ListaProdutoView();
    private String modoTela;
    
   ;
    
    public CadastroProdutoView() {
        initComponents();
       // tblProduto.setVisible(false);
        LoadTable();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        
        
        //Oculto O ID
     //  lblIDProduto.setVisible(false);
    }
    
   public void LoadTable(){
    ArrayList<String[]> listaProdutos = ProdutoController.getProdutos();
    
    DefaultTableModel tmProduto = new DefaultTableModel();
    
          tmProduto.addColumn("SEQ");
          tmProduto.addColumn("PRODUTO");
          tmProduto.addColumn("DESCRICAO"); //2
          tmProduto.addColumn("CATEGORIA");
 
          tmProduto.addColumn("VALOR");

          tmProduto.addColumn("MARCA");
          tmProduto.addColumn("LINHA");
   
           tmProduto.addColumn("ESTOQUE");
           tmProduto.addColumn("UNIDADE");
           tmProduto.addColumn("OBS");

          tblProduto.setModel(tmProduto);
          
            //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
       
        
       // tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(17));
       // tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(18));
      // tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(19));
 
    //Opção 2 - Descomentar linhas abaixo caso queira reutilizar o modelo padrão
        //Resgato o modelo da tabela
       // DefaultTableModel tmProduto = (DefaultTableModel) this.txtIdProduto.getModel();
        ////Limpo a tabela, excluindo todas as linhas
        //tmClientes.setRowCount(0);
    
    for(String[] c : listaProdutos)
        {
            tmProduto.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
    // tmProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
      tblProduto.getColumnModel().getColumn(0).setPreferredWidth(5);
      tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(6).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(7).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(8).setPreferredWidth(100);
 
     // tblProduto.getColumnModel().getColumn(15).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(16).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(17).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(18).setPreferredWidth(100);
    //  tblProduto.getColumnModel().getColumn(19).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(20).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(21).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(22).setPreferredWidth(100);
     // tblProduto.getColumnModel().getColumn(23).setPreferredWidth(100);   
     // tblProduto.getColumnModel().getColumn(24).setPreferredWidth(100);
      //tblProduto.getColumnModel().getColumn(25).setPreferredWidth(100);  

    
}
    
    public void LimparFormulario()
    {
txtIdProduto.setText("");
txtNomeProduto.setText("");
txtDescricaoProduto.setText("");
//txtCategoriaProduto.setText("Sofa");
//txtSubcategoriaProduto.setText("");
txtValorvendaProduto.setText("");

//txtGarantiaProduto.setText("");
txtMarcaProduto.setText("");
txtLinhaProduto.setText("");

//txtUffornProduto.setText("AC");

txtEstoqueProduto.setText("");
//txtUnidademProduto.setText("");
txtRefProduto.setText("");

        
    }
    
    
       public void DesabilitarFormulario()
    {
txtIdProduto.setEnabled(false);
txtNomeProduto.setEnabled(false);
txtDescricaoProduto.setEnabled(false);
txtCategoriaProduto.setEnabled(false);

txtValorvendaProduto.setEnabled(false);

txtMarcaProduto.setEnabled(false);
txtLinhaProduto.setEnabled(false);

txtEstoqueProduto.setEnabled(false);
txtUnidademProduto.setEnabled(false);
txtRefProduto.setEnabled(false);


    } 
    
    
    
        public void HabilitarFormulario()
    {
        txtIdProduto.setEnabled(true);
txtDescricaoProduto.setEnabled(true);
txtNomeProduto.setEnabled(true);
txtCategoriaProduto.setEnabled(true);

txtValorvendaProduto.setEnabled(true);

txtMarcaProduto.setEnabled(true);
txtLinhaProduto.setEnabled(true);

txtEstoqueProduto.setEnabled(true);
txtUnidademProduto.setEnabled(true);
txtRefProduto.setEnabled(true);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnlComputador = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCategoriaProduto = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtValorvendaProduto = new javax.swing.JFormattedTextField();
        txtMarcaProduto = new javax.swing.JTextField();
        txtLinhaProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        pnlHD3 = new javax.swing.JPanel();
        txtEstoqueProduto = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtUnidademProduto = new javax.swing.JComboBox<>();
        txtRefProduto = new javax.swing.JTextField();
        btnCancelarProduto = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnConsultarProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra Personalizada");
        setResizable(false);

        pnlComputador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        pnlComputador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Código*");

        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descrição*");

        jLabel8.setText("Categoria*");

        txtCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Móveis\t", "Utensilios Domesticos", "Cama, Mesa e Banho" }));
        txtCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoActionPerformed(evt);
            }
        });

        jLabel16.setText("Valor Venda (R$)");

        jLabel1.setText("Linha*");

        jLabel9.setText("Nome do Produto*");

        jLabel11.setText("Marca*");

        txtValorvendaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));

        javax.swing.GroupLayout pnlComputadorLayout = new javax.swing.GroupLayout(pnlComputador);
        pnlComputador.setLayout(pnlComputadorLayout);
        pnlComputadorLayout.setHorizontalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlComputadorLayout.createSequentialGroup()
                                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProduto))
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlComputadorLayout.createSequentialGroup()
                                .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarcaProduto)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLinhaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlComputadorLayout.setVerticalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLinhaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtValorvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-ok-icon.png"))); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-cross-icon.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        pnlHD3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        txtEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueProdutoActionPerformed(evt);
            }
        });

        jLabel13.setText("Referencias/Obs.:");

        jLabel23.setText("Estoque*");

        jLabel31.setText("Unidade de Medida");

        txtUnidademProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litros", "Unidades", "Metros" }));
        txtUnidademProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidademProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHD3Layout = new javax.swing.GroupLayout(pnlHD3);
        pnlHD3.setLayout(pnlHD3Layout);
        pnlHD3Layout.setHorizontalGroup(
            pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHD3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHD3Layout.createSequentialGroup()
                        .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidademProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRefProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlHD3Layout.setVerticalGroup(
            pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHD3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtUnidademProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtRefProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (1).png"))); // NOI18N
        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-plus-icon.png"))); // NOI18N
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProduto);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Módulo de Produto");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-archive-icon.png"))); // NOI18N

        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-search-icon_1.png"))); // NOI18N
        btnConsultarProduto.setText("Consultar");
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-notes-icon.png"))); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlComputador.getAccessibleContext().setAccessibleName("Selecione o cliente");
        pnlComputador.getAccessibleContext().setAccessibleDescription("");

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
   
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        Random gerador = new Random();
        txtIdProduto.setText(Integer.toString(gerador.nextInt(60000)));
        btnAdicionarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        btnEditarProduto.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        // TODO add your handling code here:
        produto.setVisible(true);
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueProdutoActionPerformed

    private void txtCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProdutoActionPerformed

    private void txtUnidademProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidademProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidademProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
             
        if(ValidarFormulario())
        {
            if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(ProdutoController.salvar(

txtNomeProduto.getText(),
txtDescricaoProduto.getText(),
txtCategoriaProduto.getSelectedItem().toString(),

txtValorvendaProduto.getText(),

txtMarcaProduto.getText(),
txtLinhaProduto.getText(),

txtEstoqueProduto.getText(),
txtUnidademProduto.getSelectedItem().toString(),
txtRefProduto.getText()
                ))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    
                    JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                    LimparFormulario();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar Produto!");
                }

                 btnAdicionarProduto.setEnabled(true);
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
        btnConsultarProduto.setEnabled(true);
                
            }else
            {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if(ProdutoController.atualizar(
                        Integer.parseInt(txtIdProduto.getText()), 
txtNomeProduto.getText(),
txtDescricaoProduto.getText(),
txtCategoriaProduto.getSelectedItem().toString(),


txtMarcaProduto.getText(),
txtLinhaProduto.getText(),

txtEstoqueProduto.getText(),
txtUnidademProduto.getSelectedItem().toString(),
txtRefProduto.getText()      
                ))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this,"Carro atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar Carro!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
        btnAdicionarProduto.setEnabled(true);
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
        btnConsultarProduto.setEnabled(true);
        
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
     LimparFormulario();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel pnlComputador;
    private javax.swing.JPanel pnlHD3;
    private javax.swing.JTable tblProduto;
    private javax.swing.JComboBox<String> txtCategoriaProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JFormattedTextField txtEstoqueProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtLinhaProduto;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtRefProduto;
    private javax.swing.JComboBox<String> txtUnidademProduto;
    private javax.swing.JFormattedTextField txtValorvendaProduto;
    // End of variables declaration//GEN-END:variables

private boolean ValidarFormulario() {
        
        if(this.txtNomeProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o Modelo!");
            return false;
        }
        
        if(this.txtDescricaoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Ano para o Carro!");
            return false;
        }
        
         if(this.txtIdProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Ano para o Carro!");
            return false;
        }
        
        return true;
        
    }

}
