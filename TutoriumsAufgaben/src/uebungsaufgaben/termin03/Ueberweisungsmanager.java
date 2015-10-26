package uebungsaufgaben.termin03;

public class Ueberweisungsmanager {
	
	public boolean ueberweisen(Konto quellKonto, Konto zielKonto, int betrag) {
		if(betrag > 0) {
			if(quellKonto.abziehen(betrag)) {
				zielKonto.einzahlen(betrag);
				return true;
			}
		}
		return false;
	}
}
