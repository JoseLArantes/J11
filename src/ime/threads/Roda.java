package ime.threads;


// threads    rodar coisas em paralelo

/*
 * JAVADOC lugar onde se guardam as referencias às bibliotecas
 * 
 * 
 * 
 *  Classe anonimas e lambda só funcionam para interfaces que só possuem um método
 * 
 * 
 * 
 * O programa PARA no final do método MAIN
 * 
 * 
 * 
 * 
 * 
 * */


public class Roda{
	public static void main(String[] args) {
		ControlandoThreads p = new ControlandoThreads();
		//TestandoExecucaoParalela p = new TestandoExecucaoParalela();
		p.setId(1);
		Thread t1 = new Thread(p);
		
		t1.start();
		
		
		ControlandoThreads p2 = new ControlandoThreads();
		//TestandoExecucaoParalela p2 = new TestandoExecucaoParalela();
		p2.setId(2);
		
		Thread t2 = new Thread(p2);
		
		t2.start();
		
		
		
	}
}