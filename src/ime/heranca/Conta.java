package ime.heranca;

import ime.exceptions.SaldoInsuficienteException;

abstract public class Conta{
    private Cliente cliente;
    private int numeroConta;
    private double saldo;
    private static double cofre;
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setCliente(Cliente c){
        this.cliente = c;
    }

    public double getCofre(){
       return Conta.cofre;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void deposita(double valor){
        this.saldo += valor;
        Conta.cofre += valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void saca(double valor) throws IllegalArgumentException {
    	if (this.getSaldo() >= valor){
            this.saldo -=valor;
            Conta.cofre -= valor;
        } else {
        	//Passando mensagem via construtor
        	throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }
    }
    
    public void ImprimeCliente(){
    	cliente.ImprimeCliente();
    }
}