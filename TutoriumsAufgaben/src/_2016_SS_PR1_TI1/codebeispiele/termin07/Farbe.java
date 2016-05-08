package _2016_SS_PR1_TI1.codebeispiele.termin07;

/**
 * Beschreibt mögliche "Farben" einer Spielkarte
 * @author Lenno
 */
public enum Farbe {
	KREUZ("Kreuz"),
	PIK("Pik"),
	HERZ("Herz"),
	KARO("Karo");
	
	private String bezeichnung;

	private Farbe(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}
}
