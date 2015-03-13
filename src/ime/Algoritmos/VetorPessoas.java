package ime.Algoritmos;

class VetorPessoas {
	private int y;
	private Pessoa[] pessoas;
	
	public void setPessoas(Pessoa p, int x){
	
		pessoas[x] = p;
	}
	
	public Pessoa getPessoas(int x){
		return this.pessoas[x];
	}
	
	public VetorPessoas(int vetor){
		this.pessoas = new Pessoa[vetor];
	}

}
