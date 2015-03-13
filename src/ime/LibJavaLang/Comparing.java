package ime.LibJavaLang;

public class Comparing {
	public static void main(String[] args) {
		
		String a = "juréia";
		String b = "juréia";
		
		
		
		
		a = a.toUpperCase().replace("J", "G");
		
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(a.length());

		System.out.println(a.substring(4));
		
		System.out.println(a.contains("U"));
		
		
		String c = "    esta cidade é pindamoiangaba  ooooo beleza!!! ! !     !!! ";
		
		System.out.println(c.contains("gaba"));
		System.out.println(c.trim());
		System.out.println(c.isEmpty());
		System.out.println(c.length());
		
		
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		if (i1 == i2){
			System.out.println("Igual");
		}
			System.out.println("Diferente");
			
		System.out.println(i1.equals(i2));	
		
		String cem = "100";
		
		int z = Integer.parseInt(cem);
		
		System.out.println(z);
				
				
		
		
		
		
	}
}
