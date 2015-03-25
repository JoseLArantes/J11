package ime.lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class DList {
	private DListNode head;
	private DListNode tail;
	private int size = 0;
	
	public void adiciona(Object o) {
		if (this.size == 0) {
			adicionaComeco(o);
		} else {
			DListNode item = new DListNode(o);
			this.tail.setNext(item);
			item.setPrev(this.tail);
			this.tail = item;
			this.size++;
		}
	}

	public void adiciona(Object o, int posicao) {
		if (posicao == 1) {
			adicionaComeco(o);
		} else if (posicao == this.size) {
			adiciona(o);
		} else {
			DListNode prev = getListNode(posicao - 1);
			DListNode nova = new DListNode(o, prev.getNext());
			prev.setNext(nova);
			nova.setPrev(prev);
			nova.getNext().setPrev(nova);
			this.size++;
		}

	}

	public void adicionaComeco(Object o) {
		DListNode item = new DListNode(o, this.head);
		if (size == 0) {
			this.head = item;
			this.tail = this.head;
			item.setNext(item);
			item.setPrev(item);
		} else{
			//this.head.setPrev(item);
			this.head = item;
			item.setPrev(item);
			item.getNext().setPrev(item);
		}
		this.size++;
	}

	public void removeComeco() {
		if (!posicaoOcupada(1)){
			throw new IllegalArgumentException("Posicao Inválida!");
		}
		this.head = this.head.getNext();
		this.head.setPrev(this.head);
		this.size--;
		
		if (this.size==0){
			this.head = null;
		}
		
	}

	public void removeFim() {
		DListNode atual = getListNode(this.size);
		System.out.println(atual);
		
		this.tail = atual.getPrev();
		System.out.println(this.tail);
		atual.getPrev().setNext(atual.getNext());
		//atual.getNext().setPrev(atual.getPrev());
		//this.tail = this.tail.getPrev();
		this.size--;
		
	}

	public Object getObjeto(int posicao) throws IllegalArgumentException {
		if (!posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posicao Inválida!");
		}
		return this.getListNode(posicao).getItem();
	}

	private DListNode getListNode(int posicao) throws IllegalArgumentException {
		if (!this.posicaoOcupada(posicao)) {
			throw (new IllegalArgumentException("Posicao inválida!"));
		}
		DListNode atual = this.head;
		for (int x = 1; x < posicao; x++) {
			atual = atual.getNext();
		}
		return atual;
	}

	public void remove(int posicao) {
		System.out.println("******* REMOVENDO ITEM *********");
		
		if (!posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida!");
		}
		if (posicao == this.size){
			System.out.println("***REMOVENDO DO FIM***");
			this.removeFim();
		} else if (posicao == 1){
			System.out.println("***REMOVENDO DO COMECO***");
			this.removeComeco();
		} else{
			System.out.println("***REMOVENDO DO POSICAO***");
			DListNode atual = getListNode(posicao);
			DListNode ant = atual.getPrev();
			//DListNode atu = ant.getNext();
			DListNode pro = atual.getNext();
			
			ant.setNext(pro);
			pro.setPrev(ant);
//			atual.getPrev().setNext(atual.getNext());
//			atual.getNext().setPrev(atual.getPrev());
			this.size--;
		}
	}

	public int tamanho() {
		return this.size;
	}

	public boolean contem(Object o) {
		DListNode atual = this.head;
		while (atual != null){
			if (o.equals(atual.getItem())){
				return true;
			}
		atual = atual.getNext();
		}
		return false;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao <= this.size && posicao > 0;
	}

	public String toString() {
		if (this.size == 0){
			return "[ ]";
		}
		StringBuilder builder = new StringBuilder(this.size+"- [ ");

		DListNode atual = this.head;

		for (int x = 1; x <= this.size - 1; x++) {
			builder.append(atual.getItem() + ", ");
			//builder.append(" ##PREV## "+atual.getPrev() + ", ");
			//builder.append("##NEXT## "+atual.getNext() + ", ");
			atual = atual.getNext();
		}
		builder.append(atual.getItem());
		//builder.append(" ##PREV## "+atual.getPrev() + ", ");
		//builder.append("##NEXT## "+atual.getNext() + ", ");
		builder.append(" ]");
		return builder.toString();
	}

}

