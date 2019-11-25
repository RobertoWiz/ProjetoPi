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
import projetoPI.model.Relatorio;


/**
 *
 *
 */




public class RelatorioDAO {
    
    //TODO: Linhas abaixo deverão ser removidas futuramente com o uso de uma classe de Conexão
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0 do MySQL, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   
    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    
    public static String URL = "jdbc:mysql://localhost:3306/javahome?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    
    
           
    public static ArrayList<Relatorio> getRelatorios()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        
        
        ArrayList<Relatorio> listaRelatorios = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery(  "select distinct g.data, g.cpf, g.pedido,  f.qtd,g.totalpag as total"
              +    "from  relatorio g"
               +   "left join (select pedido, sum(qtdsel) qtd from relatorio group by pedido) f "
              +    "on f.pedido = g.pedido " );
                
            while(rs.next())
            {
                Relatorio c = new Relatorio();
                c.setId       (rs.getInt("Id"));
                c.setData     (rs.getString("Data"));
                c.setCpf      (rs.getString("cpf"));
                c.setPedido   (rs.getString("Pedido"));
                c.setQtd      (rs.getString("qtd"));
                c.setTotal    (rs.getString("total"));
               // c.setDataini  (rs.getString("dataini"));
               // c.setTotal    (rs.getString("datafim"));
                
                listaRelatorios.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaRelatorios = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaRelatorios = null;
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
        
        return listaRelatorios;
    }
    
    public static ArrayList<Relatorio> buscaRelatorio(String dataini, String datafim) {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Relatorio> listaRelatorios2 = new ArrayList<>();
        
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery(
                   "select distinct 1 as id, date_format(g.data, '%d/%m/%Y') as data, g.cpf, g.pedido, f.qtd, ROUND(g.totalpag,2) as total, ROUND(a.valortotal,2) AS VALORTOTAL "
              +    " from  relatorio g "
              +    " left join (select pedido, sum(qtdsel) qtd from relatorio group by pedido) f "
              +    " on f.pedido = g.pedido "
              +    " left join (select data, ROUND(sum(totalpag),2) valortotal from relatorio group by data) a "
              +    "  on g.data = a.data   "                           
              +    " where date_format(g.data, '%d/%m/%Y') >= '" + dataini + "'"
              +    "   and date_format(g.data, '%d/%m/%Y') <= '" + datafim + "'"
                    
                  );
                
            while(rs.next())
            {
                 Relatorio c = new Relatorio();
                c.setId       (rs.getInt("Id"));
                c.setData     (rs.getString("Data"));
                c.setCpf      (rs.getString("cpf"));
                c.setPedido   (rs.getString("Pedido"));
                c.setQtd      (rs.getString("qtd"));
                c.setTotal    (rs.getString("total"));
                c.setValorTotal    (rs.getString("valortotal"));
                
                
                listaRelatorios2.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaRelatorios2 = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaRelatorios2 = null;
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
        
        return listaRelatorios2;
    }

   // public static ArrayList<Produto> buscaProduto(String categoria) {
   //     return SimulaDB.getInstance().buscaProduto(categoria);
   // }

   // public static ArrayList<Produto> buscaProduto(int id) {
   //     return SimulaDB.getInstance().buscaProduto(id);
   // }

  
    

         
    
    
}
