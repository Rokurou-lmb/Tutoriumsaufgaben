package _2016_SS_PR1_TI.codebeispiele.termin07.enumbeispiel;

/**
 * Beschreibt moegliche Werte einer Spielkarte.
 * Asse werden in diesem Beispiel als 1 angesehen
 * @author Lenno
 */
public enum Wert {
	ASS(1),
	ZWEI(2),
	DREI(3),
	VIER(4),
	FUENF(5),
	SECHS(6),
	SIEBEN(7),
	ACHT(8),
	NEUN(9),
	ZEHN(10),
	BUBE(11),
	DAME(12),
	KOENIG(13);
	
	private int zahlenWert;
	
	private Wert(int zahlenWert) {
		this.zahlenWert = zahlenWert;
	}
	
	public int getZahlenWert() {
		return zahlenWert;
	}
}
