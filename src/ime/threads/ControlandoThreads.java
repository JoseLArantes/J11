package ime.threads;



//atomicamente = de uma vez só


public class ControlandoThreads implements Runnable {

	private int id;
	

	public void run() {
		synchronized (this) {
			for (int x = 0; x < 1000; x++){
				System.out.println("Esta saída é do id: "+this.id+" e o contador está em: "+x);
			}
			
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int i) {
		this.id = i;
	}
	
	
}
