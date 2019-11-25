/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.ProdutoDAO;
import projetoPI.model.Produto;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param pID
     * @param pNome
     * @param pDescricao
     * @param pCategoria
     *
     * @param pValorVenda
     *
     * @param pLinha
     * @param pMarca
     *
     * @param pEstoque
     * @param pUnidadeM
     * @param pRef
     * @return
     */
    public static boolean salvar(String pNome, String pDescricao, String pCategoria, String pValorVenda, String pMarca, String pLinha,
            int pEstoque, String pUnidadeM, String pRef) {
        //Salvo na memória
        Produto p = new Produto(pNome, pDescricao, pCategoria, pValorVenda, pMarca, pLinha,
                pEstoque, pUnidadeM, pRef);

        return ProdutoDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return ProdutoDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pDescricao, String pCategoria, String pValorVenda, String pMarca, String pLinha,
            int pEstoque, String pUnidadeM, String pRef) {
        Produto p = new Produto(pId, pNome, pDescricao, pCategoria, pValorVenda,
                pMarca, pLinha, pEstoque, pUnidadeM, pRef);

        return ProdutoDAO.atualizar(p);

    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getProdutos() {

        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getId()), produtos.get(i).getNome(),
                String.valueOf(produtos.get(i).getDescricao()), String.valueOf(produtos.get(i).getCategoria()),
                String.valueOf(produtos.get(i).getValorVenda()), produtos.get(i).getMarca(),
                produtos.get(i).getLinha(), String.valueOf(produtos.get(i).getEstoque()),
                String.valueOf(produtos.get(i).getRef()), String.valueOf(produtos.get(i).getUnidadeM())});

        }

        return listaProdutos;

    }

    public static ArrayList<String[]> buscaProduto(String categoria) {
        ArrayList<Produto> produtos = ProdutoDAO.buscaProduto(categoria);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (Produto p : produtos) {
            resultado.add(new String[]{
                String.valueOf(p.getId()),
                p.getNome(),
                String.valueOf(p.getEstoque()),
                p.getValorVenda()});
        }
        return resultado;

    }

    public static ArrayList<String[]> buscaProduto(int id) {
        ArrayList<Produto> produtos = ProdutoDAO.buscaProduto(id);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (Produto p : produtos) {
            resultado.add(new String[]{
                String.valueOf(p.getId()),
                p.getNome(),
                p.getDescricao(),
                p.getCategoria(),
                p.getMarca(),
                p.getLinha(),
                String.valueOf(p.getValorVenda()),
                String.valueOf(p.getEstoque()),
                p.getUnidadeM(),
                p.getRef()});

        }
        return resultado;

    }
}
