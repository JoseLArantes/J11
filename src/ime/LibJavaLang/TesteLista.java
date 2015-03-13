package ime.LibJavaLang;

import ime.heranca.Conta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Array é dificil, existe uma classe que facilita o uso de coisas que voce quer fazer com array
//Parecido com o guardador de objetos
//

public class TesteLista {
	public static void main(String[] args) {
		
		//pacote java.util
		
		
		// o que vem aqui <> é o tipo da lista, nesse caso só recebe string
		// elimina a necessidade do CAST na leitura

		// <> se chama GENERICS - A partir do java 5
		
		
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("äslashflashflhasfl");
		
		String y = x.get(0);
		x.remove(0);
		
		x.set(0, "ALTERADO");
		
		System.out.println(x.size());
		
		//Essa classe Array List possui muitos métodos
		
		// ArrayList e LinkedList implementam a interface List
		
		
		
		
		
	}
}

class BancoUtil {
	
	private List<Conta> contas = new ArrayList<Conta>();
	
	
}
