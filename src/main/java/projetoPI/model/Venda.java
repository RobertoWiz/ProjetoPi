package projetoPI.model;


public class Venda {
    private static int qtdVendasCriados;
    
    private int id;
    private String cpf;
    private String nome;
    private String codprod;
    private String nomeprod;
    private String qtddisp;
    private String valor;
    private String qtdsel;
    private String totalpagar;
    private String formapag;
    private String pedido;
    private String total;
    
    public Venda() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdVendasCriados++;
        this.id = qtdVendasCriados;
    }

    public Venda(String pCpf, String pNome, String pCodProd, String pNomeProd,  String pQtdDisp, String pValor, 
            String pQtdSel, String pTotalPagar , String pFormaPag, String  pPedido, String pTotal ) {
        qtdVendasCriados++;
        this.id = qtdVendasCriados;
        this.cpf= pCpf;
        this.nome= pNome;
        this.codprod = pCodProd;
        this.nomeprod = pNomeProd;
        this.qtddisp = pQtdDisp;
        this.valor = pValor;
        this.qtdsel= pQtdSel;
        this.totalpagar =pTotalPagar;
        this.formapag= pFormaPag;
        this.pedido = pPedido;
        this.total= pTotal;
   }

    public Venda (int idVenda,String Cpf, String Nome, String CodProd, String NomeProd,  String QtdDisp, String Valor, 
            int QtdSel, String  TotalPagar , String FormaPag, String  pPedido, String pTotal ) {
        
        this.id = id;
        this.cpf= cpf;
        this.nome= nome;
        this.codprod = codprod;
        this.nomeprod = nomeprod;
        this.qtddisp = qtddisp;
        this.valor = valor;
        this.qtdsel= qtdsel;
        this.totalpagar =totalpagar;
        this.formapag= formapag;
        this.pedido = pedido;
        this.total=total;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodprod() {
        return codprod;
    }

    public void setCodprod(String codprod) {
        this.codprod = codprod;
    }

    
    public String getNomeprod() {
        return nomeprod;
    }

    public void setNomeprod(String nomeprod) {
        this.nomeprod = nomeprod;
    }

    
    public String getQtdDisp() {
        return qtddisp;
    }

    public void setQtdDisp(String qtddisp) {
        this.qtddisp = qtddisp;
    }

    
      public String getQtdSel() {
        return qtdsel;
    }

    public void setQtdSel(String qtdsel) {
        this.qtdsel = qtdsel;
    }

    
    
      public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

    public String getTotalPagar() {
        return totalpagar;
    }

    public void setTotalPagar(String  totalpagar) {
        this.totalpagar = totalpagar;
    }

    
    public String getFormaPag() {
        return formapag;
    }

    public void setFormaPag(String formapag) {
        this.formapag = formapag;
    }

     public String getPedido() {
        return pedido;
    }

    public void setPedido(String  pedido) {
        this.pedido = pedido;
    }
    
         public String getTotal() {
        return total;
    }

    public void setTotal(String  total) {
        this.total = total;
    }
    
}
