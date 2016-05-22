package _2016_SS_PR1_TI1.uebungsaufgaben.blatt2;

/*Klasse "ErstesArray"
 * Das Attribut wert[] ist im Datenfeld mit 6 Elementen.
 * Das Arrayobjekt wird im Konstruktor erzeugt.
 * Die Methode initialisieren() weist jedem Array-Element einen Wert zu.
 * Folgendes Feld ergibt sich:
 * 		wert [0] | [1] | [2] | [3] | [4] | [5]
 * 			 ---------------------------------
 * 			  1  |  2  |  3  |  4  |  5  |  6
 */
public class ErstesArray {
	//Attribut:
	private int[] wert;
	
	//Konstruktor:
	public ErstesArray() {
		//Array-Objekt erzeugen
		wert = new int[6];
	}
	//Methoden:
	public void initialisieren() {
		for (int i = 0; i < wert.length; i++) {
			wert[i] = i+1;
		}
	}
	
	public static void main(String[] args) {
		//Objekt "test" erzeugen:
		ErstesArray test = new ErstesArray();
		//Für das Objekt die Methode initialisieren aufrufen:
		test.initialisieren();
	}
}
