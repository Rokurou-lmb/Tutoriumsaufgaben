package _2016_SS_PR1_TI.aufgabenblatt3;

import java.util.Scanner;

public class Flaecheninhalt {

	public static void main(String[] args) {

		// Einlesen
		Scanner scanner = new Scanner(System.in);
		System.out.println("bla1");
		double groesse = scanner.nextDouble();
		System.out.println("bla2");
		int index = scanner.nextInt();

		scanner.close();

		String ausgabe = "";
		switch (index) {
		case 0:
			ausgabe = "Die Flaeche des Kreises betraegt: " + 2 * Math.PI * groesse;
			break;
		case 1:
			ausgabe = "Der Flaecheninhalt des Quadrates betraegt: " + groesse * groesse;
			break;
		case 2:
			ausgabe = "Der Flaecheninhalt des Sechsecks betraegt: " + (groesse*groesse)*1.5*Math.sqrt(3);
			break;
		default:
			ausgabe = "Ungueltiger Index!";
		}
		
		if (index == 0) {
			ausgabe = "Die Flaeche des Kreises betraegt: " + 2 * Math.PI * groesse;
		}
		else if (index == 1) {
			ausgabe = "Der Flaecheninhalt des Quadrates betraegt: " + groesse * groesse;
		}
		else if (index == 2){
			ausgabe = "Der Flaecheninhalt des Sechsecks betraegt: " + (groesse*groesse)*1.5*Math.sqrt(3);
		}

		// Ausgabe
		System.out.println(ausgabe);

	}

}
