package org.modelos;

public class Medicamento {
    private String nome;
    private String classe;
    private String principioativo;
    private String descricao;
    
    public Medicamento() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPrincipioativo() {
        return principioativo;
    }

    public void setPrincipioativo(String principioativo) {
        this.principioativo = principioativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
