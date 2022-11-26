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
public class ContaPoupanca extends Conta{
    
    /*
    public void Saldo(String cliente, int agencia, int numero, int digito, double saldo){
        
        System.out.println("Nome: " + cliente +
                 "Agência: " + agencia + 
                 " - Número: " + numero + 
                 " - DV: " + digito +
                 " - Saldo Atual: " + saldo);                
    }*/
    
    public void Rendimento(){
        double saldoAnterior = saldo;
        
        saldo = (saldo + (saldo * RENDIMENTO));
        System.out.println("Saldo anterior Da Poupança: " + saldoAnterior +
                           " Saldo Da Poupança Atualizado com Rendimentos: " + saldo +
                            " ");
    }

    public void Saque(double valorSaque){
        if (saldo != 0 && valorSaque <= saldo){
                saldo = saldo - valorSaque;
                System.out.println("Saque Em poupança efetuado com sucesso, O dinheiro será entregue em seguida!"+
                                   " ");
                System.out.println("Saldo Atual da poupança: " + saldo);
            }else{
                System.out.println("Erro, Saldo da poupança Insuficiente!");
        }
    }
    
    
    @Override
    public void Transferencia(Conta destino, double valorTransf){    
	if (saldo != 0 && valorTransf <= saldo){
            saldoAnterior = saldo;
            saidaDaConta = (saldoAnterior - valorTransf);
            System.out.println("Transferência Entre Contas Poupança efetuada com Sucesso!");
            System.out.println("Conta Poupança Remetente: Nome - " + getCliente() + " - Agência - " + getAgencia() + " - DV - " +
            getDigito() + " - Conta Nº - "  + getNumero() + " - Saldo Atual - " + saidaDaConta);
            System.out.println("Conta Poupança Destino: Nome - "  + destino.cliente + " - Agência - " +  destino.agencia + " - DV - "
                    + destino.digito + " - Conta Nº - " + destino.numero + " - Saldo Atual - " + (destino.saldo + valorTransf));
            }else{
                System.out.println("Erro! Saldo da poupança Insuficiente");
            }
}

    void setLimite(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
