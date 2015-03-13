package br.caelum.ed.vetores;

public class testeLista {
	public static void main(String[] args) {
		int[] lista = new int[5];
		
		lista[0] = 1;
		lista[1] = 4;
		lista[2] = 7;
		lista[3] = 8;
		lista[4] = 1;
		
		for (int x : lista){
			System.out.print(x+" ");
		}
			System.out.println(" ");
			System.out.println("Agora a lista devidamente ordenada");
			System.out.println("---------------");
			for (int i = 0; i < lista.length-1; i++) {
				if (lista[i]>lista[i+1]){
					int t = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = t;
				}
			}	
		
		for (int x : lista){
			System.out.print(x+" ");
		}
		
	}
	
}
