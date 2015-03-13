package ime.LibJavaLang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TesteIO {
	
	private static void CarregaKey(InputStream entrada) throws IOException{
		InputStreamReader stream = new InputStreamReader(entrada);
		BufferedReader buffer = new BufferedReader(stream);
		
		String linha = buffer.readLine();
		while (linha != null){
			System.out.println(linha);
			linha = buffer.readLine();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		InputStream stream = System.in;
		CarregaKey(stream);
		
		
	}
	
	
	
}
