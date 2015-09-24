package ime.Lucas;

import java.util.Scanner;

class Produto{
	public static void main(String[] args){

    String nome;
	double preco, total;
    int qtd;

		System.out.println("Digite o nome do produto");
		Scanner scanner = new Scanner(System.in);
		nome = scanner.nextLine();
		System.out.println("Nome do produto: "+nome);

		System.out.println("Digite o preco do produto");
		preco = scanner.nextFloat();
		System.out.println("Preco do produto: "+preco);

		System.out.println("Digite a quantidade desejada");
		qtd = scanner.nextInt();
		System.out.println("Quantidade de produtos: "+qtd);

		if (qtd <= 10){
			total = preco*qtd;
			System.out.println(nome+", "+total);
		}
		if (qtd > 10 && qtd < 20){
			total = ((preco*qtd)*10/100);
			System.out.println(nome+", "+total);
		}
		if (qtd > 20 && qtd < 50){
			total = ((preco*qtd)*20/100);
			System.out.println(nome+", "+total);
		}
		else{
			total = ((preco*qtd)*25/100);
			System.out.println(nome+", "+total);
		}
	}
}
