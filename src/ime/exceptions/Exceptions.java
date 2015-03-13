package ime.exceptions;

import ime.exceptions.SaldoInsuficienteException;

import ime.heranca.Conta;
import ime.heranca.ContaCorrente;

public class Exceptions {
	public static void main(String[] args){
	
		ContaCorrente x = new ContaCorrente();
		x.deposita(120);
		try {
			x.saca(100);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	
	
}
