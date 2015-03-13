package br.caelum.ed.vetores;
import br.caelum.ed.Aluno;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Joao");
		a2.setNome("Joaquim");
		a3.setNome("Manuel");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
	TesteAdicionaPorPosicao pp = new TesteAdicionaPorPosicao(); 	
	}
}
