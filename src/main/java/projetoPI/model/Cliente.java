/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.model;

/**
 *
 * @author fernando.fernandes
 */
public class Cliente {

    private static int qtdClientesCriados;

    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private String dNascimento;
    private String estCivil;
    private String email;
    private String telefone;

    private String celular1;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Cliente() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdClientesCriados++;
        this.id = qtdClientesCriados;
    }

    public Cliente(String cpf, String nome , String sexo, String dNascimento, String estCivil, String email,
            String telefone, String celular1, String endereco, String numero, String complemento, String bairro,
            String cidade, String uf, String cep) {
        qtdClientesCriados++;
        this.id = qtdClientesCriados;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dNascimento = dNascimento;
        this.estCivil = estCivil;
        this.email = email;
        this.telefone = telefone;
        this.celular1 = celular1;
        
        
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;

        
        this.cidade = cidade;
        this.uf = uf; 
        this.cep = cep;
    }

    public Cliente(int pId,String pCpf, String pNome,  String pSexo, String pDNascimento, String pEstCivil, String pEmail,
            String pTelefone, String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
            String pCidade, String pUf, String pCep) {

        this.id = pId;
        this.cpf = pCpf;
        this.nome = pNome;
        this.sexo = pSexo;
        this.dNascimento = pDNascimento;
        this.estCivil = pEstCivil;
        this.email = pEmail;
        this.telefone = pTelefone;
        this.celular1 = pCelular1;
        this.endereco = pEndereco;
        this.numero = pNumero;
        this.complemento = pComplemento;
        this.bairro = pBairro;

        this.cidade = pCidade;
        this.uf = pUf; 
        this.cep = pCep;
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

    public void setCpf(String pCpf) {
        this.cpf = pCpf;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getdNascimento() {
        return dNascimento;
    }

    public void setdNascimento(String dNascimento) {
        this.dNascimento = dNascimento;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
