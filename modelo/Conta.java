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

public class Conta {
    //ATRIBUTOS
    int numero;
    double saldo;
    double limite;

    //CONSTRUTOR VAZIO
    public Conta() {
    }

    //CONSTRUTORES CHEIO
    public Conta(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    //GET E SET
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //METODOS
      public void sacar(double valor){
        if (this.saldo < this.limite){
            System.out.println("SALDO NEGATIVO");
        }
        else 
            this.saldo = this.saldo - valor;
          System.out.println("Valor do saque --> " + valor + "\n" + "Saldo apos o saque --> "+ this.saldo);
        }
    
        public void depositar(double valor)
        {
        this.saldo = this.saldo + valor;
            System.out.println("Valor depositado: " + valor + "\n" + "Saldo apos o deposito --> "+this.saldo);
        }
          public void transferir(double valor, Conta objConta)
          {
              if (this.saldo >= valor){
                  sacar(valor);
                  objConta.depositar(valor);
              }
              else {
                  System.out.println("Transferencia não permitida");
              }
         }
    
            
}
