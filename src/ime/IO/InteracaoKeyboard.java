package ime.IO;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Comparable;

public class InteracaoKeyboard {
	public static void main(String[] args) throws IOException {
		Scanner keyb = new Scanner(System.in);
		System.out.println("Digite o texto: ");
		String a = "";
		while (!a.equals("sair")){
			a = keyb.next();
			System.out.println(a);
		}
		System.out.println("Saiu");
	
	InputStream is = new FileInputStream("/Users/joseluiz/Documents/workspace/J11/src/ime/Arquio.txt");
	InputStreamReader rdr = new InputStreamReader(is);
	BufferedReader buffer = new BufferedReader(rdr);
	String linha = buffer.readLine();
	while (linha != null){
		System.out.println(linha);
		linha = buffer.readLine();
	}
	}
}
