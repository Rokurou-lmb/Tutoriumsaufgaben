package _2016_WS_PR1_TI.codebeispiele.termin07;

/**
 * Ein Knoten zum Beschreiben von Baumstrukturen, jeder Knoten hält einen Wert vom Typ {@code int}.
 * 
 * Beispiel einer möglichen Struktur:
 * 
 * 				a
 * 			   /|\
 * 			  / | \
 * 			 /  |  \
 * 			/   |   \
 * 		   b    c    d
 * 			   /|\
 * 			  / | \
 * 			 /  |  \
 * 			/   |   \
 * 		   e    f    g
 * 
 * Man spricht hier davon das a der Wurzelknoten ist, 
 * {b,c,d} die direkten Nachfolger von a und 
 * {e,f,g} die indirekten Nachfolger von a sind.
 * 
 * Werte der Knoten:
 * 		a = 10
 * 		b = 12
 * 		c = 2
 * 		d = 6
 * 		e = 9
 * 		f = 1
 * 		g = null
 * 
 * Beispielaufrufe (mit Ergebnis):
 * 		a.summieren() = 40
 * 		c.summieren() = 12
 * 		e.summieren() = 9
 * 
 * 
 * 
 * @author Lennart Borchert
 */
public class BaumKnoten {
	private BaumKnoten _links;
	private BaumKnoten _mitte;
	private BaumKnoten _rechts;
	private int _wert;
	
	/**
	 * Erzeugt einen neuen Knoten mit dem übergebenen Wert und setzt alle Nachfolger auf {@code null}.
	 * 
	 * @param wert Der Wert welchen der erzeugte Knoten annehmen soll.
	 */
	public BaumKnoten(int wert) {
		_wert = wert;
	}
	
	/**
	 * Erzeugt einen neuen Knoten mit dem übergebenen Wert und hängt die übergebenen Knoten an den erzeugten an.
	 * (Der Parameter "BaumKnoten... knoten" ist ein sogenannter Vararg. 
	 *  Er erlaubt beliebig viele folgende Parameter vom selben Typ anzugeben,
	 *  welche dann als ein Array an den formalen Parameter gebunden werden.
	 *  Dies kann erstmal ignoriert werden, weiter darauf eingegangen wird in Level 4)
	 *
	 * @param wert Der Wert welchen der erzeugte Knoten annehmen soll.
	 * @param knoten Knoten welche angehängt werden soll, 1 bis 3 Knoten sind gefordert.
	 */
	public BaumKnoten(int wert, BaumKnoten... knoten) {
		if(knoten.length > 3) {
			throw new IllegalArgumentException("Es können maximal 3 Knoten an einen Knoten angehängt werden!");
		}
		if(knoten.length == 1) {
			throw new IllegalArgumentException("Es muss mindestens ein Knoten angehängt werden!");
		}
		_wert = wert;
		switch(knoten.length) {
			case 3:
				_rechts = knoten[2];
			case 2:
				_mitte = knoten[1];
			case 1:
				_links = knoten[0];
		}
	}
	
	/**
	 * Summiert die Werte dieses Knoten und aller nachfolgenden Knoten und gibt das Ergebnis zurück.
	 * 
	 * @return Die Summe der Werte dieses Knoten und aller nachfolgenden.
	 */
	public int summieren() {
		int summe = _wert;
		
		if(_links != null)
		{
			summe += _links.summieren();
			if(_mitte != null)
			{
				summe += _mitte.summieren();
				if(_rechts != null)
				{
					summe += _rechts.summieren();
				}
			}
		}
		return summe;
	}
	
	/**
	 * Summiert die Werte aller direkt nachfolgenden Knoten und setzt den eigenen Wert auf die so errechnete Summe.
	 * 
	 * @return Der neue Wert
	 */
	public int internSummieren() {
		//TODO: implementieren
		return 42;
	}
}
