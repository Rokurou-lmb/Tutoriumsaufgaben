package _2016_SS_PR1_TI.aufgabenblatt6;

public class Adresse {
	private Staedte ort;
	private int hausnummer;
	private int postleitzahl;

	public Adresse(Staedte ort, int hausnummer, int postleitzahl) {
		super();
		this.ort = ort;
		this.hausnummer = hausnummer;
		this.postleitzahl = postleitzahl;
	}

	public Staedte getOrt() {
		return ort;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

}
