/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016.exception;

import br.edu.ifba.eunapolis.ads.poo2016.modelo.ItemEmpretavel;
import br.edu.ifba.eunapolis.ads.poo2016.modelo.Usuario;

/**
 *
 * @author Usuário
 */
public class ItemJaEmprestadoException extends Exception {

    private Usuario usuario;
    private ItemEmpretavel empretavel;

    public ItemJaEmprestadoException(Usuario usuario, ItemEmpretavel empretavel) {
        this.usuario = usuario;
        this.empretavel = empretavel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ItemEmpretavel getEmpretavel() {
        return empretavel;
    }

}
