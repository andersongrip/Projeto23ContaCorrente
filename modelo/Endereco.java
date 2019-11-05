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
public class Endereco {
    //ATRIBUTOS
    String rua;
    String numero;
    String cidade;
    String estado;
    String CEP;

    //CONSTRUTOR VAZIO
    public Endereco() {
    }

    //CONSTRUTORES CHEIOS
    public Endereco(String rua, String numero, String cidade, String estado, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    //GET E SET
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    //METODOS
      public void localizacaoByCEP(String cep){
          if (this.CEP.equals(cep)){
               System.out.println("ESTADO: "+ this.estado + "\nCIDADE: " + this.cidade + "\nRUA: " + this.rua + "NUMERO: " + this.numero + "\nCEP: " + this.CEP);
          }
         
    }
      
}
