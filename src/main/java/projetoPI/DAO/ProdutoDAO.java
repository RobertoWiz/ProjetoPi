/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projetoPI.model.Produto;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoDAO {
    
    //TODO: Linhas abaixo deverão ser removidas futuramente com o uso de uma classe de Conexão
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0 do MySQL, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   
    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    
    public static String URL = "jdbc:mysql://localhost:3306/javahome?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    public static boolean salvar(Produto p)
    {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        
        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);
            
            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);     
            instrucaoSQL = conexao.createStatement(); 
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO PRODUTO (Nome,Descricao,Categoria,ValorVenda,Marca,Linha,Estoque,UnidadeM,Ref) " + 
                    "VALUES(" +
                    "'" + p.getNome() + "'" + "," +
                    "'" + p.getDescricao() + "'"  + "," +
                    "'" + p.getCategoria() + "'" + "," +
                    "'" + p.getValorVenda() + "'"  + "," +    
                    "'" + p.getMarca() + "'"  + "," +        
                    "'" + p.getLinha() + "'" + "," +
                    "'" + p.getEstoque()+ "'" + "," +
                    "'" + p.getUnidadeM()+ "'"  + "," +        
                    "'" + p.getRef() + "'" +")")
                    
                    
                    ;
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean atualizar(Produto p )
     {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        
        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);
            
            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);     
            instrucaoSQL = conexao.createStatement(); 
            
            int linhasAfetadas = instrucaoSQL.executeUpdate( "Update produto SET " +
                     " Nome= " +        "'" + p.getNome()        + "'" + "," +
                     " Descricao = " +  "'" + p.getDescricao()   + "'" + "," +
                     " Categoria= " +   "'" + p.getCategoria()   + "'" + "," +
                     " ValorVenda= " +  "'" + p.getValorVenda()  + "'" + "," +
                     " Marca = " +      "'" + p.getMarca()       + "'" + "," +
                     " Linha= " +       "'" + p.getLinha()       + "'" + "," +
                     " Estoque = " +    "'" + p.getEstoque()     + "'" + "," +
                     " UnidadeM= " +    "'" + p.getUnidadeM()    + "'" + "," +
                     " Ref= " +         "'" + p.getRef()         + "'" +
                      
                             
                   " where pId =" + p.getId() 
               
                           
                           );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    public static boolean excluir(int pID)
    {
   boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        
        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);
            
            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);     
            instrucaoSQL = conexao.createStatement(); 
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("delete from produto " + 
                    "where pId =" + pID );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT * FROM Produto;" );
                
            while(rs.next())
            {
                Produto c = new Produto();
                c.setId         (rs.getInt("pId"));
                c.setNome       (rs.getString("Nome"));
                c.setDescricao  (rs.getString("Descricao"));
                c.setCategoria  (rs.getString("Categoria"));
                c.setValorVenda (rs.getString("ValorVenda"));
                c.setMarca      (rs.getString("Marca"));
                c.setLinha      (rs.getString("Linha"));
                c.setEstoque    (rs.getInt("Estoque"));
                c.setUnidadeM   (rs.getString("UnidadeM"));
                c.setRef        (rs.getString("Ref"));
                
                listaProdutos.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaProdutos = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaProdutos = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return listaProdutos;
    }
    


    public static ArrayList<Produto> buscaProduto(String categoria) {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT * FROM Produto where Categoria = " + "'" + categoria +"'" );
                
            while(rs.next())
            {
                Produto c = new Produto();
                c.setId         (rs.getInt("pId"));
                c.setNome       (rs.getString("Nome"));
                c.setValorVenda  (rs.getString("ValorVenda"));
                c.setCategoria  (rs.getString("Categoria"));
                c.setEstoque   (rs.getInt("Estoque"));
                
                
                listaProdutos.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaProdutos = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaProdutos = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return listaProdutos;
    }
    public static ArrayList<Produto> buscaProduto(int id) {
        return SimulaDB.getInstance().buscaProduto(id);
    }
    

}
