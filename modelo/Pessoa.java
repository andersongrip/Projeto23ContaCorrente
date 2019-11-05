/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
    //ATRIBUTOS
public class Pessoa {
    String nome;
    String sobrenome;
    String CPF;

    //CONSTRUTOR VAZIO
    public Pessoa() {
    }
    //CONSTRUTOR CHEIO
    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    //METODOS
    public void validarCPF(String cpf){
        
        if (cpf.length()!= 11){
            System.out.println("INVALIDO");
        } 
        else 
            System.out.println("SEU CPF ESTA CORRETO");
    }
    public void getNomeCompleto(){
        System.out.println(this.nome + " " + this.sobrenome + " " + this.CPF);
    }
}
