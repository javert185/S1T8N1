package s1t8n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// Llista d'strings
		List<String> cotxes = new ArrayList<String>();
		cotxes.add("Red Bull");
		cotxes.add("Mercedes");
		cotxes.add("Ferrari");
		cotxes.add("Mclaren");
		cotxes.add("Aston Martin");
		cotxes.add("Alfa Romeo");
		cotxes.add("Williams");
		cotxes.add("Lotus");

		
		//Expressió lambda
		Stream<String> resultat = cotxes.stream()
				.filter(c -> c.contains("o"))
				.filter(c -> c.length() > 5);
				
		//Imprimim
		resultat.forEach(c -> System.out.println(c));		
	}
}