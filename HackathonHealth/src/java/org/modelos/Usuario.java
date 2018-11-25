package org.modelos;
//import java.util.ArrayList;

import java.util.ArrayList;


public class Usuario {
   private int id;
   private String nome;
   private String sexo;
   private String idade;
   private String altura;
   private String peso;
   private String gestante;
   private ArrayList<Alergia> alergia;
   private ArrayList<Sintomas> sintomas;

   public Usuario(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getGestante() {
        return gestante;
    }

    public void setGestante(String gestante) {
        this.gestante = gestante;
    }

    public ArrayList<Alergia> getAlergia() {
        return alergia;
    }

    public void setAlergia(ArrayList<Alergia> alergia) {
        this.alergia = alergia;
    }

    public ArrayList<Sintomas> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<Sintomas> sintomas) {
        this.sintomas = sintomas;
    }

   
}
