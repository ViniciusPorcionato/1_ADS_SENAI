/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointegrador;

/**
 *
 * @author Vinicius Porcionato
 */
public class TipoImovel {
    
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    @Override
    public String toString() {
        return "Descricao=" + Descricao ;
    }
    
    
    
}