class TestAdiciona {
	public static void main(String[] args) {
		//System.out.println("Teste adiciona no FIM!!");
		Alunos Alberto = new Alunos("Alberto", 32);
		Alunos Bernardo = new Alunos("Bernardo", 22);
		Alunos Carlos = new Alunos("Carlos", 22);
		Alunos Daniel = new Alunos("Daniel", 53);
		Alunos Eduardo = new Alunos("Eduardo", 33);
		Alunos Fabio = new Alunos("Fabio", 27);

		DList lista = new DList();

		
		System.out.println(lista);
		System.out.println("Teste adiciona no FIM!!");
		lista.adiciona(Alberto);
		System.out.println(lista);	
		System.out.println("Teste adiciona no INICIO!!");
		lista.adicionaComeco(Daniel);
		System.out.println(lista);
		System.out.println("Teste adiciona no FIM!!");
		lista.adiciona(Carlos);
		System.out.println(lista);	
		System.out.println("Teste adiciona no INICIO!!");
		lista.adicionaComeco(Eduardo);
		System.out.println(lista);
		System.out.println("Teste adiciona no MEIO!!");
		lista.adiciona(Fabio,1);
		System.out.println(lista);
		lista.adiciona(Bernardo);
		System.out.println(lista);
		lista.adiciona(Carlos);
		System.out.println(lista);
		System.out.println("------------------------------");
		System.out.println("Teste adiciona no INICIO!!");
		lista.adicionaComeco(Daniel);
		System.out.println(lista);
		lista.adicionaComeco(Eduardo);
		System.out.println(lista);
		lista.adiciona(Fabio, 3);
		System.out.println(lista);
		
		// Pegar um objeto de uma posicao
		try {
			System.out.println(lista.getObjeto(5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		lista.removeFim();
		System.out.println(lista);

		System.out.println("*************");
		System.out.println(lista.contem(Carlos));
		
		lista.adiciona(Carlos);
		
		System.out.println(lista.contem(Carlos));
		System.out.println(lista);
		lista.remove(10);
		System.out.println(lista);
		lista.remove(9);
		System.out.println(lista);
		lista.remove(1);
		System.out.println(lista);
		lista.adicionaComeco(Eduardo);
		System.out.println(lista);

	}
}

class TestAPI{
	public static void main(String[] args) {
		Alunos a = new Alunos("Alberto",12);
		Alunos b = new Alunos("Breno",17);
		Alunos c = new Alunos("Cleber",81);
		Alunos d = new Alunos("Dinei",22);
		Alunos e = new Alunos("Emerson",22);
		
		LinkedList<Alunos> ListaLigada = new LinkedList<Alunos>();
		ListaLigada.add(a);
		ListaLigada.add(b);
		ListaLigada.add(c);
		
		System.out.println(ListaLigada);
		ListaLigada.addFirst(d);
		System.out.println(ListaLigada);
		ListaLigada.addLast(a);
		System.out.println(ListaLigada);
		System.out.println(ListaLigada.contains(a));
		ListaLigada.remove(1);
		System.out.println(ListaLigada.size());
		System.out.println(ListaLigada.get(7));
	}
}

class TestPerformance{
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		
		int elementos = 100000;
		
		long inicio = System.currentTimeMillis();
		
		for (int x=0;x<elementos;x++){
			array.add(0,""+x);
		}
		
		long fim = System.currentTimeMillis();
		System.out.println("Array add comeco: "+(fim-inicio));
		
		inicio = System.currentTimeMillis();
		
		for (int x=0;x<elementos;x++){
			lista.add(0,""+x);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista add comeco: "+(fim-inicio));
			
		//Percorrendo
		
		inicio = System.currentTimeMillis();
		
		for (int x=0;x<elementos;x++){
			array.get(x);
		}
		fim = System.currentTimeMillis();
		System.out.println("Array percorrendo: "+(fim-inicio));
		
		inicio = System.currentTimeMillis();
		
		for (int x=0;x<elementos;x++){
			lista.get(x);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista percorrendo: "+(fim-inicio));
		
		//Removendo comeco
		
		inicio = System.currentTimeMillis();
		for (int x=0;x<elementos;x++){
			array.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Array remove comeco: "+(fim-inicio));
		
		inicio = System.currentTimeMillis();
		for (int x=0;x<elementos;x++){
			lista.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista remove comeco: "+(fim-inicio));
		
	}
}
