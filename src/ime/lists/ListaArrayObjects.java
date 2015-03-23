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

	public void inserirNoInicio(Object objeto) {
		// Cria um array novo com o dobro do tamanho em caso de esgotamento do
		// array
		if (duplicarArray(this.lista.length * 2));
		this.lista[ultimo] = objeto;
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

	public boolean duplicarArray(int novoComprimento) {
		if (this.ultimo + 1 > this.lista.length) {
			System.out.println("Criando novo array");
			ListaArrayObjects novoArray = new ListaArrayObjects(novoComprimento);
			for (int x = 0; x < this.lista.length; x++) {
				novoArray.lista[x] = this.lista[x];
			}
			this.lista = novoArray.lista;
			return true;
		}
		return false;
	}

	public void inserirPosicao(Object objeto, int posicao)
			throws ArrayIndexOutOfBoundsException {
		if (posicao > this.ultimo || posicao < 0) {
			throw (new ArrayIndexOutOfBoundsException("Posição Inválida!!"));
		} else {
			if (duplicarArray(this.lista.length * 2));
			this.ultimo++;
			for (int x = this.ultimo; x > posicao; x--) {
				this.lista[x] = this.lista[x - 1];
			}
			this.lista[posicao] = objeto;

		}
	}

	public boolean contem (Object objeto){
		for (int x=0;x<this.ultimo;x++){
			if (objeto.equals(this.lista[x]) == true){
				return true;
			}
		}
		return false;
	}
	
	public void remover (Object objeto){
		for (int x=0;x<this.ultimo;x++){
			if (objeto.equals(this.lista[x])){
				for (int y=x;y<this.ultimo;y++){
					this.lista[y]=this.lista[y+1];
				}
			this.ultimo--;
			}
		}

	}
	
}	

class TestaListaArrayObjects {
	public static void main(String[] args) {
		ListaArrayObjects ListaAlunos = new ListaArrayObjects(2);
		// Alunos aluno1 = new Alunos("Anabel", 15);

		ListaAlunos.inserirNoInicio(new Alunos("Anabel", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro", 15));

		System.out.println(ListaAlunos);
		try {
			ListaAlunos.inserirPosicao(new Alunos("Emanuel", 12), 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro2", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro3", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro4", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro5", 15));
		ListaAlunos.inserirNoInicio(new Alunos("Barbaro6", 15));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro7", 15));

		System.out.println(ListaAlunos);
		try {
			ListaAlunos.inserirPosicao(new Alunos("Emanuel", 12), 5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(ListaAlunos);

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro8", 99));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro9", 99));

		ListaAlunos.inserirNoInicio(new Alunos("Barbaro10", 99));

		System.out.println(ListaAlunos);

		try {
			ListaAlunos.inserirPosicao(new Alunos("Fagundes", 12), 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(ListaAlunos);

		try {
			ListaAlunos.inserirPosicao(new Alunos("Gustavo", 12), 7);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		Alunos higor = new Alunos("Higor", 12);
		
		System.out.println(ListaAlunos.contem(higor));
		
		ListaAlunos.inserirNoInicio(new Alunos("Barbaro11", 99));

		try {
			ListaAlunos.inserirPosicao(new Alunos("Higor", 12), 10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(ListaAlunos);
		
		System.out.println(ListaAlunos.contem(higor));

		ListaAlunos.remover(higor);
		ListaAlunos.remover(new Alunos("Barbaro11", 12));
		ListaAlunos.remover(new Alunos("Barbaro10", 10));
		ListaAlunos.remover(new Alunos("Barbaro9", 9));
		ListaAlunos.remover(new Alunos("Barbaro8", 8));
		ListaAlunos.remover(new Alunos("Aassnabel", 10));
		ListaAlunos.remover(new Alunos("Aassnabel", 10));
		
		ListaAlunos.remover(new Alunos("Aassnabel", 10));
		
		ListaAlunos.remover(new Alunos("Aassnabel", 10));
		
		ListaAlunos.remover(new Alunos("Anabel", 10));
		
		ListaAlunos.remover(new Alunos("Aassnabel", 10));
		
		
		
		System.out.println(ListaAlunos);
		
		

	}
}