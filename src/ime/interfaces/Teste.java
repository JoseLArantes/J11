package ime.interfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new	Retangulo(7, 5);
		System.out.println(a.calculaArea());
		
		AreaCalculavel circ = new Circulo(1);
		System.out.println(circ.calculaArea());
	}

}
