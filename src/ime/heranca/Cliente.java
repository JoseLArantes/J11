package ime.heranca;

public class Cliente extends Pessoa{
    private int numeroCliente;

    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente(){
        return this.numeroCliente;
    }
    
    public void ImprimeCliente(){
    	System.out.println("Nome: "+this.getNome());
    	System.out.println("RG: "+this.getRG());
    	System.out.println("Numero do cliente: "+this.getNumeroCliente());
    }
}