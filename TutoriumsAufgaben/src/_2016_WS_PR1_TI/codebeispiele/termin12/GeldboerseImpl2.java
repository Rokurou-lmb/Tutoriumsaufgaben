package _2016_WS_PR1_TI.codebeispiele.termin12;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeldboerseImpl2 implements Geldboerse{

	private Map<Euroschein, Integer> _scheine;
	
	public GeldboerseImpl2() {
		_scheine = new HashMap<>();
		for(Euroschein scheintyp : Euroschein.values()) {
			_scheine.put(scheintyp, 0);
		}
	}
	
	public GeldboerseImpl2(Map<Euroschein, Integer> scheinbuendel) {
		_scheine = new HashMap<>(scheinbuendel);
		for(Euroschein scheintyp : Euroschein.values()) {
			if(!_scheine.containsKey(scheintyp))
			{
				_scheine.put(scheintyp, 0);
			}
		}
	}
	
	@Override
	public void scheineEinstecken(int anzahl, Euroschein scheintyp) {
		testGroesserNull(anzahl);
		verandereWertInDerMap(scheintyp, anzahl);
	}

	@Override
	public void scheineEinstecken(List<Euroschein> buendel) {
		for(Euroschein scheintyp : Euroschein.values())
		{
			int anzahl = Collections.frequency(buendel, scheintyp);
			verandereWertInDerMap(scheintyp, anzahl);
		}
	}

	@Override
	public void scheineEntnehmen(int anzahl, Euroschein scheintyp) {
		testGroesserNull(anzahl);
		testKleinerAls(anzahl, anzahlScheine(scheintyp));
		verandereWertInDerMap(scheintyp, -anzahl);
	}

	@Override
	public void scheineEntnehmen(Map<Euroschein, Integer> buendel) {
		for(Map.Entry<Euroschein,Integer> euroscheinBuendel : buendel.entrySet())
		{
			Euroschein scheintyp = euroscheinBuendel.getKey();
			Integer anzahl = euroscheinBuendel.getValue();
			testGroesserNull(anzahl);
			testKleinerAls(anzahl, anzahlScheine(scheintyp));
			verandereWertInDerMap(scheintyp, -anzahl);
		}
	}

	@Override
	public int enthaltenesGeld() {
		int wert =0;
		for(Map.Entry<Euroschein, Integer> euroscheinBuendel : _scheine.entrySet())
		{
			Euroschein scheintyp = euroscheinBuendel.getKey();
			Integer anzahl = euroscheinBuendel.getValue();
			wert += scheintyp.wert() * anzahl;
		}
		return wert;
	}

	@Override
	public int anzahlScheine() {
		int anzahlScheine = 0;
		for(Euroschein scheintyp : _scheine.keySet()) {
			anzahlScheine += _scheine.get(scheintyp);
		}
		return anzahlScheine;
	}

	@Override
	public int anzahlScheine(Euroschein scheintyp) {
		return _scheine.get(scheintyp);
	}

	@Override
	public boolean geldPassendVorhanden(int euroBetrag) {
		testGroesserNull(euroBetrag);
		if(euroBetrag % 5 != 0 || euroBetrag > enthaltenesGeld())
		{
			return false;
		}
		if((euroBetrag % 10 == 5) && (anzahlScheine(Euroschein.E5) == 0))
		{
			return false;
		}
		
		Geldboerse verbleibendeScheine = new GeldboerseImpl2(_scheine);
		int verbleibenderBetrag = euroBetrag;
		
		boolean passend = false;
		int anzahlStellen = ("" + euroBetrag).length();
		int[] stellen = new int[anzahlStellen];
		
		for(int i = 0; i < anzahlStellen; i++)
		{
			
		}
		return passend;
	}
	
	private void verandereWertInDerMap(Euroschein scheintyp, int anzahl) {
		int anzahlVorhandenerScheine = _scheine.get(scheintyp);
		_scheine.put(scheintyp, anzahlVorhandenerScheine + anzahl);
	}
	
	private void testGroesserNull(int anzahl) {
		if(anzahl < 0)
		{
			throw new IllegalArgumentException();
		}
	}
	
	private void testKleinerAls(int anzahl, int anzahl2) {
		if(anzahl > anzahl2)
		{
			throw new IllegalStateException();
		}
	}
}