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
public class Professor extends Usuario{
    
    private String siap;

    public Professor(String nome, String siap) {
        super(nome);
        this.siap = siap;
    }

    @Override
    public int getTamanhoMaximo() {
        return 5;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.siap);
        return hash;
    }

    @Override
    public String toString() {
        return "Professor{" + "siap=" + siap + '}';
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
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.siap, other.siap)) {
            return false;
        }
        return true;
    }

    
}
