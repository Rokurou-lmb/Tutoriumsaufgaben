package _2016_SS_PR1_TI1.aufgabenblatt6.sendungen;

import _2016_SS_PR1_TI1.aufgabenblatt6.Person;

public abstract class Sendung {
	private Person sender;
	private Person empfaenger;
	private int sendungsnummer;
	private int startZeitpunkt;
	private int transportDauer;
	private static int sendungsnummerZaehler;
	private boolean ausgeliefert;

	public Sendung(Person sender, Person empfaenger, int sendungsnummer, int startZeitpunkt) {
		this.sender = sender;
		this.empfaenger = empfaenger;
		this.sendungsnummer = sendungsnummer;
		this.startZeitpunkt = startZeitpunkt;
	}

	public Person getSender() {
		return sender;
	}

	public Person getEmpfaenger() {
		return empfaenger;
	}

	public int getSendungsnummer() {
		return sendungsnummer;
	}

	public int getStartZeitpunkt() {
		return startZeitpunkt;
	}

	public int getTransportDauer() {
		return transportDauer;
	}

	public boolean istAusgeliefert() {
		return ausgeliefert;
	}
	
	public void aktualisiereZeitpunkt(int neuerZeitpunkt) {
		this.startZeitpunkt = neuerZeitpunkt;
	}
}
