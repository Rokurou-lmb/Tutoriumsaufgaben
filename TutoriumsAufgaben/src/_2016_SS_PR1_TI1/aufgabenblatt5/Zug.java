package _2016_SS_PR1_TI1.aufgabenblatt5;


/**
 * BTI1-PTP/06, SS 15
 * Gruppe: Helena Lajevardi (helena.lajevardi@haw-hamburg.de)
 * 		   Maximilian Lau (maximilian.lau@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
 * 
 */


/**
 * Diese Klasse repraesentiert einen Zug, bestehend aus einer Lokomotive
 * und einer beliebigen Anzahl von Waggons.
 * 
 * @author Helena Lajevardi
 * @version 1.0
 */
public class Zug {
	
	/**
	 * Die Lokomotive dieses Zuges.
	 */
	private Lokomotive lok;
	
	/**
	 * Konstruktor
	 */
	public Zug(Lokomotive lok) {
		
		this.lok = lok;
	}
	
	/**
	 * Haengt einen neuen Wagen an das Ende des Zuges.
	 * 
	 * @param anzuhaengenderWagen Der neue Wagen.
	 */
	public void wagenHinzufuegen(Wagen anzuhaengenderWagen){
		
		if (lok.getErsterWagen() == null) {
			
			lok.setErsterWagen(anzuhaengenderWagen);
		}
		else {
			Wagen wagen = lok.getErsterWagen();
			while(wagen.getNaechsterWagen() != null){
				wagen = wagen.getNaechsterWagen();
			}
			wagen.setNaechsterWagen(anzuhaengenderWagen);		
			
		}
		
	}
	
	/**
	 * Haengt den ersten Wagen aus diesem Zug aus und liefert den ausgehaengten Wagen zurueck.
	 * Die restlichen Wagen ruecken nach vorne. Falls es keinen Wagen gibt, ist das Ergebnis null.
	 * 
	 * @return Der ausgehaengte Wagen oder null.
	 */
	public Wagen erstenWagenEntfernen(){
		
		if (lok.getErsterWagen() == null) {
			return null;
			
		}
		else {
			Wagen ersterWagen = lok.getErsterWagen();
			lok.setErsterWagen(ersterWagen.getNaechsterWagen());
			return ersterWagen;
		}
	}
	
	/**
	 * Haengt alle Wagen eines anderen Zuges in der gleichen Reihenfolge an diesen Zug.
	 * 
	 * @param umzukoppelnderZug Der Zug, dessen Wagen an diesen Zug angekoppelt werden.
	 */
	public void zugAnheangen(Zug umzukoppelnderZug){
		
		Wagen umzukoppelnderWagen = umzukoppelnderZug.erstenWagenEntfernen();	
		wagenHinzufuegen(umzukoppelnderWagen);
		
		while(umzukoppelnderZug.erstenWagenEntfernen() != null);
		
	}
	
	/**
	 * Liefert die Anzahl der Wagen in diesem Zug zurueck ohne Lokomotive.
	 * 
	 * @return Die Anzahl der Wagen.
	 */
	public int getWagenAnzahl(){
		int wagenAnzahl = 0;
		Wagen wagen = lok.getErsterWagen();
		while(wagen !=null){
			wagenAnzahl ++;
			wagen = wagen.getNaechsterWagen();
		}
		return wagenAnzahl;
	}
	
	/**
	 * Liefert die gesamte Passagierkapazitaet des Zuges zurueck.
	 * 
	 * @return Die Passagierkapazitaet.
	 */
	public int getKapazitaet(){
		int kapazitaet = 0;
		Wagen wagen = lok.getErsterWagen();
		while(wagen != null){
			kapazitaet += wagen.getPassagierKapazitaet();
			wagen = wagen.getNaechsterWagen();
		}
		return kapazitaet;
	}
	
	/**
	 * Liefert die Gesamtlaenge des Zuges zurueck.
	 * 
	 * @return Die Gesamtlaenge.
	 */
	public int getLaenge(){
		
		int gesamtLaenge = lok.getLaenge();
		Wagen wagen = lok.getErsterWagen();
		while(wagen != null){
			gesamtLaenge += wagen.getLaenge();
			wagen = wagen.getNaechsterWagen();
		}
		
		return gesamtLaenge;
	}
	
	/**
	 * Gibt eine Beschreibung des Zuges mit allen Bestandteilen auf der Konsole aus.
	 */
	public void info(){
		
		System.out.format("Typ der Lokomotive: "+lok.getTyp()+"  Anzahl Wagen: "
				+ getWagenAnzahl() +"  Gesamtlaenge:"+ getLaenge()
				+ "  Gesamtpassagierkapazitaet: "+getKapazitaet()+"\n");
				
				Wagen wagen = lok.getErsterWagen();
				while(wagen != null){
					System.out.println(wagen.getSerienNummer()+" / "+wagen.getLaenge()
					+" / "+wagen.getPassagierKapazitaet());
					wagen = wagen.getNaechsterWagen();
				}
		
	}

}
