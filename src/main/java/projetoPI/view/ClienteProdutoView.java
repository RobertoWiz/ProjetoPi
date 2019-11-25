/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.view;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoPI.controller.ClienteController;


public final class ClienteProdutoView extends javax.swing.JFrame {

    ListaClienteView lista = new ListaClienteView();
    private String modoTela;

    ;
   
      public ClienteProdutoView() {
        initComponents();

        LoadTable1();

        this.setLocationRelativeTo(null);

        DesabilitarFormulario();
        btnSalvarCliente.setEnabled(false);
        btnCancelarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(true);
        btnEditarCliente.setEnabled(true);

        //Oculto O ID
        lblIDCliente.setVisible(false);
    }

    public void LoadTable1() {
        ArrayList<String[]> listaClientes = ClienteController.getClientes();

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("ID");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("Nome"); //2
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("DAta de Nascimento");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("Email");
        tmCliente.addColumn("Telefone");
        tmCliente.addColumn("Celular");
        tmCliente.addColumn("Rua");
        tmCliente.addColumn("Numero");
        tmCliente.addColumn("Complemento");
        tmCliente.addColumn("Bairro");
        tmCliente.addColumn("Cidade");
        tmCliente.addColumn("UF");
        tmCliente.addColumn("CEP");

        tblCliente.setModel(tmCliente);

        //tblCliente.removeColumn(tblCliente.getColumnModel().getColumn(0));
        
        for (String[] c : listaClientes) {
            tmCliente.addRow(c);
        }

        //Defino o tamanho para cada coluna
        // tmProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(13).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(14).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(15).setPreferredWidth(100);
       
        
        
    }

    public void LimparFormulario() {
        CampoCpf.setText("");
        CampoCliente.setText("");
//ComboBoxSexo.setText("");
//        CampoNascimento.setText("");
//ComboBoxEstadoCivil.setText("");
        CampoEmail.setText("");
        CampoTelefone.setText("");
        CampoCelular1.setText("");
        CampoRua.setText("");
        CampoNumero.setText("");
        CampoComplemento.setText("");
        CampoBairro.setText("");
        CampoCidade.setText("");
//ComboBoxUf.setText("");
        CampoCep.setText("");

    }

    public void DesabilitarFormulario() {
        CampoCpf.setEnabled(false);
        CampoCliente.setEnabled(false);
        ComboBoxSexo.setEnabled(false);
        CampoNascimento.setEnabled(false);
        ComboBoxEstadoCivil.setEnabled(false);
        CampoEmail.setEnabled(false);
        CampoTelefone.setEnabled(false);
        CampoCelular1.setEnabled(false);
        CampoRua.setEnabled(false);
        CampoNumero.setEnabled(false);
        CampoComplemento.setEnabled(false);
        CampoBairro.setEnabled(false);
        CampoCidade.setEnabled(false);
        ComboBoxUf.setEnabled(false);
        CampoCep.setEnabled(false);

    }

