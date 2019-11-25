package projetoPI.model;


public class Analitico {
    private static int qtdRelatoriosCriados;
    
    private int id;
    private String pedido;
    private String data;
    private String cpf;
    private String nomeprod;
    private String qtdsel;
    private String valor;
    private String totalpag;
    private String formpag;

    
  
    
    
    public Analitico() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdRelatoriosCriados++;
        this.id = qtdRelatoriosCriados;
    }

   public Analitico(String pPedido, String pData, String pCpf, String pNomeprod, String pQtdsel, String pValor,String pTotalpag, String pFormpag) {
        
        this.id = id;
        this.pedido = pPedido;
        this.data = pData;
        this.cpf= pCpf;
        this.nomeprod = pNomeprod;
        this.qtdsel = pQtdsel;
        this.valor = pValor;
        this.totalpag = pTotalpag;
        this.formpag = pFormpag;
     

    }
 
    public Analitico(int id, String pedido, String data, String cpf, String nomeprod, String qtdsel, String valor, String totalpag, String formpag ) {
        qtdRelatoriosCriados++;
        this.id = qtdRelatoriosCriados;
        this.pedido = pedido;
        this.data= data;
        this.cpf = cpf;
        this.nomeprod = nomeprod;
        this.qtdsel= qtdsel;
        this.valor = valor;
        this.totalpag = totalpag;
        this.formpag = formpag;
      
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getQtdsel() {
        return qtdsel;
    }

    public void setQtdsel(String qtdsel) {
        this.qtdsel= qtdsel;
    }


    public String getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(String totalpag) {
        this.totalpag= totalpag;
    }

    
      public String getFormpag() {
        return formpag;
    }

    public void setFormpag(String formpag) {
        this.formpag = formpag;
    }


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

       public String getNomeprod() {
        return nomeprod;
    }

    public void setNomeprod(String nomeprod ) {
        this.nomeprod = nomeprod;
    }
    
}
