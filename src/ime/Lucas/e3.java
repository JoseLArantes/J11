class Produtos{
	public static void main(String[] args) {
		String nome;
		double total, preco;
		int qtd;
		nome = "arroz";
		preco = 20;
		qtd = 25;

		if(qtd < 10){
			total = (qtd*preco);
			System.out.println(nome+","+total);
		}
		if(qtd > 10 && qtd < 20){
			total = ((qtd*preco)-((qtd*preco)*(10/100)));
			System.out.println(nome+","+total);
		}
		if(qtd > 20 && qtd < 50){
			total = ((qtd*preco)-((qtd*preco)*((20/100))));
			System.out.println(nome+","+total);
		}
		if(qtd > 50){
			total = ((qtd*preco)-((qtd*preco)*(20/100)));
			System.out.println(nome+","+total);
		}
	}
}
