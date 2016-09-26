package _2016_SS_PR1_TI.aufgabenblatt6.sendungen;

import _2016_SS_PR1_TI.aufgabenblatt6.Person;

public class Packet extends Sendung {
	
	private double gewicht;
	
	public Packet(Person sender, Person empfaenger, int sendungsnummer, int startZeitpunkt, double gewicht) {
		super(sender, empfaenger, sendungsnummer, startZeitpunkt);
		this.gewicht = gewicht;
	}

	public double getGewicht() {
		return gewicht;
	}

}
