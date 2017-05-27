/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016.modelo;

import br.edu.ifba.eunapolis.ads.poo2016.exception.ItemJaEmprestadoException;
import br.edu.ifba.eunapolis.ads.poo2016.exception.MaximoEmprestimoException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public abstract class Usuario {
    
    private String nome;
    private List<ItemEmpretavel> empretimos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }
    
    public void addEmprestimo(ItemEmpretavel empretavel) throws MaximoEmprestimoException, ItemJaEmprestadoException{
        if(empretimos.size() < getTamanhoMaximo()){
            if(!empretimos.contains(empretavel)){
                empretimos.add(empretavel);
            }else{
                throw new ItemJaEmprestadoException(this, empretavel);
            }
        }else{
            throw new MaximoEmprestimoException(this, empretavel);
        }
    }
    
    public void removeEmprestimo(ItemEmpretavel empretavel){
        empretimos.remove(empretavel);
    }

    public String getNome() {
        return nome;
    }
    
    public abstract int getTamanhoMaximo();
    
}
