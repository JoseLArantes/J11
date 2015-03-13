package ime.heranca;

public class ContaCorrente extends Conta{
    private int contaDigito;
    public void setContaDigito(int digito){
        this.contaDigito = digito;
    }
    public int getContaDigito(){
        return this.contaDigito;
    }

    public void deposita(double valor){
        super.deposita(valor - 10);
        System.out.println("Tarifa de operação em Conta Corrente: R$10,00");
    }

    public void saca(double valor) throws IllegalArgumentException{
        super.saca(valor+2);
    }
    
    public void ImprimeDadosCC(){
    	this.ImprimeCliente();
    	System.out.println("---------Dados Bancários----------");
    	System.out.println("O numero da conta é: "+this.getNumeroConta()+"-"+this.getContaDigito());
    	System.out.println("O saldo da conta é: "+this.getSaldo());
    	
    }
}