package aufgabenblatt4;

public class Wette {
	
	private String fahrerin;
	
	private int wettEinsatz;
	
	private String spieler;
	
	public Wette(String fahrerin, int wettEinsatz, String spieler) {
		this.fahrerin=fahrerin;
		this.wettEinsatz=wettEinsatz;
		this.spieler=spieler;
	}

	public String getFahrerin() {
		return fahrerin;
	}

	public int getWettEinsatz() {
		return wettEinsatz;
	}

	public String getSpieler() {
		return spieler;
	}
	
	

}
