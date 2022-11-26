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
public class ContaCorrente extends Conta{
    double limite;
    double limiteAnterior;
    double saidaDolimite;



    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    @Override
    public void Saque(double valorSaque){
        if (valorSaque > saldo){
                    if (valorSaque <= (saldo + limite)){
                    saidaDaConta = (saldo - valorSaque);
                    limiteAnterior = limite;
                    saidaDolimite = (limiteAnterior + saidaDaConta);
                    System.out.println("Saque Efetuado com Sucesso!");
                    System.out.println("Saldo Atual em Conta Corrente = 0 / Limite Atual em Conta Corrente- " + saidaDolimite);
                    /*System.out.println("Conta Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));}*/
                }else{
                System.out.println("Erro! Saldo da Conta Insuficiente");
                }}else if(valorSaque <= saldo){  
                    saldoAnterior = saldo;
                    saidaDaConta = (saldoAnterior - valorSaque);
                    System.out.println("Saque Efetuado com Sucesso!");
                    System.out.println("Saldo Atual em Conta Corrente - " + saidaDaConta);
                    /*ystem.out.println("Conta Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));*/
            }else{
                System.out.println("Erro! Saldo da Conta Insuficiente");
            }

        }
        
        
        /*if (valorSaque <= saldo){
            saldoAnterior = saldo;
            limiteAnterior = limite;
            saidaDaConta = saldoAnterior - valorSaque;
            System.out.println("Saque Em conta Corrente efetuado com sucesso, O dinheiro será entregue em seguida!");
            System.out.println("Saldo Atual Em conta Corrente: " + saidaDaConta);
        }
        else if(valorSaque <= limite){
            limite = limite - valorSaque;
            System.out.println("Saque Em conta Corrente efetuado com sucesso, O dinheiro será entregue em seguida!" +
                               " ");
            System.out.println("Limite Atual Em conta Corrente: " + limite);
        }else if(valorSaque > saldo){
                if(valorSaque > limite){
                    if(valorSaque <= (saldo + limite)){
                        limiteAnterior = limite - (saldo - valorSaque);
                        System.out.println("Saque Em conta Corrente efetuado com sucesso, O dinheiro será entregue em seguida!" +
                               " ");
                        System.out.println("Limite Atual Em conta Corrente: " + limiteAnterior);
                    }
                }else{System.out.println("Erro, Limite Em conta Corrente Indisponível!");
        }
    }*/
    
    
    @Override
    public void Transferencia(Conta destino, double valorTransf){ 
                if (valorTransf > saldo){
                    if (valorTransf <= (saldo + limite)){
                    saidaDaConta = (saldo - valorTransf);
                    limiteAnterior = limite;
                    saidaDolimite = (limiteAnterior + saidaDaConta);
                    System.out.println("Transferência Entre Contas Poupança efetuada com Sucesso!");
                    System.out.println("Conta Remetente: Nome - " + getCliente() + " - Agência - " + getAgencia() + " - DV - " +
                    getDigito() + " - Conta Nº - "  + getNumero() + " - Sem saldo, Limite Atualizado - " + saidaDolimite);
                    System.out.println("Conta Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));}
                }else if(valorTransf <= saldo){  
                    saldoAnterior = saldo;
                    saidaDaConta = (saldoAnterior - valorTransf);
                    System.out.println("Transferência Entre Contas Corrente efetuada com Sucesso!");
                    System.out.println("Conta Remetente: Nome - " + getCliente() + " - Agência - " + getAgencia() + " - DV - " +
                    getDigito() + " - Conta Nº - "  + getNumero() + " - Saldo Atual - " + saidaDaConta);
                    System.out.println("Conta Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));
            }else{
                System.out.println("Erro! Saldo da Conta Insuficiente");
            }

        }
}