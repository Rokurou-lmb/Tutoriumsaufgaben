package _2016_SS_PR1_TI1.aufgabenblatt4;

public class Rennauto {

	private String name;

	private String typ;

	private double maximalGeschwindigkeit;

	private double gefahreneStrecke;

	public Rennauto(String name, String typ, double maximalGeschwindigkeit) {
		this.name = name;
		this.typ = typ;
		this.maximalGeschwindigkeit = maximalGeschwindigkeit;
	}

	public void fahren() {
		gefahreneStrecke += maximalGeschwindigkeit * Math.random();
	}

	public void ausgeben() {
		System.out.println("Name: " + name + "\n Fahrzeugtyp: " + typ
				+ "\n Maximale Geschwindigkeit: " + maximalGeschwindigkeit + "km/h"
				+ "\n Bereits gefahrene Strecke: " + gefahreneStrecke + "Km");

	}

	public static void main(String[] args) {
		Rennauto rennauto = new Rennauto("Elena", "Ferrari", 10.0);
		rennauto.fahren();
		rennauto.ausgeben();
		rennauto.fahren();
		rennauto.ausgeben();
	}

	public String getName() {
		return name;
	}

	public double getGefahreneStrecke() {
		return gefahreneStrecke;
	}

}
