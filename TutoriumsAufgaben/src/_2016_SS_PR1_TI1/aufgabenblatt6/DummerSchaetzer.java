package aufgabenblatt6;

/**
 * Trivialimplementation von {@link SendungsdauerSchaetzer} antwortet auf
 * Anfragen statisch.
 * 
 * @author Helena
 *
 */
public class DummerSchaetzer implements SendungsdauerSchaetzer {

	/**
	 * Gibt immer 1 zurück.
	 * 
	 * @param herkunft
	 *            Die Stadt aus welcher versendet wird.
	 * @param ziel
	 *            Die Stadt zu welcher zugestellt werden soll.
	 */
	@Override
	public int getSendungsTransportDauer(Staedte herkunft, Staedte ziel) {
		return 1;
	}

}
