package ime.threads;

public class TestandoExecucaoParalela implements Runnable {
	int id;

	
	
	//Reescrevendo o método run da interface Runnable
	public void run() {
		synchronized (this) {
			for (int x = 0; x < 1000; x++){
				System.out.println("Esta saída é do id: "+this.id+" e o contador está em: "+x);
			}
		}
	}
}