package _2016_SS_PR1_TI1.aufgabenblatt4;

public class Wettbuero {

	private Rennen wettRennen;

	private int anzahlWetten = 0;

	private Wette[] wetten;

	private double faktor;

	public Wettbuero(Rennen wettRennen) {
		this.wettRennen = wettRennen;
	}

	public void wetteAnnehmen(String fahrerin, int wettEinsatz, String spieler) {
		Wette neueWette = new Wette(fahrerin, wettEinsatz, spieler);

		if (this.anzahlWetten == this.wetten.length) {
			Wette[] copyWetten = this.wetten;
			this.wetten = new Wette[this.wetten.length * 2];
			System.arraycopy(copyWetten, 0, this.wetten, 0, copyWetten.length);
		}
		this.wetten[anzahlWetten] = neueWette;
		anzahlWetten++;
	}

	public void auswerten() {
		this.wettRennen.durchfuehren();
		String sieger = wettRennen.ermittleSieger().getName();
		System.out.println("Gewonnen hat Fahrerin: " + sieger);
		for (Wette wette : wetten) {
			if (wette.getFahrerin().equals(sieger)) {
				System.out.println(wette.getSpieler() + " hat "
						+ (wette.getWettEinsatz() * this.faktor) + "� gewonnen!");
			}
		}
	}

}
