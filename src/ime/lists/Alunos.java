package ime.lists;

import br.caelum.ed.Aluno;

public class Alunos{
	private String nome;
	private int idade;
	
	public boolean equals(Object o){
		Alunos outro = (Alunos)o;
		return this.nome.equals(outro.getNome());
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Alunos(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString(){
		return this.nome;
	}
	
}