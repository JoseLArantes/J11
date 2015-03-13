package ime.Banco;

public class GuardadorDeContas {
	//Capacidade de guardar 100 objetos
	private int posicao = 0;
	private Object[] object = new Object[100];
	
	public void AddObject(Object o){
		System.out.println("Guardando objeto: "+this.posicao);
		object[this.posicao] = o;
		this.posicao++;
	}
	
	public Object getObject(int indice){
		System.out.println(this.object[indice]);
		return this.object[indice];
	}
		
	
	
	
}
