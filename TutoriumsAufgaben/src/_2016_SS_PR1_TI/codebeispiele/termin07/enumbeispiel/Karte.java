package _2016_SS_PR1_TI.codebeispiele.termin07.enumbeispiel;

/**
 * Beschreibt eine Spielkarte welche sich durch ihre {@link Farbe} und ihren {@link Wert} beschreibt.
 * @author Lenno
 */
public class Karte {
	private final Farbe farbe;
	private final Wert wert;
	
	/**
	 * Initialisiert eine Karte mit der Uebergebenen {@link Farbe} und {@link Wert}
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
	 * Vergleicht diese Karte mit einer anderen Karte und gibt {@code true} zurueck,
	 * wenn der Wert diese Karte groesser ist als der Wert der anderen Karte.
	 * @param andereKarte
	 * @return
	 */
	public boolean groesserAls(Karte andereKarte) {
		return wert.getZahlenWert() > andereKarte.getWert().getZahlenWert();
	}
	
	@Override
	public String toString() {
		return farbe.getBezeichnung() + wert.getZahlenWert();
	}
}