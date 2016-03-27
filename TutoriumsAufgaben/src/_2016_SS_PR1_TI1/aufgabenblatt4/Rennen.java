package aufgabenblatt4;

public class Rennen {

	private int anzahlRennautos;

	private Rennauto[] rennautos;

	private int naechsterIndex = 0;

	private double streckenlaenge;

	public Rennen() {
		rennautos = new Rennauto[1];
	}

	public static void main(String[] args) {

	}

	public void addRennauto(Rennauto rennauto) {
		if (naechsterIndex == rennautos.length) {
			Rennauto[] copyRennauto = this.rennautos;
			this.rennautos = new Rennauto[this.rennautos.length * 2];

			for (int i = 0; i < copyRennauto.length; i++) {
				this.rennautos[i] = copyRennauto[i];

			}
		}
		this.rennautos[naechsterIndex] = rennauto;
		naechsterIndex++;
	}

	private void schritt() {
		for (Rennauto rennauto : rennautos) {
			rennauto.fahren();
		}
	}

	Rennauto ermittleSieger() {
		Rennauto sieger = null;
		for (int i = 0; (i < rennautos.length) && (sieger == null); i++) {
			Rennauto aktuellesRennauto = rennautos[i];
			if (aktuellesRennauto != null
					&& (aktuellesRennauto.getGefahreneStrecke() > streckenlaenge)) {
				sieger = aktuellesRennauto;
			}
		}
		return sieger;
	}

	public void durchfuehren() {
		do {
			schritt();
		} while (ermittleSieger() == null);
	}
}
