/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.ClienteDAO;
import projetoPI.model.Cliente;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param Id
     * @param pCPF
     * @param pNome
     * @param pSexo
     * @param pDNascimento
     * @param pEstCivil
     * @param pEmail
     * @param pTelefone
     

     * @param pCelular1
     * @param pComplemento
     * @param pNumero
     * @param pBairro
     * @param pCidade
     * @param pUf
     * @param pCep
     * @param pEndereco

     * @return
     */
    public static boolean salvar(String pCPF,String pNome,  String pSexo, String pDNascimento, String pEstCivil, String pEmail,
            String pTelefone,  String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
            String pCidade, String pUf, String pCep) {
        //Salvo na memória
        Cliente p = new Cliente(pCPF, pNome,  pSexo, pDNascimento, pEstCivil, pEmail,
                pTelefone,  pCelular1, pEndereco, pNumero, pComplemento, 
                pBairro, pCidade, pUf, pCep );

        return ClienteDAO.salvar(p);
    }

    public static boolean excluir(int pId) {
        return ClienteDAO.excluir(pId);
    }

    public static boolean atualizar(int pId, String pCPF, String pNome,  String pSexo, String pDNascimento, String pEstCivil, String pEmail,
            String pTelefone,  String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
            String pCidade, String pUf, String pCep ) {
        Cliente p = new Cliente( pId, pCPF, pNome,pSexo, pDNascimento, pEstCivil, pEmail,
                pTelefone,  pCelular1, pEndereco, pNumero, pComplemento, 
                pBairro,pCidade, pUf, pCep);

        return ClienteDAO.atualizar(p);

    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{
                String.valueOf(clientes.get(i).getId()), 
                String.valueOf(clientes.get(i).getCpf()),
                clientes.get(i).getNome(),
                clientes.get(i).getSexo(), 
                String.valueOf(clientes.get(i).getdNascimento()),
                String.valueOf(clientes.get(i).getEstCivil()), 
                clientes.get(i).getEmail(), 
                 clientes.get(i).getTelefone(),
                clientes.get(i).getCelular1(),
                clientes.get(i).getEndereco(),
                clientes.get(i).getNumero(),
                clientes.get(i).getComplemento(),
                clientes.get(i).getBairro(),
                clientes.get(i).getCidade(), 
                String.valueOf(clientes.get(i).getUf()), 
                String.valueOf(clientes.get(i).getCep())});

        }

        return listaClientes;

    }
  public static ArrayList<String[]> buscaCliente(int id) {
          ArrayList<Cliente> clientes = ClienteDAO.buscaCliente(id);
          ArrayList<String[]> resultado = new ArrayList<>();
 
          for (Cliente p : clientes) {
             resultado.add(new String[]{
                  String.valueOf(p.getId()),
                  p.getNome(),
                 String.valueOf(p.getCpf())});
          }
          return resultado;

     }
 public static ArrayList<String[]> buscaCliente(String nome2) {
        ArrayList<Cliente> clientes = ClienteDAO.buscaCliente(nome2);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (Cliente p : clientes) {
            resultado.add(new String[]{
                String.valueOf(p.getId()),
                String.valueOf(p.getNome()),
               String.valueOf(p.getCpf())});
        }
        return resultado;

    }
}
