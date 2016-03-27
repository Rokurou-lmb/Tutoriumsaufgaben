package aufgabenblatt2;

import java.util.Scanner;

/**
 * BTI1-PTP, SS 16
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.3
 * 
 */

public class Modulo {
	
	public static void main(String[] args) {
		
		// Einlesen von zwei Zahlen a und b
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl(a) ein:");
		int eingabeZahlA = scanner.nextInt();
		
		System.out.println("Bitte geben Sie eine weitere Zahl(b) ein:");
		int eingabeZahlB = scanner.nextInt();
		
		scanner.close();
		
		//Ausgabe
		System.out.println("Ergebnis mit Modulo-Operator: " + eingabeZahlA%eingabeZahlB);
		
		double ergebnisMitFormel = eingabeZahlA-(eingabeZahlA/eingabeZahlB)*eingabeZahlB;
		System.out.println("Ergebnis mit Formel: " + ergebnisMitFormel);
		
		
		
	}

}
