package _2016_WS_PR1_TI.codebeispiele.termin12;

public class Waggon implements KannEtwasAnhaengen, Anhaengbar {
	
	private int _passagiere;
	private Anhaengbar _next;
	
	public Waggon(int passagiere) {
		_passagiere = passagiere;
	}
	
	@Override
	public int anzahlPassagiere() {
		return _passagiere + ((_next == null) ? 0 : _next.anzahlPassagiere());
	}
	
	@Override
	public boolean anhaengen(Anhaengbar kopfVomRest) {
		if(_next == null) 
		{
			_next = kopfVomRest;
			return true;
		}
		return false;
	}
	
	@Override
	public Anhaengbar gibAnhaenger() {
		return _next;
	}
	
	@Override
	public int anzahlZugelemente() {
		return 1 + ((_next == null) ? 0 : _next.anzahlZugelemente());
	}
}
