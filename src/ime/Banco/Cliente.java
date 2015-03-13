package ime.Banco;

public class Cliente extends Pessoa{
	private DataEntrada entrada;
	private ContaCorrente cc;
	private ContaPoupanca cp;
	
	public ContaCorrente getCc() {
		return cc;
	}
	public void setCc(ContaCorrente cc) {
		this.cc = cc;
	}
	public ContaPoupanca getCp() {
		return cp;
	}
	public void setCp(ContaPoupanca cp) {
		this.cp = cp;
	}
	
	public void ImprimeCliente() throws NullPointerException, DataInvalidaException{
		this.ImprimePessoa();
		try{
			if (entrada.getDia() != 0){
				System.out.println("Data de Entrada: "+entrada.getEntrada());
			} else {
				throw new DataInvalidaException("Data Inválida!");
			}
		} catch (NullPointerException e){
			e.getMessage();
		}
	}
	public DataEntrada getEntrada() {
		return entrada;
	}
	public void setEntrada(DataEntrada entrada) {
		this.entrada = entrada;
	}
}
