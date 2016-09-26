package _2016_SS_PR1_TI.uebungsaufgaben.termin09;

public abstract class Auflage implements Pizza {
	private final Pizza drunter;
	
	public Auflage(Pizza drunter) {
		this.drunter = drunter;
	}

}
