package ime.lists;

public class ListaArrayInteger {
	private int[] lista;
	private int ultimo = 0;

	public ListaArrayInteger(int comprimento) {
		this.lista = new int[comprimento];
	}

	public String toString() {
		if (this.ultimo == 0) {
			return "[ ]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int x = 0; x < this.ultimo; x++) {
			builder.append(this.lista[x]);
			builder.append(", ");
		}

		builder.append(" ]");
		return builder.toString();
	}

	public void inserirInicio(int valor) {
		// Verifica a necessidade de se criar um array novo
		// Caso o array esteja esgotando, criar um array novo com o dobro do
		// tamanho
		if (this.ultimo + 1 == this.lista.length) {
			int[] novo = new int[this.lista.length * 2];
			for (int x = 0; x < this.ultimo; x++) {
				novo[x] = this.lista[x];
			}
			System.out.println("Criando novo Array!");
			this.lista = novo;
		}
		this.lista[ultimo] = valor;
		ultimo++;
	}

	public void inserirPosicao(int valor, int posicao)
			throws ArrayIndexOutOfBoundsException {
		if (posicao > this.ultimo || posicao < 0) {
			throw new ArrayIndexOutOfBoundsException("Posicao Inválida!");
		} else {
			this.inserirInicio(this.lista[ultimo]);
			for (int x = this.ultimo; x > posicao; x--) {
				this.lista[x] = this.lista[x - 1];
			}
			this.lista[posicao] = valor;
		}
	}

	public void remover(int valor) throws ArrayIndexOutOfBoundsException {
		for (int x=0; x<this.ultimo;x++){
			if (this.lista[x] == valor){
				for (int y=x;y<this.ultimo;y++){
					this.lista[y] = this.lista[y+1];
				}
				this.ultimo--;
			}
		}
		
		
		
	}

}

class UTListaArrayInteger {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		ListaArrayInteger lista = new ListaArrayInteger(3);
		lista.inserirInicio(10);
		lista.inserirInicio(15);
		lista.inserirInicio(7);
		lista.inserirInicio(17);
		lista.inserirInicio(81);
		lista.inserirInicio(117);
		System.out.println(lista);
		lista.inserirPosicao(99, 2);
		System.out.println(lista);
		lista.inserirPosicao(199, 5);
		System.out.println(lista);
		lista.inserirPosicao(645, 7);
		System.out.println(lista);
		try {
			lista.inserirPosicao(555, 222);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(lista);
		lista.inserirPosicao(871, 6);
		System.out.println(lista);
		lista.inserirPosicao(996, 0);
		System.out.println(lista);
		lista.remover(996);
		System.out.println(lista);
		lista.remover(1179);
		System.out.println(lista);

	}
}