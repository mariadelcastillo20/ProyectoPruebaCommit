package es.upm.ProyectoPruebaCommit;

public class PruebaCommit {

	public static void main(String[] args) {
		
		System.out.println("Probando segundo commit");
		
		System.out.println("Probando recorrer array");
		int[] numeros = {2, 5, 8, 10};
		for (int n : numeros) {
		    System.out.println(n);
		}
		
		System.out.println("Probando recorrer string");
		String p = "prueba";
		for (int i=0; i<p.length(); i++){
			System.out.print(p.charAt(i));
		}
		
	}
	
}
