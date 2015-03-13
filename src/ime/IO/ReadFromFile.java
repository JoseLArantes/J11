package ime.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFile {
	
	public static void loadKey(InputStream keyIn) throws IOException{
		InputStreamReader stream = new InputStreamReader(keyIn);
		BufferedReader buffer = new BufferedReader(stream);
		String lineTyped = buffer.readLine();
		
		while (lineTyped != null){
			System.out.println(lineTyped);
			lineTyped = buffer.readLine();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		InputStream stream = System.in;
		loadKey(stream);
	}
	
}
