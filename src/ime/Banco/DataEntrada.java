package ime.Banco;

public class DataEntrada {
	private int dia;
	private int mes;
	private int ano;

	public DataEntrada(int dia, int mes, int ano) throws DataInvalidaException{
		this.setMes(mes);
		this.setDia(dia);
		this.setAno(ano);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) throws DataInvalidaException {
		if (dia <= ChecaData(this.getMes())){
			this.dia = dia;
		} else {
			this.dia = 0;
			throw new DataInvalidaException("Dia invalido!");
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) throws DataInvalidaException {
		if (mes <= 12 && mes >1){
			this.mes = mes;	
		} else {
			throw new DataInvalidaException("Mes invalido");
		}
		
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int ChecaData(int mes){
			switch(mes){
			case 2: return 28;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: return 31;
			default: return 30;
			}
	}

	public String getEntrada() throws DataInvalidaException{
		if (this.getDia() != 0){
			return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
		}else{
			throw new DataInvalidaException("Data inválida!");
		}
			
	}
		
}
