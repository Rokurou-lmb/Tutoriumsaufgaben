package _2016_SS_PR1_TI.aufgabenblatt5;

/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
 * 
 */


/**
 * Diese Klasse repraesentiert einen Wagen, der an eine Lokomotive
 * oder einen anderen Wagen gehaengt werden kann.  
 * 
 * @author Helena Lajevardi
 * @version 1.0
 */
public class Wagen {
	
	/**
	 * Eine Zaehlvariable, die fuer jede neu erzeugte Instanz hochgezaehlt wird.
	 */
	private static int instanzZaehler;
	
	/**
	 * Die eindeutige SerienNr. des Wagens.
	 */
	private final int serienNummer;
	
	/**
	 * Die Laenge des Wagens in Metern.
	 */
	private final int laenge;
	
	/**
	 * Die Anzahl an Personen, die dieser Wagen transportieren kann.
	 */
	private final int passagierKapazitaet;
	
	/**
	 * Der jeweils naechste Wagen, der an diesem Wagen haengt. 
	 */
	private Wagen naechsterWagen;
	
	/**
	 * Konstruktor
	 */
	public Wagen(int laenge, int passagierKapazitaet) {
		
		serienNummer=instanzZaehler++;
		this.laenge = laenge;
		this.passagierKapazitaet = passagierKapazitaet;
		naechsterWagen = null;
	}

	/**
	 * Getter und Setter
	 */
	public int getLaenge() {
		return laenge;
	}
	
	public int getPassagierKapazitaet() {
		return passagierKapazitaet;
	}
	
	public Wagen getNaechsterWagen() {
		return naechsterWagen;
	}

	public void setNaechsterWagen(Wagen naechsterWagen) {
		this.naechsterWagen = naechsterWagen;
	}

	public int getSerienNummer() {
		return serienNummer;
	}

	

	
	

}
