package s1t8n1exercici5;

public class Main {

	public static void main(String[] args) {
		
		// Instanciem la interfície
		PiValue valor = () -> 3.1415;
		
		//Invoquem el mètode		
		double resultat = valor.getPiValue();
		
		//Imprimim el resultat
		System.out.println(resultat);
	}
}