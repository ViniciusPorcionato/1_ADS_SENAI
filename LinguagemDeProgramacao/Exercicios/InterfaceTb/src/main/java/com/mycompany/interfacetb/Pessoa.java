/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacetb;


public class Pessoa {
    private String nome, idade, sexo, profissao, receberEmail;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(String receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String status() {
        return "nome: " + this.nome + 
                "\nIdade: " + idade + 
                "\nProfissao: " + profissao ;
    }
    
    
    
    
    
}
