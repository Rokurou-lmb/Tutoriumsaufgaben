package _2016_WS_PR1_TI.uebungsaufgaben.termin03;

public class Buch {
	private String _autor;
	private String _titel;
	private int _seiten;
	private String _refNummer;
	private int _ausgeliehen;
	private final boolean _kursText;
	
	public Buch(String buchautor, String buchtitel, int buchseiten, boolean kursText) {
		_autor = buchautor;
		_titel = buchtitel;
		_seiten = buchseiten;
		_refNummer = "";
		_ausgeliehen = 0;
		_kursText = kursText;
	}

	public void ausleihen() {
		_ausgeliehen++;
	}
	
	public void autorAusgeben() {
		System.out.println("Autor: " + _autor);
	}
	
	public void titelAusgeben() {
		System.out.println("Autor: " + _titel);
	}
	
	public void detailsAusgeben() {
		System.out.println("Titel: " 										+ _titel + 
						   ",\nAutor: " 									+ _autor + 
						   ",\nSeiten: " 									+ _seiten + 
						   ",\nRefnummer: " + (_refNummer.isEmpty() ? "ZZZ" : _refNummer) + 
						   ",\nDas Buch wurde bereits " + _ausgeliehen + " mal ausgeliehen.");
	}
	
	public String gibAutor() {
		return _autor;
	}
	
	public String gibTitel() {
		return _titel;
	}
	
	public int gibSeiten() {
		return _seiten;
	}
	
	public String gibRefNummer() {
		return _refNummer;
	}
	
	public int gibAusgeliehen() {
		return _ausgeliehen;
	}
	
	public boolean istKursText() {
		return _kursText;
	}
	
	public void setAutor(String autor) {
		autor = _autor;
	}
	
	public void setTitel(String titel) {
		titel = _titel;
	}
	
	public void setzeRefNummer(String ref) {
		if(ref.length() >= 3) {
			_refNummer = ref;
		} else {
			System.out.println("Die Referenznummer konnte nicht gessetzt werden, sie muss mindestens 3 Zeichen lang sein!");
		}
	}
}
