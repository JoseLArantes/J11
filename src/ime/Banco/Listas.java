package ime.Banco;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		List<Conta> x = new LinkedList<Conta>();
		
		ContaCorrente c = new ContaCorrente(0);
		c.deposita(1000);
		
		ContaCorrente d = new ContaCorrente(1);
		d.deposita(400);
		
		ContaCorrente e = new ContaCorrente(2);
		e.deposita(359);
		
		x.add(c);
		x.add(d);
		x.add(e);
		
		Collections.sort(x);
		
		System.out.println(x);
		//ORDENANDO
		
		//Reescrever o método compareTo da classe listas
		
		
		//Classe anonima
				
		Collections.sort(x, new Comparator<ContaCorrente>(){
			public int compare(String s1, String s2){
				if (s1.length() < s2.length()){
					return -1;
				}
				if (s1.length() > s2.length()){
					return 1;
				}
				return 0;
			}

			@Override
			public int compare(ContaCorrente arg0, ContaCorrente arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
				
				
				
		
	}
}
