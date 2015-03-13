package ime.Banco;

public class ContaCorrente extends Conta implements Tributavel, Comparable{
	
	public ContaCorrente(int numero){
		super(numero);
	}	
	
	public void deposita(double valor){
		super.deposita(valor - valor*10/100); //10% de taxa de conta corrente
		this.tributaDeposito(10);
		System.out.println("Cobrança de taxa de deposito: R$"+valor*10/100);
	}
	
	public void saca(double valor){
			super.saca(valor + valor*1/100); //1% de taxa de saque de cc
			this.tributaSaque(5);
			System.out.println("Cobrança de taxa de saque: R$"+valor*1/100);
	}

	public void tributaDeposito(int percent) {
		super.saca(super.getSaldo()*percent/100);
		System.out.println("Pagando "+percent+"% de tributos devido a depósito");
		
	}
	public void tributaSaque(int percent) {
		super.saca(super.getSaldo()*percent/100);
		System.out.println("Pagando "+percent+"% de tributos devido a saque");
	
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

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
