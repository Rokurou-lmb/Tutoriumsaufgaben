package _2016_SS_PR1_TI1.aufgabenblatt3;

import java.util.Scanner;

public class FibonacciZahlen {

	public static void main(String[] args) {
		// Variablen
		int fib0 = 0;
		int fib1 = 1;
		int zaehler = 1;
		int gesuchteFibZahl = 0;

		// Einlesen der zu ermittelnden Fibonacci-Zahl
		System.out.println("Die wievielte Fibonacci-Zahl wird gesucht? Bitte eingeben:");
		Scanner scanner = new Scanner(System.in);
		int eingabeZahl = scanner.nextInt();
		scanner.close();

		while (zaehler < eingabeZahl) {

			gesuchteFibZahl = fib0 + fib1;
			fib0 = fib1;
			fib1 = gesuchteFibZahl;

			zaehler++;

		}

		// Ausgabe der ermittelten Fibonacci-Zahl
		System.out.println("Die gesuchte Fibonacci-Zahl lautet: " + gesuchteFibZahl);
	}

}
