package _2016_SS_PR1_TI1.aufgabenblatt3;

public class Arrays {

	public static void main(String[] args) {

		// Initialisierung der Wetterdaten
		int[][] wetterDaten = new int[][] { { 1, 12 }, { 2, 14 }, { 3, 9 }, { 4, 12 }, { 5, 15 },
				{ 6, 16 }, { 7, 15 }, { 8, 15 }, { 9, 11 }, { 10, 8 }, { 11, 13 }, { 12, 13 },
				{ 13, 15 }, { 14, 12 } };

		// Berechnung der Durchschnittstemperatur
		double durchschnittstemperatur = 0.0;
		double gesamtTemperatur = 0.0;

		// Min Max Temperatur
		int temperaturMax = 0;
		int temperaturMin = Integer.MAX_VALUE;
		int aktuelleTemperatur = 0;

		// Umschwungsberechnung
		int groessterUmschwung = 0;
		int umschwungsTag = 0;
		int aktuellerTag = 0;
		int aktuellerUmschwung = 0;
		int letzteTemperatur = wetterDaten[0][1];

		// Tabellarische Ausgabe
		System.out.println("Tag | Temperatur");
		System.out.println("----------------");

		for (int[] is : wetterDaten) {
			aktuellerTag = is[0];
			aktuelleTemperatur = is[1];

			// durschnittsberechnung
			gesamtTemperatur += aktuelleTemperatur;

			// min, max berechnung
			temperaturMax = (aktuelleTemperatur > temperaturMax) ? aktuelleTemperatur
					: temperaturMax;
			temperaturMin = (aktuelleTemperatur < temperaturMin) ? aktuelleTemperatur
					: temperaturMin;

			// Umschwungsberechnung
			aktuellerUmschwung = Math.abs(aktuelleTemperatur - letzteTemperatur);
			if (aktuellerUmschwung > groessterUmschwung) {
				groessterUmschwung = aktuellerUmschwung;
				umschwungsTag = aktuellerTag;
			}

			// tabellarische ausgabe
			System.out.print((aktuellerTag >= 10) ? "" : "0");
			System.out.println(aktuellerTag + "  | " + aktuelleTemperatur);

			// merken der letzten Temperatur
			letzteTemperatur = aktuelleTemperatur;
		}
		durchschnittstemperatur = gesamtTemperatur / wetterDaten.length;

		System.out.println("Durchschnittstemperatur: " + durchschnittstemperatur);
		System.out.println("Maximale Temperatur: " + temperaturMax);
		System.out.println("Minimale Temperatur: " + temperaturMin);
		System.out.println("Der groesste Umschwung geschah vom Tag " + (umschwungsTag - 1)
				+ " auf den Tag " + umschwungsTag + ".");
	}
}
