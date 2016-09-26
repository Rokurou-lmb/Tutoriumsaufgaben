
/**
 * Diese Klasse beschreibt eine einfache Waage, welche neue Gewichte registrieren,
 * und Aussagen ueber den Verlauf machen kann.
 * 
 * @author Lennart Borchert
 * @version 1.0
 */
public class Waage
{
	private int _letztesGewicht;
	private int _aktuellesGewicht;
	private int _Trend;
	private int _minimalesGewicht;
	private int _maximalesGewicht;
	private int _gesammtesGewicht;
	private int _anzahlDerMessungen;


	/**
	 * Initialisiert ein neues Objekt des Typs Waage mit dem gegebenen Gewicht.
	 * @param Aktuelles Gewicht in Gramm
	 */
    public Waage(int aktuellesGewicht)
    {
    	_aktuellesGewicht = aktuellesGewicht;
		_minimalesGewicht = aktuellesGewicht;
		_maximalesGewicht = aktuellesGewicht;
		_gesammtesGewicht = aktuellesGewicht;
    	_letztesGewicht = aktuellesGewicht;
		_anzahlDerMessungen = 1;
    	_Trend = 0;
    }


    /**
	 * Registriert ein neues Gewicht
	 * @param Das aktuelle Gewicht
     */
    public void registriere(int neuesGewicht)
    {

    	if(neuesGewicht>_maximalesGewicht)
		{
			_maximalesGewicht = neuesGewicht;
		}
		else if(neuesGewicht<_minimalesGewicht)
		{
			_minimalesGewicht = neuesGewicht;
		}
    	_letztesGewicht = _aktuellesGewicht;
    	_gesammtesGewicht += _aktuellesGewicht;
    	_Trend = gibTrend();
    	_anzahlDerMessungen += 1;
    	_aktuellesGewicht = neuesGewicht;
    }


	/**
	 * Gibt einen representativen Wert zur verdeutlichung des Trends an
	 * @return Trend der Gewichtsentwicklung
	 */
    public int gibTrend()
    {
    	if(_aktuellesGewicht > _letztesGewicht)
    	{
    		return(+1);
    	}
    	else if(_aktuellesGewicht < _letztesGewicht)
    	{
    		return(-1);
    	}
    	else
    	{
    		return(0);
    	}
    }


	/**
	 * Gibt das kleinste gemessene Gewicht zurueck
	 * @return Kleinstes gemessenes Gewicht
	 */
    public int gibMinimalgewicht()
    {
    	return(_minimalesGewicht);
    }


	/**
	 * Gibt das groesste gemessene Gewicht zurueck
	 * @return Groesstes gemessenes Gewicht
	 */
    public int gibMaximalgewicht()
    {
    	return(_maximalesGewicht);
    }


	/**
	 * Gibt den Durchschnitt der gemessene Gewichte zurueck
	 * @return Durchschnitt der gemessenen Gewichte
	 */
    public int gibDurschnittsgewicht()
    {
    	return(_gesammtesGewicht/_anzahlDerMessungen);
    }
}

