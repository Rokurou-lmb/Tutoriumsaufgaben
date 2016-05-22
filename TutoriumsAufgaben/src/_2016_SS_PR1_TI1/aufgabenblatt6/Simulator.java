package _2016_SS_PR1_TI1.aufgabenblatt6;

import java.util.Random;
import java.util.Scanner;

import _2016_SS_PR1_TI1.aufgabenblatt6.sendungen.Brief;
import _2016_SS_PR1_TI1.aufgabenblatt6.sendungen.Sendung;

public class Simulator {
	private final static String SCHRITT = "SCHRITT";
	private final static String ENDE = "ENDE";
	
	private static int zeit = 0;
	private static Sendung[] sendungen;
	
	private final static Random rng = new Random();
	private final static Staedte[] staedte = Staedte.values();
	
	public static void main(String[] args) {
		String aktuellerBefehl = "";
		do {
			Scanner scanner = new Scanner(System.in);
			aktuellerBefehl = scanner.nextLine().toUpperCase();
			if(aktuellerBefehl.equals(SCHRITT)) {
				zeit++;
				for (int i = 0; i < sendungen.length; i++) {
					Sendung sendung = sendungen[i];
					if(sendung != null) {
						sendung.aktualisiereZeitpunkt(zeit);
						if(sendung.istAusgeliefert()) {
							//neue Sendung ins System einfließen lassen
							sendungen[i] = getNewDelivery();
						}
					}
				}
			}
			
		} while(!(aktuellerBefehl.equals(ENDE)));
	}
	
	private static Sendung getNewDelivery() {
		Person sender = getNewRandomPerson();
		Person empfaenger = getNewRandomPerson();
		Sendung neueSendung = null;
		
		if(Math.random() > 0.5) { //TODO
		} else {
			
		}
		return neueSendung;
	}

	private static Person getNewRandomPerson() {
		return new Person(new Adresse(staedte[rng.nextInt(staedte.length)], rng.nextInt(100), rng.nextInt(99999)));
	}
}
