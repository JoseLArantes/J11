package ime.lists;

public class ListNode {
	private Object objeto;
	public ListNode proxima;
	
	public void adicionaFim(Object objeto){
		if (this.proxima != null){
			adicionaFim(objeto);
		}else{
			this.proxima = new ListNode(objeto);
		}
	}
	
	
	public ListNode(Object o, ListNode proximo) {
		this.objeto = o;
		this.proxima = proximo;
	}
	
	public ListNode(Object o){
		this(o,null);
	}
	
	public String getProxima(ListNode l){
		return l.proxima.toString();
	}
	
	public void insetAfter(Object o){
		this.proxima = new ListNode(o,this.proxima);
	}
	
	public ListNode getPosicao (int position){
		if (position == 1){
			return this;
		}else{
			if (position <1 || this.proxima == null){
				return null;
			} else{
				return this.proxima.getPosicao(position-1);
			}
		}
	}
	
	
	public String toString(){
		return this.objeto.toString();
	}
	
	public Object getObject(){
		return this.objeto;
	}
	
}


class TesteListNodes{
	public static void main(String[] args) {
		
		SList sl = new SList();
		
		Alunos a = new Alunos("Jose",10);
		Alunos b = new Alunos("Henrique",1);
		Alunos c = new Alunos("Wagnger",9);
		Alunos manuel = new Alunos("Manuel",67);
		Alunos joaquim = new Alunos("Joaquim",33);
		
		sl.insertItem(manuel);
		sl.insertFront(a);
//		sl.insertFront(b);
		sl.insertItem(b);
		sl.insertFront(c);
		//sl.insertFront(joaquim);
		
		
		
		
		System.out.print(sl);
		
		
		System.out.println("");
		sl.removeItem(a);

		
		try{
			System.out.println("*****"+ sl.getNode(4));
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		sl.insertPos(joaquim, 2);
		
		System.out.println(sl);
		
		
		System.out.println(sl.getSize());
		sl.insertPos(a, 6);
		
		System.out.println(sl);
//		System.out.println(sl.toString());

		
		
	}

}