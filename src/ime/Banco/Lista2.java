package ime.Banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lista2 {
	public static void main(String[] args) {
		List<String> x = new ArrayList<String>();
		
		x.add("aaaaaaaaaa");
		x.add("kkkkkkkkk");
		x.add("hhhhhhhhhhhh");
		
		Collections.sort(x);
		
		System.out.println(x);
		
		
		
		/*
		 Classe Collection, hierarquia
		 
		  							Collection
		  
		    		List						Set
		 LinkedList	     ArrayList					HashSet
		  													---> HashSet -> tabelas de espalhamento
		  													----> tecnica para diminuir o numero de comparações
		  													---> muito mais rapido para executar métodos como Contains 
		  													-->Desvantagem, não consegue manter a ordem, não da pra saber a posição exata de um
		  													elemento
		  													-->utiliza conceito de conjunto
  
		 */
		
		Collection<String> y = new HashSet();
		
		//exemplos de impressao da lista inteira
		
//FOR, fraco para linkedlist		
		for(int i=0;i<x.size();i++){
			System.out.println(x.get(i));
		}
//ITERADOR, pouco usado mas aparece		
		Iterator<String> it = new Iterator() {
		while (it.hasNext()){
			System.out.println(it.next());
		}
//FORIT, mais usado ultimamente		
		for(String palavra : x){
			System.out.println(palavra);
		}
		
		//MAP - relacionamento chave/valor
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put("Usuário", "senha");
		
		mapa.get("Usuário");
		
		
		
		
		
	}
	
class ListaBanco{
	
	private Collection<ContaCorrente> cc = new LinkedList<ContaCorrente>();
	//sendo mais genérico para aproveitar o polimorfismo
	
	
	
	
}
}
