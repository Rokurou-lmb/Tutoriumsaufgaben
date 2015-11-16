package codebeispiele.termin07;

public class GuessMyObjectAufgabe {
	
	private int _verschiebung;
	
	public GuessMyObjectAufgabe(String a) {
		_verschiebung = a.length();
	}
	
	public String guessMyObjectIter(String a) {
		String b = "";
		for(int i = 0; i < a.length(); i++) {
			char aktuellesZeichen = a.charAt(i);
			if(aktuellesZeichen >= 'a' && aktuellesZeichen <= 'z') {
				b += (char)(aktuellesZeichen + (_verschiebung % 26));
			} else if(aktuellesZeichen >= 'A' && aktuellesZeichen <= 'Z') {
				b += (char)(aktuellesZeichen + (_verschiebung % 26));
			}
		}
		return b;
	}
	
	public String guessMyObjectRekHelp(String a) {
		return guessMyObjektRek(a, 0);
	}
	
	private String guessMyObjektRek(String a, int index) {
		if(index == a.length()) {
			return "";
		} else {
			char aktuellesZeichen = a.charAt(index);
			if(aktuellesZeichen >= 'a' && aktuellesZeichen <= 'z') {
				aktuellesZeichen = (char)(aktuellesZeichen + (_verschiebung % 26));
			} else if(aktuellesZeichen >= 'A' && aktuellesZeichen <= 'Z') {
				aktuellesZeichen = (char)(aktuellesZeichen + (_verschiebung % 26));
			}
			return aktuellesZeichen + guessMyObjektRek(a, index+1);
		}
	}
}
