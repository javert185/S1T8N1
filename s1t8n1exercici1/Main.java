package s1t8n1exercici1;

import java.util.*;
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
	
		//Expressió lambda
		Stream<String> resultat = cotxes.stream()
				.filter(c -> c.indexOf("o") != -1);
		
		//Imprimim
		resultat.forEach(c -> System.out.println(c));
	}
}