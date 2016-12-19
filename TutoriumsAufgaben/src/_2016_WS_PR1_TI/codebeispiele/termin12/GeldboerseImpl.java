package _2016_WS_PR1_TI.codebeispiele.termin12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeldboerseImpl implements Geldboerse{

	private List<Euroschein> _scheine;
	
	public GeldboerseImpl() {
		_scheine = new ArrayList<>();
	}
	
	@Override
	public void scheineEinstecken(int anzahl, Euroschein scheintyp) {
		testGroesserNull(anzahl);
		for(int i = 0; i < anzahl; i++)
		{
			_scheine.add(scheintyp);
		}
	}

	@Override
	public void scheineEinstecken(List<Euroschein> buendel) {
		_scheine.addAll(buendel);
	}

	@Override
	public void scheineEntnehmen(int anzahl, Euroschein scheintyp) {
		testGroesserNull(anzahl);
		testKleinerAls(anzahl, anzahlScheine(scheintyp));
		
		for(int i = 0; i < anzahl; i++) {
			_scheine.remove(scheintyp);
		}
	}

	@Override
	public void scheineEntnehmen(Map<Euroschein, Integer> buendel) {
		Map<Euroschein, Integer> anzahlScheine = new HashMap<>();
		for(Euroschein scheintyp : Euroschein.values()) {
			anzahlScheine.put(scheintyp, anzahlScheine(scheintyp));
		}
		
		for(Map.Entry<Euroschein,Integer> euroscheinBuendel : buendel.entrySet()) {
			Integer anzahl = euroscheinBuendel.getValue();
			Euroschein scheintyp = euroscheinBuendel.getKey();
			testGroesserNull(anzahl);
			testKleinerAls(anzahl, anzahlScheine(scheintyp));
			for(int i = 0; i < anzahl; i++) {
				_scheine.remove(scheintyp);
			}
		}
	}

	@Override
	public int enthaltenesGeld() {
		int wert =0;
		for(Euroschein euroschein : _scheine)
		{
			wert += euroschein.wert();
		}
		return wert;
	}

	@Override
	public int anzahlScheine() {
		return _scheine.size();
	}

	@Override
	public int anzahlScheine(Euroschein scheintyp) {
		int anzahl = 0;
		for(Euroschein euroschein : _scheine)
		{
			if(scheintyp == euroschein)
			{
				anzahl++;
			}
		}
		return anzahl;
	}

	@Override
	public boolean geldPassendVorhanden(int euroBetrag) {
		// TODO Auto-generated method stub
		return false;
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
