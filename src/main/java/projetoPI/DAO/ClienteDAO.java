/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.DAO;

import java.util.ArrayList;
import projetoPI.model.Cliente;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteDAO {
    
    public static boolean salvar(Cliente p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarCliente(p);
    }
    
    public static boolean atualizar(Cliente p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirCliente(pID);
    }
    
    public static ArrayList<Cliente> getClientes()
    {
        return SimulaDB.getInstance().getClientes();
    }
        public static ArrayList<Cliente> buscaCliente(int id) {
        return SimulaDB.getInstance().buscaCliente(id);
    }

    public static ArrayList<Cliente> buscaCliente(String nome) {
        return SimulaDB.getInstance().buscaCliente(nome);
    }
}
