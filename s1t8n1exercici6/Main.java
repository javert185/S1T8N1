package s1t8n1exercici6;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// Creació d'una llista amb nombres i cadenes de text
		List<Object> llista = new ArrayList<Object>();
		llista.add("enciclopedia");
		llista.add(4);
		llista.add("catala");
		llista.add(56);
		llista.add("emparanoiat");
		llista.add(34);
		llista.add("bingo");
		llista.add(79);
		llista.add("aquarius");
		
		// Ordenar la llista amb les cadenes de més curt a més llarg
		Stream<Object> resultat = llista.stream()
				.filter(c -> c instanceof String)
				.sorted((c1, c2) -> ((String)c1).length() - ((String)c2).length());
		
		//Imprimim la llista
		resultat.forEach(c -> System.out.println(c));
	}
}