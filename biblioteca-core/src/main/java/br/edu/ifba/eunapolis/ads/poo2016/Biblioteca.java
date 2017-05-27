/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.ads.poo2016;

import br.edu.ifba.eunapolis.ads.poo2016.exception.ItemJaEmprestadoException;
import br.edu.ifba.eunapolis.ads.poo2016.exception.ItemNaoEncotradoException;
import br.edu.ifba.eunapolis.ads.poo2016.exception.MaximoEmprestimoException;
import br.edu.ifba.eunapolis.ads.poo2016.modelo.ItemEmpretavel;
import br.edu.ifba.eunapolis.ads.poo2016.modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Usuário
 */
public class Biblioteca {

    Map<ItemEmpretavel, Integer> acervoMap = new HashMap<>();
    List<Usuario> usuarios = new ArrayList<>();

    public List<ItemEmpretavel> pesquisaPorNome(String nomePesquisado) throws ItemNaoEncotradoException {
        List<ItemEmpretavel> encontrados = new ArrayList<>();
        //fazer busca
        if (encontrados == null || encontrados.size() == 0) {
            throw new ItemNaoEncotradoException(nomePesquisado);
        }
        return encontrados;
    }
    
    public void adcionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void emprestar(ItemEmpretavel empretavel, Usuario usuario) throws MaximoEmprestimoException, ItemJaEmprestadoException, ItemNaoEncotradoException {
        usuario = getUsuario(usuario);
        
        if(acervoMap.containsKey(empretavel)){
            Integer qtdItem = acervoMap.get(empretavel);
            if(qtdItem > 0){
                usuario.addEmprestimo(empretavel);
                qtdItem--;
                acervoMap.put(empretavel, qtdItem);
            }else{
                throw new ItemNaoEncotradoException(empretavel);
            }
        }
        
    }

    public void devolver(ItemEmpretavel empretavel, Usuario usuario) {
        usuario.removeEmprestimo(empretavel);
    }

    public void inserirNoAcervo(ItemEmpretavel empretavel) {
        //acervo.add(empretavel);
        if(acervoMap.containsKey(empretavel)){
            Integer qtdItem = acervoMap.get(empretavel)+1;
            acervoMap.put(empretavel, qtdItem);
        }else{
            acervoMap.put(empretavel, 1);
        }
    }

    private Usuario getUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)){
            usuario = usuarios.get(usuarios.indexOf(usuario));
        }else{
            usuarios.add(usuario);
        }
        return usuario;
    }
    
    public Set<ItemEmpretavel> obterItens(){
        return acervoMap.keySet();
    }

    public List<Usuario> obterUsuarios(){
        return usuarios;
    }

}
