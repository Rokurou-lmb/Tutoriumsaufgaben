package codebeispiele.termin05;


/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
 * 
 */


/**
 * Diese Klasse repräsentiert eine Anwendungsklasse, die mehrere Zuege zusammenstellt
 * und dem Annwenden/Testen dient.
 * 
 * @author Helena Lajevardi
 * @version 1.0
 */
public class AnwendungEisenbahnzuege {

	/**
	 * Main-Methode
	 */
	public static void main(String[] args) {
		
		//Erzeuge 5 neue Wagen
		Wagen wagen1 = new Wagen(22,20);
		Wagen wagen2 = new Wagen(26,30);
		Wagen wagen3 = new Wagen(28,32);
		Wagen wagen4 = new Wagen(30,35);
		Wagen wagen5 = new Wagen(24,22);
		
		//Erzeuge 2 neue Lokomotiven
		Lokomotive lok1 = new Lokomotive(144,28);
		Lokomotive lok2 = new Lokomotive(559,30);
		
		//Erzeuge 2 neue Zuege
		Zug zug1 = new Zug(lok1);
		Zug zug2 = new Zug(lok2);
		
		//An zug1 werden 3 Waggons (wagen1 bis wagen3) angehaengt und der Status wird jedesmal ausgegeben
		System.out.println("zug1 mit keinen Waggons:");
		zug1.info();
		zug1.wagenHinzufuegen(wagen1);
		System.out.println("zug1 mit einem Waggon:");
		zug1.info();
		zug1.wagenHinzufuegen(wagen2);
		System.out.println("zug1 mit 2 Waggons:");
		zug1.info();
		zug1.wagenHinzufuegen(wagen3);
		System.out.println("zug1 mit 3 Waggons:");
		zug1.info();
		System.out.println("------------------------------------------------------------------------------");
		
		//An zug2 werden 2 Waggons (wagen4 bis wagen6) angehaengt und der Status wird jedesmal ausgegeben
		System.out.println("zug2 mit keinen Waggons");
		zug2.info();
		zug2.wagenHinzufuegen(wagen4);
		System.out.println("zug2 mit einem Waggon:");
		zug2.info();
		zug2.wagenHinzufuegen(wagen5);
		System.out.println("zug2 mit 2 Waggons:");
		zug2.info();
		System.out.println("------------------------------------------------------------------------------");
		
		//Die Waggons von zug1 werden an zug2 angehaengt und der Status ausgegeben
		zug2.zugAnheangen(zug1);
		System.out.println("zug1:");
		zug1.info();
		System.out.println("zug2:");
		zug2.info();
		System.out.println("------------------------------------------------------------------------------");
		
		//Die Waggons von zug2 werden an zug1 angehaengt und der Status wird ausgegeben
		zug1.zugAnheangen(zug2);
		System.out.println("zug1:");
		zug1.info();
		System.out.println("zug2:");
		zug2.info();
		System.out.println("------------------------------------------------------------------------------");
		
		//Ersten Wagen von zug1 entfernen und Status ausgeben
		System.out.println("zug1 vor dem entfernen des ersten Wagens:");
		zug1.info();
		zug1.erstenWagenEntfernen();
		System.out.println("zug1 nach dem entfernen des ersten Wagens:");
		zug1.info();
		
	}

}
