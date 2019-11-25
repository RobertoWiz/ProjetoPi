package projetoPI.model;


public class Produto {
    private static int qtdProdutosCriados;
    
    private int id;
    private String nome;
    private String descricao;
    private String categoria;
    private String valorVenda;
    private String marca;
    private String linha;
    
    private int estoque;
    private String unidadeM;
    private String ref;
    
    public Produto() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdProdutosCriados++;
        this.id = qtdProdutosCriados;
    }

    public Produto(String nome, String descricao, String categoria, String valorVenda, String marca, 
    String linha, int estoque, String unidadeM , String ref ) {
        qtdProdutosCriados++;
        this.id = qtdProdutosCriados;
        this.nome = nome;
        this.descricao= descricao;
        this.categoria = categoria;
        this.valorVenda = valorVenda;
        this.marca = marca;
        this.linha = linha;
        this.estoque = estoque;
        this.unidadeM =unidadeM;
        this.ref = ref;
   }

    public Produto(int id, String pNome, String pDescricao, String pCategoria, String pValorVenda, String pMarca, String pLinha,
     int pEstoque, String pUnidadeM , String pRef) {
        
        this.id = id;
        this.nome = pNome;
        this.descricao= pDescricao;
        this.categoria = pCategoria;
        this.valorVenda = pValorVenda;
        this.marca = pMarca;
        this.linha = pLinha;
        this.estoque = pEstoque;
        this.unidadeM = pUnidadeM;
        this.ref = pRef;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getUnidadeM() {
        return unidadeM;
    }

    public void setUnidadeM(String unidadeM) {
        this.unidadeM = unidadeM;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    
    
}
