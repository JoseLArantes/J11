package ime.LibJavaLang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;


//Leitor de arquivo externo
//Existe uma Exception CHECKED no FileInputStream - Exception Checked força a utilizacao do try catch

//FileNotFoundException
// Fluxo do arquivo - Le um byte    (InputStreamReader)
// Leitor - Le um char				(BufferReader le inputStreamReader)
// Leitor maior - Le um string		(String le buffer)


//INTERFACE.... >> o que o objeto faz!!

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		//Pacote   java.io
		
		InputStream stream = new FileInputStream("conteudo.txt");
		
		mostraConteudo(stream);
		/*
		Ler de um arquivo especificamente
		FileInputStream stream = new FileInputStream("conteudo.txt");
		
		
		//	stream.read(); isso iria ler um byte 
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader buffer = new BufferedReader(reader);
		String linha = buffer.readLine();
		System.out.println(linha);*/
		
		//Escrever em um arquivo
		OutputStream arquivo = new FileOutputStream("saida.txt");
		OutputStreamWriter writer = new OutputStreamWriter(arquivo);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("teste que esqueve no arquivo");
		bw.close(); 
		
		//Outro exemplo
		
		PrintStream x = System.out;
		x.println("Primeira linha do arquivo");
		x.close();
		
		//Hoje em dia se preferem Interfaces à classes abstratas
		
		
	}
	
	
	//LER DO TECLADO
	/* o processo de leitura de arquivos e leitura de IO é muito parecida, basta usar a classe InputStream que 
	   ela trata tudo o que é byte da mesma forma*/
	
	
	public static void mostraConteudo(InputStream fonte) throws IOException{
		InputStreamReader leitor = new InputStreamReader(fonte);
		BufferedReader buffer = new BufferedReader(leitor);
		
		String linha = buffer.readLine();
		while (linha != null){
			System.out.println(linha);
			linha = buffer.readLine();
		}
	}
	
}
