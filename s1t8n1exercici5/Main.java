package s1t8n1exercici5;

public class Main {

	public static void main(String[] args) {
		
		// Instanciem la interf�cie
		PiValue valor = () -> 3.1415;
		
		//Invoquem el m�tode		
		double resultat = valor.getPiValue();
		
		//Imprimim el resultat
		System.out.println(resultat);
	}
}