    public void HabilitarFormulario() {
        CampoCpf.setEnabled(true);
        CampoCliente.setEnabled(true);
        ComboBoxSexo.setEnabled(true);
        CampoNascimento.setEnabled(true);
        ComboBoxEstadoCivil.setEnabled(true);
        CampoEmail.setEnabled(true);
        CampoTelefone.setEnabled(true);
        CampoCelular1.setEnabled(true);
        CampoRua.setEnabled(true);
        CampoNumero.setEnabled(true);
        CampoComplemento.setEnabled(true);
        CampoBairro.setEnabled(true);
        CampoCidade.setEnabled(true);
        ComboBoxUf.setEnabled(true);
        CampoCep.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BarraRolagem = new javax.swing.JScrollPane();
        tblCliente8 = new javax.swing.JPanel();
        CampoDados = new javax.swing.JPanel();
        TxtCpf = new javax.swing.JLabel();
        TxtSexo = new javax.swing.JLabel();
        TxtNascimento = new javax.swing.JLabel();
        TxtTelefone = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JLabel();
        TxtNomeCliente = new javax.swing.JLabel();
        CampoCliente = new javax.swing.JTextField();
        ComboBoxSexo = new javax.swing.JComboBox<>();
        CampoEmail = new javax.swing.JTextField();
        CampoCelular1 = new javax.swing.JFormattedTextField();
        TxtEstadoCivil = new javax.swing.JLabel();
        ComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        CampoCpf = new javax.swing.JFormattedTextField();
        CampoTelefone = new javax.swing.JFormattedTextField();
        CampoNascimento = new javax.swing.JFormattedTextField();
        IconeModulo = new javax.swing.JLabel();
        btnAdicionarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        TxtModuloCliente = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        pnlSO = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CampoRua = new javax.swing.JTextField();
        CampoComplemento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CampoBairro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CampoCidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ComboBoxUf = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        CampoNumero = new javax.swing.JFormattedTextField();
        CampoCep = new javax.swing.JFormattedTextField();
        btnExcluirCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnCancelarCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        lblIDCliente = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra Personalizada");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        CampoDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Básicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        CampoDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TxtCpf.setText("CPF/CNPJ*");

        TxtSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TxtSexo.setText("Sexo*");

        TxtNascimento.setText("Data Nascimento*");

        TxtTelefone.setText("Telefone");

        TxtEmail.setText("Email");

        TxtCelular.setText("Celular*");

        TxtNomeCliente.setText("Nome do Cliente*");

        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        try {
            CampoCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCelular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCelular1ActionPerformed(evt);
            }
        });

        TxtEstadoCivil.setText("Estado Cívil*");

        ComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo" }));

        try {
            CampoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            CampoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CampoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout CampoDadosLayout = new javax.swing.GroupLayout(CampoDados);
        CampoDados.setLayout(CampoDadosLayout);
        CampoDadosLayout.setHorizontalGroup(
            CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CampoDadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtTelefone)
                    .addComponent(TxtCpf)
                    .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail))
                .addGap(18, 18, 18)
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CampoDadosLayout.createSequentialGroup()
                        .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(CampoDadosLayout.createSequentialGroup()
                                .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtNomeCliente))
                            .addGroup(CampoDadosLayout.createSequentialGroup()
                                .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(TxtNascimento)))
                        .addGap(18, 18, 18)
                        .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CampoDadosLayout.createSequentialGroup()
                                .addComponent(CampoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEstadoCivil)
                                .addGap(29, 29, 29)
                                .addComponent(ComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoCliente)))
                    .addGroup(CampoDadosLayout.createSequentialGroup()
                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(TxtCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        CampoDadosLayout.setVerticalGroup(
            CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CampoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNomeCliente)
                    .addComponent(CampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSexo)
                    .addComponent(TxtNascimento)
                    .addComponent(TxtEstadoCivil)
                    .addComponent(ComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(CampoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefone)
                    .addComponent(TxtCelular)
                    .addComponent(CampoCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        IconeModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-user-icon.png"))); // NOI18N

        btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-plus-icon.png"))); // NOI18N
        btnAdicionarCliente.setText("Adicionar");
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-notes-icon.png"))); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        TxtModuloCliente.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        TxtModuloCliente.setText("Módulo de Cliente");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-search-icon_1.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        pnlSO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Rua*");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Complemento");

        jLabel10.setText("Cidade*");

        jLabel15.setText("Bairro");

        jLabel21.setText("Número*");

        jLabel22.setText("UF*");

        ComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel31.setText("CEP");

        CampoNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        try {
            CampoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlSOLayout = new javax.swing.GroupLayout(pnlSO);
        pnlSO.setLayout(pnlSOLayout);
        pnlSOLayout.setHorizontalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSOLayout.createSequentialGroup()
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addComponent(CampoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSOLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlSOLayout.setVerticalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CampoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel7)
                    .addComponent(CampoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(ComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(CampoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel15, jLabel6, jLabel7});

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CampoBairro, CampoCidade, CampoComplemento, CampoRua});

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-cross-icon.png"))); // NOI18N
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCliente);

        btnCancelarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (1).png"))); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-ok-icon.png"))); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        lblIDCliente.setText("lblID");

        javax.swing.GroupLayout tblCliente8Layout = new javax.swing.GroupLayout(tblCliente8);
        tblCliente8.setLayout(tblCliente8Layout);
        tblCliente8Layout.setHorizontalGroup(
            tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblCliente8Layout.createSequentialGroup()
                .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tblCliente8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tblCliente8Layout.createSequentialGroup()
                                .addComponent(IconeModulo)
                                .addGap(18, 18, 18)
                                .addComponent(TxtModuloCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIDCliente)
                                .addGap(51, 51, 51))
                            .addComponent(CampoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(tblCliente8Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tblCliente8Layout.createSequentialGroup()
                                .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tblCliente8Layout.createSequentialGroup()
                                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tblCliente8Layout.setVerticalGroup(
            tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblCliente8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tblCliente8Layout.createSequentialGroup()
                        .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IconeModulo)
                            .addComponent(TxtModuloCliente))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblCliente8Layout.createSequentialGroup()
                        .addComponent(lblIDCliente)
                        .addGap(28, 28, 28)))
                .addComponent(CampoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tblCliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        CampoDados.getAccessibleContext().setAccessibleName("Selecione o cliente");
        CampoDados.getAccessibleContext().setAccessibleDescription("");

        BarraRolagem.setViewportView(tblCliente8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if (tblCliente.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblCliente.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDcliente = Integer.parseInt(tblCliente.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if (ClienteController.excluir(IDcliente)) {
                this.LoadTable1();
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o Cliente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há Cliente para Excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        
        HabilitarFormulario() ;
        lista.setVisible(true);
        
        //     CampoCpf.setEnabled(true);
        //    CampoCliente.setEnabled(true);
        
       //  ListaClienteView novaJanela3 = new ListaClienteView();
       //  novaJanela3.telaVenda3 = this;
        // novaJanela3.setVisible(true);
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (tblCliente.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if (tblCliente.getSelectedRow() >= 0) {
                HabilitarFormulario();

                btnAdicionarCliente.setEnabled(false);
                btnExcluirCliente.setEnabled(false);
                btnEditarCliente.setEnabled(false);
                btnConsultar.setEnabled(false);
                btnSalvarCliente.setEnabled(true);
                btnCancelarCliente.setEnabled(true);

                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                lblIDCliente.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 0).toString());
                CampoCpf.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 1).toString());
                CampoCliente.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                ComboBoxSexo.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 3).toString());
                CampoNascimento.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 4).toString());
                ComboBoxEstadoCivil.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 5).toString());
                CampoEmail.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 6).toString());
                CampoTelefone.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 7).toString());
                CampoCelular1.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 8).toString());
                CampoRua.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 9).toString());
                CampoNumero.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 10).toString());
                CampoComplemento.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 11).toString());
                CampoBairro.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 12).toString());
                CampoCidade.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 13).toString());
                ComboBoxUf.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 14).toString());
                CampoCep.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 15).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um Produto para editar para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para editar!");
        }


    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();

        btnSalvarCliente.setEnabled(true);
        btnCancelarCliente.setEnabled(true);
        btnAdicionarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
        btnEditarCliente.setEnabled(false);
        btnConsultar.setEnabled(false);

    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if (ClienteController.salvar(
                        CampoCpf.getText(),
                        CampoCliente.getText(),
                        ComboBoxSexo.getSelectedItem().toString(),
                        CampoNascimento.getText(),
                        ComboBoxEstadoCivil.getSelectedItem().toString(),
                        CampoEmail.getText(),
                        CampoTelefone.getText(),
                        CampoCelular1.getText(),
                        CampoRua.getText(),
                        CampoNumero.getText(),
                        CampoComplemento.getText(),
                        CampoBairro.getText(),
                        CampoCidade.getText(),
                        ComboBoxUf.getSelectedItem().toString(),
                        CampoCep.getText()
                )) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable1();

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar Cliente !");
                }

                btnAdicionarCliente.setEnabled(true);
                btnExcluirCliente.setEnabled(true);
                btnEditarCliente.setEnabled(true);
                btnConsultar.setEnabled(true);
                btnSalvarCliente.setEnabled(false);
                btnCancelarCliente.setEnabled(false);

            } else {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if (ClienteController.atualizar(
                        Integer.parseInt(lblIDCliente.getText()),
                        CampoCpf.getText(),
                        CampoCliente.getText(),
                        ComboBoxSexo.getSelectedItem().toString(),
                        CampoNascimento.getText(),
                        ComboBoxEstadoCivil.getSelectedItem().toString(),
                        CampoEmail.getText(),
                        CampoTelefone.getText(),
                        CampoCelular1.getText(),
                        CampoRua.getText(),
                        CampoNumero.getText(),
                        CampoComplemento.getText(),
                        CampoBairro.getText(),
                        CampoCidade.getText(),
                        ComboBoxUf.getSelectedItem().toString(),
                        CampoCep.getText()
                )) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable1();
                    JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar Produto!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
            btnAdicionarCliente.setEnabled(true);
            btnExcluirCliente.setEnabled(true);
            btnEditarCliente.setEnabled(true);
            btnConsultar.setEnabled(true);
            btnSalvarCliente.setEnabled(false);
            btnCancelarCliente.setEnabled(false);
        }


    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        LimparFormulario();
        DesabilitarFormulario();
        btnAdicionarCliente.setEnabled(true);
        btnExcluirCliente.setEnabled(true);
        btnEditarCliente.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnSalvarCliente.setEnabled(false);
        btnCancelarCliente.setEnabled(false);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void CampoCelular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCelular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCelular1ActionPerformed

      //   public void definirNomeCli(String nomecli){
     //    this.CampoCliente.setText(String.valueOf(nomecli));
   //  }
   
   // public void definirCpf (String cpf){
   //      this.CampoCpf.setText(cpf);
   //  }
    
    
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
            java.util.logging.Logger.getLogger(ClienteProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteProdutoView().setVisible(true);
            }
        });
    }

 public void Enome(String nomecli){
     CampoCliente.setText(nomecli);  
 }
 
  public void Etotal(String total){
     CampoCpf.setText(total);  
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BarraRolagem;
    private javax.swing.JTextField CampoBairro;
    private javax.swing.JFormattedTextField CampoCelular1;
    private javax.swing.JFormattedTextField CampoCep;
    private javax.swing.JTextField CampoCidade;
    private javax.swing.JTextField CampoCliente;
    private javax.swing.JTextField CampoComplemento;
    private javax.swing.JFormattedTextField CampoCpf;
    private javax.swing.JPanel CampoDados;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JFormattedTextField CampoNascimento;
    private javax.swing.JFormattedTextField CampoNumero;
    private javax.swing.JTextField CampoRua;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JComboBox<String> ComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> ComboBoxSexo;
    private javax.swing.JComboBox<String> ComboBoxUf;
    private javax.swing.JLabel IconeModulo;
    private javax.swing.JLabel TxtCelular;
    private javax.swing.JLabel TxtCpf;
    private javax.swing.JLabel TxtEmail;
    private javax.swing.JLabel TxtEstadoCivil;
    private javax.swing.JLabel TxtModuloCliente;
    private javax.swing.JLabel TxtNascimento;
    private javax.swing.JLabel TxtNomeCliente;
    private javax.swing.JLabel TxtSexo;
    private javax.swing.JLabel TxtTelefone;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JPanel pnlSO;
    private javax.swing.JTable tblCliente;
    private javax.swing.JPanel tblCliente8;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.CampoCpf.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o CPF!");
            return false;
        }

        if (this.CampoCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma descricao para o CLIENTE");
            return false;
        }

        if (this.CampoNascimento.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina UM VALOR PARA O DATA NASCIMENTO");
            return false;
        }

        if (this.CampoTelefone.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um valor para o TELEFONE");
            return false;
        }

        if (this.CampoRua.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um RUA!");
            return false;
        }
        if (this.CampoCidade.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CIDADE!");
            return false;
        }

        if (this.CampoCep.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CEP!");
            return false;
        }
        if (this.CampoCelular1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CELULAR!");
            return false;
        }

        return true;

    }

 //   void definirNomecli(String selNomecli) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }
//
 //   void definirCpf(String selCpf) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }

}
