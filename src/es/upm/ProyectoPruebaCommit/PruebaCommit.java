package es.upm.ProyectoPruebaCommit;

public class PruebaCommit {

	public static void main(String[] args) {
		
		System.out.println("Probando segundo commit");
		
		System.out.println("Probando recorrer array");
		int[] numeros = {2, 5, 8, 10};
		for (int n : numeros) {
		    System.out.println(n);
		}
		
		int mayor = numeros[0];
		for (int n : numeros) {
		    if (n > mayor) {
		        mayor = n;
		    }
		}
		System.out.println("El numero mayor es: " + mayor);
		
		System.out.println("Probando recorrer string");
		String p = "prueba";
		for (int i=0; i<p.length(); i++){
			System.out.print(p.charAt(i));
		}
		
		System.out.println(factorial(4));
	
	}
	
	public static int factorial(int n) {
	    if (n == 0) return 1; // Caso base
	    return n * factorial(n - 1); // Llamada recursiva
	}
	
	public static int sumar(int n) {
	    if (n == 0) {
	        return 0;
	    }
	    return n + sumar(n - 1);
	}
	
}
