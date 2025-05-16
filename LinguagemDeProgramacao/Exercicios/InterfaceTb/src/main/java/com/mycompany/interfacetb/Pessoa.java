
package com.mycompany.interfacetb;


public class Pessoa {
    private String nome, idade, sexo, profissao, receberEmail, news;

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

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String status() {
        return  "----Dados do cadastro:----" +
                "\nnome: " + this.nome + 
                "\nIdade: " + this.idade + 
                "\nSexo: " + this.sexo +
                "\nProfissao: " + this.profissao +
                "\nReceber Email: " + this.receberEmail + 
                "\n Cadstrar newsletter: " + this.news +
                "\n";
        
    }
    
}
