package _2015_WS_PR1_WI1.uebungsaufgaben.termin05;

public class Tamagochi {
	private int _hunger;
	private int _langeweile;
	private int _muedigkeit;
	
	public Tamagochi() {
		_hunger = 0;
		_langeweile = 0;
		_muedigkeit = 0;
	}
	
	public void iss() {
		_hunger = 0;
		_langeweile += 1;
	}
	
	public void schlaf() {
		_muedigkeit = 0;
		_langeweile = 0;
		_hunger += 1;
	}
	
	public void spiel() {
		_langeweile = 0;
		_hunger += 1;
		_muedigkeit += 1;
	}
	
	public int gibPunktestand() {
		int punkte = (_hunger < 4) ? 1 : -2;
		punkte += (_langeweile < 4) ? 1 : -2;
		punkte += (_muedigkeit < 4) ? 1 : -2;
		return punkte;
	}

	private void rundeVerarbeiten() {
		
	}
}
