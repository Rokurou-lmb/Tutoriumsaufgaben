package _2016_SS_PR1_TI1.codebeispiele.termin07;

public class Karte {
	private Farbe farbe;
	private Wert wert;
	
	/**
	 * Initialisiert eine Karte mit der übergebenen Farbe und Wert
	 * @param farbe Die Farbe der Karte
	 * @param wert Der Wert der Karte
	 */
	public Karte(Farbe farbe, Wert wert) {
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public Farbe getFarbe() {
		return farbe;
	}
	
	public Wert getWert() {
		return wert;
	}
}
