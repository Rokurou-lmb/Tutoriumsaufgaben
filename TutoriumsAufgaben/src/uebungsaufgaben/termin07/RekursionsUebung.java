package uebungsaufgaben.termin07;

/**
 * Eine Klasse mit einer Beispielmethode welche rekursiv implementiert wurde.
 * 
 * @author Lennart Borchert
 */
public class RekursionsUebung {
	
	/**
	 * Entfernt alle Vorkommnisse des gegebenen Zeichens aus der übergebenen Zeichenkette.
	 * @param zeichenkette der String aus welchem die Zeichen entfernt werden sollen.
	 * @param zuEntfernendesZeichen das zu entfernende Zeiohen.
	 * @return Die übergebene Zeichenkette ohne alle Vorkomnisse des übergebenen Zeichens.
	 */
	public String vorkommenEntfernen(String zeichenkette, char zuEntfernendesZeichen) {
		if(zeichenkette.length() == 0) {
			return "";
		}
		char erstesZeichen = zeichenkette.charAt(0);
		
		String restlicheZeichenkette = vorkommenEntfernen(zeichenkette.substring(1), zuEntfernendesZeichen);
		
		return (erstesZeichen == zuEntfernendesZeichen) ? restlicheZeichenkette : erstesZeichen + restlicheZeichenkette ;
	}
	
	public String vorkommenEntfernenIterativ(String zeichenkette, char zuEntfernendesZeichen){
		String neueZeichenkette = "";
		for (int i = 0; i < zeichenkette.length(); i++) {
			if(zeichenkette.charAt(i)!=zuEntfernendesZeichen){
				neueZeichenkette = neueZeichenkette + zeichenkette.charAt(i);
			}
		}
		return neueZeichenkette;
	}
}
