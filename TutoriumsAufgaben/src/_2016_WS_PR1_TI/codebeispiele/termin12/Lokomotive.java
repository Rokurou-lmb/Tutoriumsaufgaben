package _2016_WS_PR1_TI.codebeispiele.termin12;

/**
 * Beschreiben Sie hier die Klasse Lokomotive.
 * 
 * @author Lennart Borchert
 * @version 0.1
 */
class Lokomotive implements KannEtwasAnhaengen
{
	private Anhaengbar _next;

	public Lokomotive() {
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