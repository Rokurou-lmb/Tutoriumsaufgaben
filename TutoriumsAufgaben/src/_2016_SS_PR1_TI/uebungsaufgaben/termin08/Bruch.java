package _2016_SS_PR1_TI.uebungsaufgaben.termin08;

public class Bruch {
	private int nenner;
	private int zaehler;
	
	public Bruch() {
		this(1, 1);
	}
	
	public Bruch(int zaehler) {
		this(1, zaehler);
	}
	
	public Bruch(int nenner, int zaehler) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
}