package projetoPI.model;


public class Relatorio {
    private static int qtdRelatoriosCriados;
    
    private int id;
    private String data;
    private String cpf;
    private String pedido;
    private String qtd;
    private String total;
     private String valortotal;
    //  private String datafim;

    
  
    
    
    public Relatorio() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdRelatoriosCriados++;
        this.id = qtdRelatoriosCriados;
    }

   public Relatorio(String pData, String pCpf, String pPedido, String pQtd, String pTotal, String pValortotal) {
        
        this.id = id;
        this.data = pData;
        this.cpf= pCpf;
        this.pedido = pPedido;
        this.qtd = pQtd;
        this.total = pTotal;
        this.valortotal = pValortotal;
       // this.datafim = pDatafim;
     

    }
 
    public Relatorio(int id, String data, String cpf, String pedido, String qtd, String total ) {
        qtdRelatoriosCriados++;
        this.id = qtdRelatoriosCriados;
        this.data = data;
        this.cpf= cpf;
        this.pedido = pedido;
        this.qtd = qtd;
        this.total = total;
        this.valortotal = valortotal;
       // this.datafim = datafim;
      
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

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }


    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
      public String getValorTotal() {
        return valortotal;
    }

    public void setValorTotal(String valortotal) {
        this.valortotal = valortotal;
    }


 //   public String getDatafim() {
 //       return datafim;
 //   }

 //   public void setDatafim(String datafim) {
 //       this.datafim = datafim;
 //   }

   
        
            
    
    
}
