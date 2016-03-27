package _2015_WS_PR1_WI1.codebeispiele.termin05;

import java.util.Scanner;

/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.4
 * Verwendete Quellen: Wikipedia (Begriff: Fibonacci-Folge)
 * 
 */

public class FibonacciZahlen {

	public static void main(String[] args) {
		
		
		// Variablen
		int fib0 = 0;
		int fib1 = 1;
		int zaehler=0;
		int gesuchteFibZahl = 0;
		
		// Einlesen der zu ermittelnden Fibonacci-Zahl
		System.out.println("Die wievielte Fibonacci-Zahl wird gesucht? Bitte eingeben:");
		Scanner scanner = new Scanner(System.in);
		int eingabeZahl = scanner.nextInt();
		scanner.close();
		
		
		while (zaehler < eingabeZahl) {
			
			gesuchteFibZahl=fib0 + fib1;
			fib0=fib1;
			fib1=gesuchteFibZahl;
			
			zaehler++;
				
		}
		
		// Ausgabe der ermittelten Fibonacci-Zahl
		System.out.println("Die gesuchte Fibonacci-Zahl lautet: " + gesuchteFibZahl);
		

	}

}
