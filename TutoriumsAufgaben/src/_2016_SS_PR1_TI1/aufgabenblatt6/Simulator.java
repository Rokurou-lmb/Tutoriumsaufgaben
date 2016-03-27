package _2016_SS_PR1_TI1.aufgabenblatt6;

import java.util.Scanner;
import _2016_SS_PR1_TI1.aufgabenblatt6.sendungen.Sendung;

public class Simulator {
	private final static String SCHRITT = "SCHRITT";
	private final static String ENDE = "ENDE";
	
	private static int zeit = 0;
	private static Sendung[] sendungen;
	
	public static void main(String[] args) {
		String aktuellerBefehl = "";
		do {
			Scanner scanner = new Scanner(System.in);
			aktuellerBefehl = scanner.nextLine();
			if(aktuellerBefehl.equals(SCHRITT)) {
				
			}
			
		} while(!(aktuellerBefehl.equals(ENDE)));
	}
}
