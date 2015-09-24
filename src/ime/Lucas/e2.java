class Fatorial{
	public static void main(String[] args) {

		int fatorial, numero, auxiliar;
		
		numero = 5;
		fatorial = 1;
		auxiliar = numero;

		while(numero > 1){
			fatorial = (fatorial*numero); 
			numero -= 1;
		}
		numero = auxiliar;
		System.out.println("O fatorial de: "+numero+" e "+fatorial);
	}
}
