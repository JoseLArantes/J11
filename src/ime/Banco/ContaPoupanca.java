package ime.Banco;

import java.util.Comparator;

public class ContaPoupanca extends Conta implements Comparable{
	private String aniversario;
	
	
	public ContaPoupanca(int numero) {
		super(numero);
	}

	public void deposita(double valor){
		super.deposita(valor+valor*7/100); //7% de bonificacao de deposito
		System.out.println("Depósito: 7% de bonificacao de deposito!");
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	

	public int compareTo(Conta outra) {
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
