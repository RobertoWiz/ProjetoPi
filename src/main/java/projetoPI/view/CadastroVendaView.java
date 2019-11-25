/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.view;
//import projetoPI.controller.ClienteController;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

//import projetoPI.controller.ProdutoController;
import projetoPI.controller.VendaController;
import projetoPI.model.Venda;


public final class CadastroVendaView extends javax.swing.JFrame {
     private String modoTela;
     
 
public Venda teste = new Venda();
     
   //  ListaProdutoView produto = new ListaProdutoView ();
   //  ListaClienteView lista = new ListaClienteView ();
     
    public CadastroVendaView() {
        initComponents();
        //VendaController.limpar();
        this.setLocationRelativeTo(null);
         LoadTable10();    
         Random gerador = new Random();
         txtPedido.setText(Integer.toString(gerador.nextInt(60000)));
         Desabilitar() ;
      
         txtCpf.setEditable(false);
         txtNomeCli.setEditable(false);
         txtCodProduto.setEditable(false);
         txtNomeProduto.setEditable(false);
         txtQntdDispo.setEditable(false);
         txtValor.setEditable(false);


    }
//public void LoadTable(){
 //   ArrayList<String[]> listaProdutos = ProdutoController.getProdutos();
//    ArrayList<String[]> listaClientes = ClienteController.getClientes();
//    
//    DefaultTableModel listaProduto = new DefaultTableModel();
//        listaProduto.addColumn("Cod Produto");
//        listaProduto.addColumn("Descr Produto");
 //       listaProduto.addColumn("Quantidade");
 //       listaProduto.addColumn("Valor");
 //       tblVenda.setModel(listaProduto);
    
//}


  public void LoadTable10() {
        ArrayList<String[]> listaVendas = VendaController.getVendas();

        DefaultTableModel tmVenda = new DefaultTableModel();
        tmVenda.addColumn("ID"); //0
        tmVenda.addColumn("CPF"); //1 1
        tmVenda.addColumn("Nome"); //2
        tmVenda.addColumn("Cod Prod"); //3  2
        tmVenda.addColumn("Nome Produto"); //4
        tmVenda.addColumn("Qtde"); //5
        tmVenda.addColumn("Valor"); //6
        tmVenda.addColumn("Qtde sel"); //7
        tmVenda.addColumn("TotalPagar"); //8
        tmVenda.addColumn("FormaPag"); //9
        tmVenda.addColumn("Pedido"); //10
        tmVenda.addColumn("Total"); //10

        tblVenda.setModel(tmVenda);
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(6));
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(8));
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(5));
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(3));
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(2));
        tblVenda.removeColumn(tblVenda.getColumnModel().getColumn(1));

        
        for (String[] c : listaVendas) {
            tmVenda.addRow(c);
        }

        //Defino o tamanho para cada coluna
        // tmProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblVenda.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblVenda.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblVenda.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblVenda.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblVenda.getColumnModel().getColumn(4).setPreferredWidth(20);
       // tblVenda.getColumnModel().getColumn(5).setPreferredWidth(50);
      //  tblVenda.getColumnModel().getColumn(6).setPreferredWidth(50);
      //  tblVenda.getColumnModel().getColumn(7).setPreferredWidth(50);
      //  tblVenda.getColumnModel().getColumn(8).setPreferredWidth(50);
       // tblVenda.getColumnModel().getColumn(9).setPreferredWidth(50);
       // tblVenda.getColumnModel().getColumn(10).setPreferredWidth(50);
  
        
    }
  
     public void LimparFormulario() {
        txtCpf.setText("");
                    txtNomeCli.setText("");
                    txtCodProduto.setText("");
                    txtNomeProduto.setText("");
                    txtQntdDispo.setText("");
                    txtValor.setText("");
                    txtQntdSel.setText("");
                    txtTotalPagar.setText("");
                    
                    
     }
     
     public void Desabilitar() {
         txtCpf.setEnabled(false);
         txtNomeCli.setEnabled(false);
         txtCodProduto.setEnabled(false);
         txtNomeProduto.setEnabled(false);
         txtQntdDispo.setEnabled(false);
         txtValor.setEnabled(false);
     }
     
     public void Habilitar() {
       //   txtCpf.setEnabled(false);
        //  txtNomeCli.setEnabled(false);
         txtCodProduto.setEnabled(true);
         txtNomeProduto.setEnabled(true);
         txtQntdDispo.setEnabled(true);
         txtValor.setEnabled(true);
     
     }
     
