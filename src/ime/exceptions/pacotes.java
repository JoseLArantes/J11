package ime.exceptions;
import ime.exceptions.Exceptions;
import ime.heranca.ContaCorrente;

public class pacotes {

}



/*Principal biblioteca do JAVA
	java.lang
	Unico pacote que não precisa dar import

	ex:
		System
		String
		Exception

	No JAVA, TODAS as classes são filhas da classe Object. Quando não se inclui extends em uma classe, o Java inclui "extends Object"
	Java estaticamente tipado
		ele confere toda vez se o tipo existe
		
	CLASSE OBJECT
	
		essa classe tem uns 12 ou 13 métodos
		
		Método toString
			retorna uma string com o nome da classe mais um endereço unico do objeto
			é interessante reescrever esse método pra dar uma resposta mais interessante
			
		Método equals
			compara dois objetos
			
			é importante reescrever o método para comparar os métodos ou atributos das classes que deseja reescrever
			

			public boolean equals(Object x){
				Conta z = (Object) x;
				if this.saldo == x.saldo;
			}
			
			System.out.println(contaX.equals(outraConta);
			
	CLASSE STRING
			Não é necessário instanciar a classe String, porém pode-se fazer isso
				ao instanciar uma nova instancia da classe é criada e a referencia à esse objeto é guardado
				na variável escolhida para o new
						
			comparação de Strings sempre deve ser feita com equals
			
			s.equals("Conteúdo bla bla bla");
			
			
			uma string é imutavel pq ela é a referencia pra um objeto
			
			ex.
			s1 = s1.toUpperCase();			
			
			nesse caso foi criado um novo objeto e s1 passou a se referenciar pra ele
			
			 
		Tipos primitivos e referencias não se misturam
		
			int é tipo primitivo e ponto
			
			no java existe uma classe chamada Integer, essa classe possui um atributo int
			isso serve pra guardar um int e esse int poder ser referenciado como um Object
			
			Integer é uma classe que serve pra envelopar, encaixotar um tipo primitivo (wrapper)
			
			
			Integer i = new Integer(50);
			
			auto-boxing
			
			int x = 50;
			Integer i = x;
			
			Integer i = 70;
			
			isso é um wrapper
			
			Todos os tipos primitivos existem equivalentes pra transformar o mundo primitivo para o mundo Object
			
			
			 Integer
		
		
			
			
	
*/

class Guardador{
	private Object[] objetos = new Object[100];
	private int proximo = 0;
	
	public void adiciona(Object o){
		this.objetos[this.proximo] = o;
		this.proximo++;
	}
	public Object pega(int indice){
		return this.objetos[indice];
	}
}

class Executa{
	
	public static void main(String [] args){
		Guardador guardador = new Guardador();
		ContaCorrente conta = new ContaCorrente();	
		guardador.adiciona(conta);

		Object o = guardador.pega(0);
// Conta conta = o; //Não compila porque nem todo object é uma conta
//CAST
		ContaCorrente c = (ContaCorrente) o; //Estou garantindo ao java que o Objeto é do tipo conta;
		System.out.println(c.getSaldo());
	}
}



//

