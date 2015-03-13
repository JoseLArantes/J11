package ime.Banco;

public class DataInvalidaException extends Exception{

	public DataInvalidaException(String string) {
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Dia impossível para mês escolhido";
	}
	
}
