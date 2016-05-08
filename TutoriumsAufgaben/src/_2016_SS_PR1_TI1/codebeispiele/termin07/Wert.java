package _2016_SS_PR1_TI1.codebeispiele.termin07;

public enum Wert {
	ZWEI(2),
	DREI(3),
	VIER(4),
	FÜNF(5),
	SECHS(6),
	SIEBEN(7),
	ACHT(8),
	NEUN(9),
	ZEHN(10),
	BUBE(11),
	DAME(12),
	KÖNIG(13),
	ASS(14);
	
	private int zahlenWert;
	
	Wert(int zahlenWert) {
		this.zahlenWert = zahlenWert;
	}
	
	public int getZahlenWert() {
		return zahlenWert;
	}
}
