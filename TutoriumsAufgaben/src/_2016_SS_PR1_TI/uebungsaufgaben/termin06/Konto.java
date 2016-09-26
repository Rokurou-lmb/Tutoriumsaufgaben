package _2016_SS_PR1_TI.uebungsaufgaben.termin06;

/**
 * Ein Konto welches einen Saldo besitzt und an dem Geld eingezahlt oder abgezogen werden kann.
 * @author Lenno
 * @version 1.0
 */
public class Konto {
	private int saldo;
	
	/**
	 * Erzeugt ein neues Konto mit einem Startsaldo von 50
	 */
	public Konto() {
		saldo = 50;
	}
	
	/**
	 * Zieht den uebergebenen Geldbetrag vom Saldo dieses Kontos ab.
	 * @param betrag der abzuziehende Geldbetrag
	 * @return {@code true} wenn das Geld erfolgreich abgezogen wurde, {@code false} wenn nicht genug Geld vorhanden ist.
	 */
	public boolean abziehen(int betrag) {
		if(this.saldo >= betrag) {
			this.saldo -= betrag;
			return true;
		}
		return false;
	}
	
	/**
	 * Erhoeht den Saldo um den uebergeben Betrag
	 * @param betrag Der einzuzahlende Betrag
	 */
	public void einzahlen(int betrag) {
		this.saldo += betrag;
	}
}
