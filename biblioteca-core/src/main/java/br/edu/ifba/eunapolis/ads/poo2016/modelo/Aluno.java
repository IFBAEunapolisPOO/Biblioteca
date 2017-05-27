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
public class Aluno extends Usuario{
    
    private String matricula;

    public Aluno(String nome, String matricula ) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public int getTamanhoMaximo() {
        return 2;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.matricula);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + '}';
    }
    
    
    
    
    
}
