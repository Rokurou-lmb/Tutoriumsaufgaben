package _2016_SS_PR1_TI1.aufgabenblatt5;

public class EdelsteinBox {
	private Edelstein[] edelsteine;
	
	public EdelsteinBox(Edelstein... edelsteine) {
		this.edelsteine = edelsteine;
	}
	
	public int getAnzahl(Edelstein sorte) {
		int anzahl = 0;
		for(Edelstein edelstein : this.edelsteine) {
			if(edelstein.equals(sorte))
				anzahl++;
		}
		return anzahl;
	}
	
	@Override
	public String toString() {
		return ausgeben();
	}
	
	private String ausgeben() {
		String ausgabe = "(";
		for(Edelstein edelstein : this.edelsteine) {
			switch(edelstein) {
				case Diamant:
					ausgabe += "D";
					break;
				case Rubin:
					ausgabe += "R";
					break;
				case Smaragd:
					ausgabe += "S";
					break;
			}
		}
		return ausgabe + ")";
	}
	
	public EdelsteinBox hineinlegen(Edelstein sorte, int anzahl) {
		int verbleibendeAnzahl = anzahl;
		for(int i = 0; i < this.edelsteine.length; i++) {
			Edelstein edelstein = this.edelsteine[i];
			if(edelstein == null) {
				this.edelsteine[i] = sorte;
				verbleibendeAnzahl--;
			}
		}
		if(verbleibendeAnzahl > 0) {
			Edelstein[] copyEdelsteine = this.edelsteine;
			this.edelsteine = new Edelstein[Math.max(verbleibendeAnzahl, this.edelsteine.length * 2)];
			System.arraycopy(copyEdelsteine, 0, this.edelsteine, 0, copyEdelsteine.length);
			hineinlegen(sorte, verbleibendeAnzahl);
		}
		return this;
	}
	
	public EdelsteinBox herausnehmen(Edelstein sorte, int anzahl) {
		int verbleibendeAnzahl = anzahl;
		for(int i = 0; (i < this.edelsteine.length) && (verbleibendeAnzahl > 0); i++) {
			Edelstein edelstein = this.edelsteine[i];
			if(edelstein.equals(sorte)) {
				this.edelsteine[i] = null;
				verbleibendeAnzahl--;
			}
		}
		return this;
	}
	
	public EdelsteinBox umwandeln(Edelstein vonSorte, Edelstein zuSorte) {
		for(int i = 0; i < this.edelsteine.length; i++) {
			Edelstein edelstein = this.edelsteine[i];
			if(edelstein.equals(vonSorte)) {
				this.edelsteine[i] = zuSorte;
			}
		}
		return this;
	}
	
	public EdelsteinBox leeren() {
		this.edelsteine = new Edelstein[1];
		return this;
	}
}
