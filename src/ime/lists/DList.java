package ime.lists;

public class DList {
	private DListNode head;
	private DListNode tail;
	private int size=0;
	
	
	public void adiciona(Object o){
		if (this.size == 0){
			adicionaComeco(o);
		}else{
			DListNode item = new DListNode(o);
			this.tail.setNext(item);
			this.tail = item;
			this.size++;
		}
	}
	public void adiciona(Object o, int posicao){}
	
	public void adicionaComeco(Object o){
		DListNode item = new DListNode(o,this.head);
		this.head = item;
		if (size == 0){
			this.tail = this.head;
		}
		this.size++;
	}
	
	public void removeComeco(){}
	public void removeFim(){}
	public Object getObjeto(int posicao) throws IllegalArgumentException{
		if (posicao > this.size || posicao < 1){
			throw ( new IllegalArgumentException("Posição inválida!"));
		} else {
			for (int x=1;x<this.size-1;x++){
				if (this.)
			}
		}
		return null;}
	public void remove(int posicao){}
	public int tamanho(){return 0;}
	public boolean contem(Object o){return null}
	
	public String toString(){
		StringBuilder builder = new StringBuilder("[ ");
		
		DListNode atual = this.head;
		
		for (int x=1;x<=this.size-1;x++){
			builder.append(atual.getItem()+", ");
			atual = atual.getNext();
		}
		builder.append(atual.getItem());
		builder.append(" ]");
		return builder.toString();
	}
		
}

class TestAdiciona{
	public static void main(String[] args) {
		System.out.println("Teste adiciona no FIM!!");
		Alunos Alberto = new Alunos("Alberto",32);
		Alunos Bernardo = new Alunos("Bernardo",22);
		Alunos Carlos = new Alunos("Carlos",22);
		Alunos Daniel = new Alunos("Daniel",53);
		Alunos Eduardo = new Alunos("Eduardo",33);
		Alunos Fabio = new Alunos("Fabio",27);
		DList lista = new DList();
		lista.adiciona(Alberto);
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
		lista.adiciona(Fabio);
		System.out.println(lista);
		
	}
}
