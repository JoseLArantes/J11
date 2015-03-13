package ime.Banco;

abstract public class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private Endereco endereco;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void ImprimePessoa(){
		System.out.println("-------------------------");
		System.out.println("Dados do cliente");
		System.out.println("");
		System.out.println("Nome: "+this.getNome());
		System.out.println("RG: "+this.getRg());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("");
		this.endereco.ImprimeEndereco();
	}
	
}
