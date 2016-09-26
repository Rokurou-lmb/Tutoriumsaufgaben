package _2015_WS_PR1_WI.codebeispiele.termin05;


/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
 * 
 */


/**
 * Diese Klasse repr�sentiert eine Lokomotive.  
 * 
 * @author Helena Lajevardi
 * @version 1.0
 */
public class Lokomotive {
	
	/**
	 * Die Laenge der Lokomotive in Metern.
	 */
	private final int laenge;
	
	/**
	 * Die Typ der Lokomotive.
	 */
	private final int typ;
	
	/**
	 * Der erste Wagen der an der Lokomotive haengt.
	 */
	private Wagen ersterWagen;
	
	/**
	 * Konstruktor
	 */
	public Lokomotive(int typ, int laenge) {
		
		this.typ = typ;
		this.laenge = laenge;
		ersterWagen = null;
	}

	/**
	 * Getter und Setter
	 */
	public int getLaenge() {
		return laenge;
	}
	
	public int getTyp() {
		return typ;
	}
	
	public Wagen getErsterWagen() {
		return ersterWagen;
	}
	
	public void setErsterWagen(Wagen ersterWagen) {
		this.ersterWagen = ersterWagen;
	}
	
}
