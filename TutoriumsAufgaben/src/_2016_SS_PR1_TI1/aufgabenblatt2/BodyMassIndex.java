package aufgabenblatt2;
import java.util.Scanner;

/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.2
 * Verwendete Quellen: Wikipedia (Begriff: Body-Mass-Index)
 * 
 */

public class BodyMassIndex {

	public static void main(String[] args) {
		
		// Einlesen von Körpergröße und -gewicht
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Körpergröße (in Metern) an:");
		Double eingabeGroesse = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie ihr Körpergewicht (in kg) an:");
		Double eingabeGewicht = scanner.nextDouble();
		
		scanner.close();
		
		// Berechnung des BMI-Werts
		int bmiWert = (int) (eingabeGewicht / (eingabeGroesse * eingabeGroesse));
		
		// Ausgabe des ermittelten BMI-Werts
		System.out.println("Ihr Body-Mass-Index: " + bmiWert);

	}

}
