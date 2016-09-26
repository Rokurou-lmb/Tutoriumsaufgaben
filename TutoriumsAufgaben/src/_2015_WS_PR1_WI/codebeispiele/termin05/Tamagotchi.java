package _2015_WS_PR1_WI.codebeispiele.termin05;

import java.util.Scanner;

/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 4.1
 * 
 */


/**
 * Diese Klasse repr�sentiert ein Tamagotchi. Durch Eingabe von Kommandos
 * auf der Konsole kann mit dem Tamagotchi interagiert werden. 
 * 
 * @author Helena Lajevardi
 * @version 1.0
 */
public class Tamagotchi {
	
	/**
	 * Eigenschaften(Objektvariablen: hunger, langeweile, muedigkeit),
	 * die den Zustand des Tamagotchis als ganzzahligen positiven Wert beschreiben.
	 */
	private int hunger;
	private int langeweile;
	private int muedigkeit;
	
	/**
	 * Konstruktor
	 */
	public Tamagotchi() {
		
		hunger = 0;
		langeweile = 0;
		muedigkeit = 0;
	}

	/**
	 * In jeder Runde steigen die Werte fuer Hunger, Muedigkeit und Langeweile.
	 * Das Tamagotchi beschwert sich, wenn mindestens einer der Statuswerte 3 ueberschreitet.
	 */
	public void tick(){
		
		hunger++;
		langeweile++;
		muedigkeit++;
		
		if (hunger>3){
			System.out.println("Tamagotchi: Ich habe Hunger! Bitte f�ttere mich...");
		}
		if(langeweile>3){
			System.out.println("Tamagotchi: Mir ist langweilig! Spiel mit mir...");
		}
		if(muedigkeit>3){
			System.out.println("Tamagotchi: Ich bin M�de! Bring mich ins Bett...");
		}
	}
	
	/**
	 * Fuettert das Tamagotchi, dabei wird dem Tamagotchi langweilig.
	 */
	public void iss(){
		
		hunger=0;
		langeweile++;
		
		System.out.println("Tamagotchi: Das war lecker! \n");
	}
	
	/**
	 * Schickt das Tamagotchi schlafen, dabei wird es hungrig.
	 */
	public void schlaf(){
		
		muedigkeit=0;
		langeweile=0;
		hunger++;
		
		System.out.println("Tamagotchi: Jetzt bin ich ausgeschlafen! \n");
	}
	
	/**
	 * Laesst das Tamagotchi spielen, dabei wird es muede und hungrig.
	 */
	public void spiel() {
		
		langeweile=0;
		hunger++;
		muedigkeit++;
		
		System.out.println("Tamagotchi: Das hat Spass gemacht! \n");
	}
	
	/**
	 * Gibt den aktuellen Punktestand auf der Kommandozeile aus.
	 */
	private void printPunktestand(){
		System.out.println("Hunger: " + hunger + " Muedigkeit: " + muedigkeit + " Langeweile: " + langeweile);
		System.out.println("Aktueller Punktestand: " + getPunktestand());
	}
	
	/**
	 * Berechnet den aktuellen Punktestand.
	 * 
	 * @return berechneten Punktestand.
	 */
	public int getPunktestand(){
		
		int punkteStand = 0;
		
		if (hunger<4) {
			punkteStand += 1;
		}
		else if (hunger>=4){
			punkteStand += -2;
		}
		if(muedigkeit<4){
			punkteStand += 1;
		}
		else if (muedigkeit>=4){
			punkteStand += -2;
		}
		if(langeweile<4){
			punkteStand += 1;
		}
		else if(langeweile>=4){
			punkteStand += -2;
		}
		
		return punkteStand;
	}
	
	/**
	 * 
	 * Vergleicht �bergebenes Kommando mit m�glichen Kommandos und
	 * fuehrt dieses bei Uebereinstimmung aus.
	 * 
	 * @param kommando Das uebergebene Kommando.
	 */
	private void verarbeiteKommando(String kommando){
		
		switch (kommando) {
		case "iss":
			iss();
			break;
		case "schlaf":
			schlaf();
			break;
		case "spiel":
			spiel();
			break;
		case "nichts":
			System.out.println("Das Tamagotchi macht nichts...");
			break;
		case "ende":
			break;
		default:
			System.out.println("Befehl nicht erkannt!");
			break;
		}
		
	}	
	
	/**
	 * Main-Methode
	 */
	public static void main(String[] args) {
		
		Tamagotchi myTamagotchi = new Tamagotchi();
		
		Scanner scanKommando = new Scanner(System.in);
		System.out.println("Herzlich Willkommen zum Tamagotchi-Spiel! \n");
		String kommando = "";
		//Game-Loop
		while (!kommando.equalsIgnoreCase("ende")) {
			myTamagotchi.printPunktestand();
			myTamagotchi.tick();
			System.out.println("Was soll das Tamagotchi machen?");
			System.out.println("M�gliche Kommandos: iss, spiel, schlaf, nichts, ende");
		    kommando = scanKommando.next();
			myTamagotchi.verarbeiteKommando(kommando.toLowerCase());
		}
		System.out.println("Das Tamagotchi-Spiel wurde beendet!");
		scanKommando.close();
	
	}
	
	

}
