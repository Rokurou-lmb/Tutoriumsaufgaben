package uebungsaufgaben.termin03;

/**
 * Diese Klasse modeliert einen simplen Kuehlschrank, welcher einzelne Gegenstaende beinhalten kann.
 * 
 * @author Lenno
 */
public class Kuehlschrank {
	private boolean _milchVorhanden = false;
	private boolean _eierVorhanden = false;
	private boolean _saftVorhanden = false;
	
	/**
	 * Initialisiert ein neues Objekt vom Typ Kuehlschrank mit den gegebenen Gegenstaenden bereits vorhanden.
	 * 
	 * @param milchVorhanden true, wenn der Kuehlschrank schon Milch enthaelt.
	 * @param eierVorhanden true, wenn der Kuehlschrank schon Eier enthaelt.
	 * @param saftVorhanden true, wenn der Kuehlschrank schon Saft enthaelt.
	 */
	public Kuehlschrank(boolean milchVorhanden, boolean eierVorhanden, boolean saftVorhanden) {
		_milchVorhanden = milchVorhanden;
		_eierVorhanden = eierVorhanden;
		_saftVorhanden = saftVorhanden;
	}
	
	/**
	 * Fuellt Gegenstaende ein, wenn sie nicht mehr im Kuehlschrank vorhanden sind.
	 */
	public void auffuellen() {
		if(!_milchVorhanden)
			_milchVorhanden = true;
		if(!_eierVorhanden)
			_eierVorhanden = true;
		if(!_saftVorhanden)
			_saftVorhanden = true;
	}
	
	/**
	 * Verbraucht Eier, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn keine Eier vorhanden sind.
	 */
	public void eierEssen() {
		if(_eierVorhanden)
			System.out.println("Es sind keine Eier mehr im Kuehlschrank!");
		else
			_eierVorhanden = false;
	}
	
	/**
	 * Verbraucht Milch, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn keine Milch vorhanden sind.
	 */
	public void milchTrinken() {
		if(_milchVorhanden)
			System.out.println("Es ist keine Milch mehr im Kuehlschrank!");
		else
			_milchVorhanden = false;
	}
	
	/**
	 * Verbraucht Saft, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn kein Saft vorhanden ist.
	 */
	public void saftTrinken() {
		if(_saftVorhanden)
			System.out.println("Es ist kein Saft mehr im Kuehlschrank!");
		else
			_saftVorhanden = false;
	}
	
	/**
	 * Verbraucht Milch, Saft und Eier, wenn vorhanden.
	 * Gibt eine Meldung auf der Konsole aus wenn einer der Gegenstaende nicht vorhanden ist.
	 */
	public void fruehstuecken() {
		if(!_milchVorhanden || !_eierVorhanden || !_saftVorhanden)
			System.out.println("Es ist nicht alles für ein anstaendiges Fruehstueck im Haus, jemand sollte einkaufen gehen!");
		else {
			_milchVorhanden = false;
			_eierVorhanden = false;
			_saftVorhanden = false;
		}
	}
	
	/**
	 * Gibt TRUE zurueck wenn der Kuehlschrank voll(Alle Gegenstaende vorhanden) ist.
	 * @return true, wenn der Kuehlschrank voll ist. Sonst false.
	 */
	public boolean istKuehlschrankVoll() {
		return _milchVorhanden && _eierVorhanden && _saftVorhanden;
	}
	
	public void whatever() {
		int i = 0;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
	}
}
