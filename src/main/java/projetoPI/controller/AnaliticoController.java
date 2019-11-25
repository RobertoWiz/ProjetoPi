/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.AnaliticoDAO;
import projetoPI.model.Analitico;

/**
 *
 * @author fernando.fernandes
 */
public class AnaliticoController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param pID
     * @param pData
     * @param pCpf
     * @param pPedido
     * @param pQtd
     * @param pValor
     * @param dataini
    // * @param pDatafim
     * @return
     */
   
 
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @param numpedido
     * @return lista de string
     */


    

       public static ArrayList<String[]> buscaAnalitico(String numpedido) {
        ArrayList<Analitico> analiticos = AnaliticoDAO.buscaAnalitico(numpedido);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (Analitico p : analiticos) {
            resultado.add(new String[]{
                String.valueOf(p.getId()),
                String.valueOf(p.getPedido()),
                String.valueOf(p.getData()),
                String.valueOf(p.getCpf()),
                String.valueOf(p.getNomeprod()),
                 String.valueOf(p.getQtdsel()),
                String.valueOf(p.getValor()),
                String.valueOf(p.getTotalpag()),
                String.valueOf(p.getFormpag()),
                });
        }
        return resultado;

       }    
    
}
