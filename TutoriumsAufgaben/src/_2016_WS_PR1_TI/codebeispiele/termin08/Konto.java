package _2016_WS_PR1_TI.codebeispiele.termin08;

public class Konto {
	private int _saldo;
	private Kontotyp _typ;
	
	
	public Konto(int startSaldo, Kontotyp typ) {
		_saldo = startSaldo;
		_typ = typ;
	}
	
	public void zahleEin(int summe) {
		if(summe <= 0) {
			throw new IllegalArgumentException("Die Summe muss größer als 0 sein!");
		}
		_saldo += summe;
	}
	
	public int gibSaldo() {
		return _saldo;
	}
	
	public int berechneZinsen() {
		return (int)(_saldo * _typ.getProzentSatz() / 100.0);
	}
}
