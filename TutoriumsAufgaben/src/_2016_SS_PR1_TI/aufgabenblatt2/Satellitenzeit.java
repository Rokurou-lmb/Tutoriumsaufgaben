package _2016_SS_PR1_TI.aufgabenblatt2;
import java.util.Scanner;

/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.1
 * 
 */

public class Satellitenzeit {

	public static void main(String[] args) {
		
		// Einlesen der Anzahl der Sekunden
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl der Sekunden ein:");
		int sekunden = scanner.nextInt();
		scanner.close();
		
		// Ermitteln der Tage, Stunden, Minuten aus der Anzahl der Sekunden
		int tage=sekunden / 86400;
		sekunden= sekunden-tage * 86400;
		int stunden= sekunden / 3600;
		sekunden = sekunden - stunden*3600;
		int minuten= sekunden / 60;
		sekunden = sekunden - minuten * 60;
	
		
		// Ausgabe der Zeitspanne in Tagen, Stunden, Minuten und Sekunden
		System.out.println(tage + " Tage " + stunden + ":" + minuten + ":" + sekunden);

	}

}