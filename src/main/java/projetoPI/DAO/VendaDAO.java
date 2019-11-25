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
import projetoPI.model.Venda;

/**
 *
 * @author fernando.fernandes
 */
public class VendaDAO {
    
    //TODO: Linhas abaixo deverão ser removidas futuramente com o uso de uma classe de Conexão
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0 do MySQL, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   
    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    
    public static String URL = "jdbc:mysql://localhost:3306/javahome?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    public static boolean salvar(Venda p)
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO Venda (Data, Cpf, Nome, CodProd ,NomeProd ,QtdDisp ,Valor ,QtdSel ,TotalPag ,Formpag, Pedido)"+ 
                    "VALUES( sysdate(), " +
                    "'" + p.getCpf()+ "'" + "," +
                    "'" + p.getNome()+ "'"  + "," +
                    "'" + p.getCodprod()+ "'" + "," +
                    "'" + p.getNomeprod()+ "'"  + "," +    
                    "'" + p.getQtdDisp()+ "'"  + "," +        
                    "'" + p.getValor()+ "'" + "," +
                    "'" + p.getQtdSel()+ "'" + "," +
                    "'" + p.getTotalPagar()+ "'"  + "," + 
                    "'" + p.getFormaPag()+ "'"  + "," +
                    "'" + p.getPedido()+ "'" +")")
                    
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("delete from Venda " + 
                    "where Id =" + pID );
            
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
    
    public static ArrayList<Venda> getVendas()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Venda> listaVendas = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT T.id, T.data,T.Cpf, upper (T.Nome) as Nome, T.CodProd, upper (T.NomeProd) as NomeProd, T.QtdDisp, "
                    + "T.Valor, T.QtdSel, ((T.QtdSel*1)*replace(T.Valor,',','.')) AS TotalPag, upper (T.FormPag) as FormPag, T.Pedido, F.TOTAL FROM Venda T  "
                    + "LEFT JOIN (SELECT PEDIDO, SUM(REPLACE(((QtdSel*1)*replace(Valor,',','.')),'.','.')) AS TOTAL FROM VENDA  "
                    + "GROUP BY PEDIDO) F ON F.PEDIDO = T.PEDIDO;");
                
            while(rs.next())
            {
                Venda c = new Venda();
                c.setId         (rs.getInt("Id"));
                c.setCpf        (rs.getString("Cpf"));
                c.setNome       (rs.getString("Nome"));
                c.setCodprod    (rs.getString("CodProd"));
                c.setNomeprod   (rs.getString("NomeProd"));
                c.setQtdDisp    (rs.getString("Qtddisp"));
                c.setValor      (rs.getString("Valor"));
                c.setQtdSel     (rs.getString("Qtdsel"));
                c.setTotalPagar (rs.getString("Totalpag"));
                c.setFormaPag   (rs.getString("Formpag"));
                c.setPedido     (rs.getString("Pedido"));
                c.setTotal      (rs.getString("Total"));
                listaVendas.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaVendas = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaVendas = null;
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
        
        return listaVendas;
    }
    


   // public static ArrayList<Produto> buscaProduto(String categoria) {
   //     return SimulaDB.getInstance().buscaProduto(categoria);
   // }

   // public static ArrayList<Produto> buscaProduto(int id) {
   //     return SimulaDB.getInstance().buscaProduto(id);
   // }
    

     public static boolean relatorio()
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("insert into relatorio (SELECT T.id, T.data,T.Cpf, T.Nome, T.CodProd, T.NomeProd, T.QtdDisp,  T.valor, t.qtdsel,  "
                 +  " F.TOTAL as TotalPag, T.FormPag, T.Pedido  FROM Venda T  "
               +  " LEFT JOIN (SELECT PEDIDO, SUM(REPLACE(((QtdSel*1)*replace(Valor,',','.')),'.','.')) AS TOTAL FROM VENDA "
                 +  " GROUP BY PEDIDO) F ON F.PEDIDO = T.PEDIDO); "
             //       + " delete from venda; " 
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
    
         public static boolean limpar()
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
            
            int linhasAfetadas = instrucaoSQL.executeUpdate("delete from venda; " 
            );
            
          //  if(linhasAfetadas>0)
           // {
          //      retorno = true;
          //  }
          //  else{
          //      retorno = false;
          //  }
            
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
         
         
    
    
}
