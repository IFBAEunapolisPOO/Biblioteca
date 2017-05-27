/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016.exception;

import br.edu.ifba.eunapolis.ads.poo2016.modelo.ItemEmpretavel;

/**
 *
 * @author Usuário
 */
public class ItemNaoEncotradoException extends Exception{
    private String nomePesquisado;
    private ItemEmpretavel empretavel;
    public ItemNaoEncotradoException(String nomePesquisado) {
        this.nomePesquisado = nomePesquisado;
    }
    public ItemNaoEncotradoException(ItemEmpretavel empretavel) {
        this.empretavel = empretavel;
    }

    public ItemEmpretavel getEmpretavel() {
        return empretavel;
    }
    
    
    
}