//public String selTotal(){
  //      String total = tblVenda.getModel().getValueAt(0, 0).toString();
    //    return total;           
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnlComputador = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        btnPesquiasrCli = new javax.swing.JButton();
        pnlHD = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtlougra = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlSO = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtQntdDispo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtQntdSel = new javax.swing.JFormattedTextField();
        pnlAcessorios = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        pnlAcessorios1 = new javax.swing.JPanel();
        lblFormaPAg = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        boxFormaPag = new javax.swing.JComboBox<>();
        txtTotalPagar = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtPedido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra Personalizada");
        setResizable(false);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(25, 23));

        pnlComputador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        pnlComputador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Documento*");

        jLabel5.setText("Nome do cliente*");

        btnPesquiasrCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/blue-search-icon.png"))); // NOI18N
        btnPesquiasrCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquiasrCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlComputadorLayout = new javax.swing.GroupLayout(pnlComputador);
        pnlComputador.setLayout(pnlComputadorLayout);
        pnlComputadorLayout.setHorizontalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquiasrCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlComputadorLayout.setVerticalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(btnPesquiasrCli, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCli)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25))
        );

        pnlHD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações da Entrega", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jCheckBox2.setText("Retirada em Loja");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setText("Endereço de Entrega");

        txtlougra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlougraActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Cidade*");

        jLabel1.setText("UF");

        jLabel18.setText("Logradouro*");

        jLabel20.setText("CEP*");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "BA", "DF", "ES" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Referencias/Obs.:");

        javax.swing.GroupLayout pnlHDLayout = new javax.swing.GroupLayout(pnlHD);
        pnlHD.setLayout(pnlHDLayout);
        pnlHDLayout.setHorizontalGroup(
            pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDLayout.createSequentialGroup()
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObs)
                            .addGroup(pnlHDLayout.createSequentialGroup()
                                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlHDLayout.createSequentialGroup()
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtlougra, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlHDLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addGroup(pnlHDLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox2)))
                .addContainerGap())
        );
        pnlHDLayout.setVerticalGroup(
            pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlougra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (1).png"))); // NOI18N
        btnCancelar.setText("Limpar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-tag-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Módulo de Venda");

        pnlSO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cod Produto*");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nome do Produto*");

        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });

        jLabel10.setText("Selecione a Quantidade*");

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-plus-icon.png"))); // NOI18N
        jButton2.setText("Adicionar Produto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor Unitário R$");

        jLabel15.setText("Quantidade Disponivel");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/blue-search-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtQntdSel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout pnlSOLayout = new javax.swing.GroupLayout(pnlSO);
        pnlSO.setLayout(pnlSOLayout);
        pnlSOLayout.setHorizontalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSOLayout.createSequentialGroup()
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSOLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtQntdDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSOLayout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQntdSel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSOLayout.setVerticalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtQntdDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(txtQntdSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel15, jLabel6, jLabel7});

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodProduto, txtNomeProduto, txtQntdDispo, txtValor});

        pnlAcessorios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho do Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        tblVenda.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Produto", "Descr Produto", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblVenda.setRowHeight(12);
        jScrollPane2.setViewportView(tblVenda);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (2).png"))); // NOI18N
        jButton3.setText("Excluir Produto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAcessoriosLayout = new javax.swing.GroupLayout(pnlAcessorios);
        pnlAcessorios.setLayout(pnlAcessoriosLayout);
        pnlAcessoriosLayout.setHorizontalGroup(
            pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcessoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAcessoriosLayout.setVerticalGroup(
            pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcessoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAcessorios1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        pnlAcessorios1.setPreferredSize(new java.awt.Dimension(478, 252));

        lblFormaPAg.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        lblFormaPAg.setText("Selecione a Forma");

        lblTotalPagar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblTotalPagar.setText("Total a Pagar");

        boxFormaPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "2x", "3x", "4x" }));
        boxFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFormaPagActionPerformed(evt);
            }
        });

        txtTotalPagar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        txtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlAcessorios1Layout = new javax.swing.GroupLayout(pnlAcessorios1);
        pnlAcessorios1.setLayout(pnlAcessorios1Layout);
        pnlAcessorios1Layout.setHorizontalGroup(
            pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcessorios1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormaPAg)
                    .addComponent(boxFormaPag, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAcessorios1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblTotalPagar)))
                .addGap(96, 96, 96))
        );
        pnlAcessorios1Layout.setVerticalGroup(
            pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcessorios1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAcessorios1Layout.createSequentialGroup()
                        .addGroup(pnlAcessorios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPagar)
                            .addComponent(lblFormaPAg))
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(boxFormaPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-ok-icon.png"))); // NOI18N
        btnSalvar.setText("Finalizar Compra");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel8.setText("Número do Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlComputador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlAcessorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAcessorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2)
                    .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAcessorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnSalvar});

        pnlComputador.getAccessibleContext().setAccessibleName("Selecione o cliente");
        pnlComputador.getAccessibleContext().setAccessibleDescription("");
        pnlHD.getAccessibleContext().setAccessibleName("Detalhes do Pedido");
        pnlAcessorios.getAccessibleContext().setAccessibleName("Produtos selecionados"); // NOI18N
        pnlAcessorios1.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
