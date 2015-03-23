package ime.lists;

import java.util.ArrayList;

public class ListaJavaArraylist {

	
	
	
	
}



class TestaListaJavaArraylist{
	public static void main(String[] args) {
		ArrayList<Alunos> vetor = new ArrayList<Alunos>();
		ArrayList str = new ArrayList();
		
		
		
		Alunos jose = new Alunos("Jose", 32);
		Alunos joao = new Alunos("João", 33);
		Alunos jota = new Alunos("Jota", 22);
		Alunos beto = new Alunos("Beto", 11);
		
		vetor.add(jose);
		vetor.add(joao);
		vetor.add(0,jota);
	
		str.add("lajsgfhkjsahj  safkk ahfs kjafs j ja");
		
		String a = (String) str.get(0);
		
		System.out.println(a);
		
		
	}
}