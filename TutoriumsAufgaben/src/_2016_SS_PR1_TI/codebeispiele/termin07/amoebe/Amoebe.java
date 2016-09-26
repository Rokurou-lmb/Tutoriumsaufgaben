package _2016_SS_PR1_TI.codebeispiele.termin07.amoebe;

public class Amoebe {
	private final boolean geschlecht;
	private int groesse;
	
	/**
	 * Initialisiert eine neue Amoebe mit dem uebergebenen Geschlecht. ({@code true} für weiblich, {@code false} für
	 * männlich)
	 * @param geschlecht
	 */
	public Amoebe(boolean geschlecht) {
		this.geschlecht = geschlecht;
		groesse = 1;
	}
	
	public boolean istWeiblich() {
		return geschlecht;
	}
	
	public int gibGroesse() {
		return groesse;
	}
	
	/**
	 * Laesst die Amoebe um 1 wachsen.
	 * @return die gewachsene Amoebe
	 */
	Amoebe fuettern() {
		groesse++;
		return this;
	}
	
	/**
	 * Laesst die Amoebe um 1 schrumpfen.
	 * @return die geschrumpfte Amoebe
	 */
	Amoebe hungern() {
		if(groesse > 1) {
			groesse--;
		}
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("moeba(%c, %d)", geschlecht ? 'f' : 'm', gibGroesse());
	}
	
	/**
	 * Diese Amoebe versucht eine neue Amoebe abzuspalten, die als Ergebnis zurueckgeliefert wird. Wenn diese Amoebe
	 * kleiner als 5 ist, ist sie zu klein zum Teilen und veraendert sich nicht. Der Rueckgabewert ist in diesem Fall
	 * null. Die neue Amoebe hat das gleiche Geschlecht und die halbe Groesse(abgerundet) wie diese Amoebe. Diese Amoebe
	 * schrumpft dabei um die Groesse der neuen, abgespalteten Amoebe.
	 * @return Die neue Amoebe
	 */
	Amoebe teilen() {
		Amoebe neueAmoebe = null;
		if(groesse > 5) {
			neueAmoebe = new Amoebe(geschlecht);
			hungern();
			
			int groesseDerNeuenAmoebe = groesse / 2;
			while(neueAmoebe.gibGroesse() < groesseDerNeuenAmoebe) {
				neueAmoebe.fuettern();
				hungern();
			}
		}
		return neueAmoebe;
	}
	
	/**
	 * Diese Amoebe vereinigt sich mit der anderen Amoebe andere und produziert eine neue Amoebe, die als Ergebnis
	 * zurueckgegeben wird. Wenn zwei Amoeben das gleiche Geschlecht oder die gleiche Groesse haben, moegen sie sich
	 * nicht vereinigen. In diesem Fall ist das Ergebnis null. Andernfalls entsteht eine neue Amoebe der Groesse 1 mit
	 * dem gleichen Geschlecht, wie die groessere Eltern-Amoebe. Die Eltern-Amoeben bleiben unveraendert.
	 * @param andere Die Amoebe mit der sich verbunden werden soll.
	 * @return Die neu entstandene Amoebe
	 */
	Amoebe vereinigen(Amoebe andere) {
		Amoebe neueAmoebe = null;
		if((istWeiblich() != andere.istWeiblich()) && (groesse != andere.gibGroesse())) {
			neueAmoebe = new Amoebe((groesse > andere.gibGroesse()) ? istWeiblich() : andere.istWeiblich());
		}
		return neueAmoebe;
	}
	
	/**
	 * Diese Amoebe greift die andere Amoebe gegner an. Wenn beide Amoeben maennlich (weibliche Amoeben haben andere
	 * Mittel und Wege, um sich auseinanderzusetzen) und unterschiedlich gross sind, dann schrumpft die kleinere Amoebe
	 * auf Groesse 1. Die andere waechst entsprechend an. Die Summe der Groessen bleibt also gleich. Andernfalls
	 * geschieht nichts.
	 * @param gegner Die Amoebe die angegriffen werden soll.
	 * @return Diese Amoebe
	 */
	Amoebe angreifen(Amoebe gegner) {
		if(!istWeiblich() && !gegner.istWeiblich()) {
			Amoebe gewinner = this;
			Amoebe verlierer = gegner;
			if(groesse < gegner.groesse) {
				gewinner = gegner;
				verlierer = this;
			}
			
			while(verlierer.gibGroesse() > 1) {
				gewinner.fuettern();
				verlierer.hungern();
			}
		}
		return this;
	}
}