if ((ValidarFormulario()) &&  (ValidarFormulario2())) { 
   LimparFormulario();
   Random gerador = new Random();
   txtPedido.setText(Integer.toString(gerador.nextInt(60000)));
        if (VendaController.relatorio()) {
         JOptionPane.showMessageDialog(this, "Venda efetuada com  sucesso!");
        VendaController.limpar();
         this.LoadTable10();
        } else {
                JOptionPane.showMessageDialog(this, "Falha ao finalizar a venda");
            }
    }//GEN-LAST:event_btnSalvarActionPerformed
    }
    
    private void btnPesquiasrCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquiasrCliActionPerformed
   VendaController.limpar();
           txtCpf.setEnabled(true);
           txtNomeCli.setEnabled(true);
        
        ListaClienteView novaJanela2 = new ListaClienteView();
        novaJanela2.telaVenda2 = this;
        novaJanela2.setVisible(true);
 //   String cpf = "";
  //  String nome = "";
  //      Ecpf(cpf);
  //      Etotal(total);
  
          
           
    }//GEN-LAST:event_btnPesquiasrCliActionPerformed

    private void boxFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFormaPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxFormaPagActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtlougraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlougraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlougraActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBox2.isSelected()){
        txtCidade.setEnabled(false);
        txtCep.setEnabled(false);
        txtlougra.setEnabled(false);
        txtObs.setEnabled(false);}
        else {
        txtCidade.setEnabled(true);
        txtCep.setEnabled(true);
        txtlougra.setEnabled(true);
        txtObs.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    public void definirCodigoProduto(int codProduto){
        this.txtCodProduto.setText(String.valueOf(codProduto));
    }
   
    public void definirNomeProduto (String nomeProduto){
        this.txtNomeProduto.setText(nomeProduto);
    }
    public void definirEstoque (String estoque){
        this.txtQntdDispo.setText(estoque);
    }
    public void definirValor (String valor){
        this.txtValor.setText(String.valueOf(valor));
    }
    
    
      //public void definirCodigoProduto(int codCliente){
       // this.txt.setText(String.valueOf(codProduto));
    
    public void definirNomeCli(String nomecli){
        this.txtNomeCli.setText(String.valueOf(nomecli));
    }
   
    public void definirCpf (String cpf){
        this.txtCpf.setText(cpf);
    }
    
    

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  produto.setVisible(true);
        
        txtCidade.setText("");
                    txtCep.setText("");
                    txtlougra.setText("");
                    txtObs.setText("");
                    txtQntdSel.setText("");
        
        
        ListaProdutoView novaJanela = new ListaProdutoView();
        novaJanela.telaVenda = this;
        novaJanela.setVisible(true);
        Habilitar(); 
          jButton2.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        if (ValidarFormulario()) {
            modoTela = "Criar"; jButton2.setEnabled(false);
            if (modoTela.equals("Criar")) {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if (VendaController.salvar(txtCpf.getText(),
                    txtNomeCli.getText(),
                    txtCodProduto.getText(),
                    txtNomeProduto.getText(),
                    txtQntdDispo.getText(),
                    txtValor.getText(),
                    txtQntdSel.getText(),
                    txtTotalPagar.getText(),
                    boxFormaPag.getSelectedItem().toString(),
                    txtPedido.getText(),
                    txtPedido.getText()

                )) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    
                    this.LoadTable10();
                    Desabilitar();
                 //   selTotal();
               
                  
                    JOptionPane.showMessageDialog(null, "Produto Incluído na lista com sucesso!");
                    //LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao incluir o Produto !");
                }
    }//GEN-LAST:event_jButton2ActionPerformed
        }    
        txtTotalPagar.setText(tblVenda.getModel().getValueAt(0, 11).toString());
        
    }
    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void txtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        if (tblVenda.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblVenda.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int Id = Integer.parseInt(tblVenda.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if (VendaController.excluir(Id)) {
                
                this.LoadTable10();
                JOptionPane.showMessageDialog(this, "Produto excluído");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o Produto");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há Produto para Excluir!");
        }
                                                    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
   
        LimparFormulario();
        if (VendaController.limpar()) { 
          //  DefaultTableModel tmVenda = (DefaultTableModel) this.tblVenda.getModel();
          //  tmVenda.setRowCount(0);
       
       this.LoadTable10();
      // tblVenda.setVisible(false);
        JOptionPane.showMessageDialog(this, "Venda excluida");
        } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir venda");
            }
    }//GEN-LAST:event_btnCancelarActionPerformed


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
            java.util.logging.Logger.getLogger(CadastroVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVendaView().setVisible(true);
            }
        });
    }

 
  public void Eid(String id){
     txtCodProduto.setText(id);
 }
 public void Enomeproduto(String nomeproduto){
     txtNomeProduto.setText(nomeproduto);
 }
 
 public void Eestoque(String estoque){
     txtQntdDispo.setText(estoque);
 }
 public void Evalor(float valor){
     txtValor.setAlignmentX(valor);
 }
  public void Ecpf(String cpf){
        txtCpf.setText(cpf);
    }
 public void Enome(String nomecli){
     txtNomeCli.setText(nomecli);  
 }
 
  public void Etotal(String total){
     txtTotalPagar.setText(total);  
 }
 

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFormaPag;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquiasrCli;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFormaPAg;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JPanel pnlAcessorios;
    private javax.swing.JPanel pnlAcessorios1;
    private javax.swing.JPanel pnlComputador;
    private javax.swing.JPanel pnlHD;
    private javax.swing.JPanel pnlSO;
    private javax.swing.JTable tblVenda;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPedido;
    private javax.swing.JTextField txtQntdDispo;
    private javax.swing.JFormattedTextField txtQntdSel;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtValor;
    private javax.swing.JFormattedTextField txtlougra;
    // End of variables declaration//GEN-END:variables
 private boolean ValidarFormulario() {
        
        if(this.txtCodProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Selecione um Produto!");
            return false;
        }
        
        if(this.txtNomeProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Selecione um Produto!");
            return false;
        }
        
        if(this.txtQntdSel.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Digite a quantidade do produto");
                     jButton2.setEnabled(true);
            return false;
        }
        
         if(this.txtNomeCli.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Selecione o cliente!");
            return false;
        }
         int qntdSel = Integer.parseInt(this.txtQntdSel.getText());
         int qntdDis = Integer.parseInt(this.txtQntdDispo.getText());
          if(qntdSel > qntdDis)
        {
            JOptionPane.showMessageDialog(this,"Quantidade Selecionada maior que a Quantidade Disponivel!");
            return false;
        }
        
        
          
        return true;
        
    }


private boolean ValidarFormulario2() {
    
       if ((!this.jCheckBox2.isSelected()) && (this.txtlougra.getText().equalsIgnoreCase("")))
        {
            JOptionPane.showMessageDialog(this,"Digite o endereço de entrega!");
            return false;
        }
       
       if ((!this.jCheckBox2.isSelected()) && (this.txtCidade.getText().equalsIgnoreCase("")))
        {
            JOptionPane.showMessageDialog(this,"Digite a cidade de entrega!");
            return false;
        }
       
       if ((!this.jCheckBox2.isSelected()) && (this.txtCep.getText().equalsIgnoreCase("")))
        {
            JOptionPane.showMessageDialog(this,"Digite o CEP de entrega!");
            return false;
        }
       
 return true;
}
}
