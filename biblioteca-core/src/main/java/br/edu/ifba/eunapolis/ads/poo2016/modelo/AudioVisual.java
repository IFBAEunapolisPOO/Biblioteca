/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016.modelo;

import br.edu.ifba.eunapolis.ads.poo2016.modelo.enums.TiposAudioVisual;

/**
 *
 * @author Usuário
 */
public class AudioVisual extends ItemEmpretavel {

    private TiposAudioVisual tiposAudioVisual;
    
    public AudioVisual(TiposAudioVisual tiposAudioVisual, String titulo, String nome) {
        super(titulo, nome);
        this.tiposAudioVisual = tiposAudioVisual;
    }

}
