package ime.lists;

/**
 * @author joseluiz
 *
 */
public class ListaArrayObjects {
	private Object[] lista;
	private int ultimo = 0;

	public ListaArrayObjects(int comprimento) {
		this.lista = new Object[comprimento];
	}

	public void inserirNoInicio(Alunos aluno) {
		// Cria um array novo com o dobro do tamanho em caso de esgotamento do
		// array
		if (this.ultimo + 1 > this.lista.length) {
			System.out.println("Criando novo array");
			ListaArrayObjects novoArray = new ListaArrayObjects(
					this.lista.length * 2);
			for (int x = 0; x < this.lista.length; x++) {
				novoArray.lista[x] = this.lista[x];
			}
			this.lista = novoArray.lista;
		}
		this.lista[ultimo] = aluno;
		ultimo++;
	}

	public String toString() {
		if (this.ultimo == 0) {
			return "[ ]";
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append("[ ");
			for (int x = 0; x < ultimo; x++) {
				builder.append(this.lista[x] + ", ");
			}
			builder.append(" ]");
			return builder.toString();
		}
	}

	public void inserirPosicao(Alunos aluno, int posicao)
			throws ArrayIndexOutOfBoundsException {
		if (posicao > this.ultimo || posicao < 0) {
			throw (new ArrayIndexOutOfBoundsException("Posição Inválida!!"));
		} else {
			if (this.ultimo + 1 > this.lista.length) {
				System.out.println("Criando novo array ******");
				ListaArrayObjects novoArray = new ListaArrayObjects(
						this.lista.length * 2);
				for (int y = 0; y < this.lista.length; y++) {
					novoArray.lista[y] = this.lista[y];
				}
				this.lista = novoArray.lista;
				this.ultimo--;
			}

			this.ultimo++;
			for (int x = this.ultimo; x > posicao; x--) {
				this.lista[x] = this.lista[x - 1];
			}
			this.lista[posicao] = aluno;
			
		}
	}

}

class TestaListaArrayObjects {
	public static void main(String[] args) {
		ListaArrayObjects ListaAlunos = new ListaArrayObjects(2);
		// Alunos aluno1 = new Alunos("Anabel", 15);

		ListaAlunos.inserirNoInicio(new Alunos("Anabel", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));

		System.out.println(ListaAlunos 	);
		try {
			ListaAlunos.inserirPosicao(new Alunos("Emanuel", 12), 2);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		}

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));
		
		
		System.out.println(ListaAlunos);
		//try {
			ListaAlunos.inserirPosicao(new Alunos("Emanuel", 12), 5);
	//	} catch (ArrayIndexOutOfBoundsException e) {
		//System.out.println(e.getMessage());
		//}

			ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 99));

		System.out.println(ListaAlunos);
		
	}
}