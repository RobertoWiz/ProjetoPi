/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.RelatorioDAO;
import projetoPI.model.Relatorio;

/**
 *
 * @author fernando.fernandes
 */
public class RelatorioController {

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
     * @param datafim
     * @return
     */
   
 
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getRelatorios() {

        ArrayList<Relatorio> relatorios = RelatorioDAO.getRelatorios();
        ArrayList<String[]> listaRelatorios = new ArrayList<>();

        for (int i = 0; i < relatorios.size(); i++) {
            listaRelatorios.add(new String[]{String.valueOf(relatorios.get(i).getId()), 
                String.valueOf(relatorios.get(i).getData()), 
                String.valueOf(relatorios.get(i).getCpf()), 
                String.valueOf(relatorios.get(i).getPedido()),
                String.valueOf(relatorios.get(i).getQtd()), 
             
                 String.valueOf(relatorios.get(i).getTotal()),
                 String.valueOf(relatorios.get(i).getValorTotal()),
                // String.valueOf(relatorios.get(i).getDatafim())
            
            });
                    }

        return listaRelatorios;

    }

    

       public static ArrayList<String[]> buscaRelatorio(String dataini, String datafim) {
        ArrayList<Relatorio> relatorios = RelatorioDAO.buscaRelatorio(dataini,datafim);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (Relatorio p : relatorios) {
            resultado.add(new String[]{
                String.valueOf(p.getId()),
                String.valueOf(p.getData()),
                String.valueOf(p.getCpf()),
                String.valueOf(p.getPedido()),
                String.valueOf(p.getQtd()),
                String.valueOf(p.getTotal()),
                String.valueOf(p.getValorTotal()),
                });
        }
        return resultado;

       }    
    
}
