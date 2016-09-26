package _2016_SS_PR1_TI.aufgabenblatt6.sendungen;

import _2016_SS_PR1_TI.aufgabenblatt6.Person;

public class Brief extends Sendung{
	
	boolean einschreiben;
	
	
	public Brief(Person sender, Person empfaenger, int sendungsnummer, int startZeitpunkt, boolean einschreiben) {
		super(sender, empfaenger, sendungsnummer, startZeitpunkt);
		this.einschreiben = einschreiben;
	}


	public boolean istEinEinschreiben() {
		return einschreiben;
	}
	
	
}
