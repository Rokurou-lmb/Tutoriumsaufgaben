package _2016_WS_PR1_TI.codebeispiele.termin02;

public class BeispielKlasse {

	int _zaehler;
	
	void methode1(String text, int zahl) {
		
		_zaehler += zahl;
		System.out.println(text);
	}
	
	boolean methode2(boolean b1, boolean b2, boolean b3) {
		boolean ergebnis = true;
		
		if(b1 && b2)
		{
			b1 = b3;
			if(b1)
				ergebnis = false;
		}
		return ergebnis;
	}
}
