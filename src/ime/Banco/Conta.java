package ime.Banco;

abstract public class Conta implements Comparable {
	private static double cofreSomaTudo;
	private int numero;
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setCofre(double valor){
		Conta.cofreSomaTudo +=valor;
	}
	
	public double getCofre(){
		return this.cofreSomaTudo;
	}
	
	
	public void deposita(double valor){
		this.saldo += valor;
		this.setCofre(valor);
	}
	
	public void saca(double valor) throws IllegalArgumentException{
		if (this.saldo > valor){
			this.saldo -= valor;
			this.setCofre(-valor);
		} else {
			throw new IllegalArgumentException("Saldo insuficiente para esta operacação!");
		}
	}
	
	public Conta(int numero){
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "[Saldo: "+this.getSaldo()+"]";
	}
	
	public int compareTo(Conta outra){
		if (this.getSaldo() < outra.getSaldo()){
			return -1;
		}
		if (this.getSaldo() > outra.getSaldo()) {
			return 1;
		} 
		return 0;
	}
	
	public void ImprimeConta(){
		System.out.println("----------------------------");
		System.out.println("Dados da Conta ");
		System.out.println(" ");
		System.out.println("Numero da conta: "+this.getNumero());
		System.out.println("Saldo atual R$"+this.getSaldo());
		System.out.println(" ");
		System.out.println("-- Cofre -- ");
		System.out.println(this.getCofre());
	}
	
	
}
