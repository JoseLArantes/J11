package ime.Banco;

public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String cep;
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public String getCep() {
		return cep;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}	
	
	public void ImprimeEndereco(){
		System.out.println("------------------------");
		System.out.println("Endereço do cliente");
		System.out.println(" ");
		System.out.println("Endereço: "+this.getRua()+ " "+this.getNumero()+" "+this.getComplemento() );
		System.out.println("Bairro: "+this.getBairro());
		System.out.println("CEP: "+this.getCep());
		System.out.println("Cidade: "+this.getMunicipio());
	}
}
