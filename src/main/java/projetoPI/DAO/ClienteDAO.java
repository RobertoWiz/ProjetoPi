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
import projetoPI.model.Cliente;
import projetoPI.view.ListaClienteView;

/**
 *
 * 
 * 
 * 
 */



public class ClienteDAO {
    
    //TODO: Linhas abaixo deverão ser removidas futuramente com o uso de uma classe de Conexão
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0 do MySQL, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   
    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    
    public static String URL = "jdbc:mysql://localhost:3306/javahome?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    public static boolean salvar(Cliente p)
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO Cliente ( Cpf ,Cliente,Sexo, Nascimento ,EstadoCivil,Email ,Telefone ,Celular1 ,Rua ,Numero ,Complemento ,Bairro ,Cidade ,Uf ,Cep ) " + 
                    "VALUES(" +
                    "'" + p.getCpf() + "'" + "," +
                    "'" + p.getNome() + "'"  + "," +
                    "'" + p.getSexo() + "'" + "," +
                    "'" + p.getdNascimento() + "'"  + "," +    
                    "'" + p.getEstCivil()+ "'"  + "," +    
                    "'" + p.getEmail() + "'" + "," +
                    "'" + p.getTelefone()+ "'" + "," +
                    "'" + p.getCelular1()+ "'"  + "," +    
                    "'" + p.getEndereco() + "'" + "," +
                    "'" + p.getNumero()+ "'" + "," +
                    "'" + p.getComplemento() + "'" + "," +
                    "'" + p.getBairro()+ "'"  + "," +   
                    "'" + p.getCidade()+ "'" + "," +
                    "'" + p.getUf()+ "'"  + "," +  
                    "'" + p.getCep() + "'" +")") 
                    
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
    
    public static boolean atualizar(Cliente p )
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate( "Update Cliente SET " +
                     " Cpf  = " +          "'" + p.getCpf()+ "'" + "," +
                     " Cliente= " +        "'" + p.getNome()   + "'" + "," +
                     " Sexo = " +          "'" + p.getSexo()  + "'" + "," +
                     " Nascimento = " +    "'" + p.getdNascimento()       + "'" + "," +
                     " EstadoCivil= " +    "'" + p.getEstCivil()      + "'" + "," +
                     " Email = " +         "'" + p.getEmail()    + "'" + "," +
                     " Telefone = " +      "'" + p.getTelefone()  + "'" + "," +
                     " Celular1 = " +      "'" + p.getCelular1()       + "'" + "," +
                     " Rua= " +            "'" + p.getEndereco()       + "'" + "," +
                     " Numero = " +        "'" + p.getNumero()     + "'" + "," +                    
                     " Complemento = " +   "'" + p.getComplemento()  + "'" + "," +
                     " Bairro = " +        "'" + p.getBairro()       + "'" + "," +
                     " Cidade= " +         "'" + p.getCidade()       + "'" + "," +
                     " Uf= " +             "'" + p.getUf()    + "'" + "," +        
                     " Cep= " +            "'" + p.getCep()         + "'" +
                      
                             
                   " where Id =" + p.getId() 
               
                           
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
    public static boolean excluir(int pId)
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("delete from Cliente " + 
                    "where Id =" + pId );
            
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
    
    public static ArrayList<Cliente> getClientes()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
       
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT * FROM Cliente "
                  //  + "where id = " + te
            );
                
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId         (rs.getInt("Id"));
                c.setCpf        (rs.getString("Cpf"));
                c.setNome       (rs.getString("Cliente"));
                c.setSexo       (rs.getString("Sexo"));
                c.setdNascimento(rs.getString("Nascimento"));
                c.setEstCivil   (rs.getString("EstadoCivil"));
                c.setEmail      (rs.getString("Email"));
                c.setTelefone   (rs.getString("Telefone"));
                c.setCelular1   (rs.getString("Celular1"));
                c.setEndereco   (rs.getString("Rua"));
                c.setNumero     (rs.getString("Numero"));
                c.setComplemento(rs.getString("Complemento"));
                c.setBairro     (rs.getString("Bairro"));
                c.setCidade     (rs.getString("Cidade"));
                c.setUf         (rs.getString("Uf"));
                c.setCep        (rs.getString("Cep"));
               
                
                
                listaClientes.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaClientes = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaClientes = null;
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
        
        return listaClientes;
    }
    


    public static ArrayList<Cliente> buscaCliente(String nomecli) {
          Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT * FROM CLIENTE where cliente like " + "'%" + nomecli +"%'" + "or cpf like " + "'%" + nomecli +"%'"  );
                
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId         (rs.getInt("id"));
                c.setCpf      (rs.getString("cpf"));
                c.setNome  (rs.getString("cliente"));
               
                
                
                listaClientes.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaClientes = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaClientes = null;
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
        
        return listaClientes;
    }
    
 
 

//public static ArrayList<Cliente> buscaCliente(long cpf) {
 //         Connection conexao = null;
 //       Statement instrucaoSQL = null; 
 //       ResultSet rs = null;
        
  //      ArrayList<Cliente> listaClientes = new ArrayList<>();
        
  //      try {
  //          Class.forName(DRIVER);
 //           conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
  //          instrucaoSQL = conexao.createStatement();
  //          rs = instrucaoSQL.executeQuery("SELECT * FROM CLIENTE where cpf like " + "'%" + cpf + "'%;"  );
  //              
   //         while(rs.next())
   //         {
    //            Cliente c = new Cliente();
               // c.setId         (rs.getInt("pId"));
    //            c.setCpf      (rs.getString("cpf"));
    //            c.setNome  (rs.getString("cliente"));
               
                
                
    //            listaClientes.add(c);
   //         }
            
  //      } catch (ClassNotFoundException ex) {
   //         System.out.println("Driver não encontrado.");
  //          listaClientes = null;
   //     } catch (SQLException ex) {
   //         System.out.println("Erro no comando SQL.");
   //         listaClientes = null;
   //     } finally{
    //        //Libero os recursos da memória
    //        try {
    //            if(rs!=null)
     //               rs.close();                
   //             if(instrucaoSQL!=null)
     //               instrucaoSQL.close();
    //            if(conexao!=null)
    //              conexao.close();
     //         } catch (SQLException ex) {
     //        }
     //   }
        
    //    return listaClientes;
  //  }
    public static ArrayList<Cliente> buscaCliente(int id) {
        return SimulaDB.getInstance().buscaCliente(id);
    }
    

  
}
