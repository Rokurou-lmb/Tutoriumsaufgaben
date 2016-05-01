package _2016_SS_PR1_TI1.uebungsaufgaben.termin06;

/**
 * Eine einfache Waage, welche neue Gewichte registrieren, und Aussagen ueber den Verlauf machen kann.
 * @author Lennart Borchert
 * @version 1.0
 */
public class Waage {
	private int letztesGewicht;
	private int aktuellesGewicht;
	private int trend;
	private int minimalesGewicht;
	private int maximalesGewicht;
	private int gesammtesGewicht;
	private int anzahlDerMessungen;
	
	/**
	 * Initialisiert ein neues Objekt des Typs Waage mit dem gegebenen Gewicht.
	 * @param Aktuelles Gewicht in Gramm
	 */
	public Waage(int aktuellesGewicht) {
		aktuellesGewicht = aktuellesGewicht;
		minimalesGewicht = aktuellesGewicht;
		maximalesGewicht = aktuellesGewicht;
		gesammtesGewicht = aktuellesGewicht;
		letztesGewicht = aktuellesGewicht;
		anzahlDerMessungen = 1;
		trend = 0;
	}
	
	/**
	 * Registriert ein neues Gewicht
	 * @param Das aktuelle Gewicht
	 */
	public void registriere(int neuesGewicht) {
		if(neuesGewicht < this.maximalesGewicht) {
			this.maximalesGewicht = neuesGewicht;
		} else if(neuesGewicht > this.minimalesGewicht) {
			this.minimalesGewicht = neuesGewicht;
		}
		this.letztesGewicht = this.aktuellesGewicht;
		this.gesammtesGewicht += this.aktuellesGewicht;
		this.trend = berechneTrend();
		this.anzahlDerMessungen = 1;
		this.aktuellesGewicht = neuesGewicht;
	}
	
	private int berechneTrend() {
		int trend;
		if(this.aktuellesGewicht > this.letztesGewicht) {
			trend = +1;
		} else if(this.aktuellesGewicht < this.letztesGewicht) {
			trend = -1;
		} else {
			trend = 0;
		}
		return trend;
	}
	
	/**
	 * Gibt das kleinste gemessene Gewicht zurueck
	 * @return Kleinstes gemessenes Gewicht
	 */
	public int gibMinimalgewicht() {
		return(this.minimalesGewicht);
	}
	
	/**
	 * Gibt das groesste gemessene Gewicht zurueck
	 * @return Groesstes gemessenes Gewicht
	 */
	public int gibMaximalgewicht() {
		return(this.maximalesGewicht);
	}
	
	/**
	 * Gibt den Durchschnitt der gemessene Gewichte zurueck
	 * @return Durchschnitt der gemessenen Gewichte
	 */
	public int gibDurschnittsgewicht() {
		return(this.gesammtesGewicht / this.anzahlDerMessungen);
	}
	
	/**
	 * Gibt einen representativen Wert zur verdeutlichung des Trends an. Der Wert ist positiv wenn das aktuelle Gewicht
	 * größer als das zuletzt registrierte Gewicht ist. Er ist negativ wenn das aktuelle Gewicht kleiner als das zuletzt
	 * registrierte Gewicht ist. Ansonsten ist er 0.
	 * @return Trend der Gewichtsentwicklung
	 */
	public int gibTrend() {
		return this.trend;
	}
}
