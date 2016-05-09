package codebeispiele.termin11;

/**
 * Eine einfach verkettete Liste mit einem Startwaechter, welche Objekte eines gegebenen Typen speichert.
 * 
 * @author Lenno
 *
 * @param <T> der Typ der Objekte welche in der Liste gespeichert werden sollen.
 */
public class VerketteteListe<T> {
	private ListenElement<T> _startWaechter;
	private ListenElement<T> _endWaechter;
	private int _elemente;
	
	
	
	public VerketteteListe() {
		super();
		_startWaechter = new ListenElement<T>(null);
		_endWaechter = new ListenElement<T>(null);
		_startWaechter.setzeNachfolger(_endWaechter);
		_endWaechter.setzeVorgaenger(_startWaechter);
		_elemente = 0;
	}

	/**
	 * Gibt das Element an dem gegebenen Index zurueck.
	 * @param index der Index zu gebenden Elements
	 * @return das Element an der gegebenen Indexposition
	 */
	public T gibElement(int index) {
		istGueltigerIndex(index);
		
		ListenElement<T> aktuellesListenElement = _startWaechter;
		
		int aktuellerIndex = 0;
		do {
			aktuellesListenElement = aktuellesListenElement.gibNachfolger();
		} while(aktuellerIndex != index);
		
		return aktuellesListenElement.gibInhalt();
	}
	
	/**
	 * Speichert ein gegebenes Element an dem gegebenen Index.
	 * @param element das zu speichernde Elements
	 * @param index die Indexposition an der das Element gespeichert werden soll.
	 */
	public void hinzufuegen(T element, int index) {
		elementIstNichtNull(element);
		istGueltigerIndex(index);
		
		ListenElement<T> neuesListenElement = new ListenElement<>(element);
		ListenElement<T> aktuellesListenElement = _startWaechter;
		
		int aktuellerIndex = 0;
		while(aktuellerIndex != index) {
			aktuellesListenElement = aktuellesListenElement.gibNachfolger();
		}
		
		ListenElement<T> nachfolger = aktuellesListenElement.gibNachfolger();
		aktuellesListenElement.setzeNachfolger(neuesListenElement);
		neuesListenElement.setzeNachfolger(nachfolger);
		_elemente++;
	}
	
	/**
	 * Haengt ein gegebenes Element an das Ende der Liste an.
	 * @param element das anzuhaengende Element
	 */
	public void anhaengen(T element) {
		elementIstNichtNull(element);
		
		ListenElement<T> neuesListenElement = new ListenElement<>(element);
		ListenElement<T> aktuellesListenElement = _startWaechter;
		
		while(aktuellesListenElement.gibNachfolger() != null) {
			aktuellesListenElement = aktuellesListenElement.gibNachfolger();
		}
		
		aktuellesListenElement.setzeNachfolger(neuesListenElement);
		_elemente++;
	}
	
	/**
	 * Entfernt das Element an der gegebenen Indexposition
	 * @param index der Index des zu entfernenden Elements
	 */
	public void entfernen(int index) {
		istGueltigerIndex(index);
		
		ListenElement<T> aktuellesListenElement = _startWaechter;
		
		int aktuellerIndex = 0;
		while(aktuellerIndex != index) {
			aktuellesListenElement = aktuellesListenElement.gibNachfolger();
		}
		
		ListenElement<T> zuEntfernendesElement = aktuellesListenElement.gibNachfolger();
		ListenElement<T> nachfolger = zuEntfernendesElement.gibNachfolger();
		aktuellesListenElement.setzeNachfolger(nachfolger);
		_elemente--;
	}
	
	/**
	 * Gibt die Anzahl der in der Liste gespeicherten Elemente zurueck.
	 * @return die Anzahl der gespeicherten Elemente
	 */
	public int groesse() {
		return _elemente;
	}
	
	/**
	 * Gibt zurueck ob diese Liste leer ist.
	 * @return {@code true} wenn diese Liste keine Elemente beinhaelt, {@code false} andererseits.
	 */
	public boolean istLeer() {
		return (_startWaechter.gibNachfolger() == null);
	}
	
	/**
	 * Prueft ob das uebergebene Element {@code null} ist. Wirft eine {@code IllegalArgumentException} wenn es {@code null} ist.
	 * @param element das zu pruefende Element
	 */
	private void elementIstNichtNull(T element) {
		if(element == null) {
			throw new IllegalArgumentException("Das uebergebene Element darf nicht null sein.");
		}
	}
	
	/**
	 * Prueft ob der uebergebene Index innerhalb der Indizes dieser Liste liegt. Wirft eine {@code IndexOutOfBoundsException} wenn nicht.
	 * @param index der zu pruefende Index.
	 */
	private void istGueltigerIndex(int index) {
		if(index >= _elemente) {
			throw new IndexOutOfBoundsException("Der uebergegebene Index ist groesser als der maximale Index");
		}
	}
	
	private class ListenElement<T2> {
		private ListenElement<T2> _nachfolger;
		private ListenElement<T2> _vorgaenger;
		private T2 _inhalt;
		
		
		
		public ListenElement(T2 inhalt) {
			_inhalt = inhalt;
		}

		public ListenElement<T2> gibNachfolger() {
			return _nachfolger;
		}

		public ListenElement<T2> gibVorgaenger() {
			return _vorgaenger;
		}
		
		public T2 gibInhalt() {
			return _inhalt;
		}
		
		public void setzeNachfolger(ListenElement<T2> nachfolger) {
			_nachfolger = nachfolger;
		}
		
		public void setzeVorgaenger(ListenElement<T2> vorgaenger) {
			_vorgaenger = vorgaenger;
		}
		
		public void setzeInhalt(T2 element) {
			_inhalt = element;
		}
	}
}
