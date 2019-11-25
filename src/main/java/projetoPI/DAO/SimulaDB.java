/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.DAO;


import java.util.ArrayList;
import projetoPI.model.Cliente;
import projetoPI.model.Produto;

/**
 *
 * Padrão Singleton
 */
public class SimulaDB {
    
    private static SimulaDB mockdb;
    
    private final ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private final ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    
    
    private SimulaDB(){
    
        listaClientes = new ArrayList<>();
        listaProdutos = new ArrayList<>();
    }
    
    public static synchronized SimulaDB getInstance(){
        if(mockdb == null)
            mockdb = new SimulaDB();
        
        return mockdb;
    }
    
    public boolean SalvarCliente(Cliente c)
    {
        listaClientes.add(c);
        
        return true;
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return this.listaClientes;
    }
    
    
    public boolean AtualizarCliente(Cliente p)
    {
        for(Cliente item: listaClientes)
        {
            if(item.getId() == p.getId())
            {   
                item.setNome(p.getNome());
                item.setCpf(p.getCpf());
                item.setBairro(p.getBairro());
                item.setCelular1(p.getCelular1());
                item.setCep(p.getCep());
                item.setCidade(p.getCidade());
                item.setComplemento(p.getComplemento());
                item.setEmail(p.getEmail());
                item.setEndereco(p.getEndereco());
                item.setEstCivil(p.getEstCivil());
                item.setNumero(p.getNumero());
                item.setSexo(p.getSexo());
                item.setTelefone(p.getTelefone());
                item.setUf(p.getUf());
                item.setdNascimento(p.getdNascimento());
                
            }
        }
            
        return true;
    }
    
    public boolean ExcluirCliente(int i)
    {
        Cliente clienteExcluir = new Cliente();
        boolean existeNaLista = false;
        for (Cliente c : listaClientes) {
        
            if(c.getId()==i){
                clienteExcluir = c;
                existeNaLista = true;
            }
        }
        
        if(existeNaLista)
            listaClientes.remove(clienteExcluir);
        
        return true;
    }
     public boolean SalvarProduto(Produto c)
    {
        listaProdutos.add(c);
        
        return true;
    }
    
    public ArrayList<Produto> getProdutos()
    {
        return this.listaProdutos;
    }
    
    
    public boolean AtualizarProduto(Produto p)
    {
        for(Produto item: listaProdutos)
        {
            if(item.getId() == p.getId())
            {
                item.setNome(p.getNome());
                item.setCategoria(p.getCategoria());
                item.setDescricao(p.getDescricao());
                item.setEstoque(p.getEstoque());
                item.setLinha(p.getLinha());
                item.setMarca(p.getMarca());
                item.setRef(p.getRef());
                item.setUnidadeM(p.getUnidadeM());
                item.setValorVenda(p.getValorVenda());
            }
        }
            
        return true;
    }
    
    public boolean ExcluirProduto(int i)
    {
        Produto produtoExcluir = new Produto();
        boolean existeNaLista = false;
        for (Produto c : listaProdutos) {
        
            if(c.getId()==i){
                produtoExcluir = c;
                existeNaLista = true;
            }
        }
        
        if(existeNaLista)
            listaProdutos.remove(produtoExcluir);
        
        return true;
    }
 //    public ArrayList<Produto> buscaProduto(String categoria) {
 //       ArrayList<Produto> resultado = new ArrayList<>();
//
 //       for (Produto c : listaProdutos) {
 //           if (c.getCategoria().equals(categoria)) {
 //               resultado.add(c);
 //           }
 //       }

  //      return resultado;
  //  }

    public ArrayList<Produto> buscaProduto(int id) {
        ArrayList<Produto> resultado = new ArrayList<>();

        for (Produto c : listaProdutos) {
            if (c.getId() == (id)) {
                resultado.add(c);
            }
        }

        return resultado;
    }

    public ArrayList<Cliente> buscaCliente(int id) {
        ArrayList<Cliente> resultado = new ArrayList<>();

        for (Cliente c : listaClientes) {
            if (c.getId() == id) {
                resultado.add(c);
            }
        }

        return resultado;
    }

    public ArrayList<Cliente> buscaCliente(String nome) {
        ArrayList<Cliente> resultado = new ArrayList<>();

        for (Cliente c : listaClientes) {
            if (c.getNome().contains(nome)) {
                resultado.add(c);
            }
        }

        return resultado;
    }

  
    
}
