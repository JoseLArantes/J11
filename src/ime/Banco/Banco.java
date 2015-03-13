package ime.Banco;

public class Banco {
	public static void main(String[] args) throws IllegalArgumentException, DataInvalidaException {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		endereco.setRua("Alameda Santos");
		endereco.setBairro("Saúde");
		endereco.setNumero("100");
		endereco.setComplemento("apto 5");
		endereco.setMunicipio("São Paulo");
		endereco.setCep("01234-077");
		cliente.setEndereco(endereco);
		cliente.setNome("Joaquim de Moura Andrade");
		cliente.setRg("99887766");
		cliente.setCpf("444444444444");
		try{
			DataEntrada dt = new DataEntrada(28, 2, 2015);
			cliente.setEntrada(dt);
		} catch (DataInvalidaException e){
			System.out.println(e.getMessage());
		}
		ContaCorrente cc = new ContaCorrente(555);
		cliente.setCc(cc);
		cc.deposita(150);
		cc.deposita(250);
		cc.deposita(800);
		try{
			cc.saca(300);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		GuardadorDeContas gc = new GuardadorDeContas();

		gc.AddObject(cc);
		
		cliente.ImprimeCliente();
		cc.ImprimeConta();
		
		//como o método toString foi reescrito na classe conta, esse método fica implicito na chamada do objeto Conta
		// fica como se tivesse chamando gc.getObject(0).toString()
		gc.getObject(0).toString();		
		
		
		//--- Outro Cliente
		
		Cliente c = new Cliente();
		Endereco end = new Endereco();
		end.setRua("Pirapora do Bom Jesus");
		end.setNumero("100");
		end.setComplemento("Ap. 108");
		end.setBairro("Julucreia Neusa");
		end.setMunicipio("Pindamonhangaba");
		end.setCep("000000-000");
		c.setNome("Eustácio Filos Abrao");
		c.setRg("222222");
		c.setCpf("77777777");
		c.setEndereco(end);
		try{
			DataEntrada entrada = new DataEntrada(30,03,2015);
			c.setEntrada(entrada);
		} catch (DataInvalidaException e){
			System.out.println(e.getMessage());
		}
		ContaPoupanca cp = new ContaPoupanca(789);
		c.setCp(cp);
		cp.deposita(1000);
		cp.deposita(1000);
		try {
			cp.saca(500);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		gc.AddObject(cp);
		
		c.ImprimeCliente();
		cp.ImprimeConta();
		gc.getObject(1);
		
	}
}
