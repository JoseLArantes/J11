package ime.lists;

public class DListNode {
	private Object item;
	private DListNode next;
	private DListNode prev;

	public DListNode(Object o) {
		this.item = o;
	}
	public DListNode(Object o, DListNode next) {
		this.item = o;
		this.next = next;
	}
	
	public void setNext(DListNode next){
		this.next = next;
	}
	
	public DListNode getPrev(){
		return this.prev;
	}
	public void setPrev(DListNode prev){
		this.prev = prev;
	}
	
	public DListNode getNext (){
		return this.next;
	}
	
	public Object getItem(){
		return this.item;
	}
	
	public String toString(){
		return this.item.toString();
	}
	
}
