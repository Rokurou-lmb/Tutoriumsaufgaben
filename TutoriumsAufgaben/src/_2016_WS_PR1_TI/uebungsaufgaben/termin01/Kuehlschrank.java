package _2016_WS_PR1_TI.uebungsaufgaben.termin01;

/**
 * Diese Klasse modeliert einen simplen Kuehlschrank, welcher einzelne Gegenstaende beinhalten kann.
 * 
 * @author Lenno
 */
public class Kuehlschrank {
	private boolean _milchImKuehlschrank;
	private boolean _eierImKuehlschrank;
	private boolean _saftImKuehlschrank;
	
	/**
	 * Initialisiert ein neues Exemplar vom Typ Kuehlschrank welcher bereits aufgefuellt ist.
	 */
	public Kuehlschrank() {
		_milchImKuehlschrank = true;
		_eierImKuehlschrank = true;
		_saftImKuehlschrank = true;
	}
	
	/**
	 * Initialisiert ein neues Exemplar vom Typ Kuehlschrank mit den gegebenen Gegenstaenden bereits vorhanden.
	 * 
	 * @param milchImKuehlschrank true, wenn der Kuehlschrank schon Milch enthaelt.
	 * @param eierImKuehlschrank true, wenn der Kuehlschrank schon Eier enthaelt.
	 * @param saftImKuehlschrank true, wenn der Kuehlschrank schon Saft enthaelt.
	 */
	public Kuehlschrank(boolean milchImKuehlschrank, boolean eierImKuehlschrank, boolean saftImKuehlschrank) {
		_milchImKuehlschrank = milchImKuehlschrank;
		_eierImKuehlschrank = eierImKuehlschrank;
		_saftImKuehlschrank = saftImKuehlschrank;
	}
	
	/**
	 * Fuellt Gegenstaende nach, wenn sie nicht mehr im Kuehlschrank vorhanden sind.
	 */
	public void auffuellen() {
		if(!_milchImKuehlschrank)
		{
			_milchImKuehlschrank = true;
		}
		if(!_eierImKuehlschrank)
		{
			_eierImKuehlschrank = true;
		}
		if(!_saftImKuehlschrank)
		{
			_saftImKuehlschrank = true;
		}
		System.out.println("Der Kuehlschrank wurde wieder aufgefuellt!");
	}
	
	/**
	 * Verbraucht Eier, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn keine Eier vorhanden sind.
	 */
	public void eierEssen() {
		if(_eierImKuehlschrank) 
		{
			_eierImKuehlschrank = false;
			System.out.println("Es sind nun keine Eier mehr im Kuehlschrank!");
		}
		else
		{
			System.out.println("Es sind keine Eier mehr im Kuehlschrank, die man essen koennte!");
		}
	}
	
	/**
	 * Verbraucht Milch, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn keine Milch vorhanden sind.
	 */
	public void milchTrinken() {
		if(_milchImKuehlschrank)
		{
			_milchImKuehlschrank = false;
			System.out.println("Es ist nun keine Milch mehr im Kuehlschrank!");
		}
		else
		{
			System.out.println("Es ist keine Milch mehr im Kuehlschrank, die man trinken koennte!");
		}
	}
	
	/**
	 * Verbraucht Saft, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn kein Saft vorhanden ist.
	 */
	public void saftTrinken() {
		if(_saftImKuehlschrank)
		{
			_saftImKuehlschrank = false;
			System.out.println("Es ist nun kein Saft mehr im Kuehlschrank!");
		}
		else
		{
			System.out.println("Es ist kein Saft mehr im Kuehlschrank, den man trinken koennte!");
		}
	}
	
	/**
	 * Verbraucht Milch, Saft und Eier, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn einer der Gegenstaende nicht vorhanden ist.
	 */
	public void fruehstuecken() {
		if(istKuehlschrankVoll())
		{
			_milchImKuehlschrank = false;
			_eierImKuehlschrank = false;
			_saftImKuehlschrank = false;
			System.out.println("Der Kuehlschrank ist jetzt komplett leer!");
		}
		else
		{
			System.out.println("Es ist nicht alles für ein anstaendiges Fruehstueck im Haus, jemand sollte einkaufen gehen!");
		}
	}
	
	/**
	 * Gibt TRUE zurueck wenn der Kuehlschrank voll(Alle Gegenstaende vorhanden) ist.
	 * @return true, wenn der Kuehlschrank voll ist. Sonst false.
	 */
	public boolean istKuehlschrankVoll() {
		return _milchImKuehlschrank && _eierImKuehlschrank && _saftImKuehlschrank;
	}
}
