package ime.lists;

public class SList {
	private ListNode head;
	private ListNode tail;
	private int size;

	public SList() {
		this.head = null;
		this.size = 0;
	}

	public void insertFront(Object o) {
		this.head = new ListNode(o, this.head);
		if (this.size == 0) {
			this.tail = this.head;
		}
		size++;
	}

	public void insertItem(Object o) {
		if (size == 0) {
			this.insertFront(o);
		} else {
			this.tail.proxima = new ListNode(o,this.tail.proxima);
			this.head.insetAfter(o);
			//this.tail.proxima = this.head.proxima;
			size++;
		}
	}

	public void removeItem(Object o) {
		for (int x = 1; x <= this.getSize(); x++) {
			if (o.equals(this.getNode(x).getObject())) {

				System.out.println("Item a excluir: " + this.getNode(x));
				break;
			}
		}
	}

	public ListNode getNode(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.head.getPosicao(posicao);
	}

	public void insertPos(Object o, int position) {
		if (this.size == 0) {
			this.insertItem(o);
		} else if (position == this.size) {
			this.insertItem(o);
		} else {
			ListNode anterior = this.getNode(position-1);
			anterior.proxima = new ListNode(o,anterior.proxima);
			size++;
		}

	}

	public int getSize() {
		return size;
	}

	public String toString() {
		if (this.size == 0) {
			return "[ ]";
		}
		StringBuilder builder = new StringBuilder("[ ");
		ListNode atual = this.head;

		for (int x = 0; x < this.size - 1; x++) {
			builder.append(atual.getObject());
			builder.append(", ");
			atual = atual.proxima;
		}
		builder.append(atual.getObject());
		builder.append("]");
		return builder.toString();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.size;
	}

	public void removeDoComeco() {
	}

	public void removeDoFim() {
	}

}
