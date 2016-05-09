package _2016_SS_PR1_TI1.codebeispiele.termin07.enumbeispiel;

public class Beispiel {
	
	public static void main(String[] args) {
		Karte pikAss = new Karte(Farbe.PIK, Wert.ASS);
		Karte kreuzNeun = new Karte(Farbe.KREUZ, Wert.NEUN);
		
		System.out.println("Karte #1: " + pikAss.toString());
		System.out.println("Karte #2: " + kreuzNeun.toString());
	}
}