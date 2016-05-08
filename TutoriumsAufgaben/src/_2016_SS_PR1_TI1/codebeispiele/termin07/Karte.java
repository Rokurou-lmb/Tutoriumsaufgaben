package _2016_SS_PR1_TI1.codebeispiele.termin07;

/**
 * Beschreibt eine Spielkarte welche sich durch ihre {@link Farbe} und ihren {@link Wert} beschreibt.
 * @author Lenno
 */
public class Karte {
	private final Farbe farbe;
	private final Wert wert;
	
	/**
	 * Initialisiert eine Karte mit der übergebenen {@link Farbe} und {@link Wert}
	 * @param farbe Die {@link Farbe} der Karte
	 * @param wert Der {@link Wert} der Karte
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
	
	/**
	 * Vergleicht diese Karte mit einer anderen Karte und gibt {@code true} zurück,
	 * wenn der Wert diese Karte größer ist als der Wert der anderen Karte.
	 * @param andereKarte
	 * @return
	 */
	public boolean größerAls(Karte andereKarte) {
		return wert.getZahlenWert() > andereKarte.getWert().getZahlenWert();
	}
}