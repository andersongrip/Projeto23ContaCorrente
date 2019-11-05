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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa objPessoa1 = new Pessoa("Anderson","Gripa", "12345678910");
        Pessoa objPessoa2 = new Pessoa("Jose", "Eduardo", "10987654321");
        Conta obj1conta = new Conta(01, 5000, 1000);
        Conta obj2conta = new Conta(02, 3500, 900);
        Endereco objEnd1 = new Endereco("Floriano Peixoto", "255", "Lins", "SP", "16450-000");
        Endereco objEnd2 = new Endereco("rua 2", "355", "getulina", "sp", "16400-000");
        
        objPessoa1.getNomeCompleto();
        objPessoa1.validarCPF(objPessoa1.getCPF());
        objEnd1.localizacaoByCEP("16450-000");
        System.out.println("Numero da conta --> "+ obj1conta.numero);
        System.out.println("Saldo --> "+ obj1conta.getSaldo());
        System.out.println("Limite --> "+ obj1conta.getLimite());
        obj1conta.sacar(250);
        obj1conta.depositar(100);
        obj1conta.transferir(655, obj2conta);
        
        
                
        System.out.println("\n");
        
       
        objPessoa2.getNomeCompleto();
        objPessoa2.validarCPF(objPessoa2.getCPF());
        objEnd2.localizacaoByCEP("16400-000");
        System.out.println("Numero da conta --> "+ obj2conta.numero);
        System.out.println("Saldo --> "+ obj2conta.getSaldo());
        System.out.println("Limite --> "+ obj2conta.getLimite());
        obj2conta.sacar(250);
        obj2conta.depositar(100);
        obj2conta.transferir(655, obj1conta);
        
    }
    
}
