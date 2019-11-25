/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;

import projetoPI.DAO.VendaDAO;

import projetoPI.model.Venda;

/**
 *
 * @author fernando.fernandes
 */
public class VendaController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param pId
     * @param pCpf
     * @param pNome
     * @param pCodProd
     * @param pNomeProd
     *
     * @param pQtde
     *
     * @param pValor
     * @param pQtdeSel
     *
     * @param pTotalPag
     * @param pFormaPag
     
     * @return
     */
    public static boolean salvar( String pCpf, String pNome, String pCodProd, String pNomeProd, String pQtde, String pValor,
            String pQtdeSel, String pTotalPag, String pFormaPag, String pPedido, String pTotal) {
        //Salvo na memória
        Venda p = new Venda(pCpf, pNome, pCodProd, pNomeProd, pQtde, pValor, pQtdeSel,
                pTotalPag, pFormaPag, pPedido, pTotal);

        return VendaDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return VendaDAO.excluir(pID);
    }

    
     public static boolean relatorio() {
        return VendaDAO.relatorio();
     }
     
     public static boolean limpar() {
        return VendaDAO.limpar();
     }
     
   // public static boolean atualizar(int pId, String pNome, String pDescricao, String pCategoria, String pValorVenda, String pMarca, String pLinha,
   //         int pEstoque, String pUnidadeM, String pRef) {
   //     Produto p = new Produto(pId, pNome, pDescricao, pCategoria, pValorVenda,
   //             pMarca, pLinha, pEstoque, pUnidadeM, pRef);

   //     return ProdutoDAO.atualizar(p);

    //}

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getVendas() {

        ArrayList<Venda> vendas = VendaDAO.getVendas();
        ArrayList<String[]> listaVendas = new ArrayList<>();

        for (int i = 0; i < vendas.size(); i++) {
            listaVendas.add(new String[]{String.valueOf(vendas.get(i).getId()), 
                vendas.get(i).getCpf(),
                String.valueOf(vendas.get(i).getNome()), 
                String.valueOf(vendas.get(i).getCodprod()),
                String.valueOf(vendas.get(i).getNomeprod()), 
                vendas.get(i).getQtdDisp(),
                String.valueOf(vendas.get(i).getValor()), 
                String.valueOf(vendas.get(i).getQtdSel()),
                String.valueOf(vendas.get(i).getTotalPagar()), 
                String.valueOf(vendas.get(i).getFormaPag()),
                String.valueOf(vendas.get(i).getPedido()),
                String.valueOf(vendas.get(i).getTotal()),
            });

        }

        return listaVendas;

    }

  //  public static ArrayList<String[]> buscaProduto(String categoria) {
  ////      ArrayList<Produto> produtos = ProdutoDAO.buscaProduto(categoria);
   //     ArrayList<String[]> resultado = new ArrayList<>();
//
 //       for (Produto p : produtos) {
  //          resultado.add(new String[]{
 //               String.valueOf(p.getId()),
 //               p.getNome(),
 //               String.valueOf(p.getEstoque()),
//                p.getValorVenda()});
//        }
//        return resultado;
////
//    }

//    public static ArrayList<String[]> buscaProduto(int id) {
 //       ArrayList<Produto> produtos = ProdutoDAO.buscaProduto(id);
 //       ArrayList<String[]> resultado = new ArrayList<>();
//
  //      for (Produto p : produtos) {
   //         resultado.add(new String[]{
  //              String.valueOf(p.getId()),
  //              p.getNome(),
  //              p.getDescricao(),
  //              p.getCategoria(),
  //              p.getMarca(),
  //              p.getLinha(),
  //              String.valueOf(p.getValorVenda()),
  //              String.valueOf(p.getEstoque()),
  //              p.getUnidadeM(),
  //              p.getRef()});
//
 //       }
 //       return resultado;

 //   }

   
    
}
