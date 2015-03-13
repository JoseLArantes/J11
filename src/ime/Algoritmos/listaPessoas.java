package ime.Algoritmos;

public class listaPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Joao, ");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jeferson, ");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Henrique, ");
		
		VetorPessoas vp = new VetorPessoas(3);
		//System.out.println(vp.getPessoas(0).getNome());
		vp.setPessoas(p1, 0);
		vp.setPessoas(p2, 1);
		vp.setPessoas(p3, 2);
		for (int i = 0; i < 3; i++) {
			System.out.print(vp.getPessoas(i).getNome());
		}
		
		
	}
}
