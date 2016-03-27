package _2016_WS_PR1_WI1.uebungsaufgaben.termin03;

public class SchleifenUndModulo {
	public void ausgabe(int inklusivesOberesLimit, int moduloZahl) {
		for(int i = 0; i <= inklusivesOberesLimit; i++) {
			System.out.println((i % moduloZahl) == 0 ? "Super!" : i);
		}
	}
}