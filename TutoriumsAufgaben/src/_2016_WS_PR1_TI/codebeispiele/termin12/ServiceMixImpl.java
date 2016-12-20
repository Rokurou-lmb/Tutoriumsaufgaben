package _2016_WS_PR1_TI.codebeispiele.termin12;


/**
 * Eine Klasse mit mehreren Dienstleister-Methoden.
 * Die Ruempfe sind sinnvoll zu fuellen!
 * 
 * @author (Dein Name, Deine Matrikelnummer)
 */
class ServiceMixImpl implements ServiceMix
{
	public ServiceMixImpl() {
		// Diesen Konstruktor unbedingt stehen lassen!
	}
	
	/**
	 * Gibt an, ob die Zeichenkette eine Ziffer enthaelt. Auswertungen: enthaeltZiffer("ab2i") -> enthaeltZiffer("b2i")
	 * -> enthaeltZiffer("2i") -> true enthaeltZiffer("xyz") -> enthaeltZiffer("yz") -> enthaeltZiffer("z") ->
	 * enthaeltZiffer("") -> false
	 */
	public boolean enthaeltZiffer(String s) {
		return (s.length() == 0) ? false : istZiffer(s.charAt(0)) || enthaeltZiffer(s.substring(1));
	}
	
	/**
	 * Gibt an, ob das gegebene Zeichen eine Ziffer ist.
	 */
	private boolean istZiffer(char c) {
		return c >= '1' && c <= '9';
	}
	
	public String nurVokale(String wort) {
		if(wort.length() == 0) {
			return "";
		}
		char erstesZeichen = wort.charAt(0);
		if(wort.length() == 1) {
			return (istVokal(erstesZeichen)) ? "" + erstesZeichen : "";
		}
		String restString = wort.substring(1);
		return (istVokal(erstesZeichen)) ? erstesZeichen + nurVokale(restString) : nurVokale(restString);
	}
	
	/**
	 * Gibt an, ob das gegebene Zeichen ein Vokal ist.
	 */
	private boolean istVokal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	public String[] fizzBuzz() {
		String[] fizzBuzz = new String[100];
		for(int i = 1; i <= 100; i++) {
			fizzBuzz[i - 1] = "" + i;
			String currentString = "";
			int modDrei = i % 3;
			int modFuenf = i % 5;
			if(modDrei == 0 || modFuenf == 0) {
				currentString += (modDrei == 0) ? "Fizz" : "";
				currentString += (modFuenf == 0) ? "Buzz" : "";
				fizzBuzz[i - 1] = currentString;
			}
		}
		return fizzBuzz;
	}
	
	public int[] kummuliere(int[] zahlen) {
		int[] summen = new int[zahlen.length];
		int summe = 0;
		for(int i = 0; i < zahlen.length; i++) {
			summe += zahlen[i];
			summen[i] = summe;
		}
		return summen;
	}
}
