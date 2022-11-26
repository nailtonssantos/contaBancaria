/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author nltsi
 */
public class Conta {
    static final double RENDIMENTO = 0.02;
    String cliente;
    int digito;
    int agencia;
    int numero;
    double saldo;
    double saidaDaConta;
    double saldoAnterior;
    
    
    
    
        public void Saque(double valorSaque){
        if (saldo != 0 && valorSaque <= saldo){
            System.out.println("Saque Em conta Corrente efetuado com sucesso, O dinheiro será entregue em seguida!");
            System.out.println("Saldo Atual Em conta Corrente: " + saldo);}
            else{System.out.println("Erro, Limite Em conta Corrente Indisponível!");}
        }

    
    public void Deposito(){
        double valorDeposito = 0;
        
        saldo = (saldo + valorDeposito);
        System.out.println("Depósito Efetuado com sucesso! Saldo previsto: " + saldo + " ");
    }
    
    
    public void Transferencia(Conta destino, double valorTransf){    
	if (saldo != 0 && valorTransf <= saldo){
            saldoAnterior = saldo;
            saidaDaConta = (saldoAnterior - valorTransf);
            System.out.println("Transferência Entre Contas efetuada com Sucesso!");
            System.out.println("Conta Remetente: Nome - " + getCliente() + " - Agência - " + getAgencia() + " - DV - " +
            getDigito() + " - Conta Nº - "  + getNumero() + " - Saldo Atual - " + saidaDaConta);
            System.out.println("Conta Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));
            }else{
                System.out.println("Erro! Saldo da Conta Insuficiente");
            }
}
    
    public void Saldo(String cliente, int agencia, int numero, int digito, double saldo){
        
        System.out.println("Nome: " + cliente +
                 "Agência: " + agencia + 
                 " - Número: " + numero + 
                 " - DV: " + digito +
                 " - Saldo Atual: " + saldo);                
    }
    
    
    public static void main(String[] args) {
        
        
        ContaPoupanca poupanca1 = new ContaPoupanca();
        ContaPoupanca poupanca2 = new ContaPoupanca();
        
        ContaCorrente corrente1 = new ContaCorrente();
        ContaCorrente corrente2 = new ContaCorrente();
        
        //Primeira Conta Poupança
        poupanca1.setCliente("João");
        poupanca1.setAgencia(2525);
        poupanca1.setDigito(1);
        poupanca1.setNumero(96969696);
        poupanca1.setSaldo(1500);
        
        //Segunda Conta Poupança
        poupanca2.setCliente("José");
        poupanca2.setAgencia(1111);
        poupanca2.setDigito(2);
        poupanca2.setNumero(99989998);
        poupanca2.setSaldo(200);
           
        //Primeira Conta Corrente
        corrente1.setCliente("André Noel");
        corrente1.setAgencia(1515);
        corrente1.setDigito(3);
        corrente1.setNumero(84028402);
        corrente1.setLimite(1200);
        corrente1.setSaldo(300);
        
        //Segunda Conta Corrente
        corrente2.setCliente("Rafael");
        corrente2.setAgencia(2020);
        corrente2.setDigito(4);
        corrente2.setNumero(35353535);
        corrente2.setSaldo(800);
        corrente2.setLimite(1000);
        
        
        /*****************************************************
        Realize dois saques em quaisquer contas e exiba o saldo a seguir.
        Saque em Conta Corente*/
        //poupanca1.Saque(200);
        //Saque em Conta Poupança
        //poupanca2.Saque(150);
        
        /* ****************************************************
        Realize duas transferências e exiba os saldos das contas envolvidas.
        Transferencia entre Poupanças*/
        //poupanca1.Transferencia(poupanca2, 1500);
        //Transferencia entre Contas Correntes
        //corrente1.Transferencia(corrente2, 100);
        
        /* ****************************************************
        Realize tentativas de um saque e uma transferência para uma conta corrente
        que não tenha saldo suficiente mesmo com o limite
        Tentativa de Saque*/
        corrente2.Saque(3500);
        //Tentativa de Transferência
        //corrente2.Transferencia(poupanca1, 1000);
        
        /* ****************************************************
        Realize tentativas de um saque e uma transferência para uma conta poupança
        que não tenha saldo suficiente.
        Tentativa de Saque*/
        //poupanca2.Saque(500);
        //Tentativa de Transferencia
        //poupanca1.Transferencia(poupanca2, 1800);
        
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

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
    
    
    
}
