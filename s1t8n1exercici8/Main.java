package s1t8n1exercici8;

public class Main {

	public static void main(String[] args) {
		
		//Un lambda que retorni la mateixa cadena per� al rev�s
		ReverseInt paraula = (s) -> {
			String result = "";
	        for(int i = s.length()-1; i >= 0; i--)
	            result += s.charAt(i);
	        return result;};
		
		//Invoquem la inst�ncia de la interf�cie
		System.out.println(paraula.reverse("Papiroflexia"));
	}
}