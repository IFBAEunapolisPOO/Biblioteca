/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016.modelo;

import java.util.Objects;

/**
 *
 * @author Usuário
 */
public abstract class ItemEmpretavel {
    
    private String titulo;
    private String nome;

    public ItemEmpretavel(String titulo, String nome) {
        this.titulo = titulo;
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.titulo);
        hash = 43 * hash + Objects.hashCode(this.nome);
        return hash;
    }


    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemEmpretavel other = (ItemEmpretavel) obj;
        if (!(this.titulo.equals(other.titulo))) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
